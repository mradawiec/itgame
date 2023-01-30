import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProjectGenerator {
    private static Random random = new Random();
    private static String[] difficulties = {"easy", "medium", "complex"};
    private static String[] skills = {"front-end", "backend", "database", "mobile", "wordpress", "prestashop", "client"};
    private static String[] client = {"chilled", "demanding", "skrwl"};
    public static List<Project> generateProjects(int numberOfProjects) {
        List<Project> projects = new ArrayList<>();
        for(int i=0; i <numberOfProjects; i++) {
            String projectName = "Project " + (i+1);
            String difficulty = difficulties[random.nextInt(difficulties.length)];
            int numberOfSkills = 0;
            switch (difficulty) {
                case "easy":
                    numberOfSkills = 1;
                    break;
                case "medium":
                    numberOfSkills = random.nextInt(2) + 2;
                    break;
                case "complex":
                    numberOfSkills = random.nextInt(3) +3;
            }
            List<Skills> projectSkills = new ArrayList<>();
            for(int j=0; j < numberOfSkills; j++){
                String skill = skills[random.nextInt(skills.length)];
                int days = random.nextInt(31) + 1;
                projectSkills.add(new Skills(skill, days));
            }
            int deliveryDays = random.nextInt(31) + 1;
            double penalty = random.nextDouble() * 100;
            double price = random.nextDouble() * 1000;
            int paymentDays = random.nextInt(31) + 1;
            int paymentDelay = random.nextInt(100) + 1;
            int penaltyAvoid = random.nextInt(100) + 1;
            int notWorking = random.nextInt(100) + 1;
            int zeroPayment = random.nextInt(100) + 1;
            String clientType = client[random.nextInt(client.length)];
            projects.add(new Project(projectName, projectSkills, deliveryDays, penalty, price, paymentDays, difficulty, clientType, paymentDelay, penaltyAvoid, notWorking, zeroPayment));
        }
        return projects;
    }
    public static List<Project> start (int numberOfProjects) /*do zmiany*/{
        List<Project> projects = ProjectGenerator.generateProjects(3);
        for (Project project : projects) {
            if(project.getDifficulty().equals("easy") || project.getDifficulty().equals("medium"))
                System.out.println(project.toString());
    }
        return projects;
    }

}

