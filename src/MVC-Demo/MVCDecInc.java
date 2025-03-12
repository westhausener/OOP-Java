import java.util.Observable;
 
public class MVCDecInc extends Observable {
 
    private int counter = 0;
 
    public int getCounter() {
        return counter;
    }
 
    public void inc(){
        counter += 1;
        System.out.println(this.counter);
        setChanged();
        notifyObservers(this);
    }
     
    public void dec(){
        counter -= 1;
        System.out.println(this.counter);
        setChanged();
        notifyObservers(this);
    }
     
    public String counterToString(){
        return Integer.toString(this.counter);
    }
}