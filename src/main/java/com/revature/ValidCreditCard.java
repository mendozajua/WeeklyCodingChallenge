package com.revature;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ValidCreditCard {
    public static void main(String[] args) {
        String test1 = "1234567890123456"; // should fail
        String test2 = "1234567890123452";//should be true
        //so we should have false then true
        System.out.println(creditCardChecker(test1));
        System.out.println(creditCardChecker(test2));

    }

    public static boolean creditCardChecker(String nums){
        List<String> strArray = Arrays.stream(nums.split("")).collect(Collectors.toList());
        int lastDigit = Integer.parseInt(strArray.get(strArray.size()-1));
        System.out.println("Normal list:"+ strArray + " and last digit is :" + lastDigit);

        Collections.reverse(strArray);
        System.out.println("Reversed" + strArray);
        int evenSummation = 0;
        int oddSummation = 0;
        for (int i = 1; i< strArray.size() ; i++){
            if(i%2 ==1){
                if(Integer.parseInt(strArray.get(i))*2>=10){
                    oddSummation+=selectiveDoubling(strArray.get(i));
                }else{
                    oddSummation += 2* Integer.parseInt(strArray.get(i));
                }
            }else{
                evenSummation+= Integer.parseInt(strArray.get(i));
            }
        }
        String[] tmp = String.valueOf(evenSummation+oddSummation).split("");
        int checker = Integer.parseInt(tmp[tmp.length - 1]);
        return 10 - checker == lastDigit;
    }

    public static int selectiveDoubling(String s){
        int temp = Integer.parseInt(s) *2;
        String[] temp2 = String.valueOf(temp).split("");
        int result = 0;
        for(int i=0; i< temp2.length; i++){
            result += Integer.parseInt(temp2[i]);
        }
        return result;
    }
}
