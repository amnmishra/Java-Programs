// Recursion is the technique of making a function call itself. 
// This technique provides a way to break complicated problems down into simple problems which are easier to solve.

// #1 Table
public class Main {
    public static void calculate(int number, int limit, int current) {
        if (current > limit) {
            return;
        }
        System.out.println(number + " x " + current + " = " + (number * current));
        calculate(number, limit, current + 1);
    }

    public static void printTables(int num, int limit) {
        System.out.println("\nTable for " + num + ":");
        calculate(num, limit, 1);
    }

    public static void main(String[] args) {
        printTables(3, 10);
    }
}



// #2 Factorial
// public class Main {
//     public static int factorial(int n) {
//         if (n == 0 || n == 1) {
//             return 1;
//         }
//         return n * factorial(n - 1);
//     }
//     public static void main(String[] args) {
//         int number = 5;
//         System.out.println("Factorial of " + number + " is: " + factorial(number));
//     }
// }

// #3 Fibonacci
// public class Main {
//     public static int fibonacci(int n) {
//         if (n == 0 || n == 1) {
//             return n;
//         }
//         return fibonacci(n - 1) + fibonacci(n - 2);
//     }
//     public static void main(String[] args) {
//         int count = 10;
//         System.out.print("Fibonacci series: ");
//         for (int i = 0; i < count; i++) {
//             System.out.print(fibonacci(i) + " ");
//         }
//     }
// }

// #4 Sum of Digit
// public class Main {
//     public static int sumOfDigits(int n) {
//         if (n == 0) {
//             return 0;
//         }
//         return n % 10 + sumOfDigits(n / 10);
//     }
//     public static void main(String[] args) {
//         int number = 1234;
//         System.out.println("Sum of digits of " + number + " is: " + sumOfDigits(number));
//     }
// }

// #5 Reverse String
// public class Main {
//     public static String reverse(String str) {
//         if (str.isEmpty()) {
//             return str;
//         }
//         return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
//     }
//     public static void main(String[] args) {
//         String text = "hello";
//         System.out.println("Reversed string: " + reverse(text));
//     }
// }

// #6 Greatest Common Divisor
// public class Main {
//     public static int gcd(int a, int b) {
//         if (b == 0) {
//             return a;
//         }
//         return gcd(b, a % b);
//     }
//     public static void main(String[] args) {
//         int a = 48;
//         int b = 18;
//         System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
//     }
// }

// #7 Sum of N Num
// public class Main {
//   public static void main(String[] args) {
//     int result = sum(10);
//     System.out.println(+result);
//   }
//   public static int sum(int k) {
//     if (k > 0) {
//       return k + sum(k - 1);
//     } else {
//       return 0;
//     }
//   }
// }