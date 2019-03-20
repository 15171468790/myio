package com.wang;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 过滤PDF文件
 */
public class MyFileNameFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {

        return name.endsWith(".pdf");
    }
}
