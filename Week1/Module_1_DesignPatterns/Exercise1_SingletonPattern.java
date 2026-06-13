import java.util.*;

class Logger{
    private static Logger ins=new Logger();

    private Logger(){}

    public static Logger getInstance(){
        return ins;
    }

    public void log(String st){
        System.out.println(st);
    }
}
class Exercise1_SingletonPattern {
    public static void main(String [] args){
        Logger logger1= Logger.getInstance();
        Logger logger2=Logger.getInstance();
    
        logger1.log("Logger1 Message");
        logger2.log("Logger2 Message"); 
        System.out.println(logger1==logger2);
    }
}