package com.logicalprograms;

import java.util.Scanner;

public class Utility {

    public static final Scanner scan = new Scanner(System.in);
    public static char getchar() {
        return scan.next().charAt(0);
    }

    public static int getint(){
        return scan.nextInt();
    }
}

