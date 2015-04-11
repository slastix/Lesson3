package Lesson3;

/**
 * Created by Kola on 10.04.15.
 */
public class main {
    public static void main(String[] args) {

        MyArrayList list = new MyArrayList();
        list.add(5);
        list.add(10);
        list.add(-3);
        list.add(0);
        list.printArray(list.objects);
        list.insert(4,2);
        list.printArray(list.objects);

        //list.addArray(int[] arr = {1,2,3,4});

    }
}
// 1) remove
// 2) insert array (int[] elements, int index)
// 3) clear()
// 4) Достоинства и недостатки массивов (Роберт Лафоре)
//      Массивы в памяти компьютера
//      *Посмотреть реализацию алгоритмов стандартных ArrayList
//      *Связные списки