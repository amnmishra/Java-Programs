/*
Access Modifiers :
    -> public: Accessible everywhere.
    -> protected: Accessible within the same package and in subclasses.
    -> default: Accessible within the same package only.
    -> private: Not accessible in the subclass.



AccessModifiersDemo/
│
├── src/
│   ├── com/example/base/
│   │       Parent.java
│   │
│   ├── com/example/child/
│   │       Child.java
│   │
│   ├── com/example/main/
│           Main.java


javac com/example/base/Parent.java com/example/child/Child.java com/example/main/Main.java
javac com/example/** /*.java
java com.example.main.Main

*/

package com.example.main;
import com.example.base.Parent;
import com.example.child.Child;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("=== Accessing Fields in Parent ===");
        System.out.println(parent.publicField);  // Accessible
        // System.out.println(parent.protectedField); // Not Accessible (outside subclass)
        // System.out.println(parent.defaultField);   // Not Accessible (different package)
        // System.out.println(parent.privateField);   // Not Accessible

        System.out.println("\n=== Accessing Methods in Parent ===");
        parent.publicMethod();  // Accessible
        // parent.protectedMethod(); // Not Accessible
        // parent.defaultMethod();   // Not Accessible
        // parent.privateMethod();   // Not Accessible
        parent.showPrivate();   // Access private members indirectly

        System.out.println("\n=== Accessing Parent from Child ===");
        Child child = new Child();
        child.accessParentFields();
        child.accessParentMethods();
    }
}
