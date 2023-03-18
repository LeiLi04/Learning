package Review.CommonlyUsedClasses;

import java.text.DecimalFormat;

public class DecimalFormatTest01 {
    public static void main(String[] args) {
        //java.text.DecimalFormat专门负责数字格式化
        //DecimalFormat df=new DecimalFormat("数字格式")
        //数字格式那些？
//            # 代表任意数字
//            ，代表千分位
//            . 代表小数点
//             0代表不够时补0
//             ###，###.##
//        表示：加入千分位，保留2个小数
        DecimalFormat df01=new DecimalFormat("###,###.##");
        System.out.println(df01.format(199791.31));
        //保留4位小数，补上0
        DecimalFormat df02=new DecimalFormat("###,###.0000");
        System.out.println(df02.format(123123.13));
    }
}
