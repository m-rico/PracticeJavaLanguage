package com.driko;

import javax.crypto.spec.PSource;

public class PracticeFunction {
    public static void main(String[] args) {

        System.out.println("main Method");
        System.out.print("\n");

        int inptheight = 10;
        int inptwidth = 7;

        /* jika ingin menampilkan atau mencetak hasil dari sebuah method.
        maka tidak diperlukan sebuah syntax System.out.println
        KECUALI VOID */


        picture(inptheight, inptwidth);

        System.out.println("This IS Result circumference rectangle : " + rectangle(inptheight, inptwidth));
        System.out.println("This IS Result large rectangle : " + large(inptheight, inptwidth));


    }

    static int rectangle(int height, int width){

        int result = (height + width) * 2;
        return result;
    }

    static int large(int height, int width){
        int result = height*width;
        return result;
    }

    static void picture(int height, int width){

        for (int w=0; w<width; w++){
            for (int h=0; h<height; h++){
                System.out.print(" *");
            }
            System.out.print("\n");
        }

    }
}
