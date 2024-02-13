package org.example;
/*
Armstrong sayıları, bir sayının rakamlarının küpleri toplamı, o sayıya eşit olduğunda, o sayıya Armstrong sayısı denir.
Örneğin, 153 bir Armstrong sayısıdır çünkü 1³+5³+3³ = 1+125+27 = 153

*/


public class Main {
    public static void main(String[] args) {
        System.out.println("Armstrong sayıları (100-999):");
        for (int i = 100; i <= 999; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i);
            }
        }
    }

    // Bir sayının Armstrong sayısı olup olmadığını kontrol eden fonksiyon
    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }
        return sum == originalNumber;
    }
}