package BankOperations;

public class BuyingCurrencies extends Bank{
    protected double TotalAmount;//Итоговая Сумма
    protected double AmountChargedByTheBank;//Сумма взимаемая банком
    protected double Rate;//Курс валюты
    protected String NameOfCurrency;//Наименование Валюты

    public double getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        TotalAmount = totalAmount;
    }

    public double getAmountChargedByTheBank() {
        return AmountChargedByTheBank;
    }

    public void setAmountChargedByTheBank(double amountChargedByTheBank) {
        AmountChargedByTheBank = amountChargedByTheBank;
    }

    public double getRate() {
        return Rate;
    }

    public void setRate(double rate) {
        Rate = rate;
    }

    public String getNameOfCurrency() {
        return NameOfCurrency;
    }

    public void setNameOfCurrency(String nameOfCurrency) {
        NameOfCurrency = nameOfCurrency;
    }

    public BuyingCurrencies(String UR, double AO, double P, double T, String NOC, double R)
    {

        this.Username=UR;
        this.OriginalAmount=AO;
        this.NameOfCurrency=NOC;
        this.Rate=R;
        this.Percentage=P;
        FinancialForecast();
    }
    @Override
    public Void FinancialForecast() {
        AmountChargedByTheBank= OriginalAmount*Percentage/100;
        TotalAmount = OriginalAmount* Rate - AmountChargedByTheBank;
        return null;
    }

    @Override
    public int culc(int a, int b) {
        return a*b;
    }
}
