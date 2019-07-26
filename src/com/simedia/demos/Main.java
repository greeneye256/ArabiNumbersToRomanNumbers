package com.simedia.demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int div = 1000;
        Scanner scn = new Scanner(System.in);
        System.out.print("Please insert a number between 1 and 3999: ");
        int arabicNumber = scn.nextInt();
        if (arabicNumber>3999 || arabicNumber==0){
            System.exit(1);
        }
        int num = arabicNumber;
        ArrayList<Character> romanNumber = new ArrayList<Character>();
        int[] array = new int[4];
        for (int i = 0; i < 4; i++) {
            array[i] = num / div;
            num %= div;
            div/=10;
        }
        for (int i = 3; i >= 0 ; i--) {
            switch (i){
                case 3:
                    if (array[3]==9) {
                        romanNumber.add(0,'X');
                        romanNumber.add(0,'I');
                    }
                    if (array[3]==4) {
                        romanNumber.add(0,'V');
                        romanNumber.add(0,'I');
                    }
                    else {
                        switch (array[3]){
                            case 1:
                                romanNumber.add(0,'I');
                                break;
                            case 2:
                                romanNumber.add(0,'I');
                                romanNumber.add(0,'I');
                                break;
                            case 3:
                                romanNumber.add(0,'I');
                                romanNumber.add(0,'I');
                                romanNumber.add(0,'I');
                                break;
                            case 5:
                                romanNumber.add(0,'V');
                                break;
                            case 6:
                                romanNumber.add(0,'I');
                                romanNumber.add(0,'V');
                                break;
                            case 7:
                                romanNumber.add(0,'I');
                                romanNumber.add(0,'I');
                                romanNumber.add(0,'V');
                                break;
                            case 8:
                                romanNumber.add(0,'I');
                                romanNumber.add(0,'I');
                                romanNumber.add(0,'I');
                                romanNumber.add(0,'V');
                                break;
                        }
                    }
                    break;
                case 2:
                    if (array[2]==9) {
                        romanNumber.add(0,'C');
                        romanNumber.add(0,'X');
                    }
                    if (array[2]==4) {
                        romanNumber.add(0,'L');
                        romanNumber.add(0,'X');
                    }
                    else {
                        switch (array[2]){
                            case 1:
                                romanNumber.add(0,'X');
                                break;
                            case 2:
                                romanNumber.add(0,'X');
                                romanNumber.add(0,'X');
                                break;
                            case 3:
                                romanNumber.add(0,'X');
                                romanNumber.add(0,'X');
                                romanNumber.add(0,'X');
                                break;
                            case 5:
                                romanNumber.add(0,'L');
                                break;
                            case 6:
                                romanNumber.add(0,'X');
                                romanNumber.add(0,'L');
                                break;
                            case 7:
                                romanNumber.add(0,'X');
                                romanNumber.add(0,'X');
                                romanNumber.add(0,'L');
                                break;
                            case 8:
                                romanNumber.add(0,'X');
                                romanNumber.add(0,'X');
                                romanNumber.add(0,'X');
                                romanNumber.add(0,'L');
                                break;
                        }
                    }
                    break;
                case 1:
                    if (array[1]==9) {
                        romanNumber.add(0,'M');
                        romanNumber.add(0,'C');
                    }
                    if (array[1]==4) {
                        romanNumber.add(0,'D');
                        romanNumber.add(0,'C');
                    }
                    else {
                        switch (array[1]){
                            case 1:
                                romanNumber.add(0,'C');
                                break;
                            case 2:
                                romanNumber.add(0,'C');
                                romanNumber.add(0,'C');
                                break;
                            case 3:
                                romanNumber.add(0,'C');
                                romanNumber.add(0,'C');
                                romanNumber.add(0,'C');
                                break;
                            case 5:
                                romanNumber.add(0,'D');
                                break;
                            case 6:
                                romanNumber.add(0,'C');
                                romanNumber.add(0,'D');
                                break;
                            case 7:
                                romanNumber.add(0,'C');
                                romanNumber.add(0,'C');
                                romanNumber.add(0,'D');
                                break;
                            case 8:
                                romanNumber.add(0,'C');
                                romanNumber.add(0,'C');
                                romanNumber.add(0,'C');
                                romanNumber.add(0,'D');
                                break;
                        }
                    }
                    break;
                case 0:
                    switch (array[0]){
                        case 1:
                            romanNumber.add(0,'M');
                            break;
                        case 2:
                            romanNumber.add(0,'M');
                            romanNumber.add(0,'M');
                            break;
                        case 3:
                            romanNumber.add(0,'M');
                            romanNumber.add(0,'M');
                            romanNumber.add(0,'M');
                            break;
                    }
            }
        }
        String word= new String();
        for(char c:romanNumber){
            word= word+ c;
        }
        System.out.println(word);
    }
}
