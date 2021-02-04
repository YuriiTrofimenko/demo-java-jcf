package org.tyaa.demo.console.jcf;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    List list = new ArrayList();
	    list.add("Hello JCF!");
	    list.add(42);
        list.add(42);
	    for (Object o : list) {
	        if(o instanceof Integer){
                System.out.println(((Integer)o) + 1);
            } else if(o instanceof String){
                System.out.println(((String)o) + "1");
            }
        }

        List<String> list2 = new ArrayList<>();
        list2.add("Hello JCF!");
        // list2.add(42);
        System.out.println(list2.get(0));

        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(12);
        set1.add(10);
        for(Integer i : set1) {
            System.out.println(i);
        }

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "January");
        map1.put(2, "February");
        map1.put(12, "December");
        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.printf("key = %2d; value = %10s\n", entry.getKey(), entry.getValue());
        }
    }
}
