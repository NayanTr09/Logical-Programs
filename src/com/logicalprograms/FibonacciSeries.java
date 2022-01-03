package com.logicalprograms;

public class FibonacciSeries {
    static void PrintFibonacci(){
        int a = 0;
        int b = 1;
        System.out.println("Enter number till which number Fibonacci Series needs to be generated ");
        int number = Utility.getint();
        for (int i = 1;i<=number;i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.println("" +c);
        }
    }
    public static void main(String args[]){
        PrintFibonacci();
    }
}

