package BmiService;

public class MainS {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double BMI = service.calculate(53, 1.6);
        System.out.println(BMI);
    }
}
