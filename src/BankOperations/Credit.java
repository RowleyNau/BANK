package BankOperations;
public class Credit extends Bank{
    protected double PaymentTerm; // Срок выплаты в месяцах
    protected double MonthlyPayment; // Ежемесячный платеж
    protected double TotalPayout; // Общая выплата
    protected double LoanOverpayment; // Переплата по кредиту

    public double getPaymentTerm() {
        return PaymentTerm;
    }

    public void setPaymentTerm(double paymentTerm) {
        PaymentTerm = paymentTerm;
    }

    public double getMonthlyPayment() {
        return MonthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        MonthlyPayment = monthlyPayment;
    }

    public double getTotalPayout() {
        return TotalPayout;
    }

    public void setTotalPayout(double totalPayout) {
        TotalPayout = totalPayout;
    }

    public double getLoanOverpayment() {
        return LoanOverpayment;
    }

    public void setLoanOverpayment(double loanOverpayment) {
        LoanOverpayment = loanOverpayment;
    }


   public Credit(String UN, double OA, double P, double PT )
    {
        this.Username=UN;
        this.OriginalAmount=OA;
        this.Percentage=P;
        this.PaymentTerm=PT;
        FinancialForecast();
    }

  @Override
    //Расчет Ежемесячный платеж, Общая выплата, Переплата по кредиту
    public Void FinancialForecast() {
        this.MonthlyPayment = OriginalAmount * (Percentage + (Percentage/(1+Percentage)*PaymentTerm-1));
        this.TotalPayout = PaymentTerm * MonthlyPayment;
        this.LoanOverpayment = TotalPayout - OriginalAmount;
        return null;
    }
    @Override
    public int culc(int a, int b) {
        return a+b;
    }

}
