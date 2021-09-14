public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if (this.salary < 1000){
            return 0;
        }else {
            return salary*0.03;
        }
    }

    public double bonus(){
        if (this.workHours >= 40){
            return (this.workHours -40)*30;
        }else
            return 0;
    }

    public double raiseSalary(){
        int yearCount = 2021 - hireYear;

        if (yearCount >= 20){
            return this.salary*0.15;

        }
        else if(yearCount >= 10){
            return this.salary*0.1;
        }else{
            return this.salary*0.05;
        }

    }

    public void print(){
        System.out.println("Name: " + this.name + "\n" + "Salary: " + this.salary + "\n" +
                "Work hours: " + this.workHours + "\n" + "Hire Year: " +this.hireYear + "\n" +
                "Tax: " + tax() + "\n" + "Bonus: " + bonus() + "\n" + "Raise Salary: " + raiseSalary() + "\n" +
                "Tax+bonus salary : " + (this.salary +bonus() - tax()) + "\n" + "totally salary: " +
                (this.salary+raiseSalary()));

    }
}
