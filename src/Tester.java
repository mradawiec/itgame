public class Tester extends Employee {

    public Tester(String name,double salary, Skills skills, double expenses) {
        super(name, salary, skills, expenses);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public Skills getSkills() {
        return super.getSkills();
    }

    @Override
    public double getExpenses() {
        return super.getExpenses();
    }
}