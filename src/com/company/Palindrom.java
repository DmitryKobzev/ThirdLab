package com.company;

import java.util.Scanner;

public class Palindrom {

    public String  NechetPalindrom(String input) {
        int max = 0;
        String result = "";
        String str1="";
        for (int indexMiddle = 1; indexMiddle < input.length() - 1; indexMiddle++) {
            int left = indexMiddle - 1;
            int right=indexMiddle+1;
            char left_char ;
            char right_char ;
            int amount = 0;
                    while (left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
                        left_char = input.charAt(left--);
                        right_char = input.charAt(right++);
                        amount++;
                    }
            if (amount >= result.length() / 2) {
                result = input.substring(indexMiddle - amount, indexMiddle + amount + 1);
            }
            }
        return result;
        }

        public String  ChetPalindrom(String input) {
            int max = 0;
            String result = "";
            String str1="";
            for (int indexMiddle = 1; indexMiddle < input.length() - 1; indexMiddle++) {
                int left = indexMiddle ;
                int right=indexMiddle +1;
                char left_char ;
                char right_char ;
                int amount = 0;
                while (left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
                    left_char = input.charAt(left--);
                    right_char = input.charAt(right++);
                    amount++;
                }
                if (amount >= result.length() / 2) {
                    result = input.substring(indexMiddle - amount +1 , indexMiddle + amount + 1 );
                }
            }
            return result;
        }

    }

