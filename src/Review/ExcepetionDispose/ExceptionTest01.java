package Review.ExcepetionDispose;

public class ExceptionTest01 {
    public static void main(String[] args) {
    Mystack mastack01=new Mystack();

        try {
            //input 10 objects
            mastack01.push(new Object());
            mastack01.push(new Object());
            mastack01.push(new Object());
            mastack01.push(new Object());
            mastack01.push(new Object());
            mastack01.push(new Object());
            mastack01.push(new Object());
            mastack01.push(new Object());
            mastack01.push(new Object());
            mastack01.push(new Object());
            //at this time, the stack has been full
            mastack01.push(new Object());
        } catch (MystackOperationException e) {
            e.printStackTrace();
        }
        //pop 10 objects
        try {
            mastack01.pop();
            mastack01.pop();
            mastack01.pop();
            mastack01.pop();
            mastack01.pop();
            mastack01.pop();
            mastack01.pop();
            mastack01.pop();
            mastack01.pop();
            mastack01.pop();
            //at this time, the stack has already empty
            mastack01.pop();
        } catch (MystackOperationException e) {
            e.printStackTrace();
        }

    }
}
//class Mystack
class Mystack extends Exception{
    //Properties
        //object[]
    private Object[] objects;
        //index
    private int index;
    //Method:push()
    public void push(Object object) throws MystackOperationException {
        //if the stack has been full, so we need to throw exception
        if(index>=objects.length-1){
            throw new MystackOperationException("Stack has been full");
        }
        //when the process already arrive here, we can add an element
        index++;
        objects[index]=object;
        System.out.println("成功压入："+object+"此时index指向："+index);
    }
    //Method:pop
    public void pop() throws MystackOperationException {
        if(index<0){
            throw new MystackOperationException("Stack has been empty");
        }
        System.out.println(objects[index]+"已经成功被弹出");
        index--;
        System.out.println("此刻index指向："+index);
    }
    //Method:2
        //constructor
    public Mystack() {
        this.objects = new Object[10];
        this.index = -1;
    }
        //set&get
    public Object[] getObjects() {
        return objects;
    }

    public void setObjects(Object[] objects) {
        this.objects = objects;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
//Exception: MystackOperationException
class MystackOperationException extends Exception{
    //constructor

    public MystackOperationException() {
    }

    public MystackOperationException(String message) {
        super(message);
    }
}