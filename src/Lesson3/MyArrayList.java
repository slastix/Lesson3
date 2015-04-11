package Lesson3;

/**
 * Created by Kola on 10.04.15.
 */
public class MyArrayList {
    int[] objects = new int[1];
    int size;

    // Метод, выводящий массив произвольной длины в строку через пробел.

    public void printArray (int[] array) {
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Метод, добавляющий в конец массива новый элемент с произвольным значением.

    public void add(int element) {
        int[] newArray = new int[size+1];
        for (int i = 0; i < size; i++) {
            newArray[i] = objects[i];
        }
        newArray[size] = element;
        objects = newArray;
        size++;
    }

    // Метод, удаляющий из массива элемент с произвольным индексом
    public void remove(int index) {

    }

    // Метод, вставляющий в массив новый элемент с произвольным значением и индексом.
    public void insert(int element, int index) {
        if (index >= 0 && index > size + 1) System.out.println("Слишком большой индекс");
            else {
            int[] newArray = new int[size+1];
            for (int i = 0; i < index; i++) {
                newArray[i] = objects[i];
            }
            newArray[index] = element;
            for (int i = index+1; i < size+1; i++) {
                newArray[i] = objects[i-1];
            }
            objects = newArray;
            size++;
        }
    }

    // Метод, добавляющий к концу массива произвольный массив.

    public void addArray (int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            add(elements[i]);
        }
    }
}
