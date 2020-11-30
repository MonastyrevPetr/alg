import java.util.Arrays;
import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        //Знаю что надо было делать через стек.
        //Но это тоже решение
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        for (int i = st.length()-1; i >= 0; i--) {
            System.out.print(st.charAt(i));
        }
        System.out.println();


//        MyDeque<Integer> md=new MyDeque<>();
//        md.insertRight(1);
//        md.insertRight(2);
//        md.insertRight(3);
//        md.insertRight(4);
//        md.insertRight(5);
//        System.out.println(md);
//        md.removeRight();
//        md.removeRight();
//        md.removeRight();
//        System.out.println(md);
//        System.out.println(md.peekRight());
//        System.out.println(md.peekLeft());
//        md.insertLeft(6);
//        md.insertLeft(7);
//        md.insertLeft(8);
//        md.insertLeft(49);
//        md.insertLeft(511);
//        System.out.println(md);
//        md.removeLeft();
//        md.removeLeft();
//        md.removeLeft();
//        System.out.println(md);
//        System.out.println(md.peekLeft());








    }
}
