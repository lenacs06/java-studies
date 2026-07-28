public class variable {
    public static void main(String[] args) {
        //Variables
        String Name = "Helena";
        char myInitialLetter = 'H';
        int age = 20;
        float myHeight = 1.75f;
        // 'f' is mandatory: decimal literal is double by default (details in the README)

        System.out.println("My name is " + Name);
        System.out.println("My age is " + age);
        System.out.println("My height is " + myHeight);
        System.out.println("My initial letter from the name is " + myInitialLetter);

        long worldPopulation = 8000000000L;
        System.out.println("World population is " + worldPopulation);
        // 'L' is mandatory: the large literal exceeds the int limit (details in the README)
    }
}