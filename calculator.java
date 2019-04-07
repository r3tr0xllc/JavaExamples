package com.company;

import java.util.Scanner;

public class calismalar {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int first_num,second_num;
        System.out.println("PLEASE İNPUT FİRST NUMBER :");
        first_num=input.nextInt();
        System.out.println("PLEASE İNPUT SECOND NUMBER");
        second_num=input.nextInt();

        int operation, result;
        System.out.println("PRESS 1 FOR ADDİTİON, 2 FOR SUBTRACTİON, 3 FOR MULTİPLİCATİON AND 4 FOR DİVİSİON");
        operation=input.nextInt();

        if (operation==1){
            result=first_num+second_num;
            System.out.println("ADDİTİNG :" +result);
        }

        if (operation==2){
            result=first_num-second_num;
            System.out.println("SUBTRACTİNG :" +result);
        }

        if (operation==3){
            result=first_num*second_num;
            System.out.println("MULTİPLİCATİNG :" +result);
        }

        if (operation==4){
            result=first_num/second_num;
            System.out.println("DİVİDİNG :" +result );
        }
    }
}
