package com.company;
import java.util.Scanner;

public class Main {
    public static int GecmeNotuHesaplama(int vize, int fınal) {
        int gecmeNotu = (vize * 40 / 100) + (fınal * 60 / 100);
        if (0 <= gecmeNotu && gecmeNotu <= 20) {
            System.out.println("Harf notunuz: FF");
        } else if (20 < gecmeNotu && gecmeNotu <= 50) {
            System.out.println("Harf notunuz: CB");
        } else if (50 < gecmeNotu && gecmeNotu <= 70) {
            System.out.println("Harf notunuz: BB");
        } else if (70 < gecmeNotu && gecmeNotu <= 100) {
            System.out.println("Harf notunuz: AA");
        }
        return gecmeNotu;

    }


    public static void main(String[] args) {
	// write your code here
        Scanner not  = new Scanner (System.in);
        System.out.println("Lütfen notlarınızı giriniz:");
        System.out.println("Vize notu:");
        int vize1 =not.nextInt();
        System.out.println("Final notu:");
        int fınal =not.nextInt();
        int gecmeNotunuz = GecmeNotuHesaplama(vize1,fınal);





    }
}
