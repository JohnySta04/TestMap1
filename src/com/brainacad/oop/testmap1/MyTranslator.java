package com.brainacad.oop.testmap1;

import java.util.HashMap;

public class MyTranslator {

    private HashMap<String, String> stringHashMap = new HashMap<>();

    public void addNewWord(String en, String ru) {

        stringHashMap.put(en, ru);
    }

    public String translate (String en) {

        StringBuffer result= new StringBuffer();
        String [] strings = en.split(" ");
        for (int i=0; i<strings.length; i++ ) {
            result.append(stringHashMap.get(strings[i])+' ');
        }
        return result.toString();
    }

}
