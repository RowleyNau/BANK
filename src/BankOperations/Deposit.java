package BankOperations;

public class Deposit extends Bank{
    protected double Term;//Скрок в месяцах
    protected double TotalIncome;// размер вклада на конец срока
    protected double income;//Процентный доход

    public double getTerm() {
        return Term;
    }

    public void setTerm(double term) {
        Term = term;
    }

    public double getTotalIncome() {
        return TotalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        TotalIncome = totalIncome;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }



    public Deposit(String UR, double AO, double P, double T)
    {
        this.Username=UR;
        this.OriginalAmount=AO;
        this.Percentage=P;
        this.Term=T;
        FinancialForecast();
    }
   @Override
    public Void FinancialForecast() {
        this.TotalIncome= OriginalAmount * Math.pow(1+(Percentage/100), Term);
        this.income= TotalIncome- OriginalAmount;
        return null;
    }
    @Override
    public int culc(int a, int b) {
        return a*b;
    }


}
