package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String inD = "";
        while (in.hasNextLine()) {
            String inputDate = in.nextLine();
            inD += inputDate;
        }
            Palindrom call=new Palindrom();
            if(call.ChetPalindrom(inD).length()>call.NechetPalindrom(inD).length()){
                System.out.println(call.ChetPalindrom(inD));
            }
            else{
                System.out.println(call.NechetPalindrom(inD));
            }
        }
    }
