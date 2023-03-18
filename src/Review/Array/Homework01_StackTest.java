package Review.Array;

public class Homework01_StackTest {
    /*
    * 编写程序，使用一维数组，模拟栈数据类型
    * 要求：
    *       1.这个栈可以存储Java中的任何引用类型的数据
    *       2.在栈中提供push方法模拟压栈（栈满了，要有提示信息）
    *       3.在栈中提供pop方法模拟弹栈（栈空了，也要有提示信息）
    *       4.编写测试程序*/
    public static void main(String[] args) {


        MyStack s1 = new MyStack();
        System.out.println(s1.getElements().length);
        System.out.println(s1.getIndex());
        s1.push(new Object());
        s1.pop();
    }
}
class MyStack{
    //提供一个数组来模拟栈
    private Object[] elements;
    //提供一个栈帧，指向最顶端，因为第一个元素是0，所以指向-1（在空栈时）
    private int index;
    //Constructor

    public MyStack() {
        this.elements =new Object[10];
        this.index = -1;
    }
    //pop method
    public void pop(){
        if(index<0){
            System.out.println("Stack has been empty");
            return;
        }
        //到这里说明栈里面还有东西
        System.out.println("弹出的元素是"+elements[index]);
        index--;
        System.out.println("此刻指向的元素是"+index);

    }
    //push method
    public void push(Object o){
        if(index>=elements.length-1){
            System.out.println("Stack over flow");
            return;
        }
        index++;
        //到这里说明还没有满
        System.out.println("押入元素："+elements[index]);
        System.out.println("Now,the index indicate:"+index);
    }
//set and get
    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}