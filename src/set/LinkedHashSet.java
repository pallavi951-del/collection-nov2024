package set;

public class LinkedHashSet {
    public static void main(String[] args) {
        java.util.LinkedHashSet<String> hashSet1 = new java.util.LinkedHashSet<>();


        // adding data
        hashSet1.add("Pallavi");
        hashSet1.add("Nilesh");
        hashSet1.add("Nanda");
        hashSet1.add(null);
        hashSet1.add("Omkar");
        System.out.println("hashSet is " + hashSet1);


        // removing data
        hashSet1.remove("Nilesh");
        System.out.println("after removing " +  hashSet1);

        hashSet1.remove("Omkar");
        System.out.println("after removing " +  hashSet1);


        // treaversing data

        for(String s1 : hashSet1){
            System.out.println(s1);
        }

    }
}
