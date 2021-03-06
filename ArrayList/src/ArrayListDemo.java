import java.util.ArrayList;
import java.util.Collections;

class ArrayListDemo {
    public static void main(String[] args) {
        /*Создаём экземпляр контейнера ArrayList конструктором без параметров.
        Получается контейнер ArrayList без элементов, начальная ёмкость равна 10.*/
        ArrayList<Integer> arrList = new ArrayList<>();
        /*Выводим начальное количество элементов в нашем контейнере ArrayList.*/
        System.out.println("Начальное количество элементов в этом контейнере ArrayList: " + arrList.size());
        /*Вносим несколько элементов в контейнер. Элементами служат целочисленные примитивы, при добавлении
        * примитивов производится автоупаковка - по факту в контейнере оказываются обёртки типа Integer!*/
        Collections.addAll(arrList, 1, 2, 3, 4, 5);
        /*Выводим на экран содержимое контейнера. При этом
        * используется метод toString() контейнера, кастующий содержимое контейнера
        * в одну строку, заключённую в квадратные скобки. Элементы выводятся в порядке вставки (FIFO)*/
        System.out.println("Содержимое контейнера: " + arrList);
        System.out.println("...и текущее количество элементов в этом контейнере ArrayList: " + arrList.size());
        /*Вставляем в середину контейнера новый элемент, с указанием индекса позиции вставки.*/
        arrList.add(1, 6);
        /*Снова выводим на экран содержимое контейнера.*/
        System.out.println("Содержимое контейнера после вставки одного элемента: " + arrList);
        System.out.println("...и текущее количество элементов в этом контейнере ArrayList: " + arrList.size());
        /*Последовательно добавляем в контейнер ещё несколько элементов без указания индексов.*/
        arrList.add(10);
        arrList.add(11);
        arrList.add(12);
        /*Опять выводим на экран содержимое контейнера и видим, что новые элементы вставляются в конце списка.*/
        System.out.println("Содержимое контейнера после последовательной вставки нескольких элементов: " + arrList);
        System.out.println("...и текущее количество элементов в этом контейнере ArrayList: " + arrList.size());

    }

}
