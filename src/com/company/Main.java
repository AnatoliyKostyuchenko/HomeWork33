package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class Main {

    public static void main(String[] args) {
        String[] arrayWords = new String[10];
        arrayWords[0] = "cat";
        arrayWords[1] = "run";
        arrayWords[2] = "dog";
        arrayWords[3] = "cat";
        arrayWords[4] = "winter";
        arrayWords[5] = "dog";
        arrayWords[6] = "summer";
        arrayWords[7] = "blizzard";
        arrayWords[8] = "summer";
        arrayWords[9] = "bear";

        Collections.sort(arrayWords);
    }
}
