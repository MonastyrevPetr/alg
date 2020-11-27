import java.util.Random;

public class Hw2 {
    public static void main(String[] args) {

//MyArrayList<Integer> mal=new MyArrayList<>();

//        Test
        MyArrayList<Integer> mal = new MyArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            mal.add(random.nextInt(1000));
        }
        for (int i = 0; i < 1000; i++) {
            mal.remove(0);
        }

//        long startTime = System.currentTimeMillis();
//        При 500000 боллее 30 мин При 1000000 около 2 ч
//        mal.selectionSort();// 37160 ms
//        mal.insertionSort();// 26608 ms
//        mal.bubbleSort();// 86945 ms
//        long time = System.currentTimeMillis() - startTime;
//        System.out.println(time);
    }
}
