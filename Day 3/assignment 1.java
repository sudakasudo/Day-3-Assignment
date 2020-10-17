package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[5];
        int i,sum=0;
        float avg;
        System.out.println("Enter your 5 subject marks: ");
        for(i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            sum=sum+arr[i];
        }
        avg=sum/5;
        if(avg>90 && avg<100)
            System.out.println("Grade :A ; Percentage:"+avg);
        else if(avg>80 && avg<90)
            System.out.println("Grade :B ; Percentage:"+avg);
        else if(avg>70 && avg<80)
            System.out.println("Grade :C ; Percentage:"+avg);
        else if(avg>60 && avg<70)
            System.out.println("Grade :D  Percentage:"+avg);
        else
            System.out.println("Grade :E  Percentage:"+avg);
    }
}
