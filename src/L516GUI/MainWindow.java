package L516GUI;
import javax.swing.*;
import java.awt.*;

import BankOperations.*;
import BankOperations.BankingTape;

public class MainWindow extends JFrame{
    private JTable jTable;
    private MyTableModel myTableModel;
    private JButton buttonDelet, buttonCredit, buttonDeposit, buttonBuyingCurrencies, buttonSearch;

    public MainWindow ()
    {
        super("Денежные операции");
        BankingTape data = new BankingTape();
        myTableModel= new MyTableModel(data);
        jTable = new JTable();
        jTable.setModel(myTableModel);
        JScrollPane jScrollPane = new JScrollPane(jTable);

        buttonDelet = new JButton("Удалить");
        buttonCredit = new JButton("Кредит");
        buttonDeposit = new JButton("Депозит");
        buttonBuyingCurrencies= new JButton("Обмен валют");
        buttonSearch = new JButton("Поиск");
        this.buttonSearch.setEnabled(false);
        this.buttonDelet.setEnabled(false);

        buttonDelet.addActionListener(e ->  {
             {
                try {
                    myTableModel.delete(jTable.getSelectedRow());
                }
                catch (IndexOutOfBoundsException ex) {
                    JDialog jDialog = new JDialog(MainWindow.this, "Выделите операцию", true);
                    jDialog.setVisible(true);
                }
            }
        });

        buttonCredit.addActionListener(e ->  {
            myTableModel.additionCredit();
            this.buttonSearch.setEnabled(true);
            this.buttonDelet.setEnabled(true);
        });

        buttonDeposit.addActionListener(e ->  {
            myTableModel.additionDeposit();
            this.buttonSearch.setEnabled(true);
            this.buttonDelet.setEnabled(true);
        });

        buttonBuyingCurrencies.addActionListener(e ->  {
            myTableModel.additionBuyingCurrencies();
            this.buttonSearch.setEnabled(true);
            this.buttonDelet.setEnabled(true);
        });

        buttonSearch.addActionListener(e ->  {
            new SearchWindow(data);
        });

        JPanel centerPanel = new JPanel();
        centerPanel.add(jScrollPane);
        this.add(centerPanel,BorderLayout.CENTER);

        JPanel southPanel = new JPanel();
        southPanel.add(buttonDelet);
        southPanel.add(buttonCredit);
        southPanel.add(buttonDeposit);
        southPanel.add(buttonBuyingCurrencies);
        southPanel.add(buttonSearch);
        this.add(southPanel, BorderLayout.SOUTH);

        this.add(jScrollPane);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
