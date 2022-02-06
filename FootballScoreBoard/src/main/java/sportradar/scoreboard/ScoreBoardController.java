package sportradar.scoreboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
 
import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;

public class ScoreBoardController {
  private ScoreBoardView theView;
  private ScoreBoardModel theModel;
	
  public ScoreBoardController(ScoreBoardView theView, ScoreBoardModel theModel) {
    this.theView = theView;
    this.theModel = theModel;
    this.theView.startListener(new StartListener());
    this.theView.updateListener(new UpdateListener());
    this.theView.finishListener(new FinishListener());
  }
	
  class StartListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
      String firstEntry, secondEntry = "";
      try{
        theModel.homeTeamScore = 0;
        theModel.awayTeamScore = 0;
        firstEntry = theView.firstEntry.getText();
        secondEntry = theView.secondEntry.getText();
        theModel.startGame(firstEntry, secondEntry);
        theView.startGame(theModel.scoreBoard);
      }
      catch(NullPointerException ex){
        System.out.println(ex);
        theView.displayErrorMessage("Name can't be null");
      }
    }
  }

  class UpdateListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
      int thirdEntry, fourthEntry = 0;
      try{
        theModel.homeTeam = theView.firstEntry.getText();
        theModel.awayTeam = theView.secondEntry.getText();
        thirdEntry = Integer.parseInt(theView.thirdEntry.getText());
        fourthEntry = Integer.parseInt(theView.fourthEntry.getText());
        theModel.updateScore(thirdEntry, fourthEntry);
        theView.updateScore(theModel.scoreBoard);
      }
      catch(NullPointerException ex){
        System.out.println(ex);
        theView.displayErrorMessage("Score can't be null");
      }
    }
  }

  class FinishListener implements ActionListener{
    Map<String, Integer> games = new HashMap<String, Integer>();
    public void actionPerformed(ActionEvent e) {
      theModel.finishGame();
      theModel.summaries.add(0, theModel.summary);
      theModel.totalScores.add(0, theModel.totalScore);
      theModel.games.put(theModel.summary, theModel.totalScore);
      this.games = theModel.games.entrySet().stream()
        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        .collect(
            toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                LinkedHashMap::new));
      theView.finishGame(theModel.summary, games);
    }
  }	
}
