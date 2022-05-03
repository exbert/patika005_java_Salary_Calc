public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double calculateTax() {
        if (this.salary < 1000) {
            return this.salary;
        } else {
            return (this.salary * 3.0) /100;
        }
    }

    double calculateBonus() {
        if (this.workHours > 40) {
           return  (this.workHours - 40) * 30.0;
        } else {
            return 0.0;
        }
    }

    double raiseSalary() {
        if (2021 - this.hireYear < 9) {
            return this.salary * 5.0 / 100;
        } else if ((2021 - this.hireYear) >= 9 && (2021 - this.hireYear) < 20) {
            return this.salary * 10.0 / 100;
        }
        return this.salary * 15.0 /100;
    }

    void printEmployeeInfo() {
        double tempTax = calculateTax();
        double tempBonus = calculateBonus();
        double tempRaise = raiseSalary();
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Working Hours : " + this.workHours);
        System.out.println("Hire Year : " + this.hireYear);
        System.out.println("Tax : " + tempTax);
        System.out.println("Bonus : " + tempBonus);
        System.out.println("Salary Increase : " + tempRaise);
        System.out.println("Salary with tax and bonus : " + (this.salary + tempBonus - tempTax));
        System.out.println("Total Salary : " + (this.salary + tempRaise));

    }
}
