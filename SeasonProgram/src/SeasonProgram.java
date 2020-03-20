import javax.swing.JOptionPane;
public class SeasonProgram
{
	public static void main(String[] args)
		{

			String in = " ";
			int month = 0;
			in = JOptionPane.showInputDialog("Input month: ");
			month = Integer.parseInt(in);

    		if(month >= 1 && month <= 3)
    			JOptionPane.showMessageDialog(null,"It's winter.");
    		else if (month >= 4 && month <= 6)
    			JOptionPane.showMessageDialog(null,"It's spring.");
    		else if (month >= 7 && month <= 9)
    			JOptionPane.showMessageDialog(null,"It's summer.");
    		else if (month >= 10 && month <= 12)
    			JOptionPane.showMessageDialog(null,"It's autumn.");
    		else
    			JOptionPane.showMessageDialog(null,"Invalid Month");
	}
}
