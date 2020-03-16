package March15_2020;

import javax.swing.plaf.basic.BasicMenuUI;

public class DesignEmployee {
    int EmployeeID;
    String EmployeeName;
    String EmployeeDepartment;
    double salary;
    int ContractType;

    public DesignEmployee() {
        EmployeeID = 1234;
        EmployeeName = "AGH";
        EmployeeDepartment = "HR";
        salary = 5500;
        ContractType = 1;
    }

    public DesignEmployee(int number1, String AGH, String HR, double number2, int number3) {
        EmployeeID = 1234;
        EmployeeName = AGH;
        EmployeeDepartment = HR;
        salary = 5500;
        ContractType = 1;

    }

    public void weeklyPayment() {
        System.out.println("Payment is: " + (salary));
    }

    public void biweeklyPayment() {
        System.out.println("Payment is: " + (salary / 2));
    }

    @Override
    public String toString() {
        return "DesignEmployee{" +
                "EmployeeID=" + EmployeeID +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", EmployeeDepartment='" + EmployeeDepartment + '\'' +
                ", salary=" + salary +
                ", ContractType=" + ContractType +
                '}';
    }

    public void employeeInfo() {
        System.out.println("Your ID is " + EmployeeID);
        System.out.println("Employee name is: " + EmployeeName);
        System.out.println("Your Department is " + EmployeeDepartment);
        System.out.println("Your salary is " + salary);
        System.out.println("Your contract type is " + ContractType);
    }

    public static void main(String[] args) {
        DesignEmployee myObj = new DesignEmployee();
        System.out.println(myObj.EmployeeID);
        System.out.println(myObj.EmployeeName);
        System.out.println(myObj.EmployeeDepartment);
        System.out.println(myObj.salary);
        System.out.println(myObj.ContractType);

        DesignEmployee myObj2 = new DesignEmployee();
        myObj2.employeeInfo();
        DesignEmployee myObj3 =new DesignEmployee( 1234,"AGH","HR",5500,1);
        myObj3.employeeInfo();

    }
}

