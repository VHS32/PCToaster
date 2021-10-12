package pctoaster1;

import java.io.*;

// Referenced classes of package pctoaster1:
//            a

class t
    implements Runnable
{

    public void run()
    {
        try
        {
            Process p = Runtime.getRuntime().exec(val$cmd);
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while((line = in.readLine()) != null) 
                System.out.println(line);
            p.waitFor();
        }
        catch(Exception exception) { }
    }

    final a this$0;
    private final String val$cmd;

    g()
    {
        this$0 = final_a1;
        val$cmd = String.this;
        super();
    }
}
