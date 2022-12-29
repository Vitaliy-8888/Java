/**
Задача 6_1. Создать класс Ноутбук для магазина техники.
Добавить атрибуты класса с соответствующими типами.
Например,
- идентификатор
- производитель
- название модели
- RAM
- объем HD
- операционная система
- и т.д.
Добавить конструктор класса.
Добавить необходимые методы класса.
Создать множество ноутбуков (множество объектов класса ноутбук) 3-10 штук.
Написать метод, который будет запрашивать у пользователя критерий фильтрации (один) 
и выведет ноутбуки, отвечающие критерию.
Например:

“Введите цифру, соответствующую необходимому критерию:
1 - RAM
2 - Объем HD
3 - Операционная система
4 - Цвет …

Для критериев объем и память необходимо запросить дополнительно диапазон.
Например,
"Введите минимальное значение"
"Введите максимальное значение"
Отфильтровать ноутбуки и вывести проходящие по критерию.
Пример вывода:

Ноутбуки с объем HD от 256 до 512
1 HP EliteBook...
2..
3...

Пример вывода:

Ноутбуки с цвет Серебристый
1 Honor ...
2..
3...
*/


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");

        // база ноутбуков
        Notebook notebook1 = new Notebook(1, "ASUS", "VivoBook S 16X", 16, 512, "Windows", "silver");
        Notebook notebook2 = new Notebook(2, "MSI", "CreatorPro M16", 32, 1000, "Windows", "black");
        Notebook notebook3 = new Notebook(3, "Apple", "MacBook Pro", 16, 1024, "MacOS", "silver");
        Notebook notebook4 = new Notebook(4, "HP", "Pavilion", 8, 512, "Windows", "black");
        Notebook notebook5 = new Notebook(5, "MSI", "Summit E13", 16, 512, "Windows", "white");
        Notebook notebook6 = new Notebook(6, "Acer", "Aspire 3", 8, 256, "Linux", "black");
        

        // создаем список ноутбуков
        List<Notebook> notebooks = new ArrayList<Notebook>();
        List<Notebook> res = new ArrayList<Notebook>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);


        while (true) { // главное меню
            System.out.println(
                    "\nДля выбора критерия поиска введите цифру из меню: \n1 - Производитель \n2 - ОЗУ \n3 - Объем HD \n4 - Операционная система \n5 - Цвет ");
            int a = scanner.nextInt();

            switch (a) {
                case 1:                     // блок выбора ноутбука по производителю
                    scanner.nextLine();
                    System.out.println("Введите производителя из доступных вариантов (Acer, Apple, ASUS, HP, MSI): ");
                    String bran = scanner.nextLine();
                    System.out.println("\nСписок ноутбуков производителя " + bran + ":\n");

                    res = Notebook.getNotebooksBrand(notebooks, bran);
                    for (Notebook n : res) {
                        System.out.println(n.toString());
                    }
                    break;

                case 2:                 // блок выбора ноутбука по ОЗУ
                    scanner.nextLine();
                    System.out.println("Введите минимальный объем ОЗУ из доступных вариантов (от 8 до 32): ");
                    int minram = scanner.nextInt();
                    System.out.println("Введите максимальный объем ОЗУ из доступных вариантов (от 8 до 32): ");
                    int maxram = scanner.nextInt();
                    System.out.println("\nСписок ноутбуков с ОЗУ от " + minram + " до " + maxram + " ГБ:\n");


                    res = Notebook.getNotebooksRam(notebooks, minram, maxram);
                    for (Notebook n : res) {
                        System.out.println(n.toString());
                    }
                    break;

                case 3:                 // блок выбора ноутбука по объему HD
                    scanner.nextLine();
                    System.out.println("Введите минимальный объем HD из доступных вариантов (от 256 до 1024): ");
                    int minhd = scanner.nextInt();
                    System.out.println("Введите максимальный объем HD из доступных вариантов (от 256 до 1024): ");
                    int maxhd = scanner.nextInt();
                    System.out.println("\nСписок ноутбуков с объемом HD от " + minhd + " до " + maxhd + " ГБ:\n");

                    res = Notebook.getNotebooksHd(notebooks, minhd, maxhd);
                    for (Notebook n : res) {
                        System.out.println(n.toString());
                    }
                    break;

                case 4:                 // блок выбора ноутбука по операционной системе
                    scanner.nextLine();
                    System.out.println("Введите ОС из доступных вариантов (Linux, MacOS, Windows): ");
                    String os = scanner.nextLine();
                    System.out.println("\nСписок ноутбуков c операционной системой: " + os + ":\n");

                    res = Notebook.getNotebooksOs(notebooks, os);
                    for (Notebook n : res) {
                        System.out.println(n.toString());
                    }
                    break;

                case 5:                 // блок выбора ноутбука по цвету
                    scanner.nextLine();
                    System.out.println("Введите цвет из доступных вариантов (black, silver, white): ");
                    String col = scanner.nextLine();
                    System.out.println("\nСписок ноутбуков цвета " + col + ":\n");

                    res = Notebook.getNotebooksColor(notebooks, col);
                    for (Notebook n : res) {
                        System.out.println(n.toString());
                    }
                    break;

                    default:
                    System.out.println("Некорректный ввод \n");
            }
            break;
        }
    }
}
