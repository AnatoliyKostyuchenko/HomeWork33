package com.company;

import java.util.Arrays.*;
import java.util.*;
import java.lang.reflect.*;

public class Main {

    public static void main(String[] args) {
        String[] words = new String[]{"Cat","Dog","human", "House","Cat", "DOg","Human","Blizzard", };
        calcDist("Cat");
    }
    public void calcDist(String[]array){
        Map<String, Integer> map = new HashMap<>();
        for(String s : array){
            map.put(s, map.getOrDefault(s,0)+1);
        }
        System.out.println(map);
        System.out.println(map.keySet());
    }
}
