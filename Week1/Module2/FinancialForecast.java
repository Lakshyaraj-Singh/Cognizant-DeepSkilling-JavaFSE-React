package Week1.Module2;


public class FinancialForecast {

    static double futureValue(double currentValue, double growthRate, int years) {

        if (years == 0) {
            return currentValue;
        }

        return futureValue(currentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {

        double currentValue = 10000;
        double growthRate = 0.10;
        int years = 5;

        double future = futureValue(currentValue, growthRate, years);                         
        System.out.println("After Years : " + years);
        System.out.printf("Future Value : %.3f%n", future);
    }
}
