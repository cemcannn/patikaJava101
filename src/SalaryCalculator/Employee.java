package SalaryCalculator;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary>1000) {
            return (this.salary*3)/1000;
        } else {
            return 0;
        }
    }

    public double bonus() {
        if (this.workHours>40) {
            return (this.workHours-40)*30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        if (2022-this.hireYear<10) {
            return (this.salary*5)/100;
        } else if(2022-hireYear<20) {
            return (this.salary*10)/100;
        } else {
            return (this.salary*15)/100;
        }
    }

    public String toString() {
        System.out.println("------------------------------------------" +
                "\nName of employee : " + this.name +
                "\nSalary of employee : " + this.salary +
                "\nWork hours of employee : " + this.workHours +
                "\nFire year of employee : " + this.hireYear +
                "\nTax amount of employee : " + tax() +
                "\nBonus amount of employee : " + bonus() +
                "\nRaise amount of salary : " + raiseSalary() +
                "\nSalary amount with taxes deducted and bonus added : " + (salary + bonus()+tax()) +
                "\nTotal salary of employee : " + (salary+raiseSalary()));
        return null;
    }
}
