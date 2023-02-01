abstract class Employee {
    protected double salary;
    protected Skills skills;
    protected double expenses;
    protected String name;

    public Employee(String name,double salary, Skills skills, double expenses) {
        this.name = name;
        this.salary = salary;
        this.skills = skills;
        this.expenses = expenses;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Skills getSkills() {
        return skills;
    }

    public double getExpenses() {
        return expenses;
    }
}
