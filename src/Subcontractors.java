import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subcontractors {
    String name;
    double price;
    int delayRisk;
    int qualityRisk;
    Skills skills;
    public List<Subcontractors> subcontractors = new ArrayList<>();

    public Subcontractors(String name, double price, int delayRisk, int qualityRisk, Skills skills) {
        this.name = name;
        this.price = price;
        this.delayRisk = delayRisk;
        this.qualityRisk = qualityRisk;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Subcontractors{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", delayRisk=" + delayRisk +
                ", qualityRisk=" + qualityRisk +
                ", skills=" + skills +
                '}';
    }

    public static Subcontractors chooseWorker(List<Subcontractors> subcontractors) {
        System.out.println("List of available subcontractors");
        for (int i = 0; i < subcontractors.size(); i++) {
            System.out.println(i + 1 + ") " + subcontractors.get(i).name);
        }
        System.out.print("Choose number of subcontractor: ");
        Scanner scanner = new Scanner(System.in);
        int subcNumber = scanner.nextInt();
        return subcontractors.get(subcNumber - 1);
    }
}
