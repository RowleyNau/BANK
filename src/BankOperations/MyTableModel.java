package BankOperations;

import javax.swing.table.AbstractTableModel;

public class MyTableModel extends AbstractTableModel {
    private BankingTape data;

    public MyTableModel(BankingTape bankingTape) {
        this.data = bankingTape;
    }


    @Override
    public int getRowCount() {

        return data.getCount();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0: {
                data.getBank(rowIndex).setUsername((String) aValue);
                break;
            }
            case 1: {
                data.getBank(rowIndex).setOriginalAmount(Double.parseDouble(aValue.toString()) );
                break;
            }
            case 2: {
                data.getBank(rowIndex).setPercentage(Double.parseDouble(aValue.toString()));
                break;
            }
            case 3: {
                Bank p = data.getBank(rowIndex);
                if (p instanceof  Credit ){
                    ((Credit)data.getBank(rowIndex)).setPaymentTerm(Double.parseDouble(aValue.toString()));
                }
                break;
            }
            case 4: {
                Bank p = data.getBank(rowIndex);
                if (p instanceof  Deposit ){
                    ((Deposit)data.getBank(rowIndex)).setTerm(Double.parseDouble(aValue.toString()));
                }
                break;
            }
            case 5: {
                Bank p = data.getBank(rowIndex);
                if (p instanceof  BuyingCurrencies ){
                    ((BuyingCurrencies)data.getBank(rowIndex)).setNameOfCurrency((String)aValue);
                }
                break;
            }
            case 6: {
                Bank p = data.getBank(rowIndex);
                if (p instanceof  BuyingCurrencies ){
                    ((BuyingCurrencies)data.getBank(rowIndex)).setRate(Double.parseDouble(aValue.toString()));
                }
                break;
            }

        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0: return true;
            case 1: return true;
            case 2: return true;
            case 3: return true;
            case 4: return true;
            case 5: return true;
            case 6: return true;

        }
        return false;
    }

    @Override
    public String getColumnName (int column) {
        switch (column){
            case 0: return "ФИО";
            case 1: return "Изначальная сумма";
            case 2: return "Процент";
            case 3: return "Срок выплаты";
            case 4: return "Скрок вклада";
            case 5: return "Название валюты";
            case 6: return "Курс валюты";
        }
        return "";
    }

    @Override
    public Object getValueAt(int i, int i1) {
        switch (i1) {
            case 0:
                return data.getBank(i).getUsername();
            case 1:
                return data.getBank(i).getOriginalAmount();
            case 2:
                return data.getBank(i).getPercentage();
            case 3:
            {
                Bank p = data.getBank(i);
                if (p instanceof  Credit ){
                    return ((Credit) p).getPaymentTerm();
                }
                else {
                    return "-";
                }
            }
            case 4: {
                Bank p = data.getBank(i);
                if (p instanceof Deposit) {
                    return ((Deposit) p).getTerm();
                } else {
                    return "-";
                }
            }
            case 5:
            {
                Bank p = data.getBank(i);
                if (p instanceof  BuyingCurrencies ){
                    return ((BuyingCurrencies) p).getNameOfCurrency();
                }
                else {
                    return "-";
                }
            }
            case 6: {
                Bank p = data.getBank(i);
                if (p instanceof BuyingCurrencies) {
                    return ((BuyingCurrencies) p).getRate();
                } else {
                    return "-";
                }
            }
        }
            return "null";
        }

    public void delete(int ind)
    {
        this.data.remove(ind);
        fireTableDataChanged();
    }

    public void additionCredit()
    {
        this.data.additionCredit1();
        fireTableDataChanged();
    }

    public void additionDeposit()
    {
        this.data.additionDeposit1();
        fireTableDataChanged();
    }

    public void additionBuyingCurrencies()
    {
        this.data.additionBuyingCurrencies1();
        fireTableDataChanged();
    }


    }
