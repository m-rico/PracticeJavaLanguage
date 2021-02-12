package com.driko;

import java.util.Scanner;

public class CustomInputBitwise {
    public static void main(String[] args) throws Exception {
        System.out.println("\nKim Dahyun\n\n");

        //membuat custom calculator bitwise

        System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
        System.out.println("| Welcome to bitwise Operation Machine |");
        System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n");
        Scanner inptvlue = new Scanner(System.in);

        System.out.println("Shall we start dude ? ");
        System.out.print("Type \"yes\" or \"no\" with lowercase : \n");
        String firstQ = inptvlue.next();

        if (firstQ.equals("yes")){
            System.out.println("\n\nOkay this is the rules!");
            System.out.println("first U must input number value Integer A and B, " +
                    "\nthen machine will convert that number to bit value");


            int valueA, valueB;

            System.out.print("\nPlease input Variable A : ");
            valueA = inptvlue.nextInt();
            System.out.print("\nPlease input Variable B : ");
            valueB = inptvlue.nextInt();

            String convrtA, convrtB, convrtAB;

            convrtA = String.format("%8s", Integer.toBinaryString(valueA)).replace(' ', '0');
            convrtB = String.format("%8s", Integer.toBinaryString(valueB)).replace(' ', '0');
            System.out.print("\n");
            System.out.printf("%s = %d\n", convrtA, valueA);
            System.out.printf("%s = %d\n", convrtB, valueB);
            System.out.println("\nokay now select menu what you will do with that 2 variables");
            System.out.println("| Menu |");
            System.out.println("1. AND " +
                    "\n2. OR " +
                    "\n3. XOR" +
                    "\n4. Right Shift" +
                    "\n5. Left Shift"   +
                    "\n6. Negasi Kebalikan"
            );
            System.out.print("Please Isert your answer : ");
            int secondQ = inptvlue.nextInt();
            System.out.print("\n\n");

            switch (secondQ) {
                case 1 :
                    System.out.println("Melakukan Operasi And pada variable A dan B");
                    compareAB((byte) valueA,(byte) valueB);
                    valueA = (byte) (valueA & valueB);
                    convrtAB = String.format("%8s", Integer.toBinaryString(valueA)).replace(' ', '0');
                    System.out.println("-----------------");
                    System.out.printf("%s = %d\n", convrtAB, valueA);
                    break;
                case 2 :
                    System.out.println("Melakukan Operasi OR pada variable A dan B");
                    compareAB((byte) valueA,(byte) valueB);
                    valueA = (byte) (valueA | valueB);
                    convrtAB = String.format("%8s", Integer.toBinaryString(valueA)).replace(' ', '0');
                    System.out.println("-----------------");
                    System.out.printf("%s = %d\n", convrtAB, valueA);
                    break;
                case 3 :
                    System.out.println("Melakukan Operasi XOR pada variable A dan B");
                    compareAB((byte) valueA,(byte) valueB);
                    valueA = (byte) (valueA ^ valueB);
                    convrtAB = String.format("%8s", Integer.toBinaryString(valueA)).replace(' ', '0');
                    System.out.println("-----------------");
                    System.out.printf("%s = %d\n", convrtAB, valueA);
                    break;
                case 4 :
                    System.out.println("Please Chose variable you will use Right Shift :");
                    System.out.println("Exampke : \"A\"");
                    String rightQ = inptvlue.next();

                    if(rightQ.equals("A")){

                        System.out.println("Melakukan Operasi Right Shift pada variable A");
                        System.out.print("please input value to make Right Shift : ");
                        int inptRightSA = inptvlue.nextInt();
                        compareAB((byte) valueA,(byte) valueB);
                        valueA = (byte) (valueA >> inptRightSA );
                        convrtAB = String.format("%8s", Integer.toBinaryString(valueA)).replace(' ', '0');
                        System.out.println("-----------------");
                        System.out.printf("%s = %d\n", convrtAB, valueA);

                    } else if (rightQ.equals("B")){

                        System.out.println("Melakukan Operasi Right Shift pada variable B");
                        System.out.print("please input value to make Right Shift : ");
                        int inptRightSB = inptvlue.nextInt();
                        compareAB((byte)valueA, (byte)valueB);
                        valueB = (byte) (valueB >> inptRightSB);
                        convrtAB = String.format("%8s", Integer.toBinaryString(valueB)).replace(' ', '0');
                        System.out.println("-----------------");
                        System.out.printf("%s = %d\n", convrtAB, valueB);
                    } else {
                        System.out.println("sorry Idk What U mean dude !?");
                    }
                    break;

                case 5 :
                    System.out.println("Please Chose variable you will use Left Shift :");
                    System.out.println("Exampke : \"A\"");
                    String leftQ = inptvlue.next();

                    if (leftQ.equals("A")){

                        System.out.println("Melakukan Operasi Left Shift pada variable A");
                        System.out.print("please input value to make Left Shift : ");
                        int inptLeftSA = inptvlue.nextInt();
                        compareAB((byte) valueA,(byte) valueB);
                        valueA = (byte) (valueA << inptLeftSA );
                        convrtAB = String.format("%8s", Integer.toBinaryString(valueA)).replace(' ', '0');
                        System.out.println("-----------------");
                        System.out.printf("%s = %d\n", convrtAB, valueA);

                    } else if (leftQ.equals("B")) {
                        System.out.println("Melakukan Operasi Left Shift pada variable B");
                        System.out.print("please input value to make Left Shift : ");
                        int inptleftSB = inptvlue.nextInt();
                        compareAB((byte) valueA, (byte) valueB);
                        valueB = (byte) (valueB << inptleftSB);
                        convrtAB = String.format("%8s", Integer.toBinaryString(valueB)).replace(' ', '0');
                        System.out.println("-----------------");
                        System.out.printf("%s = %d\n", convrtAB, valueB);
                    } else {
                        System.out.println("IDK what U mean dude !?");
                    }
                    break;

                case 6:

                    /*
                        negasi pada operator bitwise tidak menggunakan "!" sebagai simbol perintahnya
                        melainkan menggunakan Symbol "~"
                    */


                    byte negation;
                    System.out.println("Please Chose Variable you will convert to \"Negasi Kebalikan\" : ");
                    System.out.println("Exampke : \"A\"");
                    String reverseNQ = inptvlue.next();

                    if (reverseNQ.equals("A")){
                        System.out.println("Melakukan Operasi Negasi pada variable A");
                        compareAB((byte) valueA, (byte) valueB);
                        negation = (byte) (~valueA);
                        convrtAB = String.format("%8s", Integer.toBinaryString(negation)).replace(' ', '0');
                        System.out.println("-----------------");
                        System.out.printf("%s = %d", convrtAB, negation);


                    } else if (reverseNQ.equals("B")){
                        System.out.println("Melakukan Operasi Negasi pada variable B");
                        compareAB((byte) valueA, (byte) valueB);
                        negation = (byte) (~valueB);
                        convrtAB = String.format("%8s", Integer.toBinaryString(negation)).replace(' ', '0');
                        System.out.println("-----------------");
                        System.out.printf("%s = %d", convrtAB, negation);

                    } else {
                        System.out.println("IDK what U mean Dude ?!");
                    }




                    break;

            } // end of switch

            System.out.print("\n");
            System.out.println("\nThis is end of the programs ");







        } else if(firstQ.equals("no")) {
            System.out.println("Okay Maybe next time ?!");
        } else{
            System.out.println("i don't know what U mean dude ?!. PLEASE CEK THE HINT !");
        }

    } // End Main Method

    private static void compareAB(byte comvlueA, byte comvlueB){

    String comConvrtA = String.format("%8s", Integer.toBinaryString(comvlueA)).replace(' ', '0');
    String comConvrtB = String.format("%8s", Integer.toBinaryString(comvlueB)).replace(' ', '0');
        System.out.printf("%s = %d\n", comConvrtA, comvlueA);
        System.out.printf("%s = %d\n", comConvrtB, comvlueB);
    }
}
