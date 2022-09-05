package com.blz.employee.wage;

import java.util.Random;

public class EmployeeWage {
    public static void main(String args[]){
        System.out.println("Welcome to Employee Wage Computation Program.");

        int wagePerHour = 20;
        int fullDayWorkingHour = 8;
        int halfDayWorkingHour = 4;
        int salary = 0;

        Random random = new Random();
        int randomNum = random.nextInt(3);
        if(randomNum == 1) {
            System.out.println("Employee is present.");
            salary = wagePerHour * fullDayWorkingHour;
        } else if (randomNum == 2) {
            System.out.println("Employee is present for the half day.");
            salary = wagePerHour * halfDayWorkingHour;
        } else
            System.out.println("Employee is absent.");
        System.out.println("Employee Salary is: "+salary);
    }
}
