import java.util.List;

public class Player {
    String name;
    Skills skills;
    Project project;
    public double money;
    Subcontractors subcontractors;
    public List<Employee> employees;
    public Player(String name, Skills skills, double money) {
        this.name = name;
        this.skills = skills;
        this.money = money;
    }
    public Project getProject() {
        return project;
    }
    public void setProject(Project project) {
        this.project = project;
    }
    public void ifComplexProject(Project project) {
        if(getProject().getDifficulty().equals("complex")) {
            double temp = project.getPrice();
            temp = temp/2;
            money = temp+money;
            project.setPrice(temp);
        }
    }
    public void hireSubcontractor(Subcontractors subcontractors){
        this.subcontractors = subcontractors;
        this.money -= money;
    }
    public void hireEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", subcontractors=" + subcontractors +
                '}';
    }
}
