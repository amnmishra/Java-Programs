/* 
Inheritance is a mechanism where one class acquires the properties (fields) and behaviors (methods) of another class. It enables code reusability and establishes a parent-child relationship between classes.
    Types of Inheritance
        1. Single Inheritance
        2. Multilevel Inheritance
        3. Hierarchical Inheritance
        4. Hybrid Inheritance
*/


class Parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is the child class.");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.display(); // Inherited from Parent
        child.show();
    }
}
