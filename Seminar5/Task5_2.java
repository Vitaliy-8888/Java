// Задача 5_2. Пусть дан список сотрудников:

// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.


import java.util.*;

public class Task5_2 {

    public static void main(String[] args) {
                   
        String namesString = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        
        String[] namesArray = namesString.split(", ");      // формируем массив, разбивая список по запятой  

        HashMap<String, Integer> names = new HashMap<String, Integer>();

        for (String name : namesArray) {                  // формируем список повторяющехся имен   
                    String[] FullName = name.split(" ");        // формируем массив, разбивая список по пробелу
                    if (names.containsKey(FullName[0])) {           // проверка наличия ключа (имени)
                        names.put(FullName[0], names.get(FullName[0]) + 1);     // добавляем в список имя
                    } else {
                        names.put(FullName[0], 1);      // добавляем в список еще одно повторение имени 
                    }
                }
        
        List<Integer> positions = new ArrayList<Integer>(names.values());
        positions.sort(Collections.reverseOrder());         // сортируем по убыванию популярности имени

        HashMap<String, Integer> sortedNames = new LinkedHashMap<String, Integer>();    // список сортировки имен
        for (int position : positions)
        {
            for (String name : names.keySet()){
                if (position == names.get(name)) {      // если позиция соответсвует имени
                    sortedNames.put(name, position);    // то добавляем в список сортировки имя и позицию
                 }
            }
        }     
        System.out.println(sortedNames);      
    }   
}
