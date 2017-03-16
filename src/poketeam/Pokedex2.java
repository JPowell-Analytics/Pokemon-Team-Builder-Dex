package poketeam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.pokejava.Pokemon;
import com.pokejava.Sprite;

public class Pokedex2 extends Displayable {

	private SearchPanel sp;
	private JTextArea text;

	public Pokedex2(ArrayList<String> list) {
		sp = new SearchPanel(list);
		initPanel();
	}

	public void initPanel() {
		panel.setBackground(Color.BLACK);
		panel.setLayout(new BorderLayout());
		panel.add(sp.getPanel(), BorderLayout.CENTER);

		text = new JTextArea();
		text.setPreferredSize(new Dimension(400, 400));
		panel.add(text, BorderLayout.CENTER);

		sp.getList().addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				//

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					addElement(sp.getList().getSelectedValue());
				}

			}
		});
		sp.getList().addKeyListener(new KeyListener()
				{

					@Override
					public void keyPressed(KeyEvent arg0) {
						if(arg0.getKeyCode() == KeyEvent.VK_ENTER) {
							addElement(sp.getList().getSelectedValue());
						}
					}

					@Override
					public void keyReleased(KeyEvent e) {
						//This is not needed at this time.
						
					}

					@Override
					public void keyTyped(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
			
				});
	}

	public void addElement(String str) {
		StringBuilder builder = new StringBuilder();
		Pokemon poker = new Pokemon(str.toLowerCase());
		builder.append("Pokemon name:" + poker.getName() + "\n");
		Sprite sprite = new Sprite(poker.getID());
		sprite.getImage();
		builder.append("ID Number:" + poker.getID() + "\n");
	    builder.append("Abilities:" + poker.getAbilities() + "\n");
	    builder.append("Height:" + poker.getHeight() + "\n");
	    
	    builder.append("Species:" + poker.getSpecies() + "\n");
	    builder.append("Stats:" + "\n");
	    builder.append("Health Points:" + poker.getHP() + "\n");
	    builder.append("Attack:" + poker.getAttack() + "\n");
	    builder.append("Defense:" + poker.getDefense() + "\n");
	    builder.append("Special Attack:" + poker.getSpAttack() + "\n");
	    builder.append("Special Defense:" + poker.getSpDefense() + "\n");
	    builder.append("Speed:" + poker.getSpeed() + "\n");
		if (poker.hasEvolution()) {
			builder.append("Level Evolution:" + poker.getEvolvesAt() + "\n");
			builder.append("Evolutions:" + poker.getEvolutions() + "\n");
		} else {
			builder.append("This Pokemon has reached its final stage" + "\n");
		}
		builder.append("Catch Rate:" + poker.getCatchRate() + "\n");
		builder.append("Male/Female Ratio:" + poker.getMFRatio() + "\n");
		text.setText(builder.toString());
		// System.out.println("Moves: ");
		// System.out.println(poker.getMoves());

	}

}
