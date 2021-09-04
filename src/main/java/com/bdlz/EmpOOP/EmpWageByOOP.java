package com.bdlz.EmpOOP;

public class EmpWageByOOP {
    public static void main(String[] args) {
        empPresentOrAbsent();
    }
    public static void empPresentOrAbsent() {
        int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            System.out.println("employee is Present");
        } else {
            System.out.println("employee is Absent");
        }
    }
}
