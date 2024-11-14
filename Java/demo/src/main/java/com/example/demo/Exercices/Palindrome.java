package com.example.demo.Exercices;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Palindrome {

    public boolean isPalindrome(String str){

        if (str == null || str.isEmpty()){
            return false;
        }
        char[] strarray = str.toCharArray();
        for (int i = 0 ; i< strarray.length/2;i++){
            if (strarray[i] !=strarray[strarray.length-i-1])
            {
                return false;
            }
        }
        return true;

    }

    public boolean isPalindrome2(String str){

        if (str == null || str.isEmpty()){
            return false;
        }
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        StringBuilder sb = new StringBuilder(str);
        //char[] strarray = str.toCharArray();
        for (int i = 0 ; i< sb.length()/2;i++){
            if (sb.charAt(i) != sb.charAt(sb.length()-i-1))
            {
                return false;
            }
        }
        return true;

    }

}
