

public class Main {
    static int[] values = new int[] {1, 4, 9, 16, 25};
    static int[] weights = new int[] {1, 2, 3, 4, 5};
    static int w = 8;
    public static void main(String[] args) {
        System.out.println(exponentiation(3,3));
        System.out.println(backpack(weights.length-1,w));
    }

    public static int exponentiation(int a,int b){
        if (b==2){
            return a*=a;
        }

        return exponentiation(a,b-1)*a;
    }

    private static int backpack(int i, int w) {
        if (i < 0) {
            return 0;
        }
        if (weights[i] > w) {
            return backpack(i-1, w);
        } else {
            return Math.max(backpack(i-1, w), backpack(i-1, w - weights[i]) + values[i]);
        }
    }

}