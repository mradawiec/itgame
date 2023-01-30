import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Skills playerSkills = new Skills(true,true,true,false,true,true);
        int startProject = Integer.parseInt(System.console().readLine());
        ProjectGenerator.start(startProject);
    }
}