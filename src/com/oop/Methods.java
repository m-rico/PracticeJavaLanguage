package com.oop;


// membuat class bernama LoveLine
class LoveLine{
    String name;
    int age;
    double height;


    //membuat constractor dari class LoveLine
    LoveLine(String drname, int drage, double drheight){
        System.out.println("ini constructor");

        this.name = drname;
        this.age = drage;
        this.height = drheight;
    }


    //membuat method tanpa return dan tanpa parameter
    void KimName(){
        System.out.print("method tanpa return dan tanpa parameter\n" + this.name);
        System.out.print("\n" + this.age + "\n" + this.height + "\n");
    }

    //membuat methods tanpa return dengan parameter
    void setName(String drcname){
        this.name =drcname;
    }


    //membuat method dengan return tanpa parameter
    int getAge(){
        this.age = age;
        return age;
    }

   double getHeight(){
        return height; // kenapa tanpa menggunakan syntax "this." namun bisa memanggil variable diluar method
   }

   String getName(){
        return this.name; // menggunakan "this."
   }


   //membuat method dengan return dan dengan parameter
    String sayLove(String drlname){
        return drlname + " I love you even your age is " + this.age;
    }





}// End class LoveLine



public class Methods {
    public static void main(String[] args) {
        System.out.print("Kim Dahyun\n\n");

        LoveLine luv = new LoveLine("Kim Dahyun", 22, 1.59);    // mengisi data pada class LoveLine menggunakan constructor
        luv.setName("Queen");               //mengubah name menggunakan method setname yakni tanpa return tapi dengan parameter
        luv.KimName();                      //memanggil method untuk menampikan isi data class yakni name, age, dan height
        System.out.println("\n");

        //memanggil method getname yakni menggunakan return tanpa parameter
        System.out.println(luv.getAge());
        System.out.println(luv.getHeight());
        System.out.println(luv.getName());

        //memanggil method dengan return dan parameter
//        String dahyun = "Kim Dahyun";
//        System.out.println(luv.sayLove(dahyun));
        //atau
        String dahyunkim = luv.sayLove("Kim Dahyun");
        System.out.println(dahyunkim);




    }
}
