package ro.siit.temaDumi;

import java.util.ArrayList;
import java.util.Random;

public class Tema1 {
    public static void main(String[] args) {

//        Exercise 1: Calculate the sum of the first 100 nr
        System.out.println("Sum is: "+suma(100));

//        Exercise 2: Display the smallest number from an array
        minValue(12);


//        Exercise 3: Display the max digit from a nr
        System.out.println("Max digit is "+ size(23480100));


//       Exercise 4: Check if a number is palindrom
        if (palindrom(1234321)){
            System.out.println("The number is a palindrome number" );
        }else {
            System.out.println("The number is not a palindrome number" );
            }

//        Exercise 5: Display all the prime numbers lower than a given number
        System.out.print("The prime nr are:");
        primiNr(15);


//end of program
    }


//      Calculate the sum of the first 100 nr -- Solution
    public static int suma(int n) {
        return n * (n + 1) / 2;
    }



//        Display the smallest number from an array -- Solution

    public static void minValue (int n) {
        Random rand = new Random();
        int a[];
        a = new int[n];
        int i, min;
        for (i = 0; i < n; i++) {
            a[i] = rand.nextInt(100);
        }
        min = a[0];
        for (i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Valoare minima este:" + min);
    }


    //        Exercise 3: Display the max digit from a nr -- Solution
    public static int size(int l) {
        int n = (Integer.toString(l).length());
        int maxDigit=0;
        for (int i=0;i<n; i++){
            if (maxDigit<l%10){
                maxDigit=l%10;
            }
            l=l/10;
        }

       return maxDigit;

    }



//        Exercise 4: Check if a number is palindrom -- Solution

    public static boolean palindrom(int a) {
        int nr = a;
        int inversNr = 0, nr1 = nr;

        while (nr1 != 0) {
            inversNr = inversNr * 10 + nr1 % 10;
            nr1 = nr1 / 10;
        }

        if (inversNr == nr) {
            return true;
        } else {
            return false;
        }
    }


    //        Exercise 5: Display all the prime numbers lower than a given number  -- Solution
        public static int[] primiNr(int a) {

//        initialise constants
        int i = 0, k = 0;
            boolean prime = false;
            int array[] = new int[a];

//            System.out.print(" 1; "+"2; ");

//        find the prime nr. and creating the array
            while (i < a) {
                if (i == 1) {
                    array[1] = 1;
                    k++;
                }
                if (i == 2) {
                    array[2] = 2;
                    k++;
                }
                prime = false;
                i++;
//        divide the number with each number under it to determine if the nr is or is not prime
                for (int j = 2; j < i; j++) {
                    if ((i % j) != 0) {
                        prime = true;
                    } else {
                        prime = false;
                        break;
                    }
                }
                if (prime == true) {
                    array[k] = i;
                    System.out.print(array[k]+"; ");
                }
            }

        return array;
        }

}
