package com.basic.auth;

import com.basic.token.AccessToken;
import com.basic.token.exceptions.TokenNotFoundException;
import com.basic.token.exceptions.TokenOverdueException;
import com.basic.token.exceptions.TokenParseException;

import java.util.Map;

/**
 * Created by dailybird on 16/12/23.
 *
 */
public class Auth {
    // 数据表 Authority > Resource 字段
    public static final String PROJECT = "project";
    public static final String PROJECT_APPLYLIST = "project_applylist";
    public static final String PLAN = "plan";

    // 操作类型
    public static final String CREATE = "c";
    public static final String UPDATE = "u";
    public static final String RETREIVE = "r";
    public static final String DELETE = "d";

    public boolean validate(int indentifier, String resouce, String operation){
        // TODO: 根据 access_token 解析后的身份 id，资源、具体操作判断是否可以进行
        Map<String, Map<String, Map<Integer, Boolean>>> authTable = new AuthTable().getAuthTable();

        // TODO: 将身份 id 转换为 role，需要借助 DAO 层实现
        String role = "";

        boolean canDo = authTable.get(resouce).get(operation).get(role);

        return canDo;

    }


    public boolean validate(String accessToken, String resouce, String operation){
        // TODO: 根据 access_token，资源、具体操作判断是否可以进行
        AccessToken token = new AccessToken(accessToken);
        try {
            int identifier = token.getIdentifier();
            this.validate(identifier, resouce, operation);


        } catch (TokenParseException e) {
            // TODO: 解析失败的处理

        } catch (TokenNotFoundException e) {
            // TODO: Token 找不到

            e.printStackTrace();
        } catch (TokenOverdueException e) {
            // TODO: Token 已过期

            e.printStackTrace();
        }
        return true;
    }

}
