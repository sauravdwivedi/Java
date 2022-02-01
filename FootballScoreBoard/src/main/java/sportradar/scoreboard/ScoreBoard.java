package sportradar.scoreboard;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class ScoreBoard {
  public void runScoreBoard() {
    String inputFile = "/FootballScoreBoard_input.txt";
    String outputFile = "FootballScoreBoard_output.txt";
    try {
      InputStream input = ScoreBoard.class.getResourceAsStream(inputFile);
      Scanner sc = new Scanner(input);
      ArrayList<String> lines = new ArrayList<String>();
      while (sc.hasNextLine()) {
        lines.add(sc.nextLine());
      }
      List<List<String>> matches = new ArrayList<List<String>>();
      int numOfGames = Integer.parseInt(lines.get(0).trim());

      for (int i=1; i < numOfGames+1; i++) {
        matches.add(Stream.of(lines.get(i).split(",")).map(String::trim)
          .collect(Collectors.toList()));
      }
      ArrayList<Game> games = new ArrayList<>();
      System.out.println("\tNew match!");
      System.out.println("Scoreboard:  - - ");
      for (List<String> match : matches) {
        Game game = new Game();
        String homeTeam = match.get(0).trim();
        String awayTeam = match.get(1).trim();
        int homeTeamScore = Integer.parseInt(match.get(2).trim());
        int awayTeamScore = Integer.parseInt(match.get(3).trim());
        game.startGame(homeTeam, awayTeam);
        System.out.println("Scoreboard: " + game.scoreBoard);
        game.updateScore(homeTeamScore, awayTeamScore);
        System.out.println("Scoreboard: " + game.scoreBoard);
        game.finishGame();
        if (match != matches.get(numOfGames-1)) {
          System.out.println("\tNew match!");
          System.out.println("Scoreboard: " + game.scoreBoard);
        }
        games.add(0, game);
      }
      games.sort(Comparator.comparing(Game::totalScore).reversed());
      System.out.println("\n\tSummary of games! \n");
      BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
      for (Game gameObj : games) {
        System.out.println(gameObj.summary);
        writer.write(gameObj.summary + '\n');
      }
      writer.close();
      sc.close();
      System.out.println("\nOutput written in file" + outputFile + " !");
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
}
