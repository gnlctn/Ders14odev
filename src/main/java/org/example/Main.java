package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {10,39,54,27,40,5};
        int a_sayi = 4;
        System.out.println(ara(dizi,a_sayi));
        int a_sayi2 = 5;
        System.out.println(ara(dizi,a_sayi2));
    }
    public static int ara(int[] dizi, int aranan){
        boolean bulunan = Arrays.stream(dizi).anyMatch(n -> n == aranan);
        if (bulunan == true){
            return aranan;
        }
        else{
            return -1;
        }
    }
}