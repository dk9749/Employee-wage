package com.bridgelabz;

public class EmpWageForMultipleCompany {
    int partTime = 1;
    int fullTime = 2;

    public static int calculateWage(String company, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        while (totalEmpHrs <= maxWorkingHrs && totalWorkingDays <= maxWorkingDays) {
            totalWorkingDays++;
            int random = (int) (Math.floor(Math.random() * 10) % 3);
            switch (random) {
                case 1:
                    empHrs = 4;
                    break;
                case 2:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Days: " + totalWorkingDays + ", Hours: " + totalEmpHrs);
        }
        int totalEmpWage = totalEmpHrs * wagePerHr;
        System.out.println("Total Employee Wage For Company \"" + company + "\" Is: " + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        calculateWage("Tata", 20, 24, 120);
        calculateWage("Burial", 19, 27, 100);


    }
}

