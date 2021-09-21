package com.revature.week7;

public class ActualMemorySize {

    public static void main(String[] args){
        ActualMemorySize driver = new ActualMemorySize();
        driver.actualSize("512MB");//should be 476
        driver.actualSize("1GB");//should be 954MB
        driver.actualSize("2GB");//should be 1.85
        driver.actualSize("4GB");//should be 3.72
        driver.actualSize("32GB");//should be 29.76
    }

    public void actualSize(String str){
        int size = str.length();
        String unit = str.substring(size-2,size);
        String contentSize = str.substring(0,size-2);
        double content = Double.parseDouble(contentSize);
        double loss = content*.07;

        //here we determine if we need to go from GB to MB,
        //we could add more cases for more memory. just check int and unit.
        if(content==1){
            unit = "MB";
            content = 1024.0;
            loss = Math.round((content*.07)/10.0) * 10;
        }

        double result = content-loss;


        System.out.println("Original Size: " + contentSize + " unit: " + unit);
        System.out.printf("Loss:" + loss + " Result = %.2f" + unit,result);
        System.out.println();
        System.out.println("================================================");

    }
}
