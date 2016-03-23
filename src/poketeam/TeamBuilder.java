package poketeam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JTextField;

import com.pokejava.Pokemon;

@SuppressWarnings("serial")
public class TeamBuilder extends JFrame {
	public TeamBuilder() {
		JMenu teamBuilder = new JMenu("Team Builder");
		JTextField addTM = new JTextField(15);
		JButton add = new JButton("Add");
		JButton export = new JButton("Export");
		JButton createNew = new JButton("Create New Team");
		JButton getStats = new JButton("Stats");
		JButton display = new JButton("Display");
		teamBuilder.add(addTM);
		teamBuilder.add(add);
		teamBuilder.add(getStats);
		teamBuilder.add(createNew);
		teamBuilder.add(export);

		add.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent event)
			{
				LinkedList<Pokemon> list = new LinkedList<Pokemon>();
				if (list.size() < 6)
				{
					Pokemon poker = new Pokemon(addTM.getText());
					list.add(poker);
					System.out.println(list.toString());
				}
				else if (list.size() == 6)
				{
					System.out.print(list.toString() + "Your team is now full");

				}
				else
				{
					System.out.println("You have surpassed your limit");
				}


			}
		});
		getStats.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				Pokemon poker = new Pokemon(addTM.getText());
				System.out.println("Ability: " + poker.getAbilities());
				System.out.println("Stats:");
				System.out.println("Health Points:" + poker.getHP());
				System.out.println("Attack:" + poker.getAttack());
				System.out.println("Defense:" + poker.getDefense());
				System.out.println("Special Attack:" + poker.getSpAttack());
				System.out.println("Special Defense:" + poker.getSpDefense());
				System.out.println("Speed:" + poker.getSpeed());
			}
		});
		createNew.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent event)
			{
				ArrayList<Pokemon> list = new ArrayList<Pokemon>();
				list.clear();
				System.out.println("Please input your new team");
			}
		});
	}

	}
		

		
}
