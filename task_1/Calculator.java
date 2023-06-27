package task_1;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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