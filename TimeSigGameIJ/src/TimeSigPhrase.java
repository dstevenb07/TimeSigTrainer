import java.awt.*;

public class TimeSigPhrase {

    private static final String[] patternsIn4 = {"10010010", "10010100"};
    private static final String[] patternsIn5 = {"10100", "10110", "1001001010"};
    private static final String[] patternsIn6 = {"100100101010", "101010100100", "100100",
            "101011010100", "101010010100"};
    private static final String[] patternsIn7 = {"1010100", "1010101", "1001001",
            "1001010", "1001100"};
    private static final String[] patternsIn9 = {"101010100"};
    private static final String[] patternsIn11 = {"10101010100"};
    private static final String[] patternsIn13 = {"1010101010100"};
    private static final String[] patternsIn15 = {"101010101010100"};

    private String currentPhrase;
    private int correctAnswer;

    public TimeSigPhrase() {
        pickNewPattern();
    }

    public String getCurrentPhrase(){
        return currentPhrase;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void pickNewPattern() {
        int rand = (int)(Math.random()*6);

        if (rand == 0) {
            currentPhrase = patternsIn4[pickWhichOne(patternsIn4)];
            correctAnswer = 4;
        } else if (rand == 1) {
            currentPhrase = patternsIn5[pickWhichOne(patternsIn5)];
            correctAnswer = 5;
        } else if (rand == 2) {
            currentPhrase = patternsIn6[pickWhichOne(patternsIn6)];
            correctAnswer = 6;
        } else if (rand == 3) {
            currentPhrase = patternsIn7[pickWhichOne(patternsIn7)];
            correctAnswer = 7;
        } else if (rand == 4) {
            currentPhrase = patternsIn9[pickWhichOne(patternsIn9)];
            correctAnswer = 9;
        } else if (rand == 5) {
            currentPhrase = patternsIn11[pickWhichOne(patternsIn11)];
            correctAnswer = 11;
        } else if (rand == 6) {
            currentPhrase = patternsIn13[pickWhichOne(patternsIn13)];
            correctAnswer = 13;
        } else {
            currentPhrase = patternsIn15[pickWhichOne(patternsIn15)];
            correctAnswer = 15;
        }
    }

    public int pickWhichOne(String[] array) {
        return (int)(Math.random() * array.length);
    }

    public void countIn(int beats) throws InterruptedException {
        for (int i = 0; i<beats; i++) {
            Toolkit.getDefaultToolkit().beep();
            Thread.sleep(500);
        }
    }

    public void play() throws InterruptedException {
        int bars = 4;

        countIn(4);
        for (int j = 0; j<bars; j++) {

            for (int i = 0; i<currentPhrase.length(); i++) {
                if (currentPhrase.charAt(i) == '1') {
                    Toolkit.getDefaultToolkit().beep();
                }

                Thread.sleep(250);
            }
        }
    }

}
