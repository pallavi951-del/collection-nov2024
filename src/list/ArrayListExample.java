package list;

import java.util.ArrayList;



import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        /*
        wrapper class
        int a = 10;
        int b = null; can not take null values

       Integer a = 10;
       Integer b = null;  allows null values
         */


        // defining ArrayList

        List<Integer>list1 = new ArrayList<Integer>();

        // adding or inserting data

        list1.add(20);
        list1.add(40);
        list1.add(60);
        list1.add(null);
        list1.add(66);
        list1.add(53);
        list1.add(40);


        System.out.println("list1 is : " + list1);


        // remove data
        list1.remove(2);

        System.out.println("list1 removing data is : " + list1);


        // search the data at specific position
        System.out.println("list1 element at 2nd index : " + list1.get(2));
        System.out.println("list1 element at 4th index : " + list1.get(4));

        // update data
        list1.set(4,  99);
        System.out.println("list1 value after updating data: " + list1);

        //size of the list
        System.out.println("list1 length or size : " + list1.size());


        // traversing data
        for(Integer l1 : list1){
            System.out.println(l1);
        }



    }
}
