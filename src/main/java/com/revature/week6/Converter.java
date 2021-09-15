package com.revature.week6;

public class Converter {

    public static void main(String[] args){
        Converter driver = new Converter();

        String test1 = driver.octalConverter(394);
        System.out.println(test1); // answer should be 612
        System.out.println(driver.octalConverter(257));//should be 401
        System.out.println(driver.octalConverter(520));//should be 1010
    }

    public String octalConverter(int num){
        StringBuffer sb = new StringBuffer();

        while(num>=8){
            int temp = num%8;
            num = num/8;
            sb.append(temp);
            if(num<8){
                temp = num%8;
                sb.append(temp);
            }
        }
        sb.reverse();
        return sb.toString();
    }

}
