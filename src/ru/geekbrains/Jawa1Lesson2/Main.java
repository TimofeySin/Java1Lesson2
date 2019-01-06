package ru.geekbrains.Jawa1Lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        exercise1();
    }

    // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void exercise1() {

        byte[] arrayForExercise1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};


        for (byte i = 0; i < arrayForExercise1.length; i++) {

            if (arrayForExercise1[i] == 1) {
                arrayForExercise1[i] = 0;
            } else {
                arrayForExercise1[i] = 1;
            }
        }
        System.out.print(Arrays.toString(arrayForExercise1));

    }






}
