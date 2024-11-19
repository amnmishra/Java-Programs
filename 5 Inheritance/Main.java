/* 
Inheritance is a mechanism where one class acquires the properties (fields) and behaviors (methods) of another class. It enables code reusability and establishes a parent-child relationship between classes.
    Types of Inheritance
        1. Single Inheritance
        2. Multilevel Inheritance
        3. Hierarchical Inheritance
        4. Hybrid Inheritance
    Java does not support multiple inheritance with classes.
        -> This is to prevent the "Diamond Problem."
        -> Use interfaces to achieve multiple inheritance-like behavior.
*/


// Single Inheritance
// class Parent {
//     void display() {
//         System.out.println("This is the parent class.");
//     }
// }

// class Child extends Parent {
//     void show() {
//         System.out.println("This is the child class.");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Child child = new Child();
//         child.display();
//         child.show();
//     }
// }

// Multilevel Inheritance
// class Grandparent {
//     void grandparentMethod() {
//         System.out.println("This is the grandparent class.");
//     }
// }

// class Parent extends Grandparent {
//     void parentMethod() {
//         System.out.println("This is the parent class.");
//     }
// }

// class Child extends Parent {
//     void childMethod() {
//         System.out.println("This is the child class.");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Child child = new Child();
//         child.grandparentMethod();
//         child.parentMethod();
//         child.childMethod();
//     }
// }

// // Hierarchical Inheritance
// class Parent {
//     void display() {
//         System.out.println("This is the parent class.");
//     }
// }

// class Child1 extends Parent {
//     void child1Method() {
//         System.out.println("This is child 1 class.");
//     }
// }

// class Child2 extends Parent {
//     void child2Method() {
//         System.out.println("This is child 2 class.");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Child1 child1 = new Child1();
//         child1.display();
//         child1.child1Method();

//         Child2 child2 = new Child2();
//         child2.display();
//         child2.child2Method();
//     }
// }


// Hybrid Inheritance
// interface A {
//     void methodA();
// }

// interface B {
//     void methodB();
// }

// class C implements A, B {
//     public void methodA() {
//         System.out.println("This is method A from interface A.");
//     }

//     public void methodB() {
//         System.out.println("This is method B from interface B.");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         C obj = new C();
//         obj.methodA();
//         obj.methodB();
//     }
// }
