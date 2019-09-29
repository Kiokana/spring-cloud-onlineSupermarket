package com.example.resourceServer.utils;

import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;

public class PathUtil {
    public static String getImageDir(){
        String imageDir = null;
        try{
            imageDir = ResourceUtils.getURL("classpath:").getPath() + "static/imgs";
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            return imageDir;
        }
    }

    public static String getFileDir(){
        String fileDir = null;
        try {
            fileDir = ResourceUtils.getURL("classpath:").getPath()+"static/files";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if(fileDir != null)    return fileDir;
        return "";
    }

    public static String getTempDir(){
        String fileDir = null;
        try {
            fileDir = ResourceUtils.getURL("classpath:").getPath()+"static/htmlTemp";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if(fileDir != null)    return fileDir;
        return "";
    }
}
