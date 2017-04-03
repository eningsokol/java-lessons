package ru.tn.courses.iborisenko.task1.v1.subtask1;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ivan Borisenko on 20.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int k = 0;
        int sum = 0;

        Scanner in = new Scanner(System.in);

        int masRand[] = new int[10];

        for (int i = 0; i < 10; i++){
            masRand[i] = rand.nextInt(20) + 1;
            System.out.println(masRand[i]);
        }

        System.out.println("Введите какому числу будет кратно:");
        k = in.nextInt();

        for (int i = 0; i < 10; i++){
            if ((masRand[i] % k) == 0) {
                sum += masRand[i];
            }
            //System.out.println("sum = " + sum);
        }

        System.out.printf("Сумма элементов кратных %d = %d", k, sum);
    }
}
