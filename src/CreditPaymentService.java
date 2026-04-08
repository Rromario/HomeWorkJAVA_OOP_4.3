public class CreditPaymentService {
    public double calculate(double creditTerm) {
        double creditPercent;
        creditPercent = 9.99;
        double creditSumm;
        creditSumm = 1_000_000;
        double mounthlyPayment = Math.ceil((creditSumm * (creditPercent / 100 / 12)) / (1 - Math.pow((1 + (creditPercent / 100 / 12)), -(creditTerm * 12))));
        return (mounthlyPayment);
    }
}
