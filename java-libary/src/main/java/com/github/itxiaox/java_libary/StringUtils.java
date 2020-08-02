package com.github.itxiaox.java_libary;

public class StringUtils {
    public static String append(String format,String... args){
        StringBuffer buffer = new StringBuffer();
        for(String arg:args){
            buffer.append(args);
        }
        return buffer.toString();
    }
}
