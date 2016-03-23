/**
 * 
 */
package poketeam;

import javax.swing.JFrame;
import javax.swing.JTextField;

import com.pokejava.Pokemon;

/**
 * @author Pjacob
 *
 */
public class SpellChecker extends JFrame {
	JTextField bar = new JTextField();
	public String spellCheck()
	{
		JTextField bar = new JTextField(15);
		String str = new String(Pokemon(bar.getText()));
		if (str.startsWith(str.toLowerCase()))
		{
			return str.toUpperCase();
		}
		return str.toUpperCase();
	}
	private String Pokemon(String text) {
		Pokemon poker = new Pokemon(bar.getText());
		return text = poker.getName();
	}
}
