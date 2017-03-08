package com.basic.token;

import com.basic.token.exceptions.TokenGenerateException;
import com.basic.token.exceptions.TokenParseException;

/**
 * Created by dailybird on 16/12/23.
 */
public class TransactionToken extends Token {

    public TransactionToken(String token) {
        super(token);
    }

    public TransactionToken(int identifier) {
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
