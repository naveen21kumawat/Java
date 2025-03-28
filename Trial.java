abstract class A {
    public int salary;

    int set(int b) {
        salary = b;
        return salary;
    }

    abstract void show();
}

class Employee extends A {
    void show() {
        System.out.println("Salary:" + salary);
    }
}

public class Trial {
    public static void main(String[] args) {
        // Employee ob = new Employee();
        // int a=ob.set(10);
        // ob.show();
        A ob = new A() {
            void show() {
                System.out.println("Hello");
            }
        };
        ob.show();

    }
}