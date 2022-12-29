import java.util.ArrayList;
import java.util.List;


public class Notebook {         // создаем класс Notebook

    // определяем типы данных:
    int id, RAM, HD;
    String brand, model, OS, color;

    public Notebook(int id, String brand, String model, int RAM, int HD, String OS, String color) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.RAM = RAM;
        this.HD = HD;
        this.OS = OS;
        this.color = color;
    }


    public String toString() {            // формируем шаблон для вывода на экран результатов 
        return "Ноутбук: " + id + "\n" +
                "Производитель: " + brand + "\n" +
                "Модель: " + model + "\n" +
                "ОЗУ: " + RAM + "\n" +
                "Объем HD: " + HD + "\n" +
                "ОС: " + OS + "\n" +
                "Цвет: " + color + "\n";
    }


    // метод нахождения производителя ноутбуков
    public static List<Notebook> getNotebooksBrand(List<Notebook> notebooks, String bran) {
        List<Notebook> result = new ArrayList<>();
        for (Notebook c : notebooks) {
            if (c.brand.toLowerCase().equals(bran.toLowerCase())) {
                result.add(c);
            }
        }
        return result;
    }


    // метод нахождения ОЗУ ноутбуков
    public static List<Notebook> getNotebooksRam(List<Notebook> notebooks, int min, int max) {
        List<Notebook> result = new ArrayList<>();
        for (Notebook c : notebooks) {
            if ((c.RAM >= min) && (c.RAM <= max)) {
                result.add(c);
            }
        }
        return result;
    }


    // метод нахождения объема HD ноутбуков
    public static List<Notebook> getNotebooksHd(List<Notebook> notebooks, int min, int max) {
        List<Notebook> result = new ArrayList<>();
        for (Notebook c : notebooks) {
            if ((c.HD >= min) && (c.HD <= max)) {
                result.add(c);
            }
        }
        return result;
    }


    // метод нахождения операционной системы ноутбуков
    public static List<Notebook> getNotebooksOs(List<Notebook> notebooks, String os) {
        List<Notebook> result = new ArrayList<>();
        for (Notebook c : notebooks) {
            if (c.OS.toLowerCase().equals(os.toLowerCase())) {
                result.add(c);
            }
        }
        return result;
    }
    

    // метод нахождения цвета ноутбуков
    public static List<Notebook> getNotebooksColor(List<Notebook> notebooks, String color) {
        List<Notebook> result = new ArrayList<>();
        for (Notebook c : notebooks) {
            if (c.color.toLowerCase().equals(color.toLowerCase())) {
                result.add(c);
            }
        }
        return result;
    }
}
