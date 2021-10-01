package tpmodul8;

public class Konsumer extends Share implements Runnable{
    Share sh;
    public Konsumer(Share sh) {
        this.sh = sh;
    }
    
    public void run(){
        for (int a = 0; a < 100; a++){
            sh.getData();
        }
    }
}
