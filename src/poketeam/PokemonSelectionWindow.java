
package poketeam;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.pokejava.Pokemon;
import com.pokejava.Sprite;


/**
 * @author Pjacob
 *
 */
@SuppressWarnings("serial")
public class PokemonSelectionWindow extends JFrame {


	public PokemonSelectionWindow() {

		initUI();
	}

	public final void initUI() {

		JMenuBar menu = new JMenuBar();
		JPopupMenu poke = new JPopupMenu();
		JPopupMenu teamBuilder = new JPopupMenu();
		JButton click = new JButton("Search");
		JTextField bar = new JTextField(15);
		JWindow window = new JWindow();
		Pokedex2 poker = new Pokedex2();
		TeamBuilder teams = new TeamBuilder();
		
		//		JMenu teams = new JMenu("Teams");
		//		JMenu summary = new JMenu("Generation");
		//		JButton stats = new JButton("Stats");
		//		JButton info = new JButton("Information");
		//		JMenu atk = new JMenu("Attack");
		//		JMenu def = new JMenu("Defense");
		//		JMenu spAtk = new JMenu("Sp. Attack");
		//		JMenu spDef = new JMenu("Sp. Defense");
		//		JMenu spd = new JMenu("Speed");
		//		JMenu hp = new JMenu("Health");
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
		menu.add(poke);
		poke.add(poker.add(click));
		menu.add(teamBuilder);
		teamBuilder.add(teams.add(teamBuilder));
		
		

	setJMenuBar(menu);

	JToolBar tools = new JToolBar();
	tools.setFloatable(false);

	ImageIcon quitNow = new ImageIcon("exit.png");
	JButton quit = new JButton(quitNow);
	quit.setBorder(new EmptyBorder(0 ,0, 0, 0));
	tools.add(quit);

	add(tools, BorderLayout.NORTH);

	JToolBar vertical = new JToolBar(JToolBar.VERTICAL);
	vertical.setFloatable(false);
	vertical.setMargin(new Insets(10, 5, 5, 5));

	ImageIcon select = new ImageIcon("drive.png");
	ImageIcon Selection = new ImageIcon("computer.png");

	JButton selectb = new JButton(select);
	selectb.setBorder(new EmptyBorder(3, 0, 3, 0));

	JButton Selectionb = new JButton(Selection);
	Selectionb.setBorder(new EmptyBorder(3, 0, 3, 0));

	vertical.add(selectb);
	vertical.add(Selectionb);

	add(vertical, BorderLayout.WEST);
	add(new JTextArea(), BorderLayout.CENTER);

	JLabel statusbar = new JLabel("Statusbar");
	statusbar.setPreferredSize(new Dimension(-1, 22));
	statusbar.setBorder(LineBorder.createBlackLineBorder());
	add(statusbar, BorderLayout.SOUTH);

	setSize(500, 500);
	setTitle("Pokemon Team Creator");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
}



public static void main(String[] args) {

	SwingUtilities.invokeLater(new Runnable() {

		public void run() {
			PokemonSelectionWindow ex = new PokemonSelectionWindow();
			ex.setVisible(true);
		}
	});
}
}