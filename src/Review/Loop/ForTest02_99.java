package Review.Loop;

public class ForTest02_99 {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            for(int k=1;k<i+1;k++){
                System.out.print(i+"*"+k+"="+(i*k)+" ");
            }
            System.out.println();
        }
    }
}
