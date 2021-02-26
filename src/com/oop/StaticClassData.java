package com.oop;

class StaticDataDahyun{
    String name = "Kim";        // data variable biasa
    static int age = 20;     // data variable static Public
    int rikoAge = 20;

    StaticDataDahyun(String dname){
        this.name = dname;
    }

    void shaw(){
        System.out.println("variable : " + this.name);
    }

    void changed(int dage){
        age = dage;
    }

    void rikoChange(int drikoAge){
        rikoAge = drikoAge;
    }

    void shawRikoChange(){
        System.out.println(rikoAge);
    }
}

public class StaticClassData {
    public static void main(String[] args) {
        System.out.println("Kim Dahyun\n");
        // pengertian Static pada data class variable
        /*

        */




        //Menginstansiasi Objek StaticDataDahyun
        StaticDataDahyun love1 = new StaticDataDahyun("Kim Dahyun");
        StaticDataDahyun love2 = new StaticDataDahyun("my love");

        love1.shaw();
        love2.shaw();
        System.out.println("\n");

        System.out.println(love1.age);
        System.out.println(love2.age);
        System.out.println(StaticDataDahyun.age);
        System.out.print("\n");

        love1.changed(23);

        System.out.println(love1.age);
        System.out.println(love2.age);
        System.out.println(StaticDataDahyun.age);

        System.out.println(love1.rikoAge);
        System.out.println(love2.rikoAge);
        // System.out.println(StaticDataDahyun.rikoAge);      // tidak bisa dipanggil
        System.out.print("\n");

        System.out.println("Menampilkan Static Variable :");
        love1.age = 17;
        System.out.println("Variable Objek 1 : " + love1.age);
        System.out.println("Variable Objek 2 : " + love2.age);
        System.out.print("\n");

        System.out.println("Menampilkan NON-Static Variable :");
        love1.rikoAge = 17;
        System.out.println("Variable Objek 1 : " + love1.rikoAge);
        System.out.println("Variable Objek 2 : " + love2.rikoAge);
    }
}
