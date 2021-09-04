package com.bdlz.EmpOOP;

public class EmpWageByOOP {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NO_OF_WORKING_DAYS = 20;
    public static  double empCheck = Math.floor(Math.random() * 10) % 3;
    public static int empHrs = 0;
    public static int empWage = 0;
    public static int totalEmpWage = 0;

    public static void empWagePerMonth() {
        for (int day = 1; day<=NO_OF_WORKING_DAYS; day++) {
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Emp Wage: " + empWage);
        }
        System.out.println("Total Emp Wage For Month: " + totalEmpWage);
    }
    public static void main(String[] args) {
        empWagePerMonth();
    }
}
