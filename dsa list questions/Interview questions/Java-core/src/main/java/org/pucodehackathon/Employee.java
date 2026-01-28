package org.pucodehackathon;

public class Employee implements Comparable {
    int id;
    String name;

    Employee(int id ,String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Employee obj = (Employee) o;
        if(this.id  == obj.id){
            return 0;
        }else if (this.id > obj.id){
            return 1;
        }else {
            return -1;
        }
    }
}
