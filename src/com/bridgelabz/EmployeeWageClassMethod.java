package com.bridgelabz;

public class EmployeeWageClassMethod {
    public static int empHr = 0;
    public static int empWage = 0;
    public static int empWagePerHr = 20;
    public static int totalWorkingDay = 20;
    public static int totalWorkingHr = 100;
    public static int totalEmpHrs = 0;
    public static int totalEmpWorkingDays = 0;

    public static void main(String[] args) {
        wageCalculation();
    }

    public static void wageCalculation() {
        while (totalEmpHrs <= totalWorkingHr && totalEmpWorkingDays < totalWorkingDay) {
            int empCheck = (int) Math.floor(Math.random() % 10 * 3);
            switch (empCheck) {
                case 1:
                    empHr = 8;
                    break;
                case 2:
                    empHr = 4;
                    break;
                default:
                    empHr = 0;
            }
            totalEmpHrs += empHr;
            totalEmpWorkingDays++;
        }
        System.out.println("Total Working Days: " + totalEmpWorkingDays + " & Total Working Hours: " + totalEmpHrs);

        empWage = totalEmpHrs * empWagePerHr;
        System.out.println("Employee Wage: " + empWage);
    }
}

