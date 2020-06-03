package location_scorer;

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


public class LocationScoreFrame extends JFrame implements ActionListener, MouseListener
{
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;

    private TitlePanel titleArea;
    private FilterPanel filterArea;
    private DataTablePanel dataArea;

    LocationScoreFrame(){
        setTitle("Location Score Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        titleArea = new TitlePanel();
        filterArea = new FilterPanel();
        dataArea = new DataTablePanel();

        add(titleArea);
        add(filterArea);
        add(dataArea);

        

        repaint();
        setResizable(false);
        setVisible(true);

    }

    // This will be the primary method used
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