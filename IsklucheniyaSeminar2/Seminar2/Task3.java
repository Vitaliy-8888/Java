/*
 * Задание 3. 
 * Дан следующий код, исправьте его там, где требуется (задание 3 
 * https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit
 */

package Seminar2;

public class Task3 {
    
    public static void main(String[] args) { 
        
        try {
            int a = 5;
            int b = 3;
            System.out.println(a / b);
            printSum(null, 234);
            int[] abc = { 1, 2 }; 
            abc[0] = 9;
        } catch (IndexOutOfBoundsException ex) { 
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (NullPointerException ex) { 
            System.out.println("Указатель не может указывать на null!");
        } catch (Throwable ex) { 
            System.out.println("Что-то пошло не так...");
        }
    }
    
    public static void printSum(Integer a, Integer b) {  
        System.out.println(a + b);
    }
}