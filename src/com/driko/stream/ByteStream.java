package com.driko.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) throws IOException {
        System.out.println("Kim Dahyun");
        System.out.print("\n");

        FileInputStream inptstrm = new FileInputStream("dubu.txt");
        FileOutputStream moldstrm = new FileOutputStream("Dahyun.txt");
        int kim = inptstrm.read();
        int mail = inptstrm.read();


//        while (kim != -1){
//            System.out.print((char) kim);
//            kim = inptstrm.read();
//        }



/////// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
/////// Melakukan cetak char pada file "Dahyun.txt"

        while (kim != -1) {
            moldstrm.write(kim);
            kim = inptstrm.read();
        }

    }
}
