package pctoaster1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class b extends JFrame
{

    public b()
    {
        create();
    }

    void create()
    {
        setSize(450, 210);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(0);
        setResizable(false);
        JLabel l = new JLabel((new StringBuilder("This app cannot be used on \"")).append(System.getProperty("os.name")).append("\".").toString(), 0);
        l.setFont(new Font("Dialog", 1, 18));
        l.setBounds(1, 1, 430, 95);
        add(l);
        final JButton b = new JButton("Exit");
        b.setFont(new Font("Dialog", 1, 18));
        b.setBounds(170, 95, 110, 32);
        add(b);
        setVisible(true);
        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                b.setVisible(false);
                (new Thread(new Runnable() {

                    public void run()
                    {
                        JOptionPane.showMessageDialog(null, "Sorry, but this Button is not available. Please try again later or call '911' for further help.");
                        setDefaultCloseOperation(2);
                    }

                    final _cls1 this$1;

                    
                    {
                        this$1 = _cls1.this;
                        super();
                    }
                })).start();
            }

            final b this$0;
            private final JButton val$b;


            
            {
                this$0 = b.this;
                b = jbutton;
                super();
            }
        });
    }
}
