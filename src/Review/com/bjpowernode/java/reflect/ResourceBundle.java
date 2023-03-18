package Review.com.bjpowernode.java.reflect;

public class ResourceBundle {
    public static void main(String[] args) {
        java.util.ResourceBundle resourceBundle= java.util.ResourceBundle.getBundle("Review/Array/db2");
        System.out.println(resourceBundle.getString("className"));
    }
}
