package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class GenGUI {
	
//	public static void main(String[] args) {
//		new GenGUI();	
//	}
	
	private static final int FRAME_WIDTH = 800;
	private static final int FRAME_HEIGHT = 600;
	private static final int FRAME_LOCATION = 150;
	
	private JFrame frame;
	private JLayeredPane layerPane;
	private JPanel introPanel;
	private IntroBG introBGPanel;
	private JPanel genContainer;
	private JPanel headerPanel;
	private JPanel mainPanel;
	private JPanel mainPanelLeft;
	private JPanel mainPanelRight;
	private JPanel mainPanelMiddle;
	private JButton loadButton;
	private JButton newButton;
	
	//headerPanel content
	private JSpinner charLevel;
	private JTextField charName;
	private JComboBox charRace;
	private JComboBox charClass;
	private JComboBox charAlign;
	private JTextField charBG;
	
	public GenGUI() {
		setupFrameAndPanels();
		setupInfo();
		frame.setVisible(true);
	}

	private void setupInfo() {
		// TODO Auto-generated method stub
		
	}

	private void setupFrameAndPanels() {
		frame = new JFrame();
		headerPanel = new JPanel();
		mainPanel = new JPanel();
		mainPanelLeft = new JPanel();
		mainPanelMiddle = new JPanel();
		mainPanelRight = new JPanel();
		layerPane = new JLayeredPane();
		introBGPanel = new IntroBG();
		genContainer = new JPanel();
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT+22);
		frame.setLocation(FRAME_LOCATION, FRAME_LOCATION);
		
		layerPane.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		introBGPanel.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		introBGPanel.setOpaque(true);
		
		layerPane.add(introBGPanel);
		
		
		//Sets up the content for the main character generation panels
		setupGenContainer();
	
		layerPane.add(genContainer);
		
		frame.add(layerPane);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addMouseListener(new MouseCheck());
		

	
	}
	
	private void setupGenContainer() {
		genContainer.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		genContainer.setLayout(new FlowLayout());
		
		setupHeaderPanel();
		
		
		genContainer.add(headerPanel);
		
		
		
		mainPanel.setSize(FRAME_WIDTH, FRAME_HEIGHT-121);
		mainPanel.setLayout(new GridLayout(1,3));
		
		
		
		setupMainPanels();
		
		genContainer.add(mainPanel);
		
		
		
	}

	private void setupHeaderPanel() {
		headerPanel.setLayout(new GridLayout(1,3));
		headerPanel.setSize(FRAME_WIDTH, 120);
		
		charLevel = new JSpinner();
		charName = new JTextField();
		charRace = new JComboBox();
		charClass = new JComboBox();
		charAlign = new JComboBox();
		charBG = new JTextField();
		
		headerPanel.add(charName);
		headerPanel.add(charLevel);
		headerPanel.add(charClass);
		headerPanel.add(charRace);
		headerPanel.add(charAlign);
		headerPanel.add(charBG);
		
	}

	private void setupMainPanels() {
		
		
		mainPanelLeft.setLayout(new GridLayout(6,2));
		mainPanelMiddle.setLayout(new FlowLayout());
		mainPanelRight.setLayout(new FlowLayout());
		mainPanelLeft.setSize(FRAME_WIDTH/3, FRAME_HEIGHT-121);
		mainPanelMiddle.setSize(FRAME_WIDTH/3, FRAME_HEIGHT-121);
		mainPanelRight.setSize(FRAME_WIDTH/3, FRAME_HEIGHT-121);
		
	
		
		mainPanel.add(mainPanelLeft);
		mainPanel.add(mainPanelMiddle);
		mainPanel.add(mainPanelRight);
		
	}

	private class MouseCheck extends MouseAdapter {
		
		@Override 
		public void mouseClicked(MouseEvent e) {
			layerPane.moveToFront(genContainer);
		}
		
	}
	

}
