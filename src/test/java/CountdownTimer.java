
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountdownTimer extends JFrame {
    private JLabel timerLabel;
    private Timer timer;
    private int secondsRemaining;

    public CountdownTimer(int seconds) {
        this.secondsRemaining = seconds;

        timerLabel = new JLabel();
        timerLabel.setHorizontalAlignment(JLabel.CENTER);
        timerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        updateTimerLabel();

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(timerLabel, BorderLayout.CENTER);

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondsRemaining--;
                if (secondsRemaining <= 0) {
                    timer.stop();
                    timerLabel.setText("Time's up!");
                } else {
                    updateTimerLabel();
                }
            }
        });
        timer.start();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Countdown Timer");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void updateTimerLabel() {
        int minutes = secondsRemaining / 60;
        int seconds = secondsRemaining % 60;
        timerLabel.setText(String.format("%02d:%02d", minutes, seconds));
    }

    public static void main(String[] args) {
        // Set timer duration in seconds
        int seconds = 60; // 1 minute countdown
        new CountdownTimer(seconds);
    }
}

