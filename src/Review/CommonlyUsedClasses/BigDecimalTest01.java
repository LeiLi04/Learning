package Review.CommonlyUsedClasses;

import java.math.BigDecimal;

public class BigDecimalTest01 {
    public static void main(String[] args) {
        BigDecimal big01=new BigDecimal(100);
        BigDecimal big02=new BigDecimal(200);
        //这里的big01 big02是引用，不是基本数据类型，不能相加
        System.out.println(big01.add(big02));
        System.out.println(big02.divide(big01));
    }
}
