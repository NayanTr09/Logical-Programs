package com.logicalprograms;

public class ReverseNumber {
    public static void main(String args[]) {
        int reverse = 0;
        System.out.println("Enter a number");
        int num = Utility.getint();
        while(num != 0) {
            reverse = ((reverse * 10) + num % 10);
            num = num/10;
        }
        System.out.println("Reverse of this number is : " + reverse);
    }
}
