/**
 * 
 */
package poketeam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
//The Correct File To USE


/**
 * @author Pjacob
 *
 */
public class PokeDexTeambuilder {
	JFrame frame;
	public PokeDexTeambuilder()
	{
		frame = new JFrame();
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setBackground(Color.BLACK);
		
		JPanel search = new JPanel();
		search.setLayout(new BorderLayout());
		Scanner scan = null;
		try {
			scan = new Scanner(new File("pokemon_list.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ArrayList<String> list = new ArrayList<String>(10);
		while(scan.hasNext())
		{
			list.add(new String(scan.next()));
		}
		scan.close();
		
//		SearchPanel sp = new SearchPanel(list);
		
        Pokedex2 pokedex = new Pokedex2(list);
        TeamBuilder team = new TeamBuilder(list);
//		frame.getContentPane().add(sp.panel, BorderLayout.WEST);
		frame.getContentPane().add(pokedex.panel, BorderLayout.CENTER);
		frame.getContentPane().add(team.panel, BorderLayout.EAST);
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		
//		
//		JPanel teams = new JPanel();
//		teams.setLayout(new BorderLayout());
	}
	public static void main(String[] args)
	{
		new PokeDexTeambuilder();
	}
}
