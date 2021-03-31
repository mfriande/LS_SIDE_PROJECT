package com.company;

public class StringTreatment {
    public String[] delimitString(String s, String delim) {
        String[] tokens = null;
        for (int i = 0; i < s.length(); i++) {
            tokens = s.split(delim);
        }
        return tokens;
    }
}
