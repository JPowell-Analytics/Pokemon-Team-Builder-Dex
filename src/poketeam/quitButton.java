package poketeam;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * @author Pjacob
 *
 */
public class quitButton extends JFrame {

	public quitButton()
	{
		initUI();
	}
	private void initUI()
	{
		JButton quit = new JButton("Quit");
		quit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) 
			{
				System.exit(0);
			}
		});
		createLayout(quit);
		setTitle("Quit");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private void createLayout(JComponent... arg)
	{
		Container container = getContentPane();
		GroupLayout gL = new GroupLayout(container);
		container.setLayout(gL);
		gL.setAutoCreateContainerGaps(true);
		gL.setHorizontalGroup(gL.createSequentialGroup().addComponent(arg[0]));
		gL.setVerticalGroup(gL.createSequentialGroup().addComponent(arg[0]));
	}
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {;
		@Override
		public void run()
		{
			quitButton quit = new quitButton();
			quit.setVisible(true);
		}});
	}
	
}
