// Задача 3_2. Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.List;


public class Task3_2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();   // создаем новый список целых чисел
        for (int i = 0; i < 10; i++) {     
            list.add(getRandomNumber());   // добавляем случайные числа
        }
        System.out.println(list);       // список до удаления четных чисел


        int i = 0;
        while(i < list.size()) {                // через цикл удаляем четные числа
                if (list.get(i) % 2 == 0) {     
                list.remove(i);                 
                }
                else i++;
        }
        System.out.println(list);       // список после удаления четных чисел
    }

    
    public static int getRandomNumber() {      // метод генерации случайных чисел
        double x = (Math.random() * 100);    
        int num = (int) x;                  
        return num;                         
    }
} 

