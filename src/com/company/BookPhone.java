package com.company;

import java.util.*;

public class BookPhone {
    private Map<String, Set<String>> map =new HashMap<>();

    public void add(String name,String number){
        Set<String> set = map.getOrDefault(name, new HashSet<>());
        set.add(number);
        map.put(name,set);
    }
    public Set<String> getPhones(String name){
        return map.getOrDefault(name, Collections.emptySet());
    }
}
