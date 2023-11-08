package org.example;

public class Main {
    public static void main(String[] args) {
        CountClass counter1 = new CountClass(2);
        CountClass counter2 = new CountClass(3);
        CountClass counter3 = new CountClass(-5);

        System.out.println(counter1);
        System.out.println(counter2);
        System.out.println(counter3);
        CountClass.incrementTotalCount();
        CountClass.incrementTotalCount();
        CountClass.incrementTotalCount();

        counter1.incrementInstanceCount();
        counter1.incrementInstanceCount();
        counter1.incrementInstanceCount();
        System.out.println(counter1);
        System.out.println(counter2);
        System.out.println(counter3);

    }
}