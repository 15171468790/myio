package com.wang;

import java.io.File;
import java.io.IOException;

/**
 * 扫描d盘文件
 */
public class io1 {

        public static void main(String[] args) throws IOException {

            String filePath = "D:\\" ;

            File file = new File( filePath) ;
            getFile(file);

        }


        private static void getFile( File file ){
            MyFileFilter myFileFilter = new MyFileFilter();
            MyFileNameFilter myFileNameFilter = new MyFileNameFilter();
            File[] files = file.listFiles(myFileNameFilter) ;
            for( File f : files ){
                if ( f.isHidden() ) continue ;
                if(f.isDirectory() ){
                    getFile( f );
                }else{
                    System.out.println( f.getAbsolutePath()  + "  " + f.getName() );
                }
            }
        }

}
