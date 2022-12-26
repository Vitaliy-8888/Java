// Задача 5_1. Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая,что 1 человек может иметь несколько телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Task5_1 {

    public static void main(String[] args) {
        Map<Integer, ArrayList<String>> phoneNumber = new HashMap<Integer, ArrayList<String>>();
        Map<Integer, String> abonent = new HashMap<Integer, String>();          // формируем список абонентов
        abonent.put(0, "Ivanov Ivan");
        abonent.put(1, "Petrova Svetlana");
        abonent.put(2, "Ivanov Ivan");
        abonent.put(3, "Belova Kristina");
        abonent.put(4, "Musina Anna");
        abonent.put(5, "Krutova Anna");
        for (int i = 0; i < abonent.size(); i++) {              // добавляем абонентам телефонные номера
            if (phoneNumber.get(i) == null) {
                phoneNumber.put(i, new ArrayList<String>());
                phoneNumber.get(i).add("8-900-111-11-" + i + i + "; " + "8-900-222-22-" + i + i);
            }
            System.out.println(abonent.get(i) + " = " + phoneNumber.get(i));
        }
    }  
}
