import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;

public class ClickListener implements ActionListener{
	
	private String name;
	private JTextPane textPane;
	
	public ClickListener(String name, JTextPane textPane) {
		this.name=name;
		this.textPane=textPane;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.textPane.setText(this.textPane.getText()+"\r\n\r\nactionPerformed was called on ClickListener "+this.name+" ,event:" + e);		
	}

	
}
