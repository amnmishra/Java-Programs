package com.example.child;

import com.example.base.Parent;

public class Child extends Parent {
    public void accessParentFields() {
        System.out.println(publicField);      // Accessible
        System.out.println(protectedField);  // Accessible (via inheritance)
        // System.out.println(defaultField); // Not Accessible (different package)
        // System.out.println(privateField); // Not Accessible
    }

    public void accessParentMethods() {
        publicMethod();       // Accessible
        protectedMethod();    // Accessible (via inheritance)
        // defaultMethod();   // Not Accessible (different package)
        // privateMethod();   // Not Accessible
    }
}
