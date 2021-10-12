package pctoaster1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

// Referenced classes of package pctoaster1:
//            b


class t
    implements ActionListener
{

    public void actionPerformed(ActionEvent e)
    {
        val$b.setVisible(false);
        (new Thread(new Runnable() {

            public void run()
            {
                JOptionPane.showMessageDialog(null, "Sorry, but this Button is not available. Please try again later or call '911' for further help.");
                setDefaultCloseOperation(2);
            }

            final b._cls1 this$1;

            
            {
                this$1 = b._cls1.this;
                super();
            }
        })).start();
    }

    final b this$0;
    private final JButton val$b;


    tton()
    {
        this$0 = final_b1;
        val$b = JButton.this;
        super();
    }
}
