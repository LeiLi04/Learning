package Review.CommonlyUsedClasses;

        import java.util.Random;

public class RandomTest02 {
    public static void main(String[] args) {
        //创建Random对象
        Random random01 = new Random();
        //准备一个长度为5的数组
        int[] ints01 = new int[5];
        for(int i=0;i<ints01.length;i++){
            ints01[i]=-1;
        }
        //循环，生成随机数
        int index=0;
        while (index<ints01.length){
            int num=random01.nextInt(101);
            System.out.println("the random number:"+num);
            //判断ints[]数组是不是有这个num
            //如果没有这个num，就放进去
            if(!(contains(ints01,num))){
                ints01[index++]=num;
            }
        }
        //遍历数组
        for(int i=0;i<ints01.length;i++){
            System.out.println(ints01[i]);
        }
    }
    //单独编写一个方法，专门用来判断数组中是否包含某个元素
    public static boolean contains(int[] ints,int key){
        for(int i=0;i<ints.length;i++){
            if(ints[i]==key){
                return true;
            }
        }
        return false;
    }
}
