package tpmodul8;

public class Share {
    private boolean bool = false;
    private int data;
    public synchronized void setData(int data){
        while (bool == true){
            try{
                wait();
            }
            catch (InterruptedException e){}
        }
        this.data=data;
        System.out.println("Produsen : "+ ++this.data);
        bool = true;
        notifyAll();
    }
    public synchronized int getData(){
        while (bool == false){
            try{
                wait();
            }
            catch (InterruptedException e){}
        }
        System.out.println("Konsumer : "+ data);
        bool = false;
        notifyAll();
        return this.data;
    }
}
