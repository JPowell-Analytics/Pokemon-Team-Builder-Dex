package poketeam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextField;

import com.pokejava.Pokemon;
import com.pokejava.Sprite;

@SuppressWarnings("serial")
public class Pokedex2 extends JFrame {
	public Pokedex2() {
		JButton click = new JButton("Search");
		JTextField bar = new JTextField(15);
		JMenu poke = new JMenu("Pokedex");
		poke.add(bar);
		poke.add(click);


		click.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent event)
			{
				Pokemon poker = new Pokemon(bar.getText());
				System.out.println("Pokemon name:" + poker.getName());
				Sprite sprite = new Sprite(poker.getID());
				sprite.getImage();
				System.out.println("ID Number:" + poker.getID());
				System.out.println("Abilities:" + poker.getAbilities());
				System.out.println("Height:" +poker.getHeight());
				System.out.println("Species:" + poker.getSpecies());
				System.out.println("Stats:");
				System.out.println("Health Points:" + poker.getHP());
				System.out.println("Attack:" + poker.getAttack());
				System.out.println("Defense:" + poker.getDefense());
				System.out.println("Special Attack:" + poker.getSpAttack());
				System.out.println("Special Defense:" + poker.getSpDefense());
				System.out.println("Speed:" + poker.getSpeed());
				if (poker.hasEvolution())
				{
					System.out.println("Level Evolution:" + poker.getEvolvesAt());
					System.out.println("Evolutions:" + poker.getEvolutions());
				}
				else
				{
					System.out.println("This Pokemon has reached its final stage");
				}
				System.out.println("Catch Rate:" + poker.getCatchRate());
				System.out.println("Male/Female Ratio:" + poker.getMFRatio());
				System.out.println("Moves: ");
				System.out.println(poker.getMoves());

			}
		});
		//		/**
		//		 * when this button is clicked a window should open
		//		 * and generate the sprite of that pokemon
		//		 */
		//		display.addActionListener(new ActionListener()
		//		{
		//			@Override
		//			public void actionPerformed(ActionEvent event)
		//			{
		//				Pokemon poker = new Pokemon(bar.getText());
		//				Sprite sprite = new Sprite(poker.getID());
		//				window.setVisible(rootPaneCheckingEnabled);
		//			}
		//		});
	}
}
