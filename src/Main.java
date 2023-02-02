import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Player player = new Player("Marek", new Skills(true, true, true, false, true, true), 3900.00);
        List<Subcontractors> subc = new ArrayList<>();
        subc.add(new Subcontractors("Best student", 5000.00, 0, 0, new Skills(rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean())));
        subc.add(new Subcontractors("Average student", 3900.00, 10, 0, new Skills(rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean())));
        subc.add(new Subcontractors("Weak boii", 3100.00, 20, 20, new Skills(rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean())));
        Scanner scan = new Scanner(System.in);
        Incrementer incrementer = new Incrementer();
        EmployeeGenerator generatorEmployee = new EmployeeGenerator();
        boolean isWorkingDay = incrementer.workingDay;

        List<Project> projects = ProjectGenerator.start(3);
        Scanner scanner = new Scanner(System.in);
        System.out.println("List of available projects:");
        for (int i = 0; i < projects.size(); i++) {
            System.out.println(i + 1 + ") " + projects.get(i));
        }
        System.out.print("Choose number of project: ");
        int projectNumber = scanner.nextInt();

        List<Project> playerProjects = new ArrayList<>();
        playerProjects.add(projects.get(projectNumber - 1));

        while (true) {
                System.out.println("Date: " + incrementer.getCurrentDate());
                System.out.println("MENU");
                System.out.println("1. Sign contract for available projects");
                System.out.println("2. Spend day for looking opportunity to find new clients");
                System.out.println("3. Spend day for programming");
                System.out.println("4. Test code");
                System.out.println("5. Giveaway your ready to-go project to client");
                System.out.println("6. Hire new worker");
                System.out.println("7. Fire worker");
                System.out.println("8. Spend day to pay taxes");
                int choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        //pozyskanie projektu
                        break;
                    case 2:
                        //przeznacz dzien na szukanie klientów ale tylko jak masz pracownika ktory szuka
                        break;
                    case 3:
                        incrementer.isWorkingDay();
                        if(isWorkingDay == true){

                        }else {

                        }
                        //przeznacz dzien na programowanie
                        break;
                    case 4:
                        //przeznacz dzien na testowanie
                        break;
                    case 5:
                        //oddaj projekt klientowi
                        break;
                    case 6:
                        System.out.println("Who do you want to employ? 1 = Subcontractor | 2 = Employee (Programmer, Sales pearson, Tester");
                        int opt = scan.nextInt();
                        if(opt == 1) {
                            Subcontractors chosenSubcontractor = Subcontractors.chooseWorker(subc);
                            player.hireSubcontractor(chosenSubcontractor);
                            break;
                        }
                        if(opt == 2) {
                            System.out.println("Select specialisation: ");
                            System.out.println(">1: Programmer");
                            System.out.println(">2: Sales pearson");
                            System.out.println(">3: Tester");
                            int type = scan.nextInt();
                            System.out.println(generatorEmployee.generateEmployee(type));
                            System.out.println("Do you want to hire this pearson? 1=yes 2=no");
                            int choose = scan.nextInt();
                            if (choose == 1) {
                                System.out.println("Congratulations!");
                                player.hireEmployee(generatorEmployee.generateEmployee(type));
                            }else if(choose == 2){
                                break;
                            }
                        }
                        break;
                    case 7:

                        break;
                    case 8:
                        //rozlicz sie
                        break;
                    default:
                        //pomijaj dzien
                }
            incrementer.incrementDay();
                }
            }
        }

