package Review.Array;

import java.util.Scanner;

public class Homework02_HotelTest {
    /*
    * 为某个酒店编写程序：酒店管理系统，模拟订房，退房，打印所有房间状态等功能
    * 1.该系统的用户是：酒店前台
    * 2。酒店使用一个二维数组来模拟 Room[][] rooms
    * 3.酒店中的每一个房间应该有的属性：房间编号，房间类型，房间是否空闲
    * 4.酒店中的每一个房间应该是一个java对象 room
    * 5.系统应该对外提供的功能：
    *   可以预定房间，用户输入房间编号，订房
    *   可以退房，用户输入房间编号，退房*/
    public static void main(String[] args) {
        Hotel h1=new Hotel();
        java.util.Scanner s1 = new Scanner(System.in);
        System.out.println("欢迎使用酒店管理系统");
        System.out.println("功能编号对应的功能:[1]表示查看房间列表 [2]order [3]quit [4]exit");
        while (true){
            System.out.println("请输入功能编号");
            int code=s1.nextInt();
            if(code==1){
                h1.print();
            }else if(code==2){
                System.out.println("input the num of the room");
                int n1=s1.nextInt();
                h1.order(n1);
            }else if(code==3){
                System.out.println("input the num of the room");
                int n2=s1.nextInt();
                h1.exit(n2);
            }else if(code==4){
                return;
            }
            else{
                System.out.println("please input the correct num of the room");
                return;
            }
        }


    }
}
//class room
class Room{
    //房间编号
    private int num;
    //房间类型
    private String type;
    //房间是否空闲
    private boolean isEmpty;
    //some get in
    public void in(String num){
        System.out.println("Someone get in");
        boolean isEmpty=false;
    }
    //someone get out
    public void out(String num){
        System.out.println("Someone get out");
        boolean isEmpty=true;
    }
    //constructor

    public Room() {
    }

    public Room(int num, String type, boolean isEmpty) {
        this.num = num;
        this.type = type;
        this.isEmpty = isEmpty;
    }
    //set and get

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){return true;}
        if(!(obj instanceof Room)||obj==null){return false;}
        Room room01=(Room) obj;
        return room01.getNum()==getNum();
    }


    @Override
    public String toString() {
        return "num:"+num+" "+"type:"+type+" "+"isEmpty"+isEmpty;
    }
}
class Hotel{
    //property: room
    private Room[][] rooms;
    //Constructor
    public Hotel() {
        rooms=new Room[3][10];
        for(int i=0;i<rooms.length;i++){
            for(int j=0;j<rooms[i].length;j++){
                //create some singleRoom
                if(i==0){
                    rooms[i][j]=new Room(100*(i+1)+j+1,"SingleRoom",true);
                }
                if(i==1){
                    rooms[i][j]=new Room(100*(i+1)+j+1,"doubleRoom",true);
                }
                if(i==2){
                    rooms[i][j]=new Room(100*(i+1)+j+1,"GreatRoom",true);
                }
            }
        }
    }
    //method:order
    public void order(int num){
        rooms[num/100-1][num%100-1].setEmpty(false);
        System.out.println(num+"order successfully");
    }
    //method:quit
    public void exit(int num){
        rooms[num/100-1][num%100-1].setEmpty(true);
        System.out.println(num+"quit successfully");
    }
    //print
    public void print(){
        for (int i=0;i<rooms.length;i++){
            for(int j=0;j<rooms[i].length;j++){
                System.out.print(rooms[i][j].getNum()+" ");
            }
            System.out.println();
        }
    }
    //set and get

    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }
}
