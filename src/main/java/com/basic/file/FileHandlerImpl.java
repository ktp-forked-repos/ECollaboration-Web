package com.basic.file;

/**
 * Created by dailybird on 16/12/23.
 *
 */
abstract public class FileHandlerImpl implements FileHandler{
    @Override
    public void token() {

    }

    @Override
    public String fileNameGenerator() {
        return null;
    }

    @Override
    public boolean tokenValidator(String token) {
        return false;
    }
}
