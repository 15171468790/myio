package com.wang;

import java.io.File;
import java.io.FileFilter;

/**
 * 文件过滤器，实现FileFilter接口
 */
public class MyFileFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.isFile();
    }
}
