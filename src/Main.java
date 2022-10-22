public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int n = 1_000_000; //сумма кредита
        int y = 12; //срок кредита
        double p = 9.99; // годовая процентная ставка
        double m = service.calculate(n, y, p); // сумма ежемесячного аннуитентного платежа

        System.out.println();
        System.out.println("Срок кредита 1 год. Платеж=" + service.calculate(1000000,12,9.99) + " руб. " + "Процентная ставка" + " 9.99%");

        System.out.println();
        System.out.println("Срок кредита 2 года. Платеж=" + service.calculate(1000000,24,9.99) + " руб. " + "Процентная ставка" + " 9.99%");

        System.out.println();
        System.out.println("Срок кредита 3 года. Платеж=" + service.calculate(1000000,36,9.99) + " руб. " + "Процентная ставка" + " 9.99%");
    }
}