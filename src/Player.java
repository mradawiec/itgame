public class Player {
    Skills skills;
    Project project;
    public double money = 3000;

    public Player() {
    }

    public Player(Skills skills) {
        this.skills = skills;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    public void ifComplexProject() {
        if(getProject().getDifficulty().equals("complex")) {
            double temp = project.getPrice();
            temp = temp/2;
            money = temp+money;
            project.setPrice(temp);
        }
    }
}
