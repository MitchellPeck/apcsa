import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class C4UI {
    public C4UI() {
        int numPlayers = 0;
        //While number of players is invalid entry (including start value 0)
        while (numPlayers < 2 || numPlayers > 4) {
            //Show input dialog prompting for 2-4 players
            String input = JOptionPane.showInputDialog(
                    null,
                    "Enter the number of players (2-4):",
                    "Player Count",
                    JOptionPane.QUESTION_MESSAGE
            );

            //No input, close program
            if (input == null) {
                System.exit(0);
            }

            //Parse int
            try {
                numPlayers = Integer.parseInt(input);
                //If invalid, re-prompt user for number of players 2-4
                if (numPlayers < 2 || numPlayers > 4) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Invalid input. Please enter a number between 2 and 4.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            } catch (NumberFormatException ex) {
                //Catch error
                JOptionPane.showMessageDialog(
                        null,
                        "Invalid input. Please enter a valid number.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }

        //Create frame
        JFrame frame = new JFrame("CONNECT 4");
        //Default operation on window close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Instantiate game board
        final C4Board gameBoard = new C4Board(numPlayers);
        //Instantiate interface board
        final C4Interface board = new C4Interface(gameBoard);

        //Create buttons 1-7
        //Create button with text
        JButton button1 = new JButton("1");
        //Add action on button click
        button1.addActionListener(new ActionListener() {
            //On action click
            public void actionPerformed(ActionEvent event) {
                //Place in button column
                gameBoard.place(0);
                //Reload board
                board.repaint();
            }
        });

        JButton button2 = new JButton("2");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                gameBoard.place(1);
                board.repaint();
            }
        });

        JButton button3 = new JButton("3");
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                gameBoard.place(2);
                board.repaint();
            }
        });

        JButton button4 = new JButton("4");
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                gameBoard.place(3);
                board.repaint();
            }
        });

        JButton button5 = new JButton("5");
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                gameBoard.place(4);
                board.repaint();
            }
        });

        JButton button6 = new JButton("6");
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                gameBoard.place(5);
                board.repaint();
            }
        });

        JButton button7 = new JButton("7");
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                gameBoard.place(6);
                board.repaint();
            }
        });

        //Create panel for buttons
        JPanel buttons = new JPanel();
        //Add buttons to panel
        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(button4);
        buttons.add(button5);
        buttons.add(button6);
        buttons.add(button7);

        //Add board to frame centered
        frame.add(board, BorderLayout.CENTER);
        //Add buttons to bottom of frame
        frame.add(buttons, BorderLayout.SOUTH);

        //Set window size
        frame.setSize(750, 550);
        //Show frame
        frame.setVisible(true);
    }
}