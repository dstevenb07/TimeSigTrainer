import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{

    int count = 0;
    JLabel playLabel;
    Border border;
    JFrame frame;
    JPanel redPanel;
    JPanel bluePanel;
    JPanel greenPanel;

    public GUI() {

        border = BorderFactory.createLineBorder(Color.green);




        //JButton button = new JButton("Click me");
        //button.addActionListener((ActionListener) this);

        playLabel = new JLabel("Play?");
        playLabel.setVerticalAlignment(JLabel.TOP);
        playLabel.setHorizontalAlignment(JLabel.CENTER);
        playLabel.setBounds(100,100,75,75);

        //playLabel.setBorder(border);
        //playLabel.setVerticalAlignment(JLabel.CENTER);
        //playLabel.setHorizontalAlignment(JLabel.CENTER);

        //label.setBounds(0, 0,250, 250);

        //label.setHorizontalTextPosition(JLabel.CENTER);
        //label.setVerticalTextPosition(JLabel.TOP);


        redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(null);
        //panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        //panel.setLayout(new GridLayout(0, 1));
        //panel.add(button);
        //panel.add(label);

        bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout(null);

        greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(new BorderLayout());
        greenPanel.setLayout(null);

        /*

        frame = new JFrame();
        //frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(500,500);
        frame.setTitle("Game");
        //frame.getContentPane().setBackground(new Color(123,50,250));

        frame.setLayout(null);
        frame.setVisible(true);
        greenPanel.add(playLabel);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        //frame.add(label);
        //frame.pack();

        */

        MyFrame myFrame = new MyFrame();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //count++;
        //label.setText("Number of clicks:" + count);
    }
}
