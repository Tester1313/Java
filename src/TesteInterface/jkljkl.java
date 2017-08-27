package TesteInterface;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class jkljkl extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jkljkl frame = new jkljkl();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public jkljkl() {
		setBounds(100, 100, 450, 300);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);

	}

}
