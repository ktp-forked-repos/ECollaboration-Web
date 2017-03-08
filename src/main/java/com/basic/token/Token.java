package com.basic.token;

import com.basic.token.exceptions.TokenGenerateException;
import com.basic.token.exceptions.TokenNotFoundException;
import com.basic.token.exceptions.TokenOverdueException;
import com.basic.token.exceptions.TokenParseException;

/**
 * Created by dailybird on 16/12/23.
 *
 */
public abstract class Token {
    protected int identifier;
    protected String token = null;

    public Token(String token) {
        this.token = token;
    }

    public Token(int identifier) {
        this.identifier = identifier;
    }

    // TODO: Token 生成，需继承类实现
    abstract public String generate() throws TokenGenerateException;

    // TODO: Token 解析，需继承类实现
    abstract public int parse() throws TokenParseException, TokenOverdueException;

    // TODO: Token 持久化过程
    public String persist(int expire){
        try {
            String token = this.generate();
            return token;
        } catch (TokenGenerateException e) {
            // TODO: token 生成失败处理
            return null;
        }
        // TODO: 向文件系统/数据库/ Redis 中存储一定过期时间的数据

    }

    // TODO: 持久化的 Token 查找
    private String search(){
        // TODO: 使用文件系统/数据库/ Redis 查找 token 数据，以免过期
        return null;
    }

    // TODO: Token 查找 + 解析
    public int getIdentifier() throws TokenNotFoundException, TokenParseException, TokenOverdueException {
        if(this.search() == null) throw new TokenNotFoundException();

        // 解析的过程中可能产生 Token 已过期异常、Token 解析失败异常
        int indentifier = this.parse();
        // TODO: 解析成功

        return indentifier;
    }

    public String getToken() throws TokenGenerateException {
        return this.generate();
    }
}
