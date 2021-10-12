package pctoaster1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

// Referenced classes of package pctoaster1:
//            b

class <init>
    implements Runnable
{

    public void run()
    {
        JOptionPane.showMessageDialog(null, "Sorry, but this Button is not available. Please try again later or call '911' for further help.");
        setDefaultCloseOperation(2);
    }

    final efaultCloseOperation this$1;

    <init>()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class pctoaster1/b$1

/* anonymous class */
    class b._cls1
        implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            b.setVisible(false);
            (new Thread(new b._cls1._cls1())).start();
        }

        final b this$0;
        private final JButton val$b;


            
            {
                this$0 = final_b1;
                b = JButton.this;
                super();
            }
    }

}
