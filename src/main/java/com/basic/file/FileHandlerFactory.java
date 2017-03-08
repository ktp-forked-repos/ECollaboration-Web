package com.basic.file;

/**
 * Created by dailybird on 16/12/23.
 *
 */
public class FileHandlerFactory {
   public FileHandler getFileHandler(){
        if(isLocal()){
            return new LocalFileHandler();
        }else if(isOSS()){
            // TODO: 重新实现一个对应存储策略的接口
            return new LocalFileHandler();
        }else{
            return null;
        }
   }

   private boolean isLocal(){
       // TODO: 设定条件判断是否是本地存储策略，一般使用配置文件取得

       return true;
   }

    private boolean isOSS(){
        // TODO: 设定条件判断是否是云端存储（阿里云）策略，一般使用配置文件取得

        return true;
    }

    private boolean isQiNiuYun(){
        // TODO: 设定条件判断是否是云端存储（七牛云）策略，一般使用配置文件取得

        return true;
    }
}
