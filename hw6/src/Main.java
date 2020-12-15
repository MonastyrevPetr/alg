

import java.util.Random;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
//        MyTreeMap<Integer, String> map = new MyTreeMap<>();
//
//        map.put(5,"five");
//        map.put(3,"one");
//        map.put(1,"two");
//        map.put(2,"three");
//        map.put(-1,"four");
//        map.put(7,"four");
//        map.put(6,"four");
//        map.put(8,"four");
//        map.put(9,"four");
//        map.put(10,"four");
//
//
//        System.out.println(map);
//
//        System.out.println(map.height());
//        System.out.println(map.balance());
//        map.delete(10);
//        System.out.println(map);
//        System.out.println(map.height());
//        System.out.println(map.balance());

////        System.out.println(map.get(2));
//
////        map.deleteMin();
//        System.out.println(map);
//        System.out.println(map.size());
//        System.out.println(map.height());
//        map.delete(5);
//        System.out.println(map);
//        System.out.println(map.size());
//        System.out.println(map.height());
//
        Random rnd=new Random();
        MyTreeMap<Integer,String>[] map=new MyTreeMap[20];
        for (int i = 0; i < 20; i++) {
            map[i]=new MyTreeMap<>();
            while (true){
                int n=rnd.nextInt(201)-100;
                map[i].put(n," Value ");
                if (map[i].height()==7){
                    map[i].delete(n);
                    break;
                }
            }
            System.out.println(map[i]);
            System.out.println(map[i].size()+" "+map[i].height());
            System.out.println(map[i].balance());
        }

    }
}
