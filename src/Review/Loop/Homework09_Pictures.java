package Review.Loop;

public class Homework09_Pictures {
    public static void main(String[] args) {
        /*
画出一个菱形
	 行数(row)空格疏(space)	*数
		 1			4		1
		 2			3		3
		 3			2		5
		 4			1		7
		 5			0		9
		 6			1		7
		 7			2		5
		 8			3		3
		 9			4		1
		前5个 空格数=5-row	*数=2row-1
		后5个 空格数=row-5	*数=2*(10-row)-1
		每次输出外循环还要记得换行
*/
        //The front 5rows
        for (int i=1;i<6;i++){
            for (int space=1;space<=5-i;space++){
                System.out.print(" ");
            }for(int star=1;star<=2*i-1;star++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //The Back 5rows
        for(int i=6;i<10;i++){
            for(int space=1;space<=i-5;space++){
                System.out.print(" ");
            }for(int star=1;star<=2*(10-i)-1;star++){
                System.out.print("*");
            }System.out.println(" ");
        }
    }
}
