package tpmodul8;

public class TPModul8 {
    public static void main(String[] args) {
	Share share = new Share();
        new Thread(new Produser(share)).start();
	new Thread(new Konsumer(share)).start();
    }
    
}
