// A method is a block of code which only runs when it is called.

// Simple Methods
// public class Main{
// 	public static void main(String[] args) {
// 		name();
// 	}
// 	static void name(){
// 		System.out.println("ABCD");
// 	}
// }


// With Parameters
// public class Main{
// 	public static void main(String[] args) {
// 		name("AIMT");
// 		name("ARUN");
// 		name("TARUN");
// 		name("KARAN");
// 	}
// 	static void name(String name){
// 		System.out.println(name);
// 	}
// }

// With Return Value
// public class Main{
// 	public static void main(String[] args) {
// 		System.out.println(sum(3,5));
// 	}
// 	static int sum(int a , int b){
// 		int res = a + b;
// 		return res;
// 	}
// }





// Method Overloading
public class Main {
    public static void main(String[] args) {
        int a = 5, b = 6;
        float c = 6.2f, d = 3.3f;
        sum(a, b);
        sum(c, d);
    }
    static void sum(int a, int b) {
        int iSum = a + b;
        System.out.println(iSum);
    }

    static void sum(float c, float d) {
        float fSum = c + d;
        System.out.println(fSum);
    }
}


// public class Main {
//     static int Sum(int a, int b) {
//         int iSum = a + b;
//         return iSum;
//     }
//     static double Sum(double c, double d) {
//         double fSum = c + d;
//         return fSum;
//     }
//     public static void main(String[] args) {
//         Main obj = new Main();        
//         int a = 5, b = 6;
//         double c = 6.5, d = 3.2;
//         int intSum = Sum(a, b);
//         double floatSum = Sum(c, d);
//         System.out.println("Sum of integers: " + intSum);
//         System.out.println("Sum of doubles: " + floatSum);
//     }
// }