package IuliaV;

import java.util.ArrayList;
import java.util.List;

public class WeekOne {
    public int calculateSum() {
        int sum = 0;
        for (int i = 1; i<+100; i++) {
            sum += i;
        }
        return sum;
    }

    public int minFromArray(int[] array) {
        int min = array[0];
        for (int i=1; i<array.length; i++) {
            min = Math.min(min,array[i]);
        }
        return min;
    }

    public int maxDigit(int number) {
        int maxDigit = 0;
        while (number > 0) {
            if (number % 10 > maxDigit) {
                maxDigit = number % 10;
            }
            number/= 10;
        }
        return maxDigit;
    }

    public boolean isNumberPalindrome(int numberToCheck) {
        //does not work if incoming is eg: 019910; how to declare such construct, or it cannot exist as number?
        String string1;
        String string2;
        String numberToString = String.valueOf(numberToCheck);
        int numberLength = numberToString.length();
        if (numberToString.length()%2 == 0) {
            string1 = numberToString.substring(0, numberLength/2);
            string2 = numberToString.substring(numberLength/2);
        } else {
            string1 = numberToString.substring(0, numberLength/2);
            string2 = numberToString.substring(numberLength/2+1);
        }
        return string1.equals(reverseString(string2));
    }

    public List<Integer> primeNumbers(int number) {
        List<Integer> primes = new ArrayList<>();
//        int[] myArr;
//        cautare => int[]
//        multiple add: linked list
        boolean isPrime;
        int maxCheck = (int) Math.sqrt(number);
        //add check for number 0 or 1
        primes.add(1);
        primes.add(2);
        for(int i=3; i<=number; i++) {
            isPrime = true;
            for (int j=1; j<primes.size(); j++) {
                if (i%primes.get(j) == 0) {
                    isPrime = false;
                    j = primes.size();
                }
//                if (primes.get(j) >= maxCheck) {
                // why isn't this working?
//                    j = primes.size();
//                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }
        return primes;
    }

    private String reverseString(String str){
//      https://www.javatpoint.com/how-to-reverse-string-in-java
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
