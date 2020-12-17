import java.awt.*;

public class TimeSig {

    public static void main (String[] args) throws InterruptedException {

        new MyFrame();


    }

    /*

    //converts the string into a true or false array
    public static boolean[] convertToArray(String pattern) {
        boolean[] playable = new boolean[pattern.length()];

        for (int i = 0; i<pattern.length(); i++) {
            if (pattern.charAt(i) == '1') {
                playable[i] = true;
            } else {
                playable[i] = false;
            }
        }
        return playable;
    }

    //Returns a binary string, choosing from the library of patterns
    public static String pickClassicPattern() {
        String[] patternsIn4 = {"10010010", "10010100"};
        String[] patternsIn5 = {"10100", "10110", "1001001010"};
        String[] patternsIn6 = {"100100101010", "101010100100", "100100",
                "101011010100", "101010010100"};
        String[] patternsIn7 = {"1010100", "1010101", "1001001",
                "1001010", "1001100"};
        String[] patternsIn9 = {"101010100"};
        String[] patternsIn11 = {"10101010100"};
        String[] patternsIn13 = {"1010101010100"};
        String[] patternsIn15 = {"101010101010100"};
        String chosenPattern;
        int rand = (int)(Math.random()*8);

        if (rand == 0) {
            currentPhrase = patternsIn4[pickWhichOne(patternsIn4)];
        } else if (rand == 1) {
            currentPhrase = patternsIn5[pickWhichOne(patternsIn5)];
        } else if (rand == 2) {
            currentPhrase = patternsIn6[pickWhichOne(patternsIn6)];
        } else if (rand == 3) {
            currentPhrase = patternsIn7[pickWhichOne(patternsIn7)];
        } else if (rand == 4) {
            currentPhrase = patternsIn9[pickWhichOne(patternsIn9)];
        } else if (rand == 5) {
            currentPhrase = patternsIn11[pickWhichOne(patternsIn11)];
        } else if (rand == 6) {
            currentPhrase = patternsIn13[pickWhichOne(patternsIn13)];
        } else {
            currentPhrase = patternsIn15[pickWhichOne(patternsIn15)];
        }
        return currentPhrase;
    }

    public static int pickWhichOne(String[] array) {
        return (int)(Math.random() * array.length);
    }

    public static int pickRandomTimeSig() {
        int random = (int)(Math.random() * 4);
        if (random == 0) {
            return 5;
        } else if (random == 1) {
            return 6;
        } else if (random == 2) {
            return 7;
        } else {
            return 8;
        }
    }

    public static void fillPhrase (boolean[] phrase) {
        phrase[0] = true;
        for (int i = 1; i<phrase.length; i++) {
            if (Math.random() < 0.4) {
                phrase[i] = true;
            } else {
                phrase[i] = false;
            }
        }
    }

    public static void countIn(int beats) throws InterruptedException {
        for (int i = 0; i<beats; i++) {
            Toolkit.getDefaultToolkit().beep();
            Thread.sleep(500);
        }
    }

    public static void play() throws InterruptedException {
        boolean[] phrase = convertToArray(currentPhrase);
        countIn(4);
        for (int j = 0; j<4; j++) {

            for (int i = 0; i<phrase.length; i++) {
                if (phrase[i] == true) {
                    Toolkit.getDefaultToolkit().beep();
                }

                Thread.sleep(250);
            }
        }
    }
    */
}
