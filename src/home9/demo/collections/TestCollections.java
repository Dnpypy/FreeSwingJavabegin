package home9.demo.collections;

import home9.objects.Human;

import java.util.ArrayList;

public class TestCollections {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(); //Создание нетипизированного списка
        //можем добавлять любые объекты, т.к по умолчанию list1 принимает тип object

        list1.add("test");
        list1.add(1);
        list1.add(new Object());
        list1.add(234.234);
        list1.add(new Human("name_test2", 13));
        System.out.println("печать списка объектов");
        print(list1);

        //типизированная коллекция
        ArrayList<Human> list2 = new ArrayList<Human>(); // может хранить объекты только Human и дочерние от него объекты
        list2.add(new Human("name_test1", 22));
        list2.add(new Human("name_test5", 23));

        System.out.println("Печать значений объектов Human");
        print(list2);

        System.out.println("Доступ по индексу");
        System.out.println(list2.get(1).getName()); // доступ по индексу
        //list2.get(2).getName() java.lang.IndexIndexOutBoundException вышли за пределы массива
    }

    private static void print(ArrayList list) {
        // Сокращенный вид цикла для перебора объектов в списке
        for (Object obj : list) {
            if(obj instanceof Human) {
                Human h = (Human) obj;
                System.out.println(h.getName() + " " + h.getAge());
            } else {
                System.out.println(obj);
            }
        }
    }
}
