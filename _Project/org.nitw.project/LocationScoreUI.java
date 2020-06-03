package _Project.src;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;


public class LocationScoreUI extends JFrame implements ActionListener, MouseListener
{
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;

    private JPanel graphBox;

    LocationScoreUI(){
        setTitle("Location Score Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    // This will be the main method used
    // to click on various buttons
    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}