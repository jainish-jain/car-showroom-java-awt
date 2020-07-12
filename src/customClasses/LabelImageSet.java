package customClasses;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class LabelImageSet
{
    public static void iconset(String a, JLabel label)
    {
        label.setText("");
        ImageIcon imageIcon = new ImageIcon(a);
        label.setIcon(imageIcon);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
    }
}
