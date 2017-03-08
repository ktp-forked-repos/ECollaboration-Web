package com.basic.file;

import java.io.File;

/**
 * Created by dailybird on 16/12/23.
 * 文件操作标准数据类
 */
public class FileFormat {
    // 真实文件类，根据 java web 文件上传功能具体类转换
    private File file;

    // 真实文件名
    private String filename;

    // 文件大小
    private int filesize;

    public FileFormat(File file, String filename, int filesize) {
        this.file = file;
        this.filename = filename;
        this.filesize = filesize;
    }

    public String getFilename() {
        return filename;
    }

    public int getFilesize() {
        return filesize;
    }
}
