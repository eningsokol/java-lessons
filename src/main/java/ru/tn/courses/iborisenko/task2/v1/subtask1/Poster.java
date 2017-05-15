package ru.tn.courses.iborisenko.task2.v1.subtask1;

/**
 * Created by Ivan Borisenko on 15.05.2017.
 */

public class Poster {
    public int sizeX, sizeY;
    //Конструктор по умолчанию
    Poster(){
        this.sizeX = 10;
        this.sizeY = 7;
    }
    //Конструктор с параметрами
    Poster(int sizeX, int sizeY){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    //Координаты "объявления"
    public int left, top, right, bottom;

    //Метод, отвечающий за вывод координат
    //и принимающий индексы данного объявления
    public void koordOut(int i, int j) {
        System.out.println("Координаты объявления [" + i + ", " + j + "] :");
        System.out.println("Top: " + this.top);
        System.out.println("Left: " + this.left);
        System.out.println("Bottom: " + this.bottom);
        System.out.println("Right: " + this.right);
    }
}

