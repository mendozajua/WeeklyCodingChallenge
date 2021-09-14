package com.revature.week6;

public class Encryption {

    public static void main(String[] args){
        Encryption driver = new Encryption();
        String test1 = driver.rot13Encryption("math");
        System.out.println(test1); //should be zngu

        String reverseTest1 = driver.decryption(test1);
        System.out.println(reverseTest1);//reversed original word which is math;
    }

    public String rot13Encryption(String str){
        str = str.toLowerCase();
        final String alpha  = "abcdefghijklmnopqrstuvwxyz";

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i< str.length() ; i++){
            int temp = alpha.indexOf(str.charAt(i)) +13;
            if(temp > 26){
                temp = temp - 26;
            }
            sb.append(alpha.charAt(temp));
        }

        return sb.toString();
    }

    public String decryption(String str){
        str = str.toLowerCase();
        final String alpha  = "abcdefghijklmnopqrstuvwxyz";
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i<str.length(); i++){
            int temp = alpha.indexOf(str.charAt(i)) - 13;
            if(temp<0){
                temp = 26 - Math.abs(temp);
            }
            sb.append(alpha.charAt(temp));
        }
        return sb.toString();
    }
}
