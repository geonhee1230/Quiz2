package Authentication;

import javax.swing.JOptionPane;

public class Quiz2JOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quiz2 check = new Quiz2();
		
		String userinput;
		String passinput;

		userinput = JOptionPane.showInputDialog("Enter username");
		passinput = JOptionPane.showInputDialog("Enter password");

		JOptionPane.showMessageDialog(null,
				Quiz2.authentication(userinput, passinput));

	}

}
