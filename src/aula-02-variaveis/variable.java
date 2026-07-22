public class variable {
    public static void main(String[] args) {
        //Variables
        String Name = "Helena";
        char myInitialLetter = 'H';
        int age = 20;
        float myHeight = 1.75f;
        // f obrigatório: literal decimal é double por padrão (detalhes no README)

        System.out.println("My name is " + Name);
        System.out.println("My age is " + age);
        System.out.println("My height is " + myHeight);
        System.out.println("My initial letter from the name is " + myInitialLetter);

        long worldPopulation = 8000000000L;
        System.out.println("World population is " + worldPopulation);
        // L obrigatório: literal grande estoura o limite do int (detalhes no README)
    }
}