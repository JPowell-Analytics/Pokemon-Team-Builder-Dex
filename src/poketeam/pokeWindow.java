package poketeam;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Button;
import java.awt.Window;

/**
 * @author Pjacob
 */
public class pokeWindow extends JFrame 
{
	private SideWindow teamSelection;
	private SideWindow teamBuilder;
	private quitButton Quit;
	private Button Select;
	/**
	 * 
	 */
	public pokeWindow()
	{
		teamSelection = new SideWindow();
		teamBuilder = new SideWindow();
		Quit = new quitButton();
		Select = new Button();
		initUI();
	}
	/**
	 * 
	 */
	private void initUI()
	{
		teamSelection = new SideWindow();
		teamBuilder = new SideWindow();
		Quit = new quitButton();
		Select = new Button();
		setTitle("Pokemon Team Selection");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		teamBuilder = new SideWindow();
		teamSelection = new SideWindow();
		teamSelection.setSize(100, 100);
		teamBuilder.setSize(100, 100);
		teamSelection.setTitle("Selection");
		teamBuilder.setTitle("Team Builder");
		teamSelection.setLocation(0,0);
		teamBuilder.setLocation(0, 100);
		
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() 
		{
		@Override
		public void run()
		{
			pokeWindow pw = new pokeWindow();
			pw.setVisible(true);	
		}
		});
		
	}
	
	
}