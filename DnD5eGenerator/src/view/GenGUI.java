package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import model.Character;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

public class GenGUI {
	
	public static void main(String[] args) {
		new GenGUI();	
	}
	
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
	private JButton loadButton;
	private JButton newButton;
	private JTextField charName;
	private JPanel panel;
	private JTextField playerName;
	private JSpinner strSpinner;
	private JSpinner intlSpinner;
	private JSpinner wisSpinner;
	private JSpinner chaSpinner;
	private JSpinner dexSpinner;
	private JSpinner conSpinner;
	private JSpinner strSaveSpinner;
	private JSpinner dexSaveSpinner;
	private JSpinner conSaveSpinner;
	private JSpinner intlSaveSpinner;
	private JSpinner wisSaveSpinner;
	private JSpinner chaSaveSpinner;
	private JLabel classLabel;
	private JLabel raceLabel;
	private JLabel alignLabel;
	private JSpinner charLevelSpinner;
	private JLabel acLabel;
	private JLabel hpLabel;
	private JLabel initLabel;
	private JTextField acText;
	private JTextField hpText;
	private JTextField initText;
	private JLabel moveLabel;
	private JTextField moveText;
	private JTextField acrobaticsText;
	private JTextField animalHandlingText;
	private JTextField arcanaText;
	private JTextField athleticsText;
	private JTextField deceptionText;
	private JTextField historyText;
	private JTextField insightText;
	private JTextField intimidationText;
	private JTextField investigationText;
	private JTextField medicineText;
	private JTextField natureText;
	private JTextField perceptionText;
	private JTextField performanceText;
	private JTextField persuasionText;
	private JTextField religionText;
	private JTextField sleightOfHandText;
	private JTextField stealthText;
	private JTextField survivalText;
	
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
		layerPane = new JLayeredPane();
		genContainer = new JPanel();
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT+22);
		frame.setLocation(FRAME_LOCATION, FRAME_LOCATION);
		
		layerPane.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		
		
		//Sets up the content for the main character generation panels
		setupGenContainer();
	
		layerPane.add(genContainer);
		mainPanel = new JPanel();
		mainPanel.setToolTipText("Character Name");
		genContainer.add(mainPanel, "1, 1, fill, fill");
		
		dexSpinner = new JSpinner();
		
		conSpinner = new JSpinner();
		
		strSpinner = new JSpinner();
		
		intlSpinner = new JSpinner();
		
		wisSpinner = new JSpinner();
		
		chaSpinner = new JSpinner();
		
		strSaveSpinner = new JSpinner();
		
		dexSaveSpinner = new JSpinner();
		
		conSaveSpinner = new JSpinner();
		
		intlSaveSpinner = new JSpinner();
		
		wisSaveSpinner = new JSpinner();
		
		chaSaveSpinner = new JSpinner();
		
		JLabel strMod = new JLabel("+0");
		
		JLabel dexMod = new JLabel("+0");
		
		JLabel conMod = new JLabel("+0");
		
		JLabel intlMod = new JLabel("+0");
		
		JLabel wisMod = new JLabel("+0");
		
		JLabel chaMod = new JLabel("+0");
		
		JPanel subHeader = new JPanel();
		subHeader.setPreferredSize(new Dimension(800, 60));
		
		JLabel lblAbilities = new JLabel("Abilities");
		
		JLabel lblSaves = new JLabel("Saves");
		
		JLabel lblSkills = new JLabel("Skills");
		
		acrobaticsText = new JTextField();
		acrobaticsText.setColumns(2);
		
		animalHandlingText = new JTextField();
		animalHandlingText.setColumns(2);
		
		arcanaText = new JTextField();
		arcanaText.setColumns(2);
		
		athleticsText = new JTextField();
		athleticsText.setColumns(2);
		
		deceptionText = new JTextField();
		deceptionText.setColumns(2);
		
		historyText = new JTextField();
		historyText.setColumns(2);
		
		insightText = new JTextField();
		insightText.setColumns(2);
		
		intimidationText = new JTextField();
		intimidationText.setColumns(2);
		
		investigationText = new JTextField();
		investigationText.setColumns(2);
		
		medicineText = new JTextField();
		medicineText.setColumns(2);
		
		JLabel lblAcrobatics = new JLabel("Acrobatics");
		
		JLabel lblAnimalHandling = new JLabel("Animal Handling");
		
		JLabel lblArcana = new JLabel("Arcana");
		
		JLabel lblAthletics = new JLabel("Athletics");
		
		JLabel lblDeception = new JLabel("Deception");
		
		JLabel lblHistory = new JLabel("History");
		
		JLabel lblInsight = new JLabel("Insight");
		
		JLabel lblIntimidation = new JLabel("Intimidation");
		
		JLabel lblInvestigation = new JLabel("Investigation");
		
		JLabel lblMedicine = new JLabel("Medicine");
		
		JLabel lblProficient = new JLabel("Proficient?");
		
		JCheckBox acrobaticsProfCheckBox = new JCheckBox("");
		
		JCheckBox animalHandlingProfCheckBox = new JCheckBox("");
		
		JCheckBox arcanaProfCheckBox = new JCheckBox("");
		
		JCheckBox athleticsProfCheckBox = new JCheckBox("");
		
		JCheckBox deceptionProfCheckBox = new JCheckBox("");
		
		JCheckBox historyProfCheckBox = new JCheckBox("");
		
		JCheckBox insightProfCheckBox = new JCheckBox("");
		
		JCheckBox intimidationProfCheckBox = new JCheckBox("");
		
		JCheckBox investigationProfCheckBox = new JCheckBox("");
		
		JCheckBox medicineProfCheckBox = new JCheckBox("");
		
		natureText = new JTextField();
		natureText.setColumns(2);
		
		JLabel lblNature = new JLabel("Nature");
		
		JCheckBox natureProfCheckBox = new JCheckBox("");
		
		perceptionText = new JTextField();
		perceptionText.setColumns(2);
		
		JLabel lblPerception = new JLabel("Perception");
		
		JCheckBox perceptionProfCheckBox = new JCheckBox("");
		
		performanceText = new JTextField();
		performanceText.setColumns(2);
		
		JLabel lblPerformance = new JLabel("Performance");
		
		JCheckBox performanceProfCheckBox = new JCheckBox("");
		
		persuasionText = new JTextField();
		persuasionText.setColumns(2);
		
		JLabel lblPersuasion = new JLabel("Persuasion");
		
		JCheckBox checkBox = new JCheckBox("");
		
		religionText = new JTextField();
		religionText.setColumns(2);
		
		JLabel lblReligion = new JLabel("Religion");
		
		JCheckBox religionProfCheckBox = new JCheckBox("");
		
		sleightOfHandText = new JTextField();
		sleightOfHandText.setColumns(2);
		
		JLabel lblSleightOfHand = new JLabel("Sleight of Hand");
		
		JCheckBox sleightOfHandProfCheckBox = new JCheckBox("");
		
		stealthText = new JTextField();
		stealthText.setColumns(2);
		
		JLabel lblStealth = new JLabel("Stealth");
		
		JCheckBox stealthProfCheckBox = new JCheckBox("");
		
		survivalText = new JTextField();
		survivalText.setColumns(2);
		
		JLabel lblSurvival = new JLabel("Survival");
		
		JCheckBox survivalProfCheckBox = new JCheckBox("");
		
		JLabel lblStr = new JLabel("STR");
		
		JLabel lblDex = new JLabel("DEX");
		
		JLabel lblCon = new JLabel("CON");
		
		JLabel lblInt = new JLabel("INT");
		
		JLabel lblWis = new JLabel("WIS");
		
		JLabel lblCha = new JLabel("CHA");
		
		JButton btnRollStats = new JButton("Roll Stats");
		btnRollStats.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Character.getInstance().randomScoreAssignment();
				strSpinner.setValue(Character.getInstance().getStr().getValue());
				dexSpinner.setValue(Character.getInstance().getDex().getValue());
				conSpinner.setValue(Character.getInstance().getStr().getValue());
				intlSpinner.setValue(Character.getInstance().getStr().getValue());
				wisSpinner.setValue(Character.getInstance().getStr().getValue());
				chaSpinner.setValue(Character.getInstance().getStr().getValue());
				
			}
		});
		GroupLayout gl_mainPanel = new GroupLayout(mainPanel);
		gl_mainPanel.setHorizontalGroup(
			gl_mainPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainPanel.createSequentialGroup()
					.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_mainPanel.createSequentialGroup()
							.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_mainPanel.createSequentialGroup()
									.addContainerGap()
									.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblStr)
										.addComponent(lblDex)
										.addComponent(lblCon)
										.addComponent(lblInt)
										.addComponent(lblWis)
										.addComponent(lblCha))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblAbilities)
										.addGroup(gl_mainPanel.createSequentialGroup()
											.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
												.addComponent(intlSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(wisSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(chaSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
												.addComponent(wisMod)
												.addComponent(chaMod)
												.addComponent(intlMod)))
										.addGroup(gl_mainPanel.createSequentialGroup()
											.addComponent(dexSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(dexMod))
										.addGroup(gl_mainPanel.createSequentialGroup()
											.addComponent(conSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(conMod))
										.addGroup(gl_mainPanel.createSequentialGroup()
											.addComponent(strSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(strMod)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblSaves)
										.addComponent(strSaveSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(dexSaveSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(conSaveSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(intlSaveSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(wisSaveSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(chaSaveSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_mainPanel.createSequentialGroup()
									.addGap(20)
									.addComponent(btnRollStats)))
							.addGap(74)
							.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblSkills)
								.addGroup(gl_mainPanel.createSequentialGroup()
									.addComponent(acrobaticsText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblAcrobatics))
								.addGroup(gl_mainPanel.createSequentialGroup()
									.addComponent(animalHandlingText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblAnimalHandling))
								.addGroup(gl_mainPanel.createSequentialGroup()
									.addComponent(arcanaText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblArcana))
								.addGroup(gl_mainPanel.createSequentialGroup()
									.addComponent(athleticsText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblAthletics))
								.addGroup(gl_mainPanel.createSequentialGroup()
									.addComponent(deceptionText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblDeception))
								.addGroup(gl_mainPanel.createSequentialGroup()
									.addComponent(historyText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblHistory))
								.addGroup(gl_mainPanel.createSequentialGroup()
									.addComponent(insightText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblInsight))
								.addGroup(gl_mainPanel.createSequentialGroup()
									.addComponent(intimidationText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblIntimidation))
								.addGroup(gl_mainPanel.createSequentialGroup()
									.addComponent(investigationText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblInvestigation))
								.addGroup(gl_mainPanel.createSequentialGroup()
									.addComponent(medicineText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblMedicine))
								.addGroup(gl_mainPanel.createSequentialGroup()
									.addComponent(natureText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNature))
								.addGroup(gl_mainPanel.createSequentialGroup()
									.addComponent(perceptionText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblPerception))
								.addGroup(gl_mainPanel.createSequentialGroup()
									.addComponent(performanceText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblPerformance)))
							.addGap(22)
							.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(performanceProfCheckBox)
								.addComponent(perceptionProfCheckBox)
								.addComponent(natureProfCheckBox)
								.addComponent(medicineProfCheckBox)
								.addComponent(investigationProfCheckBox)
								.addComponent(intimidationProfCheckBox)
								.addComponent(insightProfCheckBox)
								.addComponent(historyProfCheckBox)
								.addGroup(gl_mainPanel.createSequentialGroup()
									.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(acrobaticsProfCheckBox)
										.addComponent(lblProficient)
										.addComponent(animalHandlingProfCheckBox)
										.addComponent(arcanaProfCheckBox)
										.addComponent(athleticsProfCheckBox)
										.addComponent(deceptionProfCheckBox))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_mainPanel.createSequentialGroup()
											.addComponent(survivalText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblSurvival))
										.addGroup(gl_mainPanel.createSequentialGroup()
											.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_mainPanel.createSequentialGroup()
													.addComponent(sleightOfHandText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(lblSleightOfHand))
												.addGroup(gl_mainPanel.createSequentialGroup()
													.addComponent(stealthText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(lblStealth))
												.addGroup(gl_mainPanel.createSequentialGroup()
													.addComponent(persuasionText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(lblPersuasion))
												.addGroup(gl_mainPanel.createSequentialGroup()
													.addComponent(religionText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(lblReligion)))
											.addGap(18)
											.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
												.addComponent(religionProfCheckBox)
												.addComponent(checkBox)
												.addComponent(stealthProfCheckBox, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
												.addComponent(sleightOfHandProfCheckBox, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
												.addComponent(survivalProfCheckBox, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))))))
						.addComponent(subHeader, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(0))
		);
		gl_mainPanel.setVerticalGroup(
			gl_mainPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainPanel.createSequentialGroup()
					.addGap(115)
					.addComponent(subHeader, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_mainPanel.createSequentialGroup()
							.addGap(28)
							.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
									.addComponent(persuasionText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblPersuasion))
								.addComponent(checkBox))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
									.addComponent(religionText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblReligion))
								.addComponent(religionProfCheckBox))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(sleightOfHandText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSleightOfHand)
								.addComponent(sleightOfHandProfCheckBox))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
									.addComponent(stealthText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblStealth))
								.addComponent(stealthProfCheckBox))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(survivalText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSurvival)
								.addComponent(survivalProfCheckBox)))
						.addGroup(gl_mainPanel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_mainPanel.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(strSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(strMod)
										.addComponent(lblStr))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(dexSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(dexMod)
										.addComponent(lblDex))
									.addGap(18)
									.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(conSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(conMod)
										.addComponent(lblCon))
									.addGap(18)
									.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(intlSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblInt))
									.addGap(18)
									.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(wisSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(wisMod)
										.addComponent(lblWis))
									.addGap(18)
									.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(chaSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(chaMod)
										.addComponent(lblCha)))
								.addGroup(gl_mainPanel.createSequentialGroup()
									.addGap(18)
									.addComponent(strSaveSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(dexSaveSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(conSaveSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(intlSaveSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(intlMod))
									.addGap(18)
									.addComponent(wisSaveSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(chaSaveSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblSaves)
								.addComponent(lblAbilities)
								.addGroup(gl_mainPanel.createSequentialGroup()
									.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblSkills)
										.addComponent(lblProficient))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(acrobaticsText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblAcrobatics)
										.addComponent(acrobaticsProfCheckBox))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(animalHandlingText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblAnimalHandling)
										.addComponent(animalHandlingProfCheckBox))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(arcanaText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblArcana)
										.addComponent(arcanaProfCheckBox))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(athleticsText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblAthletics)
										.addComponent(athleticsProfCheckBox))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(deceptionText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblDeception)
										.addComponent(deceptionProfCheckBox))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(historyText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblHistory)
										.addComponent(historyProfCheckBox))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(insightText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblInsight)
										.addComponent(insightProfCheckBox))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(intimidationText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblIntimidation)
										.addComponent(intimidationProfCheckBox))))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(investigationText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblInvestigation)
						.addComponent(investigationProfCheckBox)
						.addComponent(btnRollStats))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(medicineText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMedicine)
						.addComponent(medicineProfCheckBox))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(natureText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNature)
						.addComponent(natureProfCheckBox))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(perceptionText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPerception)
						.addComponent(perceptionProfCheckBox))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(performanceText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPerformance)
						.addComponent(performanceProfCheckBox))
					.addContainerGap())
		);
		GridBagLayout gbl_subHeader = new GridBagLayout();
		gbl_subHeader.columnWidths = new int[] {90, 64, 55, 0};
		gbl_subHeader.rowHeights = new int[]{16, 0, 0};
		gbl_subHeader.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0};
		gbl_subHeader.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		subHeader.setLayout(gbl_subHeader);
		
		moveLabel = new JLabel("Movement");
		GridBagConstraints gbc_moveLabel = new GridBagConstraints();
		gbc_moveLabel.insets = new Insets(0, 0, 5, 5);
		gbc_moveLabel.gridx = 0;
		gbc_moveLabel.gridy = 0;
		subHeader.add(moveLabel, gbc_moveLabel);
		
		acLabel = new JLabel("Armor Class | ");
		GridBagConstraints gbc_acLabel = new GridBagConstraints();
		gbc_acLabel.anchor = GridBagConstraints.NORTHWEST;
		gbc_acLabel.insets = new Insets(0, 0, 5, 5);
		gbc_acLabel.gridx = 1;
		gbc_acLabel.gridy = 0;
		subHeader.add(acLabel, gbc_acLabel);
		
		hpLabel = new JLabel("Max. HP | ");
		GridBagConstraints gbc_hpLabel = new GridBagConstraints();
		gbc_hpLabel.anchor = GridBagConstraints.NORTHWEST;
		gbc_hpLabel.insets = new Insets(0, 0, 5, 5);
		gbc_hpLabel.gridx = 2;
		gbc_hpLabel.gridy = 0;
		subHeader.add(hpLabel, gbc_hpLabel);
		
		initLabel = new JLabel("Initiative");
		GridBagConstraints gbc_initLabel = new GridBagConstraints();
		gbc_initLabel.insets = new Insets(0, 0, 5, 0);
		gbc_initLabel.anchor = GridBagConstraints.NORTHWEST;
		gbc_initLabel.gridx = 3;
		gbc_initLabel.gridy = 0;
		subHeader.add(initLabel, gbc_initLabel);
		
		moveText = new JTextField();
		GridBagConstraints gbc_moveText = new GridBagConstraints();
		gbc_moveText.insets = new Insets(0, 0, 0, 5);
		gbc_moveText.fill = GridBagConstraints.HORIZONTAL;
		gbc_moveText.gridx = 0;
		gbc_moveText.gridy = 1;
		subHeader.add(moveText, gbc_moveText);
		moveText.setColumns(10);
		
		acText = new JTextField();
		GridBagConstraints gbc_acText = new GridBagConstraints();
		gbc_acText.insets = new Insets(0, 0, 0, 5);
		gbc_acText.fill = GridBagConstraints.HORIZONTAL;
		gbc_acText.gridx = 1;
		gbc_acText.gridy = 1;
		subHeader.add(acText, gbc_acText);
		acText.setColumns(2);
		
		hpText = new JTextField();
		GridBagConstraints gbc_hpText = new GridBagConstraints();
		gbc_hpText.insets = new Insets(0, 0, 0, 5);
		gbc_hpText.fill = GridBagConstraints.HORIZONTAL;
		gbc_hpText.gridx = 2;
		gbc_hpText.gridy = 1;
		subHeader.add(hpText, gbc_hpText);
		hpText.setColumns(10);
		
		initText = new JTextField();
		GridBagConstraints gbc_initText = new GridBagConstraints();
		gbc_initText.fill = GridBagConstraints.HORIZONTAL;
		gbc_initText.gridx = 3;
		gbc_initText.gridy = 1;
		subHeader.add(initText, gbc_initText);
		initText.setColumns(10);
		mainPanel.setLayout(gl_mainPanel);
		
		frame.getContentPane().add(layerPane);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addMouseListener(new MouseCheck());
		

	
	}
	
	private void setupGenContainer() {
		genContainer.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		
//		setupHeaderPanel();
		genContainer.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("800px"),},
			new RowSpec[] {
				RowSpec.decode("600px"),}));
		headerPanel = new JPanel();
		headerPanel.setPreferredSize(new Dimension(800, 60));
		headerPanel.setMaximumSize(new Dimension(600, 120));
		headerPanel.setMinimumSize(new Dimension(600, 120));
		genContainer.add(headerPanel, "1, 1, left, top");
		headerPanel.setLayout(new BorderLayout(0, 0));
		charName = new JTextField();
		headerPanel.add(charName, BorderLayout.WEST);
		charName.setMargin(new Insets(30, 0, 30, 0));
		charName.setMaximumSize(new Dimension(2147483647, 60));
		charName.setMinimumSize(new Dimension(24, 28));
		charName.setText("Character Name");
		charName.setPreferredSize(new Dimension(150, 60));
		
		panel = new JPanel();
		panel.setMaximumSize(new Dimension(120, 32767));
		panel.setPreferredSize(new Dimension(120, 10));
		headerPanel.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {125, 125, 125, 125};
		gbl_panel.rowHeights = new int[]{0, 28, 0, 0, 0, 27, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel charLevelLabel = new JLabel("Character Level");
		GridBagConstraints gbc_charLevelLabel = new GridBagConstraints();
		gbc_charLevelLabel.anchor = GridBagConstraints.WEST;
		gbc_charLevelLabel.insets = new Insets(0, 0, 5, 5);
		gbc_charLevelLabel.gridx = 0;
		gbc_charLevelLabel.gridy = 2;
		panel.add(charLevelLabel, gbc_charLevelLabel);
		
		classLabel = new JLabel("Class");
		GridBagConstraints gbc_classLabel = new GridBagConstraints();
		gbc_classLabel.insets = new Insets(0, 0, 5, 5);
		gbc_classLabel.gridx = 1;
		gbc_classLabel.gridy = 2;
		panel.add(classLabel, gbc_classLabel);
		
		raceLabel = new JLabel("Race");
		GridBagConstraints gbc_raceLabel = new GridBagConstraints();
		gbc_raceLabel.insets = new Insets(0, 0, 5, 5);
		gbc_raceLabel.gridx = 2;
		gbc_raceLabel.gridy = 2;
		panel.add(raceLabel, gbc_raceLabel);
		
		alignLabel = new JLabel("Alignment");
		GridBagConstraints gbc_alignLabel = new GridBagConstraints();
		gbc_alignLabel.insets = new Insets(0, 0, 5, 0);
		gbc_alignLabel.gridx = 3;
		gbc_alignLabel.gridy = 2;
		panel.add(alignLabel, gbc_alignLabel);
		
		charLevelSpinner = new JSpinner();
		GridBagConstraints gbc_charLevelSpinner = new GridBagConstraints();
		gbc_charLevelSpinner.insets = new Insets(0, 0, 5, 5);
		gbc_charLevelSpinner.gridx = 0;
		gbc_charLevelSpinner.gridy = 3;
		panel.add(charLevelSpinner, gbc_charLevelSpinner);
		
		JComboBox classCombo = new JComboBox();
		classCombo.setToolTipText("");
		GridBagConstraints gbc_classCombo = new GridBagConstraints();
		gbc_classCombo.insets = new Insets(0, 0, 5, 5);
		gbc_classCombo.fill = GridBagConstraints.HORIZONTAL;
		gbc_classCombo.gridx = 1;
		gbc_classCombo.gridy = 3;
		panel.add(classCombo, gbc_classCombo);
		
		JComboBox raceCombo = new JComboBox();
		GridBagConstraints gbc_raceCombo = new GridBagConstraints();
		gbc_raceCombo.insets = new Insets(0, 0, 5, 5);
		gbc_raceCombo.fill = GridBagConstraints.HORIZONTAL;
		gbc_raceCombo.gridx = 2;
		gbc_raceCombo.gridy = 3;
		panel.add(raceCombo, gbc_raceCombo);
		
		JComboBox charAlignmentCombo = new JComboBox();
		GridBagConstraints gbc_charAlignmentCombo = new GridBagConstraints();
		gbc_charAlignmentCombo.insets = new Insets(0, 0, 5, 0);
		gbc_charAlignmentCombo.fill = GridBagConstraints.HORIZONTAL;
		gbc_charAlignmentCombo.gridx = 3;
		gbc_charAlignmentCombo.gridy = 3;
		panel.add(charAlignmentCombo, gbc_charAlignmentCombo);
		
		playerName = new JTextField();
		playerName.setText("Player Name");
		headerPanel.add(playerName, BorderLayout.EAST);
		playerName.setColumns(10);
		introBGPanel = new IntroBG();
		genContainer.add(introBGPanel, "1, 1, left, top");
		introBGPanel.setOpaque(true);
		
		
		
//		mainPanel.setSize(FRAME_WIDTH, FRAME_HEIGHT-121);
		
		
		
//		setupMainPanels();
		
		
		
	}
	
	

//	private void setupHeaderPanel() {
//		headerPanel.setSize(FRAME_WIDTH, 120);
//		
//	}

//	private void setupMainPanels() {
//		mainPanelLeft.setSize(FRAME_WIDTH/3, FRAME_HEIGHT-121);
//		mainPanelMiddle.setSize(FRAME_WIDTH/3, FRAME_HEIGHT-121);
//		mainPanelRight.setSize(FRAME_WIDTH/3, FRAME_HEIGHT-121);
//		
//	}

	private class MouseCheck extends MouseAdapter {
		
		@Override 
		public void mouseClicked(MouseEvent e) {
			
		}
		
	}
}
