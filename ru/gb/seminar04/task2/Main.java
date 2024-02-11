package ru.gb.seminar04.task2;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        Integer[] arr2 = {3, 2, 2, 1, 5};
        BoxWithNumber nums = new BoxWithNumber(arr);
        System.out.println("nums.average() = " + nums.average());
        BoxWithNumber nums2 = new BoxWithNumber(arr2);
        nums.compareAverage(nums2.average());

    }
}
