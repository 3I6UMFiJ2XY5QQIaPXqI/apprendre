package com.test.java;

public class Test {

    public static int counter = 0;

    public void incrementCounter() {
        for(int i=0; i<10; i++) {
            this.counter++;
            System.out.println(counter);
        }
    }

    public static void main(String args[]) {
        System.out.println("Begin main");

        Test t = new Test();
        t.incrementCounter();

        System.out.println("End main");
    }
}
