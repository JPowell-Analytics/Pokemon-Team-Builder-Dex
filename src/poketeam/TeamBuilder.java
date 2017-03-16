package poketeam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
//import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JButton;
//import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.pokejava.Pokemon;


public class TeamBuilder extends Displayable {
	private SearchPanel sp;
	private JTextArea text;
	public TeamBuilder(ArrayList<String> list) {
		sp = new SearchPanel(list);
		initPanel();
	}
		public void initPanel()
		{
			panel.setBackground(Color.BLACK);
			panel.setLayout(new BorderLayout());
			panel.add(sp.getPanel(), BorderLayout.WEST);
			text = new JTextArea();
			text.setPreferredSize(new Dimension(400, 400));
			panel.add(text,  BorderLayout.CENTER);

			sp.getList().addMouseListener(new MouseListener()
			{

				@Override
				public void mouseClicked(MouseEvent arg0) {
					if (arg0.getClickCount() == 2) {

						String str = sp.getList().toString();
						ArrayList<Pokemon> list = new ArrayList<Pokemon>();
						for (int i = 0; i < 10; i++) {
							if (i < 6){
								Pokemon poker = new Pokemon(str.toLowerCase());
								list.add(poker);
								System.out.println(list.toString());
							} else if (i == 6) {
								System.out.print(list.toString() + "Your team is now full, Now moving on to "
										+ "backup members.");

							} else {
								System.out.println("You have surpassed your limit and your list is now full.");
							}
							if (arg0.getClickCount() == 3)
							{
								System.out.println("Your Current Team is" + str);
							}
						}
					}
				}

				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseReleased(MouseEvent arg0) {
					// TODO Auto-generated method stub

				}
			});
		}
		public void addTeam(String str)
		{
			StringBuilder builder = new StringBuilder();
			Pokemon poke = new Pokemon(str.toLowerCase());
			builder.append("Pokemon Name:" + poke.getName() + "\n");
			builder.append("Type:" + poke.getTypes() + "\n");
			builder.append("EV's:" + poke.getEVYield() + "\n");
		}
		//			getStats.addActionListener(new ActionListener()
		//			{
		//				public void actionPerformed(ActionEvent event)
		//				{
		//					Pokemon poker = new Pokemon(addTM.getText());
		//					System.out.println("Ability: " + poker.getAbilities());
		//					System.out.println("Stats:");
		//					System.out.println("Health Points:" + poker.getHP());
		//					System.out.println("Attack:" + poker.getAttack());
		//					System.out.println("Defense:" + poker.getDefense());
		//					System.out.println("Special Attack:" + poker.getSpAttack());
		//					System.out.println("Special Defense:" + poker.getSpDefense());
		//					System.out.println("Speed:" + poker.getSpeed());
		//				}
		//			});
		//			createNew.addActionListener(new ActionListener()
		//			{
		//				@Override
		//				public void actionPerformed(ActionEvent event)
		//				{
		//					ArrayList<Pokemon> list = new ArrayList<Pokemon>();
		//					list.clear();
		//					System.out.println("Please input your new team");
		//				}
		//			});
	}




