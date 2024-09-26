package Base;

import java.util.Scanner;
public class Examination {

    public static int ValidatingInputNumberFromConsole(/*int InputNumber, */int min, int max, String message)
    {Scanner in = new Scanner(System.in);
        int InputNumber = 0;
        System.out.print(message);

        try{
         InputNumber=Integer.parseInt(in.nextLine());
        while (InputNumber>max || InputNumber<min )
        {
            InputNumber = ValidatingInputNumberFromConsole(min,max,"Введите другое число: ");

        }}catch(NumberFormatException e)
        {
            InputNumber = ValidatingInputNumberFromConsole(min,max,"Введите другое число: ");
        }
        return InputNumber;
    }

    public static double ValidatingInputNumberFromConsoledouble(/*int InputNumber, */double min, double max, String message)
    {Scanner in = new Scanner(System.in);
        double InputNumber = 0;
        System.out.print(message);

        try{
            InputNumber=Double.parseDouble(in.nextLine());
            while (InputNumber>max || InputNumber<min )
            {
                InputNumber = ValidatingInputNumberFromConsoledouble(min,max,"Введите другое число: ");

            }}catch(NumberFormatException e)
        {
            InputNumber = ValidatingInputNumberFromConsoledouble(min,max,"Введите другое число: ");
        }
        return InputNumber;
    }

    public static String ValidatingInputStringFromConsole(String message)
    {Scanner in = new Scanner(System.in);
        System.out.print(message);
        String InputString=in.nextLine();
        while (InputString=="" )
        {
            System.out.print("Строка пуста. Пожалуйста, введите новую строку ");
            InputString = in.nextLine();
        }
        return InputString;
    }
}