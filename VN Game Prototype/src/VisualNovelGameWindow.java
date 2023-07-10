import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

public class VisualNovelGameWindow extends GraphicsProgram {
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;
    private static final int TEXT_WIDTH = 700;
    private static final int FONT_SIZE = 20;

    private int currentEvent;

    private GLabel titleLabel;
    private GLabel eventLabel;
    private GLabel choice1Label;
    private GLabel choice2Label;

    public void run() {
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Mikey's Beach Adventure");

        addMouseListeners();

        currentEvent = 1;
        displayEvent(currentEvent);
    }

    private void displayEvent(int event) {
        removeAll();

        titleLabel = new GLabel("Welcome to Mikey's Beach Adventure!!");
        titleLabel.setFont("Arial-Bold-24");
        add(titleLabel, 20, 50);

        eventLabel = createWrappedLabel(getEventText(event), TEXT_WIDTH);
        eventLabel.setFont(new Font("Arial", Font.PLAIN, FONT_SIZE));
        add(eventLabel, 20, 100);

        switch (event) {
            case 1:
                choice1Label = new GLabel("1. Choose the plastic straw.");
                choice2Label = new GLabel("2. Choose the paper straw.");
                break;
            case 2:
                choice1Label = new GLabel("1. Bear the heat and throw the cup into the can.");
                choice2Label = new GLabel("2. Leave the cup on the floor near a sign.");
                break;
            case 3:
                choice1Label = new GLabel("1. Pick it up after them and throw it into the trash bin nearby.");
                choice2Label = new GLabel("2. Just ignore them and go on your merry way.");
                break;
            default:
                break;
        }

        choice1Label.setFont(new Font("Arial", Font.PLAIN, FONT_SIZE));
        add(choice1Label, 20, 200);

        choice2Label.setFont(new Font("Arial", Font.PLAIN, FONT_SIZE));
        add(choice2Label, 20, 250);
    }

    private String getEventText(int event) {
        switch (event) {
            case 1:
                return "Event 1: Mikey is given a choice for the straw of his boba drink. Either plastic or paper straw.";
            case 2:
                return "Event 2: Mikey just finished his boba drink. There's a trash bin nearby, but he has to walk under the scorching sun to get there. But he could just leave the cup on the floor near a sign and hope that someone throws it for him.";
            case 3:
                return "Event 3: Mikey saw a person from school let laziness overcome them and left their litter on the ground near them. What will Mikey do?";
            default:
                return "";
        }
    }

    private GLabel createWrappedLabel(String text, double width) {
        GLabel label = new GLabel(text);
        label.setFont(new Font("Arial", Font.PLAIN, FONT_SIZE));

        double x = 20;
        double y = 100 + label.getHeight();
        double lineHeight = label.getHeight();

        String[] words = text.split(" ");
        StringBuilder wrappedText = new StringBuilder(words[0]);

        for (int i = 1; i < words.length; i++) {
            GLabel tempLabel = new GLabel(wrappedText.toString() + " " + words[i]);
            if (tempLabel.getWidth() > width) {
                label = new GLabel(wrappedText.toString(), x, y);
                label.setFont(new Font("Arial", Font.PLAIN, FONT_SIZE));
                add(label);
                y += lineHeight;
                wrappedText = new StringBuilder(words[i]);
            } else {
                wrappedText.append(" ").append(words[i]);
            }
        }

        label = new GLabel(wrappedText.toString(), x, y);
        label.setFont(new Font("Arial", Font.PLAIN, FONT_SIZE));
        return label;
    }

    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        if (choice1Label != null && choice1Label.contains(x, y)) {
            handleChoice(1);
        } else if (choice2Label != null && choice2Label.contains(x, y)) {
            handleChoice(2);
        }
    }

    private void handleChoice(int choice) {
        switch (currentEvent) {
            case 1:
                if (choice == 2) {
                    currentEvent = 2;
                } else {
                    currentEvent = -1; // Game over
                }
                break;
            case 2:
                if (choice == 1) {
                    currentEvent = 3;
                } else {
                    currentEvent = -1; // Game over
                }
                break;
            case 3:
                if (choice == 1) {
                    // Win
                    currentEvent = 0;
                } else {
                    currentEvent = -1; // Game over
                }
                break;
            default:
                break;
        }

        if (currentEvent == 0) {
            displayWin();
        } else if (currentEvent == -1) {
            displayGameOver();
        } else {
            displayEvent(currentEvent);
        }
    }

    private void displayWin() {
        removeAll();
        GLabel winLabel = new GLabel("Congratulations! You did your part in keeping the sea cleaner than before.");
        winLabel.setFont(new Font("Arial-Bold", Font.PLAIN, 24));
        winLabel.setColor(Color.GREEN);
        add(winLabel, 20, 100);
    }

    private void displayGameOver() {
        removeAll();
        GLabel gameOverLabel = new GLabel("Game Over!");
        gameOverLabel.setFont(new Font("Arial-Bold", Font.PLAIN, 24));
        gameOverLabel.setColor(Color.RED);
        add(gameOverLabel, 20, 100);
    }

    public static void main(String[] args) {
        new VisualNovelGameWindow().start();
    }
}