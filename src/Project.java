import java.util.List;
public class Project {
    private String name;
    private List<Skills> skills;
    private int deliveryDays;
    private double penalty;
    private double price;
    private int paymentDays;
    private String difficulty;

    public Project(String name, List<Skills> skills, int deliveryDays, double penalty, double price, int paymentDays, String difficulty) {
        this.name = name;
        this.skills = skills;
        this.deliveryDays = deliveryDays;
        this.penalty = penalty;
        this.price = price;
        this.paymentDays = paymentDays;
        this.difficulty = difficulty;
    }
}
