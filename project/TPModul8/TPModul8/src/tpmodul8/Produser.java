package tpmodul8;
import java.util.*;
public class Produser extends Share implements Runnable{
    Share sh;
    Random rd = new Random();
    public Produser(Share sh) {
        this.sh = sh;
    }
    
    public void run(){
        for (int a = 0; a < 100; a++){
            sh.setData(rd.nextInt(100)+0);
        }
    }
}
