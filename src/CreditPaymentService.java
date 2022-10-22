public class CreditPaymentService {
    public double calculate(double n, int y, double p) {
        double r = p / 100 / 12; // месячная процентная ставка
        double m = n * ((r * Math.pow((1 + r), y)) / (Math.pow((1 + r), y) - 1)); // сумма ежемесячного аннуитентного платежа
        return m;
    }
}

