public class Programmer extends Employee{
    public double accuracy;
    public double punctuality;
    public Programmer(String name, double salary, Skills skills, double expenses) {
        super(name, salary, skills, expenses);
        this.accuracy = accuracy;
        this.punctuality = punctuality;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public double getPunctuality() {
        return punctuality;
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
        return "Programmer{" +
                "accuracy=" + accuracy +
                ", punctuality=" + punctuality +
                ", salary=" + salary +
                ", skills=" + skills +
                ", expenses=" + expenses +
                ", name='" + name + '\'' +
                '}';
    }
}
