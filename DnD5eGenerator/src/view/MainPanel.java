package view;

import javax.swing.JPanel;

public class MainPanel extends JPanel {

	private JPanel mainPanelLeft;
	private JPanel mainPanelMiddle;
	private JPanel mainPanelRight;
	
	public MainPanel() {
		setupPanels();
	}

	private void setupPanels() {
		mainPanelLeft = new JPanel();
		mainPanelMiddle = new JPanel();
		mainPanelRight= new JPanel();

		this.add(mainPanelLeft);
		this.add(mainPanelMiddle);
		this.add(mainPanelRight);
		
	}
	
}
