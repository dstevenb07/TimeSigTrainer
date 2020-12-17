import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.sql.Time;

public class MyFrame extends JFrame implements ActionListener {

    JButton playButton;
    JButton NextButton;
    JButton answer4;
    JButton answer5;
    JButton answer6;
    JButton answer7;
    JButton answer9;
    JButton answer11;
    JButton answer13;
    JButton answer15;
    TimeSigPhrase timeSigPhrase;

    JLabel correct;

    MyFrame() {

        timeSigPhrase = new TimeSigPhrase();

        correct = new JLabel("Correct Answer!");
        correct.setBounds(200,10,100,50);
        correct.setVisible(false);




        playButton = new JButton();
        playButton.setBounds(100,100,100,50);
        playButton.addActionListener(this);
        playButton.setText("Play");
        playButton.setFocusable(false);

        NextButton = new JButton();
        NextButton.setBounds(300,100,100,50);
        NextButton.addActionListener(this);
        NextButton.setText("Next");
        NextButton.setFocusable(false);

        answer4 = answerButton("4", 1, 1);
        answer4.addActionListener(this);


        answer5 = answerButton("5", 2, 1);
        answer5.addActionListener(this);

        answer6 = answerButton("6", 3, 1);
        answer6.addActionListener(this);

        answer7 = answerButton("7", 4, 1);
        answer7.addActionListener(this);

        answer9 = answerButton("9", 1, 2);
        answer9.addActionListener(this);

        answer11 = answerButton("11", 2, 2);
        answer11.addActionListener(this);

        answer13 = answerButton("13", 3, 2);
        answer13.addActionListener(this);

        answer15 = answerButton("15", 4, 2);
        answer15.addActionListener(this);

        answer6 = new JButton();
        answer6.setBounds(250,300,50,20);
        answer6.addActionListener(this);
        answer6.setText("6");
        answer6.setFocusable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);

        this.add(playButton);
        this.add(NextButton);
        this.add(answer4);
        this.add(answer5);
        this.add(answer6);
        this.add(answer7);
        this.add(answer9);
        this.add(answer11);
        this.add(answer13);
        this.add(answer15);

        this.add(correct);

    }


    private JButton answerButton (String timeSig, int column, int row) {
        JButton button = new JButton();
        button.setBounds(50 + ((column-1)*100), 300 + ((row-1)*100), 50, 20);
        button.setText(timeSig.toString());
        button.setFocusable(false);
        return button;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==playButton) {
            try {
                timeSigPhrase.play();
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }

        if (e.getSource()==NextButton) {
            correct.setVisible(false);
            timeSigPhrase.pickNewPattern();
            try {
                timeSigPhrase.play();
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }



        if (e.getSource()==answer4 && timeSigPhrase.getCorrectAnswer() == 4) {
            correct.setVisible(true);
        }
        if (e.getSource()==answer5 && timeSigPhrase.getCorrectAnswer() == 5) {
            correct.setVisible(true);
        }
        if (e.getSource()==answer6 && timeSigPhrase.getCorrectAnswer() == 6) {
            correct.setVisible(true);
        }
        if (e.getSource()==answer7 && timeSigPhrase.getCorrectAnswer() == 7) {
            correct.setVisible(true);
        }
        if (e.getSource()==answer9 && timeSigPhrase.getCorrectAnswer() == 9) {
            correct.setVisible(true);
        }
        if (e.getSource()==answer11 && timeSigPhrase.getCorrectAnswer() == 11) {
            correct.setVisible(true);
        }
        if (e.getSource()==answer13 && timeSigPhrase.getCorrectAnswer() == 13) {
            correct.setVisible(true);
        }
        if (e.getSource()==answer15 && timeSigPhrase.getCorrectAnswer() == 15) {
            correct.setVisible(true);
        }

    }
}
