package BmiService;

public class BmiService {
    public double calculate(int weight, double growth) {
        double BMI = weight / (growth * growth);
        {
            return BMI;
        }
    }
}