package ru.gb.seminar04.task2;

import lombok.Data;

@Data

public class BoxWithNumber<T> {
    public BoxWithNumber(T... element) {
        this.array = element;
    }

    private T[] array;

    public Integer average() {
        Integer res = 0;
        for (int i = 0; i < array.length; i++) {
            res += (Integer) array[i];
        }
        return res / array.length;
    }

//    public boolean compareAverage(Integer box2) {
//        return average() > box2.average();
    }
}
