package com.driko;

import javax.print.DocFlavor;
import java.io.FileInputStream;
import java.io.IOException;

public class JavaOpration {
    public static void main(String[] args) throws IOException {
        System.out.println("kim Dahyun");
        System.out.print("\n");

        // deklarasi variable
        int k = 28;
        int m = 20;
        int hasil;




        // Todo Operator Aritmatika

        System.out.println("||| Operasi Aritmatika |||");

        hasil = k * m;
        System.out.printf("%d * %d = %d \n", k, m, hasil);

        hasil = k + m;
        System.out.printf("%d + %d = %d \n", k, m, hasil);

        hasil = k - m;
        System.out.printf("%d - %d = %d \n", k, m, hasil);

        hasil =  k / m;
        System.out.printf("%d / %d = %f \n", k, m, (double) hasil); // modulus adalah hasil bagi
        //Merubah tipe data integer menjadi Double atau float
        //jumlah angka dibelakang koma pada desimal di java tidak bisa diatur

        double d = (double) 28 / 17;
        System.out.println(28 + " / " + 17 + " = " + d);

        hasil = k % m;
        System.out.printf("%d %% %d = %d \n", k, m, hasil);
        System.out.print("\n");



        // Todo Operasi Penugasan


        System.out.println("||| Operasi Penugasan |||");

        k *= m;
        System.out.printf("28 * %d = %d\n", m, k);
        k = 28;

        k += m;
        System.out.printf("28 + %d = %d\n", m, k);
        k = 28;

        k -= m;
        System.out.printf("28 - %d = %d\n", m, k);
        k = 28;

        k /= m;
        System.out.printf("28 / %d = %f\n", m , (double) k);
        k = 28;

        k %= m;
        System.out.printf("28 %% %d = %d\n", m, k);
        k = 28;
        System.out.print("\n");


        // Todo Operator Pembanding
        System.out.println("||| Opersi Pembanding |||");

        boolean t;

        t = k < m;
        System.out.println(k + " > " + m + " = " + t);

        t = k > m;
        System.out.println(k + " > " + m + " = " + t);

        int o = 7;
        int n = 7;
        boolean f;

        f = o == n;
        System.out.println(o + " == " + n + " = "  + f);
        System.out.printf("%d == %d = ",o,n);
        if (o == n){
            System.out.println(" Nilai ini sama ");
        } else {
            System.out.println(" nilai ini berbeda ");
        }

        f = o != n;
        System.out.println(o + " != " + n + " = "  + f);
        System.out.printf("%d != %d = ",o,n);
        if (o != n){
            System.out.println(" Nilai ini sama ");
        } else {
            System.out.println(" nilai ini berbeda ");
        }

        t = k <= m;
        System.out.println(k + " <= " + m + " = " + t);

        t = k >= m;
        System.out.println(k + " >= " + m + " = " + t);
        System.out.printf("\n");



        // Todo Operator Logika
        System.out.println("||| Operator Logika |||");
        boolean kim = true;
        boolean dahyun = false;

        System.out.println(" Mercylebih kencang dari supra = " + kim);
        System.out.println("kura-kura lebih kecang dari cheetah = " + dahyun);

        boolean riko = kim && dahyun;
        System.out.println(kim + " && " + dahyun + " = " + riko);

        riko = kim || dahyun;
        System.out.println(kim + " && " + dahyun + " = " + riko);

        System.out.println("Negasi " + "!" + dahyun + " = " + !dahyun);
        System.out.print("\n");




        // Todo Operator Bitwise
        System.out.println("||| Operator Bitwise |||");
        /*
        jika operaror aritmatika dihitung melelui nilainya yang berupa integer atau pun float, maka jika operator
        operator bitwise yang dihitung adalah nilai bit nya, contoh (00000001).
        */


        byte kimdubu = 3;
        String mriko, mail;

        mriko = String.format("%8s",Integer.toBinaryString(kimdubu)).replace(' ','0');
        System.out.printf("%s = %d\n", mriko, kimdubu);

        byte dligent;

        dligent = (byte) (kimdubu << 5);
        mail = String.format("%8s",Integer.toBinaryString(dligent)).replace(' ','0');
        System.out.printf("%s = %d ", mail, dligent);
        System.out.print(" << Shift Left 5 ");
        System.out.print("\n");

        dligent = (byte) (dligent >> 5);
        mail = String.format("%8s", Integer.toBinaryString(dligent)).replace(' ', '0');
        System.out.printf("%s = %d ", mail, dligent);
        System.out.print(" >> Shift Right 5 ");



/////// Sekedar test
        byte l = 10;
        String love;


        System.out.print("\n");
        love = String.format("%8s", Integer.toBinaryString(l)).replace(' ', '0');
        System.out.printf("%s = %d\n", love, l);
        l = (byte) (l << 1);
        love = String.format("%8s", Integer.toBinaryString(l)).replace(' ', '0');
        System.out.printf("%s = %d", love, l);
        System.out.print("\n");
        System.out.print("\n");


        byte mydubu = 7;
        byte h = 10;


        kimDahyun(mydubu, h);

        String coklat;
        mydubu = (byte) (h & mydubu);
        coklat = String.format("%8s", Integer.toBinaryString(mydubu)).replace(' ','0');
        System.out.printf("%s = %d ", coklat, mydubu);
        System.out.print(" <<< Operasi And Bitwise\n\n");

        kimDahyun(mydubu, h);
        mydubu = 7;
        mydubu = (byte) (h | mydubu);
        coklat = String.format("%8s", Integer.toBinaryString(mydubu)).replace(' ', '0');
        System.out.printf("%s = %d ", coklat, mydubu);
        System.out.print(" <<< Operasi OR Bitwise\n\n");

        kimDahyun(h, mydubu);
        mydubu = (byte) (h ^ mydubu);
        coklat = String.format("%8s",Integer.toBinaryString(mydubu)).replace(' ', '0');
        System.out.printf("%s = %d ", coklat, mydubu);
        System.out.printf(" <<< Operasi XOR bitwise \n\n\n");



        // todo Operator ternary

        int lovekim = 7;

    //  tipeData namaVariable = (parameter) ? "conditionTrue" : "conditionFalse";
        String danswer = (lovekim < 10) ? "yes" : "YES";
        System.out.println(danswer);






























    } // end main method



    // membuat Method untuk memanggil variable komprasi bitwise

    private static void kimDahyun(byte kimsatu, byte kimdua){

        //----------// Mereset ulang variable awal
        kimsatu = 7;
        kimdua = 10;
        //----------//

        String pocky, pie;
        pocky = String.format("%8s", Integer.toBinaryString(kimdua)).replace(' ', '0');
        System.out.printf("%s = %d\n", pocky, kimdua);

        pie = String.format("%8s", Integer.toBinaryString(kimsatu)).replace(' ', '0');
        System.out.printf("%s = %d\n", pie, kimsatu);
        System.out.println("--------------------------------------");
    }

}
