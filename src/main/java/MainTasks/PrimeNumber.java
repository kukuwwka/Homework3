package MainTasks;


import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int value;
        boolean isPrime = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        for (int a = 2; a <= number / 2; a++) {
            value = number % a;
            if (value == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " простое число");
        } else {
            System.out.println(number + " составное число");
        }
    }
}