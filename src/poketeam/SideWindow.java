/**
 * 
 */
package poketeam;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.SwingUtilities;

/**
 * @author Pjacob
 *
 */
public class SideWindow extends JFrame {
	public SideWindow()
	{
		initUI();
	}
	private void initUI()
	{
		JButton select = new JButton("Select");
		JPanel panel = new JPanel();
		JTextArea area = new JTextArea("Selection");
		area.setPreferredSize(new Dimension(100, 100));
		JTree tree = new JTree();
		panel.add(tree);
		panel.add(area);
		add(panel);
		pack();
		setTitle("Team Selection");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				SideWindow window = new SideWindow();
				window.setVisible(true);
			}
		});
	}
}