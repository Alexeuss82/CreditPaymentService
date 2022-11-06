public class CreditPaymentService {
    public double calculate(double loanSum, int creditTerm, double interestRate) {
        double monthInterestRate = interestRate / 100 / 12; // месячная процентная ставка
        double monthPaymentAmount = loanSum * ((monthInterestRate * Math.pow((1 + monthInterestRate), creditTerm)) / (Math.pow((1 + monthInterestRate), creditTerm) - 1)); // сумма ежемесячного аннуитентного платежа
        return monthPaymentAmount;
    }
}

