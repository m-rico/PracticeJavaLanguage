package com.driko;

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
        System.out.print(" << Shift Left 5 ");

        byte h = 7;
        byte l = 10;
        String love;


        System.out.print("\n");
        love = String.format("%8s", Integer.toBinaryString(l)).replace(' ', '0');
        System.out.printf("%s = %d\n", love, l);
        l = (byte) (l << 1);
        love = String.format("%8s", Integer.toBinaryString(l)).replace(' ', '0');
        System.out.printf("%s = %d", love, l);


























    } // end main method
}
