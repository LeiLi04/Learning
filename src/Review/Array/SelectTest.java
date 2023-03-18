package Review.Array;

public class SelectTest {
    public static void main(String[] args) {
        int[] ints={1,3,2,5,7,8,5,6,76,43};
        //SelectTest
        for(int i=0;i<ints.length-1;i++){
            int min=i;
            for (int j=i+1;j<ints.length;j++){
                if(ints[j]<ints[min]){
                    min=j;
                }
            }
            if(!(i==min)){
                int temp;
                temp=ints[min];
                ints[min]=ints[i];
                ints[i]=temp;
            }
        }
        for(int i=0;i<ints.length;i++){
            System.out.println(ints[i]);
        }
    }
}
