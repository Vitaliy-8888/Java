/*
 * Задание 1. 
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */


package Seminar2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String userInput = null;                   
        float temp = 0;                            
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число:");
        for (; ; ) {
            userInput = scanner.next();
            try {
                temp = Float.parseFloat(userInput); 
                System.out.println(temp);
                break;                              
            } catch (NumberFormatException e) {     
												    
                System.out.println("Неверные данные. Введите корректное дробное число:");
            }
        } scanner.close();
    }
}