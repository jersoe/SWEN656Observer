import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		frame.getContentPane().add(textPane, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ClickListener("Hank", textPane));
		btnNewButton.addActionListener(new ClickListener("Bob", textPane));
		frame.getContentPane().add(btnNewButton, BorderLayout.WEST);
	}
	

}
