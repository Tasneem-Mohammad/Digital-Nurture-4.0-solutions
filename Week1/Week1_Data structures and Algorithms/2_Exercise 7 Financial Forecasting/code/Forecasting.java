package financialforecasting;

public class Forecasting {
	public static double futureValue(double presentValue, double annualGrowthRate, int numberOfYears) {
        return presentValue * Math.pow(1 + annualGrowthRate, numberOfYears);
    }
	
	public static void main(String[] args) {
        double presentValue = 10000;
        double annualGrowthRate = 0.08;
        int years = 5;

        double fv = futureValue(presentValue, annualGrowthRate, years);

        System.out.println("Predicted Future Value after " + years + " years: ₹" + String.format("%.2f", fv));
    }
}

