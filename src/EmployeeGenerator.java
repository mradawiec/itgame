import java.util.Random;

public class EmployeeGenerator {
    Random rand = new Random();
    private static String[] names = {"Mark", "Jack", "Karen", "John", "Lee", "Steven", "Ann", "Rajiv"};
    public Employee generateEmployee(int type) {
        double salaryReqProgr = rand.nextDouble(10000.00) + 5000.00;
        double salaryReqSals = rand.nextDouble(3000.00) + 1500.00;
        String name = names[rand.nextInt(names.length)];
        double expencesProg = salaryReqProgr*0.09;
        double expencesSals = salaryReqSals*0.09;
        Employee employee;
        switch(type) {
            case 1:
                employee = new Programmer(name,salaryReqProgr,new Skills(rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean()),expencesProg);
                break;
            case 2:
                employee = new Salespearson(name,salaryReqSals,null,expencesSals);
                break;
            default:
                employee = new Tester(name,salaryReqSals, null, expencesSals);
                break;
        }
        return employee;
    }
}
