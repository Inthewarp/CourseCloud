package org.yourcompany;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Sudoku {

    int boardWidth = 450;
    int boardHeight = 450;

    JFrame frame = new JFrame("Sudoku");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();

    
    Sudoku() {
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setResizable(false);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        textLabel.setFont(new Font("Arial", Font.BOLD, 24));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText("Sudoku Game");

        textPanel.add(textLabel);
        frame.add(textPanel);

    }

}
