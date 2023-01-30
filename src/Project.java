import java.util.List;
public class Project {
    private String name;
    private List<Skills> skills;
    private int deliveryDays;
    private double penalty;
    private double price;
    private int paymentDays;
    private String difficulty;
    private String clientType;
    private int paymentDelay;
    private int penaltyAvoid;
    private int notWorking;
    private boolean lossContract = true;
    private int zeroPayment;


    public Project(String name, List<Skills> skills, int deliveryDays, double penalty, double price, int paymentDays, String difficulty, String client, int paymentDelay, int penaltyAvoid, int notWorking, int zeroPayment) {
        this.name = name;
        this.skills = skills;
        this.deliveryDays = deliveryDays;
        this.penalty = penalty;
        this.price = price;
        this.paymentDays = paymentDays;
        this.difficulty = difficulty;
        this.clientType = client;
        this.paymentDelay = paymentDelay;
        this.penaltyAvoid = penaltyAvoid;
        this.notWorking = notWorking;
        this.zeroPayment = zeroPayment;
    }

    public String getDifficulty() {
        return difficulty;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", skills=" + skills +
                ", deliveryDays=" + deliveryDays +
                ", penalty=" + penalty +
                ", price=" + price +
                ", paymentDays=" + paymentDays +
                ", difficulty='" + difficulty + '\'' +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getClientType() {
        return clientType;
    }
    public static isClient(){
        if()
    }
}
