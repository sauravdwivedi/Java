package sportradar.scoreboard;

import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class ScoreBoardView extends JFrame{
  JFrame frame = new JFrame("Football World Cup Score Board");
  JPanel matchPanel = new JPanel(new GridLayout(6, 2));
  JPanel buttonPanel = new JPanel(new GridLayout(1, 0));
  JPanel summaryPanel = new JPanel(new GridLayout(1, 2));
  JLabel teamA = new JLabel("Home team");
  JTextField firstEntry  = new JTextField(10);
  JLabel teamB = new JLabel("Away team");
  JTextField secondEntry = new JTextField(10);
  JButton startButton = new JButton("Start match");
  JLabel scoreBoard = new JLabel("Scoreboard");
  JLabel teamAScore = new JLabel("Home team score");
  JTextField thirdEntry = new JTextField(10);
  JLabel teamBScore = new JLabel("Away team score");
  JTextField fourthEntry = new JTextField(10);
  JButton updateButton = new JButton("Update score");
  JTextField score = new JTextField(15);
  JButton finishButton = new JButton("Finish Match");
  JLabel summaryLabel = new JLabel("Summary");
  JTextArea summary = new JTextArea(5,15);
  JScrollPane summaryScroller = new JScrollPane(summary);
  
  public ScoreBoardView(){		
    // Sets up the view and adds the components
    frame.setLayout(new FlowLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 300);
    summary.setLineWrap(true);
    summary.setWrapStyleWord(true);
    summaryScroller.setHorizontalScrollBarPolicy(
      JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    summaryScroller.setVerticalScrollBarPolicy(
      JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    score.setOpaque(true);
    score.setBackground(Color.GREEN);
    summary.setOpaque(true);
    summary.setBackground(Color.YELLOW);
		
    matchPanel.add(teamA);
    matchPanel.add(firstEntry);
    matchPanel.add(teamB);
    matchPanel.add(secondEntry);
    matchPanel.add(teamAScore);
    matchPanel.add(thirdEntry);
    matchPanel.add(teamBScore);
    matchPanel.add(fourthEntry);
    matchPanel.add(scoreBoard);
    matchPanel.add(score);
    buttonPanel.add(startButton);
    buttonPanel.add(updateButton);
    buttonPanel.add(finishButton);
    summaryPanel.add(summaryLabel);
    summaryPanel.add(summaryScroller);
    frame.add(matchPanel, BorderLayout.NORTH);
    frame.add(buttonPanel, BorderLayout.CENTER);
    frame.add(summaryPanel, BorderLayout.SOUTH);
		
    // End of setting up the components --------
    }
	
    public void startGame(String initialScore){
      score.setText(initialScore);
    }
    
    public void updateScore(String updatedScore){
      score.setText(updatedScore);
    }
    
    public void finishGame(String summaryGame, Map<String, Integer> games){
      firstEntry.setText("");
      secondEntry.setText("");
      thirdEntry.setText("");
      fourthEntry.setText("");
      score.setText(" - - ");
      summary.setText(String.join("\n", games.keySet()));
    }
    // If the startButton is clicked execute a method
    // in the Controller named actionPerformed
	
    void startListener(ActionListener listenForStartButton){
      startButton.addActionListener(listenForStartButton);
    }
    
    void updateListener(ActionListener listenForUpdateButton){
      updateButton.addActionListener(listenForUpdateButton);
    }
    
    void finishListener(ActionListener listenForFinishButton){
      finishButton.addActionListener(listenForFinishButton);
    }
	
    // Open a popup that contains the error message passed
    void displayErrorMessage(String errorMessage){
      JOptionPane.showMessageDialog(this, errorMessage);
    }
}
