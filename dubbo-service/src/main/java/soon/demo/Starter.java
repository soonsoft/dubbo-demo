package soon.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zWX458959 on 2017/9/27.
 */
public class Starter {

    private static ClassPathXmlApplicationContext context;
    private static final byte[] LOCK = new byte[0];
    private static boolean active = true;

    public static void main(String[] args) {
        String[] configArr = new String[] {
                "classpath*:/spring/*.xml"
        };
        try
        {
            context = new ClassPathXmlApplicationContext(configArr, false);
            context.refresh();
            System.out.println("server started");

            Runtime.getRuntime().addShutdownHook(new Thread(new Runnable()
            {
                public void run()
                {
                    System.out.println("server stop now.");
                    synchronized (LOCK)
                    {
                        active = false;
                        LOCK.notifyAll();
                    }
                }
            }, "APP-ShutdownHook"));

            while (true)
            {
                synchronized (LOCK)
                {
                    if (active)
                    {
                        try
                        {
                            LOCK.wait();
                        }
                        catch (InterruptedException e)
                        {
                            System.out.println("Thread error.");
                            e.printStackTrace();
                        }
                    }
                    else
                    {
                        break;
                    }
                }

            }
        }
        catch (Exception e)
        {
            System.out.println("server initialize failed");
            e.printStackTrace();
        }
        finally
        {
            if (context != null)
            {
                context.close();
            }
        }
    }

}
