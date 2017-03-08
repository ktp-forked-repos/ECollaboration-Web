package com.basic.auth;

import java.util.Map;

/**
 * Created by dailybird on 16/12/23.
 *
 */
public class AuthTable {

    // 获取资源类型 + 操作 + 身份 ＝ 是否可以执行，其中身份由 id 获得（ 还要考虑创建者的问题 ）
    private Map<String, Map<String, Map<Integer, Boolean>>> authTable;

    private void generate(){
        // TODO: 从数据库中加载权限表为特定数据格式，并存储到 Redis 中（ 为快速实现功能，现在直接存入属性中，则下面的获取代码改为直接返回 authTable ）


    }

    public Map<String, Map<String, Map<Integer, Boolean>>> getAuthTable(){
        // TODO: 查询 Redis 中有无权限表，若无则调用 generate 生成
        if(this.findAuthTableFromRedis() == null){
            this.generate();
            return this.findAuthTableFromRedis();
        }else{
            return this.findAuthTableFromRedis();
        }

    }

    private Map<String, Map<String, Map<Integer, Boolean>>> findAuthTableFromRedis(){

        // TODO: 从 Redis 中获取，若无则返回 null

        return null;
    }

}
