package com.oop;

// Player
class Players{
    String name;
    double helath;
    int level;

    Weapons weapons;
    Armors armors;


    Players(String jqname, double jqhealth, int jqlevel) {
        this.name = jqname;
        this.helath = jqhealth;
        this.level = jqlevel;


    } // End class player


    void equipWeapon(Weapons weapons){
        this.weapons = weapons;
    }

    void equipArmor(Armors armors){
        this.armors = armors;
    }


    void display(){
        System.out.println("Name    : " + this.name);
        System.out.println("Health  : " + this.helath);
        System.out.println("level   : " + this.level);
        this.weapons.display();
        this.armors.display();
    }


    void attacks(Players opponent){
        System.out.println(this.name + " Attacking " + opponent.name);

    }




}// End Player class






// Weapon
class Weapons{
    String name;
    int attackPower;

    Weapons(String wname, int wattackPower){
        this.name = wname;
        this.attackPower = wattackPower;
    }

    void display(){
        System.out.println("Weapon  : " + this.name + ", Attack Power   : " + this.attackPower);
    }

}// End weapon class



// Armor
class Armors{
    String name;
    int attackPower;

    Armors(String aname, int aattackPower){
        this.name = aname;
        this.attackPower = aattackPower;
    }

    void display(){
        System.out.println("Weapon  : " + this.name +", Deffend Power   : " + this.attackPower);
    }
}


public class LatihanDua {
    public static void main(String[] args) throws Exception {
        System.out.println("Kim Dahyun\n");

        // player
        Players joker = new Players("Joker", 28, 10);
        Players queen = new Players("Queen", 100, 17);

        //weapom
        Weapons aKfourtysix = new Weapons("AK47", 17);
        Weapons revolver = new Weapons("Revolver", 20);
        //Armor
        Armors suit = new Armors("suit", 20);
        Armors tshirt = new Armors("T-shirt", 10);


        //Prinout menggunakan objek player dan method display
        joker.equipArmor(suit);
        joker.equipWeapon(aKfourtysix);
        joker.display();

        System.out.println("\nBattle");
        joker.attacks(queen);



    }
}
