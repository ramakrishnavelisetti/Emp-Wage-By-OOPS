package com.bdlz.EmpOOP;

public interface IEmployeeWageComputation {
        public void addCompanyInfo(String companyName, int empRatePerHr, int noOfWorkingDays, int maxHrsPerMonth);
        public void computeEmpWage();

    }

