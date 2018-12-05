/*
By MacAnthony
*/
//pin is 1234
import javax.swing.*;
import javax.swing.JOptionPane;
public class WithDrawal1
{
	static int mycheck;
	static int mychoice;
	static int myamount;
	{
		JOptionPane.showMessageDialog(null, "\n WELCOME MR. AHAOTU MACANTHONY C.", "By MACANTHONY", JOptionPane.PLAIN_MESSAGE);
		mycheck = 1000000000;
		mychoice = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Withdrawal \n 2. Check Balance"));
		if (mychoice == 1)
		{
			String amount = JOptionPane.showInputDialog(null, "PLEASE ENTER THE AMOUNT");
			myamount = Integer.parseInt(amount);
			int myremain = 1000000000 - myamount;
			JOptionPane.showMessageDialog(null, "The Amount You Entered is " + amount);
			if (myamount <= 1000000000)
			{
				JOptionPane.showMessageDialog(null, "Please Wait Your Transcation Is In Processing");
				JOptionPane.showMessageDialog(null, "Please Take Your Cash");
				JOptionPane.showMessageDialog(null, "Your Available Balance is " + myremain);
				int reply = JOptionPane.showConfirmDialog(null, "Do You Want To Perform Another Transaction", "", JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION)
				{
					Pin pin = new Pin();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MR. AHAOTU MACANTHONY C.");
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, " Sorry You Do Not Have That Amount", "Error", JOptionPane.ERROR_MESSAGE);
				int reply = JOptionPane.showConfirmDialog(null, "Do You Want To Perform Another Transaction", "", JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION)
				{
					Pin pin = new Pin();
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MR. AHAOTU MACANTHONY C.");
				}
			}
		}
		else if(mychoice == 2)
		{
			JOptionPane.showMessageDialog(null, "Your Account Balance Is " + mycheck);
			int reply = JOptionPane.showConfirmDialog(null, "Do You Want To Perform Another Transaction", "By MacAnthony", JOptionPane.YES_NO_OPTION);
			if (reply == JOptionPane.YES_OPTION)
			{
				Pin pin = new Pin();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MR. AHAOTU MACANTHONY C.");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Please Input The Correct Number", "Error", JOptionPane.ERROR_MESSAGE);
			int response = JOptionPane.showConfirmDialog(null, "Do You Want To Try Again", "By MacAnthony", JOptionPane.YES_NO_OPTION);
			if (response == JOptionPane.YES_OPTION)
			{
				Pin pin = new Pin();
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MR. AHAOTU MACANTHONY C.");
			}
		}
	}
}