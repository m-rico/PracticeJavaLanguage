package com.driko.stream;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) throws IOException {
        System.out.println("Kim Dahyun");
        System.out.print("\n");

        FileInputStream inptstrm = new FileInputStream("dubu.txt");

        int kim = inptstrm.read();

        while (kim != -1){
            System.out.println(inptstrm.read());
        }
    }
}
