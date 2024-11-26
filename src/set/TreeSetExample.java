package set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> treeSet1 = new TreeSet<>();

        // adding data
        treeSet1.add("Pallavi");
        treeSet1.add("Sanjay");
        treeSet1.add("Arti");
        treeSet1.add("Jhon");
        treeSet1.add("Ruti");

        System.out.println("adding data is " + treeSet1);


        // removing data
        treeSet1 .remove("Pallavi");
        System.out.println("after removing " +  treeSet1);

        treeSet1.remove("Jhon");
        System.out.println("after removing " +  treeSet1);


        // treaversing data

        for(String s1 : treeSet1){
            System.out.println(s1);
        }
    }
}
