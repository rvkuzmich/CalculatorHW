package ru.gb.seminar04.task1;

public class Main {
    public static void main(String[] args) {
//1)	Создать класс - коробку (SimpleBox), которая может хранить любые объекты.
// Посмотреть с какими ошибками можно столкнуться и исправить данное решение на более подходящее(GenBox).
        SimpleBox intBox1 = new SimpleBox(10);
        SimpleBox intBox2 = new SimpleBox(20);
        int sum = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
        System.out.println(sum);
        intBox1.setObj("java");
        int sum2 = 0;
        if (intBox2.getObj() instanceof Integer && intBox1.getObj() instanceof Integer) {
            sum2 = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
        }
        System.out.println(sum2);
        //GenBox<Integer> gen1 = new GenBox<>(10);
        //GenBox<Integer> gen2 = new GenBox<>(20);
        //int sum3 = gen2.getObj() + gen1.getObj();
        //System.out.println(sum3);
    }
}
