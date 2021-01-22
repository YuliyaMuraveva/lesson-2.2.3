public class CreditPaymentService {
    public int calculate(int creditAmount, int periodInYears, float annualRate) {
        int periodInMonths = periodInYears * 12;
        float monthlyRate = annualRate / 100 / 12;
        float monthlyPayment = creditAmount * (monthlyRate + monthlyRate / ((float) Math.pow((1 + monthlyRate), periodInMonths) - 1));
        return (int) monthlyPayment;
    }
}
