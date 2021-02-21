package com.oop;

class loveLine{
    String name;
    int age;
    double height;
    int birthday;

    loveLine(String jqname, int jqage, double jqheight, int jqbirthday){
        System.out.println("\nProfil");
        System.out.println("Name        : " + jqname);
        System.out.println("Ages        : " + jqage);
        System.out.println("Height      : " + jqheight);
        System.out.println("Birthday    : "+ jqbirthday);

    } // end constructor

}// end class loveline



public class constructor {
    public static void main(String[] args) {
        System.out.print("Kim Dahyun\n");

        // membuat objek constructor
        loveLine dahyun = new loveLine("Kim Dahyun", 22, 1.59, 280598);
        loveLine riko = new loveLine("Muhammad Riko Ismail", 20, 1.63, 200300);


    }// end main method
}
