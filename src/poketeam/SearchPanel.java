package poketeam;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * @author Pjacob
 *
 */
public class SearchPanel extends Displayable implements ListSelectionListener, KeyListener {
	private JTextArea textEnter;
	private DefaultListModel<String> nameList;
	private JList<String> list;
	private ArrayList<String> associatedList;

	public SearchPanel(ArrayList<String> associatedList) {
		super();
		this.associatedList = associatedList;
		initPanel();
	}

	/**
	 * This initializes the Panel
	 */
	public void initPanel() {
		panel = new JPanel();
		panel.setLayout(new BorderLayout());

		textEnter = new JTextArea();
		panel.add(textEnter, BorderLayout.NORTH);
		textEnter.addCaretListener(new CaretListener() {
			private String storedText;

			public void caretUpdate(CaretEvent e) {
				if (storedText != textEnter.getText()) {
					storedText = textEnter.getText();
					nameList.removeAllElements();
					if (storedText.length() > 0) {
						list.removeAll();
						updateList(storedText);
					}
				}
			}

		});
		textEnter.addKeyListener(this);
		//sets itself as the key listener for the program
		nameList = new DefaultListModel<String>();
		list = new JList<String>(nameList);
		list.addListSelectionListener(this);
		panel.add(new JScrollPane(list), BorderLayout.CENTER);
		panel.setBorder(new EmptyBorder(new Insets(5, 5, 5, 5)));
	}

	public JList<String> getList() {
		return list;
	}

	public void updateList(String search) {
		nameList.removeAllElements();
		for (String String : searchForString(search)) {
			nameList.addElement(String);
		}
	}

	public ArrayList<String> searchForString(String searching) {
		ArrayList<String> output = new ArrayList<String>();
		for (String p : associatedList) {
			if (p.toLowerCase().contains(searching.toLowerCase())) {
				output.add(p);
				if (output.size() > 50) {
					return output;
				}
			}

		}
		return output;
	}

	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		// This is run whenever an item is clicked
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			String s = this.getList().getSelectedValue();
			this.searchForString(s);
			e.consume();
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			list.getSelectedIndex();
			int sel = list.getSelectedIndex();
			if (sel + 1 < list.getModel().getSize())
			{
				list.setSelectedIndex(sel + 1);
			}
//			else if (sel + 1 == list.getModel().getSize())
//			{
//				list.setSelectedIndex(sel - 1);
//			}
////		    this should return the data in the textArea;
			
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			list.getSelectedIndex();
			int sel = list.getSelectedIndex();
			if (sel - 1 < list.getModel().getSize())
			{
				list.setSelectedIndex(sel - 1);
			}
//			else if (sel - 1 == list.getModel().getSize())
//			{
//				list.setSelectedIndex(- 1);
//			}
//			Later on implement for check of -1
			
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}


}
