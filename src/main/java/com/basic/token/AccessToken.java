package com.basic.token;

import com.basic.token.exceptions.TokenGenerateException;
import com.basic.token.exceptions.TokenParseException;

/**
 * Created by dailybird on 16/12/23.
 *
 */
public class AccessToken extends Token {
    public AccessToken(String token) {
        super(token);
    }

    public AccessToken(int identifier) {
        super(identifier);
    }

    @Override
    public String generate() throws TokenGenerateException {
        return null;
    }

    @Override
    public int parse() throws TokenParseException {
        return 0;
    }
}
