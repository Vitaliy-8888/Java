// Задача 2_1. Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}


public class Task2_1 {
    public static final String QUERY = "select * from students where ";
    public static final String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";

    public static void main(String[] args) {
        String paramsNew = PARAMS.replace('{', ' ').replace('}', ' ');    // удаляем лишние символы: '{', '}'
        String[] params = paramsNew.split(",");     // через split разбиваем строку на элементы и формируем массив
        StringBuilder stringBuilder = new StringBuilder(QUERY);     // используя StringBuilder создаем строку 
        for (int i = 0; i < params.length; i++) {               // циклом проходимся по всем элементам массива
            String[] elements = params[i].replace('"', ' ').split(":");
            if (!"null".equals(elements[1].trim())) {          // если элемент не равен "null"
                // то добавляем элементы и компонуем строку 
                stringBuilder.append(elements[0].trim()).append(" = ").append("'").append(elements[1].trim()).append("'");
                if (i < params.length - 2)             // если индекс элемент массива меньше индекса предпоследнего элемента 
                    stringBuilder.append(" and ");     // то добавляем " and "
            }
        }
        System.out.println(stringBuilder);
    }
}
