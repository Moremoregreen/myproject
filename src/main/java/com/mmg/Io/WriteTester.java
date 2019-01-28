package com.mmg.Io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) throws IOException {
        File jkdir = new File("I:\\jk");
        jkdir.mkdir();//因為只有一層故使用mkdir，不然要用mkdirs
        FileWriter fw = new FileWriter("I:\\jk\\output.txt");
        fw.write("abc"); //因為要得緩衝區滿了才會自己送上去，所以需要加.flush
        fw.flush();//把資料沖到目的地去
        fw.close(); //記得要關閉
    }
}
