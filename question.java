import java.util.*;
// public class question {
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n1, n2 , n3;
//     n1=sc.nextInt();
//     n2=sc.nextInt();
//     n3=sc.nextInt();
//     System.out.println(n1);
//     System.out.println(n2);
//     System.out.println(n3);
//     }
// }

// Task
// Given an integer, , perform the following conditional actions:

// If n is odd, print Weird
// If n is even and in the inclusive range of  to , print Not Weird
// If n is even and in the inclusive range of  to , print Weird
// If n is even and greater than , print Not Weird
// Complete the stub code provided in your editor to print whether or not  is weird.

// Input Format

// A single line containing a positive integer, .

public class question {
    public static void main(String[] args) {
        Scanner1 sc = new Scanner1(System.in);
        int n=sc.nextInt();
        if(n%2==1){
            System.out.println("Weird");
        }
        else if(n%2==0){
            if(n>=2 && n<=5){
                System.out.println("Not Weird");
            }
        }
        else if(n%2==0){
            if(n>=6 && n<=20){
                System.out.println(" Weird");
            }
        }
        else if(n%2==0){
            if(n>20){
                System.out.println("Not Weird");
            }
        }

    }

}
