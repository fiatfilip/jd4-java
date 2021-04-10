package IuliaV;

public class Homeworks {
    public static void main(String[] args) {
        int[] testArray = {157,14,87,23,5,17,234};
        WeekOne assignment = new WeekOne();
        System.out.println("first 100 numbers sum = " + assignment.calculateSum());
        System.out.println("assignment.minFromArray(testArray) = " + assignment.minFromArray(testArray));
        System.out.println("assignment.maxDigit(3872512) = " + assignment.maxDigit(3872512));
        System.out.println("assignment.isNumberPalindrome(1234321) = " + assignment.isNumberPalindrome(1234321));
        System.out.println("assignment.primeNumbers(27) = " + assignment.primeNumbers(27));
    }
}
