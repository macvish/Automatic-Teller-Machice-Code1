/*
By MacAnthony
*/
import javax.swing.*;
public class Pin
{
	static int pin;
	{
		pin = Integer.parseInt(JOptionPane.showInputDialog("INPUT YOUR PIN"));
		if (pin == 1234)
		{
			WithDrawal1 c1 = new WithDrawal1();
		}
		else if (pin == 1111)
		{
			WithDrawal2 c1 = new WithDrawal2();
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Please Input The Correct Pin", "Error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "      TAKE YOUR CARD");
		}
	}

}