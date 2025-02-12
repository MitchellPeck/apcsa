import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;
import javax.swing.*;

public class C4Interface extends JComponent {
    C4Board gameBoard;
    private Rectangle board;
    private Rectangle textBack;
    private String stateMessage;
    private ArrayList<Ellipse2D.Double> holes;
    final int BOARD_START_X = 182;
    final int BOARD_START_Y = 75;
    final int BOARD_WIDTH = 386;
    final int BOARD_HEIGHT = 340;
    final int HOLE_DIAMETER = 36;
    final int HOLE_DISTANCE = 50;
    final int HOLE_OFFSET = 25;
    final int HOLE_START_X = BOARD_START_X + HOLE_OFFSET;
    final int HOLE_START_Y = BOARD_START_Y + BOARD_HEIGHT - HOLE_OFFSET - HOLE_DIAMETER;

    //Constructor with my game board passed in
    public C4Interface(C4Board gs) {
        //Set game board
        gameBoard = gs;
        //initializes the board
        board = new Rectangle(BOARD_START_X, BOARD_START_Y, BOARD_WIDTH, BOARD_HEIGHT);
        //initializes the gamestate message text back
        textBack = new Rectangle(BOARD_START_X + (BOARD_WIDTH / 2) - 100, BOARD_START_Y - 50, 200, 40);
        //initializes the holes in the board
        holes = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                Ellipse2D.Double hole = new Ellipse2D.Double(HOLE_START_X + i * HOLE_DISTANCE, HOLE_START_Y - j * HOLE_DISTANCE, HOLE_DIAMETER, HOLE_DIAMETER);
                holes.add(hole);
            }
        }
    }

    //Method for painting component on screen
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setFont(new Font("TimesRoman", Font.BOLD, 20));

        //draws the board
        g2.setColor(Color.blue);
        g2.fill(board);

        //draws the holes
        g2.setColor(Color.white);
        for (Ellipse2D.Double hole : holes) g2.fill(hole);

        //draws the row labeling
        g2.setColor(Color.black);
        for (int i = 0; i < 7; i++) {
            int w = (int) g2.getFontMetrics().stringWidth(Integer.toString(i + 1));
            g2.drawString(Integer.toString(i + 1), HOLE_START_X + HOLE_DIAMETER / 2 - w / 2 + i * HOLE_DISTANCE, BOARD_START_Y + BOARD_HEIGHT + 25);
        }

        //draws the proper game state message
        if (gameBoard.checkWin() == 1) {
            g2.setColor(Color.red);
            g2.fill(textBack);
            g.setColor(Color.black);
            stateMessage = "PLAYER ONE WINS!";
        } else if (gameBoard.checkWin() == 2) {
            g2.setColor(Color.yellow);
            g2.fill(textBack);
            g.setColor(Color.black);
            stateMessage = "PLAYER TWO WINS!";
        } else if (gameBoard.checkWin() == 3) {
            g2.setColor(Color.green);
            g2.fill(textBack);
            g.setColor(Color.black);
            stateMessage = "PLAYER THREE WINS!";
        } else if (gameBoard.checkWin() == 4) {
            g2.setColor(Color.blue);
            g2.fill(textBack);
            g.setColor(Color.black);
            stateMessage = "PLAYER FOUR WINS!";
        } else if (gameBoard.checkWin() == 5) {
            g2.setColor(Color.black);
            g2.fill(textBack);
            g.setColor(Color.white);
            stateMessage = "IT'S A TIE!";
        } else if (gameBoard.getPlayerTurn() == 1) {
            g2.setColor(Color.lightGray);
            g2.fill(textBack);
            g.setColor(Color.red);
            stateMessage = "Player One's Turn";
        } else if (gameBoard.getPlayerTurn() == 2) {
            g2.setColor(Color.lightGray);
            g2.fill(textBack);
            g.setColor(Color.yellow);
            stateMessage = "Player Two's Turn";
        } else if (gameBoard.getPlayerTurn() == 3) {
            g2.setColor(Color.lightGray);
            g2.fill(textBack);
            g.setColor(Color.green);
            stateMessage = "Player Three's Turn";
        } else if (gameBoard.getPlayerTurn() == 4) {
            g2.setColor(Color.lightGray);
            g2.fill(textBack);
            g.setColor(Color.blue);
            stateMessage = "Player Four's Turn";
        }
        int stringWidth = (int) g2.getFontMetrics().stringWidth(stateMessage);
        int strX = BOARD_START_X + (BOARD_WIDTH - stringWidth) / 2;
        g2.drawString(stateMessage, strX, BOARD_START_Y - 22);

        String[][] b = gameBoard.flip2DArray(gameBoard.getBoard());

        //draws the pieces
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                if (b[i][j].equals(" ")) ;
                else if (b[i][j].equals("R")) {
                    g2.setColor(Color.red);
                    g2.fill(new Ellipse2D.Double(HOLE_START_X + 2 + i * HOLE_DISTANCE, HOLE_START_Y + 2 - j * HOLE_DISTANCE, HOLE_DIAMETER - 4, HOLE_DIAMETER - 4));
                } else if (b[i][j].equals("Y")) {
                    g2.setColor(Color.yellow);
                    g2.fill(new Ellipse2D.Double(HOLE_START_X + 2 + i * HOLE_DISTANCE, HOLE_START_Y + 2 - j * HOLE_DISTANCE, HOLE_DIAMETER - 4, HOLE_DIAMETER - 4));
                } else if (b[i][j].equals("G")) {
                    g2.setColor(Color.green);
                    g2.fill(new Ellipse2D.Double(HOLE_START_X + 2 + i * HOLE_DISTANCE, HOLE_START_Y + 2 - j * HOLE_DISTANCE, HOLE_DIAMETER - 4, HOLE_DIAMETER - 4));
                } else if (b[i][j].equals("B")) {
                    g2.setColor(Color.blue);
                    g2.fill(new Ellipse2D.Double(HOLE_START_X + 2 + i * HOLE_DISTANCE, HOLE_START_Y + 2 - j * HOLE_DISTANCE, HOLE_DIAMETER - 4, HOLE_DIAMETER - 4));
                }
            }
        }
    }
}

