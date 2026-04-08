public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double monthlyPayment = service.calculate(1);
        System.out.println(monthlyPayment);

        double monthlyPayment2 = service.calculate(2);
        System.out.println(monthlyPayment2);

        double monthlyPayment3 = service.calculate(3);
        System.out.println(monthlyPayment3);
    }
}
