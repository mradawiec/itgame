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
    private boolean lossContract;
    private int zeroPayment;
    private int monthPayDelay;
    boolean payDelay;
    boolean penAvoid;
    boolean notWrk;
    boolean zeroPay;
    boolean monthDelay;



    public Project(String name, List<Skills> skills, int deliveryDays, double penalty, double price, int paymentDays, String difficulty, String client, int paymentDelay, int penaltyAvoid, int notWorking, int zeroPayment, int monthPayDelay) {
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
        this.monthPayDelay = monthPayDelay;
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

    public int getPaymentDelay() {
        return paymentDelay;
    }

    public int getPenaltyAvoid() {
        return penaltyAvoid;
    }

    public int getNotWorking() {
        return notWorking;
    }

    public boolean isLossContract() {
        return lossContract;
    }

    public int getZeroPayment() {
        return zeroPayment;
    }

    public void setPayDelay(boolean payDelay) {
        this.payDelay = payDelay;
    }

    public void setPenAvoid(boolean penAvoid) {
        this.penAvoid = penAvoid;
    }

    public void setNotWrk(boolean notWrk) {
        this.notWrk = notWrk;
    }

    public void setZeroPay(boolean zeroPay) {
        this.zeroPay = zeroPay;
    }

    public void setLossContract(boolean lossContract) {
        this.lossContract = lossContract;
    }

    public int getMonthPayDelay() {
        return monthPayDelay;
    }

    public void setMonthDelay(boolean monthDelay) {
        this.monthDelay = monthDelay;
    }

    public void isClient(){
        if(getClientType().equals("chilled")){
            if(getPaymentDelay() >= 1 && getPaymentDelay() <= 30){
                setPayDelay(false);
            }else{
                setPayDelay(true);
            }
            if (getPenaltyAvoid() >= 1 && getPaymentDelay() <= 20) {
                setPenAvoid(false);
            }else{
                setPenAvoid(true);
            }
        }else if(getClientType().equals("demanding")){
            setPayDelay(false);
            setPenAvoid(false);
            if(getZeroPayment() >= 1 && getZeroPayment() <= 50) {
                setZeroPay(false);
                setLossContract(true);
            }else {
                setZeroPay(true);
            }
        }else if(getClientType().equals("skrwl")){
            if(getPaymentDelay() >= 1 && getPaymentDelay() <= 30){
                setPayDelay(false);
            }else {
                setPayDelay(true);
            }
            if(getMonthPayDelay() >= 1 && getMonthPayDelay() <= 5) {
                setMonthDelay(true);
            }else {
                setMonthDelay(false);
            }
            setPenAvoid(false);
            setLossContract(true);
            if(getZeroPayment() == 1){
                setZeroPay(true);
            }else{
                setZeroPay(false);
            }
        }
    }
}
