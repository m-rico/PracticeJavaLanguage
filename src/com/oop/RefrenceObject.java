package com.oop;

class Kimdubu{
    String nama;
    int age;
    double height;


    Kimdubu(){

    }
}


public class RefrenceObject {
    public static void main(String[] args) {
        System.out.println("kim Dahyun\n");


        Kimdubu riko = new Kimdubu();
        riko.nama = "Kim Dahyun";
        System.out.println(riko.nama);
        Kimdubu dubu = riko;
        System.out.println(dubu.nama);
        dubu.nama = "Queen dubu";
        System.out.println(riko.nama);
        int addresSatu = System.identityHashCode(riko.nama);
        System.out.printf("Address dari Objek riko.nama : %s\n", Integer.toHexString(addresSatu));
        int rainbow = 28;
        System.out.printf("Address dari Objek raibow : %s\n", System.identityHashCode(Integer.toHexString(rainbow)));
        /*
        Refrence pada objek artinya ketika melakukan operasi ( NamaClass Objek2 = Objek1; ) Artinya kita membuat
        variable yang me Refrece pada Objek1. jadi ketika terjadi perubahan pada Objek1, Otomatis Objek2 juga berubah
        seperti Objek1. karna Objek2 perilakunya sama seperti sebuah variable yang meniru tanpa menduplikat.
        bisa dilihat ketika di cek Objek2 memili Addres yang sama dengan Objek1.


        */
    }
}
