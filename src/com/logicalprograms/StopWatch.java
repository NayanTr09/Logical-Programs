package com.logicalprograms;

public class StopWatch {
    public static void main(String args[])
    {
        System.out.println("Press any character and then ENTER to start stopwatch");
        char startch = Utility.getchar();
        long start = System.currentTimeMillis();
        System.out.println(("Press any character and then ENTER to stop stopwatch"));
        char stopch = Utility.getchar();
        long stop = System.currentTimeMillis();
        float conv = (float)(stop - start)/1000;
        System.out.println("Time in seconds is " +conv);
    }
}


