package presentation;

import javax.swing.WindowConstants;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fenetre f = new Fenetre("MA FENETRE");
		f.setVisible(true);
		f.setResizable(false);
		f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

}
