import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class MVCController implements ActionListener {
     
    private MVCDecInc decinc; 
    private MVCView view, view2, view3;
     
    public MVCController(){
        // mein Model
        this.decinc = new MVCDecInc();
        // meine Views
        this.view = new MVCView(this);
        this.view2 = new MVCView(this);
        this.view3 = new MVCView(this);
         
        // Observer zu den Modellen hinzufügen.
        this.decinc.addObserver(this.view);
        this.decinc.addObserver(this.view2);
        this.decinc.addObserver(this.view3);
        this.view.setVisible(true);
        this.view2.setVisible(true);
        this.view3.setVisible(true);
    }
     
    @Override
    public void actionPerformed(ActionEvent arg0) {
        System.out.println("ACTION: " + arg0.getActionCommand().toString());
        if(arg0.getActionCommand().equalsIgnoreCase(MVCStatics.ACTION_DEC))
            this.decinc.dec();
        if(arg0.getActionCommand().equalsIgnoreCase(MVCStatics.ACTION_INC))
            this.decinc.inc();
    }
     
}