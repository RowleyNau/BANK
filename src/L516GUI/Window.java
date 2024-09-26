package L516GUI;
import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Array;

import BankOperations.BankingTape;
import BankOperations.MyTableModel;
import BankOperations.BankingTape;
import BankOperations.BuyingCurrencies;
import BankOperations.Credit;
import BankOperations.Deposit;
import Base.Examination;

public class Window extends JFrame{
    private JTable jTable;
    private MyTableModel myTableModel;
    //private JButton jButton;
    private JButton button1, button2, button3, button4;
    //private JButton button2;

    public Window ()
    {
        super("Денежные операции");

        myTableModel= new MyTableModel(new BankingTape());
        jTable = new JTable();
        jTable.setModel(myTableModel);
        JScrollPane jScrollPane = new JScrollPane(jTable);



        //объявление
        button1 = new JButton("Удалить");
        button2 = new JButton("Добавить");
        button3 = new JButton("Нажми 3");
        button4 = new JButton("Нажми 4");//не использована

        //действия
        button1.addActionListener(new ActionListener() {

                                      @Override
                                      public void actionPerformed(ActionEvent e) {
                                          try {
                                              myTableModel.delete(jTable.getSelectedRow());
                                          }
                                          catch (ArrayIndexOutOfBoundsException ex) {
                                              JDialog jDialog = new JDialog(Window.this, "Выделите операцию", true);
                                              jDialog.setVisible(true);
                                          }
                                      }
                                  });




        button2.addActionListener(e ->  {

        });
        button3.addActionListener(e ->  {
            System.out.println("Вы нажали 3");
        });

        button4.addActionListener(e -> {
            System.out.println("Вы нажали 4");
        });



        //контейнер со списком
        JPanel centerPanel = new JPanel();
        centerPanel.add(jScrollPane);
        this.add(centerPanel,BorderLayout.CENTER);

        //контейнер с кнопками
        JPanel southPanel = new JPanel();
        southPanel.add(button1);
        southPanel.add(button2);
        this.add(southPanel, BorderLayout.SOUTH);

       /* //контейнер с кнопками
        JPanel westPanel = new JPanel();
        westPanel.add(button3);
        add(westPanel, BorderLayout.WEST);*/

        this.add(/*jTable*/jScrollPane);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationByPlatform(true);


        /*setTitle("Окно");
        setSize(200,200);

        JButton button1 = new JButton("Нажми :)");
        JButton button2 = new JButton("Нажми :р");


        button1.addActionListener(new MyListener ());
        button2.addActionListener(new MyListener ());
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("нажми");
            }
        });
        button2.addActionListener(e -> {
            System.out.println(";)");
            System.out.println(";)");
        });

        add(button1, BorderLayout.SOUTH);
        add(button2, BorderLayout.NORTH);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        pack();//экран охватывает кнопку
        setVisible(true);

        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent windowEvent) {

            }

            @Override
            public void windowClosing(WindowEvent windowEvent) {

            }

            @Override
            public void windowClosed(WindowEvent windowEvent) {

            }

            @Override
            public void windowIconified(WindowEvent windowEvent) {

            }

            @Override
            public void windowDeiconified(WindowEvent windowEvent) {

            }

            @Override
            public void windowActivated(WindowEvent windowEvent) {

            }

            @Override
            public void windowDeactivated(WindowEvent windowEvent) {

            }
        });*/
    }
}

