package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int date, month, year, salary;
        float tax = 0;
        System.out.println("Enter your name: ");
        s = sc.nextLine();
        System.out.println("Enter your date: ");
        date = sc.nextInt();
        System.out.println("Enter your month: ");
        month = sc.nextInt();
        System.out.println("Enter your year: ");
        year = sc.nextInt();
        System.out.println("Enter your salary in Lakh: ");
        salary = sc.nextInt();
        if (salary == 5) {
            tax = (500000 * 20) / 100;
        } else if (salary == 4) {
            tax = (15 * 400000) / 100;
        } else if (salary == 3) {
            tax = (10 * 300000) / 100;
        } else if (salary == 2) {
            tax = (5 * 200000) / 100;
        }
        System.out.println("Name:" + s);
        System.out.println("Date of Birth:" + date + "/" + month + "/" + year);
        System.out.println("Salary:" + salary+"L");
        System.out.println("Tax:" + tax+"Rs");

    }
}
