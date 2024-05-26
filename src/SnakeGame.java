import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.util.Date;
import java.util.LinkedList;
import java.util.Random;

public class SnakeGame {
    private static final long serialVersionUID = 6678292058307426314L;
    private static final long FRAME_TIME = 1000L / 50L;
    private static final int MIN_SNAKE_LENGTH = 5;
    private static final int MAX_DIRECTIONS = 3;
    private BoardPanel board;
    //    private SidePanel side;
    private Random random;
    //    private Clock logicTimer;
    private boolean isNewGame;
    private boolean isGameOver;
    private boolean isPaused;
    private boolean viewHigscores;
    private LinkedList<Point> snake;
    //    private LinkedList<Direction> directions;
    private int score;
    private int fruitsEaten;
    private int nextFruitScore;
    //    private Music music;
    private String difficulty;
    private String name;
    private EasyHighScores easy;
    private MediumHighScores medium;
    private HardHighScores hard;
    private Date date;
    private JFrame frame;

    public SnakeGame() {

    }
}