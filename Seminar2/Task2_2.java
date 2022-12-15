// package Seminar2;

// Задача 2_2. Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.


import java.time.LocalDateTime;
import java.io.FileWriter;
import java.util.Arrays;


public class Task2_2 {
    public static void main(String[] args) {
        int [] array = {11, 3, 14, 16, 7};

        boolean isSorted = false;
        int temporary;
        while(!isSorted) {
            isSorted = true;

            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;
                    temporary = array[i];    // сортировка через временную переменную (temporary):
                    array[i] = array[i+1];
                    array[i+1] = temporary;
                }
            }
            System.out.println(Arrays.toString(array));
            logger(Arrays.toString(array));           // команда записи в журнал лонирования каждой итерации
        }
    }


    public static void logger(String text) {              // создаем журнал логирования
        try{
            // путь к файлу записей "log.txt"
            FileWriter log = new FileWriter("C:\\Users\\Виталий\\DZ\\Java\\Seminar2\\log.txt", true);
            log.write(LocalDateTime.now() + " " + text + "\n");    // компонуем строку для записи данных в файл
            log.flush();
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }   
}