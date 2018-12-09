import java.util.TimerTask;
import java.util.Timer;
public class MyTimer {

   
    public static void main(String[] args) {
        Timer t = new Timer();

            t.scheduleAtFixedRate(
        new TimerTask()
        {
            public void run()
            {
                System.out.println("3 seconds passed");
            }
        },
        0,      // run first occurrence immediately
        3000);
        }
}