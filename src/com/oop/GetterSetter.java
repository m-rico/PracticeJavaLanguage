package com.oop;

class Mydahyun{
    String name;    // Default sama dengan public
    public int age;        // Public
    private double height;  // Private

    Mydahyun(String dname, int dage, double dheight){
        this.name = dname;
        this.age = dage;
        this.height = dheight;


    }

    void display(){
        System.out.println(getdheight());
    }

    double getdheight(){
        return height;
    }

    void setHeight(double kheight){
        this.height = kheight;
    }

}// End Class Mydahyun



public class GetterSetter {
    public static void main(String[] args) {
        System.out.println("Kim Dahyun\n");

        Mydahyun love = new Mydahyun("Kim Dahyun", 22, 1.59);

        System.out.println(love.name);
        System.out.println(love.age);
        // System.out.println(love.height); ---> error karna variable height tidak dapat diakses oleh class main

        // cara mengakses atau mengambil variable private dari class Mydahyun
        System.out.println("Ini variable height pada class Mydahyun " + love.getdheight()); // tidak akan muncul data height
        love.display();

        // merubah height class Mydahyun
        love.setHeight(1.60);
        love.display();

    }
}
