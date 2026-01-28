package org.pucodehackathon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    static void main() {
        Employee e1 = new Employee(1, "Venkatesh");
        Employee e2 = new Employee(3, "Venkatesh");
        Employee e3 = new Employee(2, "Venkatesh");
        Employee e4 = new Employee(4, "Venkatesh");
        Employee e5 = new Employee(6, "Venkatesh");
        Employee e6 = new Employee(7, "Venkatesh");


        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);



        Collections.sort(list);
        String s = "A";

        s = s + "B";
        System.out.println(s.getClass());

        list.forEach(ele -> System.out.println(ele.id + " " +  ele.name));

    }
}
