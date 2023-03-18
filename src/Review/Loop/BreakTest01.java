package Review.Loop;

public class BreakTest01 {
    public static void main(String[] args) {
        a:for (int i = 0; i < 10; i++) {
           b: for (int j = 0; j < 10; j++) {
                if (j == 8) {
                    break a;
                }
                System.out.println(i);
            }
        }
    }
}