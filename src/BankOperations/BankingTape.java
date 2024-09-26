package BankOperations;
import java.util.ArrayList;

public class BankingTape {
private ArrayList<Bank> bank = new ArrayList();

    public void additionCredit1(){
        bank.add(new Credit("",0,0,0));
    }
    public void additionDeposit1(){
        bank.add(new Deposit("",0,0,0));
    }
    public void additionBuyingCurrencies1(){bank.add(new BuyingCurrencies("", 0, 0, 0, "", 0 ));}

    public  void add(Bank bank){
        this.bank.add(bank);
    }


    public Object[][] SearchUsername (String name)
    {
        int i=0;
        int j = getCount();
        Object[][] array = new String[j][7];
        for (Bank bank: bank) {
            if (bank.getUsername().equals(name))
            {
                array[i][0]=bank.getUsername();
                array[i][1]=Double.toString (bank.getOriginalAmount());
                array[i][2]=Double.toString (bank.getPercentage());

                if (bank instanceof Credit){
                    array[i][3] = Double.toString (((Credit) bank).getPaymentTerm());
                    array[i][4] = "-";
                    array[i][5] = "-";
                    array[i][6] = "-";
                }
                if (bank instanceof Deposit){
                    array[i][3] = "-";
                    array[i][4] = Double.toString (((Deposit) bank).getTerm());
                    array[i][5] = "-";
                    array[i][6] = "-";
                }
                if (bank instanceof BuyingCurrencies){
                    array[i][3] = "-";
                    array[i][4] = "-";
                    array[i][5] = ((BuyingCurrencies) bank).getNameOfCurrency();
                    array[i][6] = Double.toString (((BuyingCurrencies) bank).getRate());
                }
                i++;
            }

        }
        return array;
    }

    public Object[][] printBuyingCurrencies ()
    {
        int i=0;
        int j = getCount();
        Object[][] array = new String[j][7];
        for (Bank bank: bank) {
            if (bank instanceof BuyingCurrencies)
            {
                array[i][0]=bank.getUsername();
                array[i][1]=Double.toString (bank.getOriginalAmount());
                array[i][2]=Double.toString (bank.getPercentage());
                array[i][3] = "-";
                array[i][4] = "-";
                array[i][5] = ((BuyingCurrencies) bank).getNameOfCurrency();
                array[i][6] = Double.toString (((BuyingCurrencies) bank).getRate());
                i++;
            }

        }
        return array;
    }



    public Object[][] printCredit ()
    {
        int i=0;
        int j = getCount();
        Object[][] array = new String[j][7];
        for (Bank bank: bank) {
            if (bank instanceof Credit)
            {
                array[i][0]=bank.getUsername();
                array[i][1]=Double.toString (bank.getOriginalAmount());
                array[i][2]=Double.toString (bank.getPercentage());
                array[i][3] = Double.toString (((Credit) bank).getPaymentTerm());
                array[i][4] = "-";
                array[i][5] = "-";
                array[i][6] = "-";

                i++;
            }

        }
        return array;
    }


    public Object[][] printDeposit ()
    {
        int i=0;
        int j = getCount();
        Object[][] array = new String[j][7];
        for (Bank bank: bank) {
            if (bank instanceof Deposit)
            {
                array[i][0]=bank.getUsername();
                array[i][1]=Double.toString (bank.getOriginalAmount());
                array[i][2]=Double.toString (bank.getPercentage());
                array[i][3] = "-";
                array[i][4] = Double.toString (((Deposit) bank).getTerm());
                array[i][5] = "-";
                array[i][6] = "-";

                i++;
            }

        }
        return array;
    }

    public Object[][] SearchSumMore (double num)
    {
        int i=0;
        int j = getCount();
        Object[][] array = new String[j][7];
        for (Bank bank: bank) {
            if (bank.getOriginalAmount()>(num))
            {
                array[i][0]=bank.getUsername();
                array[i][1]=Double.toString (bank.getOriginalAmount());
                array[i][2]=Double.toString (bank.getPercentage());

                if (bank instanceof Credit){
                    array[i][3] = Double.toString (((Credit) bank).getPaymentTerm());
                    array[i][4] = "-";
                    array[i][5] = "-";
                    array[i][6] = "-";
                }
                if (bank instanceof Deposit){
                    array[i][3] = "-";
                    array[i][4] = Double.toString (((Deposit) bank).getTerm());
                    array[i][5] = "-";
                    array[i][6] = "-";
                }
                if (bank instanceof BuyingCurrencies){
                    array[i][3] = "-";
                    array[i][4] = "-";
                    array[i][5] = ((BuyingCurrencies) bank).getNameOfCurrency();
                    array[i][6] = Double.toString (((BuyingCurrencies) bank).getRate());
                }
                i++;
            }

        }
        return array;
    }

    public Object[][] SearchSumSmaller (double num)
    {
        int i=0;
        int j = getCount();
        Object[][] array = new String[j][7];
        for (Bank bank: bank) {
            if (bank.getOriginalAmount()<(num))
            {
                array[i][0]=bank.getUsername();
                array[i][1]=Double.toString (bank.getOriginalAmount());
                array[i][2]=Double.toString (bank.getPercentage());

                if (bank instanceof Credit){
                    array[i][3] = Double.toString (((Credit) bank).getPaymentTerm());
                    array[i][4] = "-";
                    array[i][5] = "-";
                    array[i][6] = "-";
                }
                if (bank instanceof Deposit){
                    array[i][3] = "-";
                    array[i][4] = Double.toString (((Deposit) bank).getTerm());
                    array[i][5] = "-";
                    array[i][6] = "-";
                }
                if (bank instanceof BuyingCurrencies){
                    array[i][3] = "-";
                    array[i][4] = "-";
                    array[i][5] = ((BuyingCurrencies) bank).getNameOfCurrency();
                    array[i][6] = Double.toString (((BuyingCurrencies) bank).getRate());
                }
                i++;
            }

        }
        return array;
    }

    public Object[][] SearchSumEqual (double num)
    {
        int i=0;
        int j = getCount();
        Object[][] array = new String[j][7];
        for (Bank bank: bank) {
            if (bank.getOriginalAmount()==(num))
            {
                array[i][0]=bank.getUsername();
                array[i][1]=Double.toString (bank.getOriginalAmount());
                array[i][2]=Double.toString (bank.getPercentage());

                if (bank instanceof Credit){
                    array[i][3] = Double.toString (((Credit) bank).getPaymentTerm());
                    array[i][4] = "-";
                    array[i][5] = "-";
                    array[i][6] = "-";
                }
                if (bank instanceof Deposit){
                    array[i][3] = "-";
                    array[i][4] = Double.toString (((Deposit) bank).getTerm());
                    array[i][5] = "-";
                    array[i][6] = "-";
                }
                if (bank instanceof BuyingCurrencies){
                    array[i][3] = "-";
                    array[i][4] = "-";
                    array[i][5] = ((BuyingCurrencies) bank).getNameOfCurrency();
                    array[i][6] = Double.toString (((BuyingCurrencies) bank).getRate());
                }
                i++;
            }

        }
        return array;
    }


    public int getCount() {
        return this.bank.size();
    }

    public Bank getBank(int index)
    {
        return bank.get(index);
    }

    public void remove(int ind) {
        this.bank.remove(ind);
    }

}
