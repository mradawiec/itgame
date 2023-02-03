public class Salespearson extends Employee {
    public Salespearson(String name, double salary, Skills skills, double expenses, ProjectGenerator projectGenerator) {
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

    @Override
    public String toString() {
        return "Salespearson{" +
                "salary=" + salary +
                ", skills=" + skills +
                ", expenses=" + expenses +
                ", name='" + name + '\'' +
                '}';
    }
}
