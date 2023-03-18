package Review.Method;

public class MethodTest05_Constructor {
    /*
定义丈夫类 Husband 和妻子类 Wife，
丈夫类的属性包括：身份证号，姓名，出生日期，妻子。
妻子类的属性包括：身份证号，姓名，出生日期，丈夫。
分别给这两个类提供构造方法（无参数构造方法和有参数构造方法都要提供），
编写测试程序，创建丈夫对象，然后再创建妻子对象，丈夫对象关联妻子对象，
妻子对象关联丈夫对象，要求能够输出这个“丈夫对象”的妻子的名字，
或者能够输出这个“妻子对象”的丈夫的名字。要求能够画出程序执行过程的内存图。
并且要求在程序中演示出空指针异常的效果。

别懵：
	.后面只是一个单词，没有小括号，表示访问的是属性。
	.后面有一个单词，单词后面有小括号，表示访问的是方法。

这个一定要画出内存图，很有研究价值。
*/
    public static void main(String[] args) {
        Husband husband01=new Husband("110","Leo","980404");
        Wife wife01=new Wife("110","迪丽热巴","900909");
        husband01.wife=wife01;
        wife01.husband=husband01;
        System.out.println(husband01.name+"的老婆是"+husband01.wife.name);
        System.out.println(wife01.name+"的老公是"+wife01.husband.name);
    }
}
class Husband{
    //ID
    String idCard;
    //Name
    String name;
    //Date
    String date;
    //WIFE
    Wife wife;
    //Constructor without parameters
    public Husband(){

    }
    //Constructor with 3 parameters
    public Husband(String id01,String name01,String date01){
        idCard=id01;
        name=name01;
        date=date01;
    }
    //Constructor with 4 parameters
    public Husband(String id01,String name01,String date01,Wife wife01){
        idCard=id01;
        name=name01;
        date=date01;
        wife=wife01;
    }
}
class Wife{
    //ID
    String idCard;
    //Name
    String name;
    //Date
    String date;
    //Husband
    Husband husband;
    public Wife(){

    }//Constructor with 3 parameters
    public Wife(String idCard01,String name01,String date01){
        idCard=idCard01;
        name=name01;
        date=date01;
    }
    //Constructor with 4 parameters
    public Wife(String idCard01,String name01,String date01,Husband husband01){
        idCard=idCard01;
        name=name01;
        date=date01;
        husband=husband01;
    }
}