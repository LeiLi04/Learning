package Review.Private;

public class Homework01_Book {
    /*
    * 编写一个类BOOk，代表教材
    * 1.具有属性，title 和page
    * 2。其中页数不能少于200页，否则输出错误信息，并赋予默认值300
    * 3。为各属性提供赋值和取值方法
    * 4。具有方法：detail，用来在控制台输出每本教材的title和页数
    * 5。编写测试类BookTest进行测试，为Book对象的属性赋予初始值，并且调用Book对象的detail方法，看输出是否正确
    * */
    public static void main(String[] args) {
        Book b1=new Book();
        b1.setPageNum(150);
        b1.setTitle("三国演义");
        b1.detail();
        //调用另一个构造方法
        Book b2=new Book();
        b2.setTitle("小黄书");
        b2.setPageNum(300);
        b2.detail();
    }

}
class Book{
    //title
    private String title;
    //pageNum
    private int pageNum=300;
    //getter and setter
    public String getTitle(){
        return title;
    }
    public void setTitle(String newTitle01){
        title=newTitle01;
    }
    public int getPageNum(){
        return pageNum;
    }
    public void setPageNum(int newNum){
        //if pageNum<0 or pageNum>300, output null
        if(newNum<0||newNum>300){
            System.out.println("null");
        }else{
            pageNum=newNum;
        }
    }
    //实例方法detail,用来在控制台输出每本教材的名称和页数
    public void detail(){
        System.out.println(this.title+"page is"+this.pageNum);
    }
}