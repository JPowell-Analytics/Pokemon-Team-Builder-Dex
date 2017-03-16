
package poketeam;


//import java.awt.Dimension;
//import java.awt.Insets;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowListener;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JButton;
//import javax.swing.JDesktopPane; ***
import javax.swing.JFrame;
import javax.swing.JMenu;
//import javax.swing.JLabel;
//import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

//import javax.swing.JPanel;
//import javax.swing.JPopupMenu;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
//import javax.swing.JToolBar;
//import javax.swing.JWindow;
import javax.swing.SwingUtilities;
//import javax.swing.border.EmptyBorder;
//import javax.swing.border.LineBorder;
//
//import com.pokejava.Pokemon;
//import com.pokejava.Sprite;

import com.pokejava.Pokemon;


/**
 * @author Pjacob
 *
 */
@SuppressWarnings("serial")
public class PokemonSelectionWindow extends JFrame {
	JButton click;
	JTextField bar;

	JButton addMember;
	JButton createNew;
	JButton getStats;
	JButton export;
	JTextField addTM;


	public PokemonSelectionWindow() {

		initUI();
	}

	public final void initUI() {

		JMenuBar menuBar = new JMenuBar();
		JMenu pokeMenu = new JMenu("Pokedex");
		JMenu teamMenu = new JMenu("TeamBuilder");
		//		JDesktopPane desktop = new JDesktopPane();
		//		JWindow window = new JWindow();
		//Pokedex2
//		JMenuItem pokedex = new JMenuItem("Pokedex Search");
		click = new JButton("Search");
		JTextField bar = new JTextField(15);


		//TeamBuilder
//		JMenuItem teamBuilder = new JMenuItem("Team Builder");
		addTM = new JTextField(15);
		addMember = new JButton("Add");
		export = new JButton("Export");
		createNew = new JButton("Create New Team");
		getStats = new JButton("Stats");
		//		JButton display = new JButton("Display");

		//Tabs



		//		JButton click = new JButton("Search");
		//		JTextField textBar = new JTextField(15);
		//		JWindow window = new JWindow();


		//		JMenu teams = new JMenu("Teams");

		//		JMenuItem gen1 = new JMenuItem("Gen 1: 001 - 151");
		//		JMenuItem gen2 = new JMenuItem("Gen 2: 152 - 251");
		//		JMenuItem gen3 = new JMenuItem("Gen 3: 252 - 386");
		//		JMenuItem gen4 = new JMenuItem("Gen 4: 387 - 493");
		//		JMenuItem gen5 = new JMenuItem("Gen 5: 494 - 649");
		//		JMenuItem gen6 = new JMenuItem("Gen 6: 650 - 721");
		//		JMenuItem gen7 = new JMenuItem("Gen 7: 722 - ???");


		/*
		gen7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) 
			{
				System.out.println("This is currently unavailable");
				System.out.println("#722 Strange Birb Thing");
			}
		});   */
		//Menu Bar:
		//Pokedex Tab
		menuBar.add(pokeMenu);
		pokeMenu.add(bar);
		pokeMenu.add(click);
		//TeamBuilder Tab
		menuBar.add(teamMenu);
		teamMenu.add(addTM);
		teamMenu.add(addMember);
		teamMenu.add(getStats);
		teamMenu.add(createNew);
		teamMenu.add(export);

		click.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent event)
			{
				Pokemon poker = new Pokemon(bar.getText());
				System.out.println("Pokemon name:" + poker.getName());
//				Sprite sprite = new Sprite(poker.getID());
//				sprite.getImage();
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

		addMember.addActionListener(new ActionListener()
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
		
		setJMenuBar(menuBar);



		setSize(500, 500);
		setTitle("Pokemon Team Creator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
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



public static void main(String[] args) {

	SwingUtilities.invokeLater(new Runnable() {

		public void run() {
			PokemonSelectionWindow ex = new PokemonSelectionWindow();
			ex.setVisible(true);
		}
	});
}
}