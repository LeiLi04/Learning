package Review.Array;

public class BinarySearch {
    public static void ，main(String[] args) {
        int[] ints={1,2,3,4,5,6,7,8,9};
        int index=binarySearch(ints,7);
        System.out.println(index==-1?"NotFound404":"目标坐标为："+index);
    }
    public static int binarySearch(int[] ints,int dest){
        int begin=0;
        int end=ints.length-1;
        while(begin<=end){
            int mid=(begin+end)/2;
            if(dest==mid){
                return mid;
            }else if(dest<mid){
                end=mid-1;
            }else{
                begin=mid+1;
            }
        }
        return -1;
    }
}
