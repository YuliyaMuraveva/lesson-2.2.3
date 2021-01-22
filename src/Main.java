public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int creditOneYear = service.calculate(1_000_000, 1, 9.99f);
        System.out.println(creditOneYear);

        int creditTwoYear = service.calculate(1_000_000, 2, 9.99f);
        System.out.println(creditTwoYear);

        int creditThreeYear = service.calculate(1_000_000, 3, 9.99f);
        System.out.println(creditThreeYear);
    }
}
