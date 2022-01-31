package sportradar.scoreboard;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScoreBoardTestCase {

  private Game game;

  @BeforeAll
  public static void setupAll() {
    System.out.println("Running unit tests...");
  }

  @BeforeEach
  void setup() {
    System.out.println("Instantiating Game");
    game = new Game();
  }
  
  @Test
  @DisplayName("Do home and away teams like 'Mexico' and 'Canada' work?")
  public void testStartGameOne() { 
    Game game = new Game();   
    String homeTeam = "Mexico";
    String awayTeam = "Canada";
    String result = game.startGame(homeTeam, awayTeam);
    assertEquals("Mexico 0 - Canada 0", result);  
  }  
      
  @Test
  @DisplayName("Do home and away teams like ' ' and 'United States of America' work?")
  public void testStartGameTwo() { 
    Game game = new Game();  
    String homeTeam = " ";
    String awayTeam = "United States of America";
    String result = game.startGame(homeTeam, awayTeam);
    assertEquals("  0 - United States of America 0", result);  
  } 
    
  @Test
  @DisplayName("Do home team and away team scores like '0' and '5' work?")
  public void testUpdateScoreOne() {  
    Game game = new Game(); 
    int homeTeamScore = 0;
    int awayTeamScore = 5;
    String result = game.updateScore(homeTeamScore, awayTeamScore);
    assertEquals("TeamA 0 - TeamB 5", result);
  } 
 
  @Test
  @DisplayName("Do home team and away team scores " +  
    "like '0' and '1561654645' work?")
  public void testUpdateScoreTwo() {  
    Game game = new Game();
    int homeTeamScore = 0;
    int awayTeamScore = 1561654645;
    String result = game.updateScore(homeTeamScore, awayTeamScore);
    assertEquals("TeamA 0 - TeamB 1561654645", result);
  } 

  @Test
  @DisplayName("Does finish game work?")
  public void testFinishGame() {
    Game game = new Game();
    String result = game.finishGame();
    assertEquals(" - - ", result);  
  } 
  
  @AfterAll
  public static void endOfTests() {
    System.out.println("All test cases done!");
  }
}
