/**
 * Задача 1_1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), 
 * n! (произведение чисел от 1 до n)
 */

import java.util.Scanner;   

public class Task1_1 {
    public static void main(String[] args) {

         
        Scanner scanner = new Scanner(System.in);   // получение данных из терминала через экземпляр Scanner
        System.out.printf("Введите натуральное число n: ");     // ввод данных с консоли
        int number = scanner.nextInt();   // считываем строку с консоли

        int summa = 0;
        for (int i = 1; i <= number; i++) {     // проходимся циклом по всем числам от 1 до n
            summa = summa + i;              // сумма чисел от 1 до n
            }
        System.out.printf("Сумма чисел от 1 до n = %d\n", summa);     


        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;            // произведение чисел от 1 до n
            }
        System.out.printf("Произведение чисел от 1 до n = %d", result);    
        scanner.close();     
   }
}


