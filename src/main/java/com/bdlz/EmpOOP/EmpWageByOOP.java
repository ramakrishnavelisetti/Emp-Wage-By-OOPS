package com.bdlz.EmpOOP;

public class EmpWageByOOP {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static  double empCheck = Math.floor(Math.random() * 10) % 3;
    public static int empHrs = 0;
    public static int empWage = 0;

    public static void wageUsingSwitchCase() {
        switch ((int) empCheck) {
            case IS_FULL_TIME:
                empHrs = 8;
                System.out.println("Salary for Full Time");
                break;
            case IS_PART_TIME:
                empHrs = 4;
                System.out.println("Salary for Part Time");
                break;
            default:
                empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage: " + empWage);
    }
    public static void main(String[] args) {
        wageUsingSwitchCase();
    }
}
