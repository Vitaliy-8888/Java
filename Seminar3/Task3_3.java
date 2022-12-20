// Задача 3_3. Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее из этого списка.


import java.util.Arrays;
import java.util.ArrayList;

public class Task3_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6, 3, 1, 4, 5, 9, 10, 8, 7, 2));    

        int min = list.get(0);      // min присваиваем значение 1-го элемента списка
        int max = list.get(0);      // max присваиваем значение 1-го элемента списка

        for (int i= 0; i < list.size(); i++) {      
            if (min > list.get(i)) {                // если значение i-го элемента меньше min 
                min = list.get(i);              // то min присваиваем значение i-го элемента списка
            }
            else if (max < list.get(i)) {       // иначе, если значение i-го элемента больше max 
                max = list.get(i);              // то max присваиваем значение i-го элемента списка    
            }   
        }
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);


        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        int result = sum / list.size();     // среднее = сумма элементов списка / количество элементов списка 

        System.out.println("Average = " + result);
    }
}