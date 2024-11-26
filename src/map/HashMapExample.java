package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // defining hashmap

        HashMap<Integer,String> map1 = new HashMap<>();

        // adding the element in hashmap


        map1.put(101,"Mango");
        map1.put(102,"Banana");
        map1.put(103,"Orange");
        map1.put(104,"Apple");
        map1.put(null,"Gava");
        map1.put(105,"Graps");
        map1.put(102,"Banana");
        map1.put(104,"Anjir");



        // print the output
        System.out.println("map1 is :" + map1);

        System.out.println("geeting element key values :" + map1.get(105));

        // removing element

       // map1.remove(104);
        map1.remove(null);


       // System.out.println("remove valueis :" + map1);
        System.out.println("remove valueis :" + map1);


        // treversing the data
        for(Map.Entry m1 : map1.entrySet()){
            System.out.println(m1.getKey() + "............" + m1.getValue());

        }
    }
}
