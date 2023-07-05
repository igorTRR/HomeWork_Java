package task_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Scanner;


    
    public static void main(String[] args) {
        try {
            log = new File("log.txt");
            log.createNewFile();
            fileWriter = new FileWriter(log);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            Scanner scanner = new Scanner(System.in);
             try (Scanner sc = new Scanner(System.in)) {
            double firstValue, secondValue, result = 0;
            char operator, choice = 'y';
            while(choice == 'y') {
                System.out.print("Введите числа через энтер : ");
                firstValue = sc.nextDouble();
                secondValue  = sc.nextDouble();
                System.out.print("Выберите опрерацию: ( +, -, *, /, %, ^ ): ");
                operator = sc.next().charAt(0);
                switch(operator) {
                    case '+':
                        result = firstValue + secondValue;
                        break;
                    case '-':
                        result = firstValue - secondValue;
                        break;
                    case '*':
                        result = firstValue * secondValue;
                        break;
                    case '/':
                        result = firstValue / secondValue;
                        break;
                    case '%':
                        result = firstValue % secondValue;
                        break;
                    case '^':
                        result = Math.pow(firstValue, secondValue);
                        
                        break;
                    default:
                        System.out.println("Не корректный ввод ");
                        System.exit(0);
                }
                System.out.println("\n" + firstValue + " " + operator + " " + secondValue + " = " + result);
                            System.out.print("\n Подолжить?( y / n): ");
                choice = sc.next().charAt(0);
                 System.out.println();
            } 
        }
        } 
    }}

    


