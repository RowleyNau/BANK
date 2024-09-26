package L516GUI;
import javax.swing.*;
import java.awt.*;

import BankOperations.*;
import BankOperations.BankingTape;
public class SearchWindow extends JFrame {

    private MyTableModel myTableModel;
    private JTable jTable;
    private JButton buttonSearchName, buttonBuyingCurrencies, buttonCredit, buttonDeposit, buttonSearchSumSmaller,buttonSearchSumMore, buttonSearchSumEqual;
    private Object[] columnsHeader = new String[] {"ФИО", "Изначальная сумма", "Процент", "Срок выплаты", "Скрок вклада", "Курс валюты", "Название валюты"};


    public SearchWindow (BankingTape data)
    {


        super("Поиска");
        boolean step;
        myTableModel= new MyTableModel(new BankingTape());
        jTable = new JTable();
        jTable.setModel(myTableModel);

        final JTextField filterText = new JTextField("Введите");
        buttonSearchName = new JButton("По имени");
        buttonBuyingCurrencies= new JButton("Все конвертации");
        buttonDeposit= new JButton("Все вклады");
        buttonCredit= new JButton("Все кредиты");
        buttonSearchSumSmaller= new JButton("Начальная сумма меньше числа");
        buttonSearchSumMore= new JButton("Начальная сумма больше числа");
        buttonSearchSumEqual= new JButton("Начальная сумма, равная числу");


            buttonSearchName.addActionListener(e ->  {

                String text = filterText.getText();
                Object[][] array = data.SearchUsername(text);
                JTable jTable1 = new JTable(array, columnsHeader);
                this.add(jTable1, BorderLayout.CENTER);
                this.add(jTable1);
                this.buttonSearchSumEqual.setEnabled(false);
                this.buttonSearchSumSmaller.setEnabled(false);
                this.buttonSearchSumMore.setEnabled(false);
                this.buttonSearchName.setEnabled(false);
                this.buttonBuyingCurrencies.setEnabled(false);
                this.buttonDeposit.setEnabled(false);
                this.buttonCredit.setEnabled(false);
        });

        buttonBuyingCurrencies.addActionListener(e ->  {
            //String text = filterText.getText();
            Object[][] array = data.printBuyingCurrencies();
            JTable jTable1 = new JTable(array, columnsHeader);
            this.add(jTable1,BorderLayout.CENTER);
            this.add(jTable1);
            this.buttonSearchSumEqual.setEnabled(false);
            this.buttonSearchSumSmaller.setEnabled(false);
            this.buttonSearchSumMore.setEnabled(false);
            this.buttonSearchName.setEnabled(false);
            this.buttonBuyingCurrencies.setEnabled(false);
            this.buttonDeposit.setEnabled(false);
            this.buttonCredit.setEnabled(false);
        });

        buttonDeposit.addActionListener(e ->  {
            //String text = filterText.getText();
            Object[][] array = data.printDeposit();
            JTable jTable1 = new JTable(array, columnsHeader);
            this.add(jTable1,BorderLayout.CENTER);
            this.add(jTable1);
            this.buttonSearchSumEqual.setEnabled(false);
            this.buttonSearchSumSmaller.setEnabled(false);
            this.buttonSearchSumMore.setEnabled(false);
            this.buttonSearchName.setEnabled(false);
            this.buttonBuyingCurrencies.setEnabled(false);
            this.buttonDeposit.setEnabled(false);
            this.buttonCredit.setEnabled(false);
        });

        buttonCredit.addActionListener(e ->  {
            //String text = filterText.getText();
            Object[][] array = data.printCredit();
            JTable jTable1 = new JTable(array, columnsHeader);
            this.add(jTable1,BorderLayout.CENTER);
            this.add(jTable1);
            this.buttonSearchSumEqual.setEnabled(false);
            this.buttonSearchSumSmaller.setEnabled(false);
            this.buttonSearchSumMore.setEnabled(false);
            this.buttonSearchName.setEnabled(false);
            this.buttonBuyingCurrencies.setEnabled(false);
            this.buttonDeposit.setEnabled(false);
            this.buttonCredit.setEnabled(false);
        });

        buttonSearchName.addActionListener(e ->  {

            String text = filterText.getText();
            Object[][] array = data.SearchUsername(text);
            JTable jTable1 = new JTable(array, columnsHeader);
            this.add(jTable1, BorderLayout.CENTER);
            this.add(jTable1);
            this.buttonSearchSumEqual.setEnabled(false);
            this.buttonSearchSumSmaller.setEnabled(false);
            this.buttonSearchSumMore.setEnabled(false);
            this.buttonSearchName.setEnabled(false);
            this.buttonBuyingCurrencies.setEnabled(false);
            this.buttonDeposit.setEnabled(false);
            this.buttonCredit.setEnabled(false);
        });

        buttonSearchSumMore.addActionListener(e ->  {

            String text = filterText.getText();
            Object[][] array = data.SearchSumMore(Double.parseDouble(text));
            JTable jTable1 = new JTable(array, columnsHeader);
            this.add(jTable1, BorderLayout.CENTER);
            this.add(jTable1);
            this.buttonSearchSumEqual.setEnabled(false);
            this.buttonSearchSumSmaller.setEnabled(false);
            this.buttonSearchSumMore.setEnabled(false);
            this.buttonSearchName.setEnabled(false);
            this.buttonBuyingCurrencies.setEnabled(false);
            this.buttonDeposit.setEnabled(false);
            this.buttonCredit.setEnabled(false);
        });

        buttonSearchSumSmaller.addActionListener(e ->  {

            String text = filterText.getText();
            Object[][] array = data.SearchSumSmaller(Double.parseDouble(text));
            JTable jTable1 = new JTable(array, columnsHeader);
            this.add(jTable1, BorderLayout.CENTER);
            this.add(jTable1);
            this.buttonSearchSumEqual.setEnabled(false);
            this.buttonSearchSumSmaller.setEnabled(false);
            this.buttonSearchSumMore.setEnabled(false);
            this.buttonSearchName.setEnabled(false);
            this.buttonBuyingCurrencies.setEnabled(false);
            this.buttonDeposit.setEnabled(false);
            this.buttonCredit.setEnabled(false);
        });

        buttonSearchSumEqual.addActionListener(e ->  {

            String text = filterText.getText();
            Object[][] array = data.SearchSumEqual(Double.parseDouble(text));
            JTable jTable1 = new JTable(array, columnsHeader);
            this.add(jTable1, BorderLayout.CENTER);
            this.add(jTable1);
            this.buttonSearchSumEqual.setEnabled(false);
            this.buttonSearchSumSmaller.setEnabled(false);
            this.buttonSearchSumMore.setEnabled(false);
            this.buttonSearchName.setEnabled(false);
            this.buttonBuyingCurrencies.setEnabled(false);
            this.buttonDeposit.setEnabled(false);
            this.buttonCredit.setEnabled(false);
        });

        JPanel centerPanel = new JPanel();
        centerPanel.add(buttonSearchName);
        centerPanel.add(buttonCredit);
        centerPanel.add(buttonDeposit);
        centerPanel.add(buttonBuyingCurrencies);
        centerPanel.add(buttonSearchSumSmaller);
        centerPanel.add(buttonSearchSumMore);
        centerPanel.add(buttonSearchSumEqual);
        this.add(centerPanel,BorderLayout.SOUTH);

        this.add(filterText,BorderLayout.NORTH);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }
}