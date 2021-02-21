package com.oop;

class Kim {
    String  name; //jika default maka dia bisa dibaca dan di tulis di class lain

    public int age; // Jika public maka dia bisa dibaca dan di tulis juga layaknya default

    private String boyFriend;
    /* jika private maka hanya bisa dibaca
    dan di tulis di class diamana data
    tersebut di definisikan */

    Kim(String dname, int dage, String dboyFriend){
        this.name = dname;
        this.age = dage;
        this.boyFriend = dboyFriend;
    }

    void dahyun(){
        System.out.printf("my name is %s and im %d, my boyfriend is %s", this.name, this.age, this.boyFriend);
    }

}


public class PublicPrivateKeywords {
    public static void main(String[] args) {
        System.out.println("Kim Dahyun\n");
        Kim riko = new Kim("Kim Dahyun", 22, "Muhammad Riko Ismail");
        riko.dahyun();
        riko.age = 23;
        riko.dahyun();
    }
}
