package ru.tn.courses.iborisenko.task1.v1.subtask2;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Ivan Borisenko on 01.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner in = new Scanner(System.in);
        int NoC = 0;//кол-во покупателей
        int ToC = 0;//время обслуживания покупателя
        int cc = 0;
        System.out.println("Кол-во покупателей:");
        NoC = in.nextInt();

        System.out.println("Время обслуживания покупателя:");
        ToC = in.nextInt();

        for (int i = 1; i < NoC; i++) {
            if (i == 1){
                cc = 0;
            }else {
                cc += ToC;
            }
            System.out.printf("%d покупатель, время в очереди %d\n", i, cc);
        }
    }
}
