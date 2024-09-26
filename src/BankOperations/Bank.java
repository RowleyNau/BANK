package BankOperations;
public abstract class Bank {
    protected  String Username; //имя
    protected double OriginalAmount; //начальная сумма
    protected double Percentage; //процент

   public abstract Void FinancialForecast ();

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public double getOriginalAmount() {
        return OriginalAmount;
    }

    public void setOriginalAmount(double originalAmount) {
        OriginalAmount = originalAmount;
    }

    public double getPercentage() {
        return Percentage;
    }

    public void setPercentage(double percentage) {
        Percentage = percentage;
    }

    public abstract int culc(int a,int b);

}
