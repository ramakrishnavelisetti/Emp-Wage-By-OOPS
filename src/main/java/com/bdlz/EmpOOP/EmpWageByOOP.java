package com.bdlz.EmpOOP;

public class EmpWageByOOP implements IEmployeeWageComputation {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    private int numOfCompany = 0;
    private CompanyInfo[] companyInfoArray;

    public void addCompanyInfo(String companyName, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
        companyInfoArray[numOfCompany] = new CompanyInfo(companyName, empRatePerHr, numOfWorkingDays, maxHrsPerMonth);
        numOfCompany++;
    }

    public EmpWageByOOP() {
        companyInfoArray = new CompanyInfo[3];
    }


    public void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyInfoArray[i].setTotalWage(this.computeEmpWage(companyInfoArray[i]));
            System.out.println(companyInfoArray[i]);
        }
    }

    public static int computeEmpWage(CompanyInfo companyInfo) {
        int empHrs = 0;
        int totalWage = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalWorkingDays <= companyInfo.getNumOfWorkingDays() && totalEmpHrs < companyInfo.getMaxHrsPerMonth()) {
            totalWorkingDays++;
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
            int empWage = empHrs * companyInfo.getEmpRatePerHr();
            totalEmpHrs += empHrs;
            totalWage += empWage;
        }
        return totalWage;
    }
    public static void main(String[] args) {
        IEmployeeWageComputation employeeWage = new EmpWageByOOP();
        ((EmpWageByOOP) employeeWage).addCompanyInfo("Dmart", 20, 20, 100);
        ((EmpWageByOOP) employeeWage).addCompanyInfo("JIO", 25, 22, 110);
        ((EmpWageByOOP) employeeWage).addCompanyInfo("Airtel", 27, 26, 120);
        ((EmpWageByOOP) employeeWage).computeEmpWage();

    }
}