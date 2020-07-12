package customClasses;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageChange
{
    
    int z = 0;
    Timer timer;
    
    public void change(final String[] a, final JLabel jlabel1)
    {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask()
        {
            @Override
            public void run()
            {
                ImageIcon imageIcon = new ImageIcon(a[z]);
                jlabel1.setIcon(imageIcon);
                jlabel1.setHorizontalAlignment(JLabel.CENTER);
                jlabel1.setVerticalAlignment(JLabel.CENTER);
                z++;
                if (z == a.length)
                {
                    timer.cancel();
                }
            }
        }, 0, 1500);
    }
}
