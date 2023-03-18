package chapter26.src.com.bjpowernode.java.annotation7;

/*
自定义异常
 */
public class HasNotIdPropertyException extends RuntimeException {
    public HasNotIdPropertyException(){

    }
    public HasNotIdPropertyException(String s){
        super(s);
    }
}
