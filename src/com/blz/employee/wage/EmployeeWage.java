package com.blz.employee.wage;

import java.util.Random;

public class EmployeeWage {
    public static void main(String args[]){
        System.out.println("Welcome to Employee Wage Computation Program.");

        int wagePerHour = 20;
        int fullDayWorkingHour = 8;
        int halfDayWorkingHour = 4;
        int workingDayPerMonth = 20;
        int monthlySalary = 0;
        int salary = 0;

        Random random = new Random();
        int randomNum = random.nextInt(3);

        for (int i = 0; i < workingDayPerMonth; i++) {
        switch (randomNum) {
            case 0:
                System.out.println("Employee is absent.");
                break;
            case 1:
                System.out.println("Employee is present.");
                salary = wagePerHour * fullDayWorkingHour;
                break;
            case 2:
                System.out.println("Employee is present for the half day.");
                salary = wagePerHour * halfDayWorkingHour;
                break;
            }
            monthlySalary += salary;
        }
        System.out.println("Employee Monthly Salary is: "+monthlySalary);
    }
}
