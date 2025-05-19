package nl.capgemini.learn_spring_framework;

import nl.capgemini.learn_spring_framework.game.GameRunner;
import nl.capgemini.learn_spring_framework.game.MarioGame;
import nl.capgemini.learn_spring_framework.game.PacmanGame;
import nl.capgemini.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasicJava {

    public static void main(String[] args) {
        var game1 = new MarioGame();
        var game2 = new SuperContraGame();
        var game3 = new PacmanGame();
        var gameRunner = new GameRunner(game3);
        gameRunner.run();
    }
}
