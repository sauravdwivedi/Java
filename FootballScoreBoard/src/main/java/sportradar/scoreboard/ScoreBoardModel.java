package sportradar.scoreboard;

import java.util.*;

public class ScoreBoardModel {
  String homeTeam = "TeamA";
  String awayTeam = "TeamB";
  int homeTeamScore = 0;
  int awayTeamScore = 0;
  String scoreBoard = " - - ";
  int totalScore = 0;
  String summary = "";
  Map<String, Integer> games = new HashMap<String, Integer>();
  ArrayList<String> summaries = new ArrayList<>();
  ArrayList<Integer> totalScores = new ArrayList<>();

  
  public int totalScore() {
    return this.totalScore;
  }
  
  public String startGame(String homeTeam, String awayTeam) {
    this.homeTeam = homeTeam;
    this.awayTeam = awayTeam;
    this.scoreBoard = this.homeTeam + " " + this.homeTeamScore +
      " - " +  this.awayTeam + " " + this.awayTeamScore;
    return this.scoreBoard;
  }
  
  public String updateScore(int homeTeamScore, int awayTeamScore) {
    this.homeTeamScore = homeTeamScore;
    this.awayTeamScore = awayTeamScore;
    this.scoreBoard = this.homeTeam + " " + this.homeTeamScore +
      " - " +  this.awayTeam + " " + this.awayTeamScore;
    return this.scoreBoard;    
  }
  
  public String finishGame() {
    this.totalScore = this.homeTeamScore + this.awayTeamScore;
    this.summary = this.scoreBoard;
    this.scoreBoard = " - - ";
    return this.scoreBoard;
  }
}
