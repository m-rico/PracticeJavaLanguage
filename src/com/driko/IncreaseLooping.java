package com.driko;

import java.util.Scanner;

public class IncreaseLooping {
    public static void main(String[] args) {


//        for (r=0;r<=10;r++){
//            System.out.println("r "+r);
//            for (d=0;d<=0;d++){
//                System.out.println("d "+r);
//                k = d + r;
//                System.out.println("k"+ k);
//            }
//        }


//                for (r=0;r<=10;r++) {
//                    System.out.println("r " + r);
//                    for (d = 0; d <= 0; d++) {
//                        do {
//                            k = d + r;
//                            System.out.println("r "+k);
//                        } while (r<=10);
//                    }
//                }

//        for (r=0;r<=10;r++) {
//
//            d = r;
//            for (k=0;k<=r;k++){
//                m = k;
//                H = d + m;
//                System.out.println("H "+H);
//            }
//        }



        // Make with While Loop

        /*

        System.out.println("Ini adalah Awal program");

        int rNilaiAwal, dNilaiAkhir, kim;

        Scanner inptvlue = new Scanner(System.in);

        System.out.print("Masukkan Nilai Awal : ");
        rNilaiAwal = inptvlue.nextInt();
        System.out.print("Masukkan Nilai Akhir : ");
        dNilaiAkhir = inptvlue.nextInt();

        kim = 0;
        while (rNilaiAwal<=dNilaiAkhir){

          kim =  kim + rNilaiAwal;
          System.out.println("ini Hasil : " + kim);
          rNilaiAwal++;
        }

        */


        // Make with For Loop

        /*
        System.out.println("\t| Increase Looping Using For Loop |");

        int kimFirstValue, dahyunLastValue, rikoResult;

        Scanner inptvlue = new Scanner(System.in);

        System.out.print("Insert First Value : ");
        kimFirstValue = inptvlue.nextInt();
        System.out.print("Insert Last Value : ");
        dahyunLastValue = inptvlue.nextInt();

        rikoResult = 0;

        for (kimFirstValue=0;kimFirstValue<=dahyunLastValue;kimFirstValue++) {

            rikoResult = rikoResult + kimFirstValue;
            System.out.println("Ini Hasil " + kimFirstValue + " : " + rikoResult);
        */


        // Make Using do While Loop

        /*
        int dahFirstValue, hyunLastValue, kimResult;

        System.out.println("\t| Increase Looping Using do While Loop |");

        Scanner sysinptvlue = new Scanner(System.in);

        System.out.print("Insert First Value : ");
        dahFirstValue = sysinptvlue.nextInt();
        System.out.print("Insert First Value : ");
        hyunLastValue = sysinptvlue.nextInt();

        kimResult = 0;

        do {
            kimResult = kimResult + dahFirstValue;
            dahFirstValue++;
            System.out.println("ini hasul : " + kimResult);
        } while (dahFirstValue<=hyunLastValue);

         */


        // Make Using While But without Input variable

        int firstValueKim = 1, lastValueDahyun = 10, resultRiko = 0;

        while (firstValueKim<=lastValueDahyun){

            resultRiko = resultRiko + firstValueKim;
            System.out.println("hasil : " + resultRiko);
            firstValueKim++;
        }





    }
}
