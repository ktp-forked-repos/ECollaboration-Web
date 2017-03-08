package com.basic.file;

import com.basic.file.FileFormat;
import com.basic.file.exceptions.FileNotExistsException;
import com.basic.file.exceptions.FileUploadException;

import java.util.List;

/**
 * Created by dailybird on 16/12/23.
 * 文件处理类与数据库无关
 */
public interface FileHandler {
    /**
     * 上传文件，具体参数需要根据 Java web 文件上传功能确定，可直接修改 FileFormat 类
     * @param file
     */
    public void upload(FileFormat file) throws FileUploadException;

    /**
     * 上传一组文件
     * @param files
     */
    public void upload(List<FileFormat> files) throws FileUploadException;

    /**
     * 删除文件
     * @param path
     */
    public void delete(String path) throws FileNotExistsException;

    /**
     * 获取文件真实路径
     * @param filename
     */
    public void getPath(String filename);

    /**
     * 获取上传文件的令牌
     */
    public void token();

    /**
     * 随机文件名生成器，存储到数据库时，需要使用随机名称以免冲突
     * @return
     */
    public String fileNameGenerator();

    /**
     * 检测上传令牌的正确性
     * @param token
     * @return
     */
    public boolean tokenValidator(String token);
}
