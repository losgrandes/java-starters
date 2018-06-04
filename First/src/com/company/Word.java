package com.company;
import java.util.*;

public class Word {
    private String word = "";

    public Word(String word) {
        this.word = word;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Word) {
            HashMap hm1 = new HashMap();
            HashMap hm2 = new HashMap();
            for(int i=0; i<word.length(); i++) {
                int current_value = (int)hm1.getOrDefault(word.charAt(i), 0);
                hm1.put(word.charAt(i), ++current_value);
            }
            System.out.format("Letters are: %s\n", hm1.toString());
            for(int i=0; i<((Word) o).word.length(); i++) {
                int current_value = (int)hm2.getOrDefault(((Word) o).word.charAt(i), 0);
                hm2.put(((Word) o).word.charAt(i), ++current_value);
            }
            System.out.format("Letters are: %s\n", hm2.toString());
            return hm1.equals(hm2);

        } else {
            return false;
        }
    }
}
