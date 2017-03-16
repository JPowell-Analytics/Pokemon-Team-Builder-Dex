/**
 * 
 */
package poketeam;

import javax.swing.JPanel;

/**
 * @author Pjacob
 *
 */
public abstract class Displayable {
	protected JPanel panel;
	public Displayable() {
		panel = new JPanel();
	}
	public JPanel getPanel()
	{
		return panel;
	}

}
