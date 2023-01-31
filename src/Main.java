import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Player player = new Player("Marek", new Skills(true, true, true, false, true, true), 3900.00);
        int startProject = Integer.parseInt(System.console().readLine());
        ProjectGenerator.start(startProject);
        List<Subcontractors> subcontractors = new ArrayList<>();
        subcontractors.add(new Subcontractors("Best student", 5000.00, 0, 0, new Skills(rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean())));
        subcontractors.add(new Subcontractors("Average student", 3900.00, 10, 0, new Skills(rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean())));
        subcontractors.add(new Subcontractors("Weak boii", 3100.00, 20, 20, new Skills(rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean())));
        Scanner scan = new Scanner(System.in);
        /*LocalDate currentDate;

        public void date(){
            this.currentDate = LocalDate.of(2020, 1, 1);
        }

        public void incrementDay() {
            currentDate = currentDate.plusDays(1);
        }

        public LocalDate getCurrentDate() {
            return currentDate;
        }
*/
        while (true) {
            int choice = -1;
            while (choice != 0) {
                System.out.println("Date: " + incrementer.getCurrentDate());
                System.out.println("IT SIM BROS");
                System.out.println("MENU");
                System.out.println("1. Sign contract for available projects");
                System.out.println("2. Spend day for looking opportunity to find new clients");
                System.out.println("3. Spend day for programming");
                System.out.println("4. Test code");
                System.out.println("5. Giveaway your ready-to-go project to client");
                System.out.println("6. Hire new worker");
                System.out.println("7. Fire worker");
                System.out.println("8. Spend day to pay taxes");
                choice = scan.nextInt();
            }
        }
    }
}
