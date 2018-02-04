package com.brainacad.oop.testmap1;

public class Main {

    public static void main(String[] strings) {
        System.out.println("******************************************");
        System.out.println("Labwork 2.15.6");
        System.out.println("-------------------------------------------");

        MyTranslator myTranslator = new MyTranslator();
        myTranslator.addNewWord("cat", "кот" );
        myTranslator.addNewWord("mouse", "мышь" );
        myTranslator.addNewWord("caught", "впоймал" );

        String en = "cat caught mouse";

        System.out.println("en : "+en);
        System.out.println("ru : "+myTranslator.translate(en));
        System.out.println("******************************************");
    }
}
