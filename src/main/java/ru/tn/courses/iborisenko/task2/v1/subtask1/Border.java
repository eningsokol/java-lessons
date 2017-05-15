package ru.tn.courses.iborisenko.task2.v1.subtask1;

/**
 * Created by Ivan Borisenko on 15.05.2017.
 */


public class Border extends Poster {
    public int sizeX, sizeY;

    //Конструктор по умолчанию
    Border(){
        this.sizeX = 40;
        this.sizeY = 20;
    }
    //Конструктор с параметрами
    Border(int sizeX, int sizeY){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }


}
