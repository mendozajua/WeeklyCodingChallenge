package com.revature.week8;

public class TwoVariableSwap {

    public static void main(String[] args){
        int num1 = 17;
        int num2 = 9;
        TwoVariableSwap driver = new TwoVariableSwap();
        driver.swapNumbers(num1, num2);

    }

    public void swapNumbers(int x, int y){
        System.out.println("Before Swap \nx:" + x + "\ny:" + y );
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("After Swap \nx:" + x + "\ny:" + y);
    }
}
