/*
Class : 
	Class is not a real-world entity
	It is just a template or blueprint or prototype from which objects are created.
	Class is does not occupy memory
	Class is a collection of methods , variables of different data types. 

Elements of Class : 
	Data Members
	Method
	Constructor
	Nested Class
	Interface


// Class Declaration in Java

access-modifier class ClassName{
	Data Member;
	Method;
	Constructor;
	Interface;
	Nested class;
}

Object : 
	Objects are the instance of a class that are created to use the attributes and methods of a class.
	Object is a real world entity
Note : when we create an object which is a non primitive data type. It’s always allocated on the heap memory. 
Initialization : 
	ClassName objName =  new ClassName();
*/
public class Main{
	public static void main(String[] args) {
		Branch branch = new Branch();
		branch.CSE3A();
		branch.CSE3B();
		branch.CSE3C();
		branch.CSE3D();
	}
}