package day14;

import java.util.Random;

public class MentEx {
    public static void main(String[] args) {

       Random yeni=new Random();
       int yeni2=yeni.nextInt(5)+65;//0-26  65-91
        char grade =(char)yeni2;
        switch(grade) {
            case 'A' :
                System.out.println("Excellent!");
                break;
            case 'B' :
            case 'C' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You passed");
            case 'F' :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");
    }

}}
