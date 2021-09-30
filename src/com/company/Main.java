package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number 1-5");
        int numEntered = input.nextInt();

        for(int num = 1; num<= numEntered; num++){
            for(int i = 0; i <= num; i++){
                System.out.print("1");
            }
            System.out.println();
        }
        for(int num = numEntered - 1; num>0; num--){
            for(int i = 0; i<= num; numEntered++);{
               System.out.print("1");
            }
            System.out.println();
        }

    }
}
