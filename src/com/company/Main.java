package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        BrainFuck bf = new BrainFuck();
        Context ct = new Context();

        System.out.println("Enter the code:");
        ct.setCode(input.nextLine());

        System.out.println("Output:");
        bf.interpret(ct.getCode(), 0);
    }
}