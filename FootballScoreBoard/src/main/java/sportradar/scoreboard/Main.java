/**The script provides an implementation of the Football World Cup Score
 * Board. The game starts with capturing home team and away team names,
 * with initial scoreboard 0 - 0, and updates scoreboard by capturing
 * teams' scores. Finally script clears score board and finishes a game.
 * The summary of games is listed by highest total scores. In case of
 * total score clash, most recent game listed appears first.
 */
 
package sportradar.scoreboard;

public class Main {
  public static void main(String[] args) {
    ScoreBoardView theView = new ScoreBoardView();
    ScoreBoardModel theModel = new ScoreBoardModel();
    ScoreBoardController theController = new ScoreBoardController(theView, theModel);
    theView.frame.setVisible(true);
  }
}
