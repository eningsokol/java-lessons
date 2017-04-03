package ru.tn.courses.iborisenko.task1.v1.subtask3;

import java.util.Random;
import java.util.Scanner;
import  java.util.Random;

/**
 * Created by Ivan Borisenko on 01.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Длина первого массива:");
        int lengthMasA = in.nextInt();

        System.out.println("Длина второго массива:");
        int lengthMasB = in.nextInt();

        int[] masA = new int[lengthMasA];
        int[] masB = new int[lengthMasB];

        Random random = new Random();

        for (int i = 0; i < lengthMasA; i++){
            masA[i] = random.nextInt(20) + 1;
        }

        for (int i = 0; i < lengthMasB; i++) {
            masB[i] = random.nextInt(20) + 1;
        }

//        for (int i = 0; i < lengthMasA; i++) {
//            System.out.println(masA[i]);
//        }
//
//        System.out.println("----------------------");
//
//        for (int i = 0; i < lengthMasA; i++) {
//            System.out.println(masB[i]);
//        }

        Sort(masA, masB);
    }

    public static void Sort(int[] masA, int[] masB){
        //****************************************
        //в этой части отсартировал обе последовательности чтобы соответствовали заданию
        for (int i = 0; i < masA.length; i++) {
            int min = masA[i];
            int imin = i;

            for (int j = i+1; j < masA.length; j++) {
                if (masA[j] < min) {
                    min = masA[j];
                    imin = j;
                }
            }

            if (i != imin) {
                int temp = masA[i];
                masA[i] = masA[imin];
                masA[imin] = temp;
            }
        }

        for (int i = 0; i < masB.length; i++) {
            int min = masB[i];
            int imin = i;

            for (int j = i+1; j < masB.length; j++) {
                if (masB[j] < min) {
                    min = masB[j];
                    imin = j;
                }
            }

            if (i != imin) {
                int temp = masB[i];
                masB[i] = masB[imin];
                masB[imin] = temp;
            }
        }
        //*****************************************************
        for (int element:masA) {
            System.out.println(element);
        }
        System.out.println("----------------");
        for (int element:masB) {
            System.out.println(element);
        }
        //***************************************
        //в этой части перенес эелементы из последовательности B  в последовательность А, и отсартировал опять последовательность B
        for (int i = 0; i < masA.length; i++) {
            for (int j = 0; j < masB.length; j++) {
                if (masB[j] < masA[i]){
                    int temp = masA[i];
                    masA[i] = masB[j];
                    masB[j] = temp;
                }
            }
        }
        for (int i = 0; i < masB.length; i++) {
            int min = masB[i];
            int imin = i;

            for (int j = i+1; j < masB.length; j++) {
                if (masB[j] < min) {
                    min = masB[j];
                    imin = j;
                }
            }

            if (i != imin) {
                int temp = masB[i];
                masB[i] = masB[imin];
                masB[imin] = temp;
            }
        }
        //*************************************************
        for (int element:masA) {
            System.out.println(element);
        }
        System.out.println("----------------");
        for (int element:masB) {
            System.out.println(element);
        }
    }
}
