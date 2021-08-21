package fr.themode.demo;

import fr.themode.demo.pack.Exposed;

public class Main {

    public static void main(String[] args) {
        //test(PackPrivate.CONSTANT); <- currently suggested but does not compile
        test(Exposed.CONSTANT); // <- correct suggestion
    }

    private static void test(Exposed exposed) {
    }
}
