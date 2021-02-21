package com.oop;

// Player
class Player{
    String name;
    double helath;
    int level;

    Weapon weapon;
    Armor armor;


    Player(String jqname, double jqhealth, int jqlevel) {
        this.name = jqname;
        this.helath = jqhealth;
        this.level = jqlevel;


    } // End class player


    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }


    void display(){
        System.out.println("Name    : " + this.name);
        System.out.println("Health  : " + this.helath);
        System.out.println("level   : " + this.level);
       this.weapon.display();
       this.armor.display();
    }

}// End Player class



// Weapon
class Weapon{
    String name;
    int attackPower;

    Weapon(String wname, int wattackPower){
        this.name = wname;
        this.attackPower = wattackPower;
    }

    void display(){
        System.out.println("Weapon  : " + this.name + ", Attack Power   : " + this.attackPower);
    }

}// End weapon class



// Armor
class Armor{
    String name;
    int attackPower;

    Armor(String aname, int aattackPower){
        this.name = aname;
        this.attackPower = aattackPower;
    }

    void display(){
        System.out.println("Weapon  : " + this.name +", Deffend Power   : " + this.attackPower);
    }
}


public class LatihanSatu {
    public static void main(String[] args) throws Exception {
        System.out.println("Kim Dahyun\n");

        // player
        Player joker = new Player("Joker", 28, 10);

        //weapom
        Weapon aKfourtysix = new Weapon("AK47", 17);

        //Armor
        Armor suit = new Armor("suit", 20);


        //Prinout menggunakan objek player dan method display
        joker.equipArmor(suit);
        joker.equipWeapon(aKfourtysix);
        joker.display();
    }
}
