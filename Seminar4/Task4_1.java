// Задача 4_1. Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.


import java.util.LinkedList;
import java.util.List;


public class Task4_1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();      // создаем новый список целых чисел
        for (int i = 0; i < 10; i++) {              
            list.add(getRandomNumber());                 // функция getRandomNumber добавит случайные числа
        }
        System.out.println(list);               // изначальный список 
        System.out.println(revers(list));       // “перевернутый” список
    }


    private static List<Integer> revers(LinkedList<Integer> list) {         // метод, который вернет “перевернутый” список
        List<Integer> revers = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {                // цикл начинаем с конца изначального списка
            revers.add(list.get(i));
        }
        return revers;
    }


    public static int getRandomNumber() {             // метод генерации случайных чисел
        double x = (Math.random() * 100);    
        int num = (int) x;                  
        return num;                         
    }
} 
