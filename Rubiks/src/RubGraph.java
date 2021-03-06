import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class RubGraph extends Canvas
{
	static JButton button = new JButton("Enter");
	static TextField txtfld = new TextField(7);
	static JFrame frame = new JFrame("Rubik's Cube");
	static JFrame frameEnd = new JFrame("");
	static JLabel winner = new JLabel("You Win!!!");
	static JPanel panel = new JPanel();
	static RubGraph canvas = new RubGraph();

public static void cube() 
	{
	frame.setSize(315, 475);
	frame.setLayout(new BorderLayout());
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setBackground(Color.black);
	frame.getContentPane().add(canvas, BorderLayout.CENTER);
	button.setSize(new Dimension(50, 50));
	txtfld.setSize(new Dimension(50, 100));
	panel.add(txtfld);
	panel.add(button);
	frame.add(panel, BorderLayout.SOUTH);
	frame.setResizable(false);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	}
public static void disEnd()
	{
	frameEnd.setSize(460, 175);
	frameEnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frameEnd.getContentPane().setBackground(Color.black);
	frameEnd.setLocationRelativeTo(null);
	winner.setFont(new Font("French Script MT", Font.BOLD, 100));
	winner.setForeground(Color.RED);
	frameEnd.setResizable(false);
	frameEnd.add(winner);
	frameEnd.setVisible(true);
	}
public void paint(Graphics graphics) 
	{
	graphics.setColor(Mains.sidesArray[2][0]);
	graphics.drawRect(110, 25, 30, 30);
	graphics.fillRect(110, 25, 30, 30);
	graphics.setColor(Mains.sidesArray[2][1]);
	graphics.drawRect(140, 25, 30, 30);
	graphics.fillRect(140, 25, 30, 30);
	graphics.setColor(Mains.sidesArray[2][2]);
	graphics.drawRect(170, 25, 30, 30);
	graphics.fillRect(170, 25, 30, 30);
	graphics.setColor(Mains.sidesArray[2][3]);
	graphics.drawRect(110, 55, 30, 30);
	graphics.fillRect(110, 55, 30, 30);
	graphics.setColor(Mains.sidesArray[2][4]);
	graphics.drawRect(140, 55, 30, 30);
	graphics.fillRect(140, 55, 30, 30);
	graphics.setColor(Mains.sidesArray[2][5]);
	graphics.drawRect(170, 55, 30, 30);
	graphics.fillRect(170, 55, 30, 30);
	graphics.setColor(Mains.sidesArray[2][6]);
	graphics.drawRect(110, 85, 30, 30);
	graphics.fillRect(110, 85, 30, 30);
	graphics.setColor(Mains.sidesArray[2][7]);
	graphics.drawRect(140, 85, 30, 30);
	graphics.fillRect(140, 85, 30, 30);
	graphics.setColor(Mains.sidesArray[2][8]);
	graphics.drawRect(170, 85, 30, 30);
	graphics.fillRect(170, 85, 30, 30);
	graphics.setColor(Mains.sidesArray[4][0]);
	graphics.drawRect(20, 115, 30, 30);
	graphics.fillRect(20, 115, 30, 30);
	graphics.setColor(Mains.sidesArray[4][1]);
	graphics.drawRect(50, 115, 30, 30);
	graphics.fillRect(50, 115, 30, 30);
	graphics.setColor(Mains.sidesArray[4][2]);
	graphics.drawRect(80, 115, 30, 30);
	graphics.fillRect(80, 115, 30, 30);
	graphics.setColor(Mains.sidesArray[0][0]);
	graphics.drawRect(110, 115, 30, 30);
	graphics.fillRect(110, 115, 30, 30);
	graphics.setColor(Mains.sidesArray[0][1]);
	graphics.drawRect(140, 115, 30, 30);
	graphics.fillRect(140, 115, 30, 30);
	graphics.setColor(Mains.sidesArray[0][2]);
	graphics.drawRect(170, 115, 30, 30);
	graphics.fillRect(170, 115, 30, 30);
	graphics.setColor(Mains.sidesArray[5][0]);
	graphics.drawRect(200, 115, 30, 30);
	graphics.fillRect(200, 115, 30, 30);
	graphics.setColor(Mains.sidesArray[5][1]);
	graphics.drawRect(230, 115, 30, 30);
	graphics.fillRect(230, 115, 30, 30);
	graphics.setColor(Mains.sidesArray[5][2]);
	graphics.drawRect(260, 115, 30, 30);
	graphics.fillRect(260, 115, 30, 30);
	graphics.setColor(Mains.sidesArray[4][3]);
	graphics.drawRect(20, 145, 30, 30);
	graphics.fillRect(20, 145, 30, 30);
	graphics.setColor(Mains.sidesArray[4][4]);
	graphics.drawRect(50, 145, 30, 30);
	graphics.fillRect(50, 145, 30, 30);
	graphics.setColor(Mains.sidesArray[4][5]);
	graphics.drawRect(80, 145, 30, 30);
	graphics.fillRect(80, 145, 30, 30);
	graphics.setColor(Mains.sidesArray[0][3]);
	graphics.drawRect(110, 145, 30, 30);
	graphics.fillRect(110, 145, 30, 30);
	graphics.setColor(Mains.sidesArray[0][4]);
	graphics.drawRect(140, 145, 30, 30);
	graphics.fillRect(140, 145, 30, 30);
	graphics.setColor(Mains.sidesArray[0][5]);
	graphics.drawRect(170, 145, 30, 30);
	graphics.fillRect(170, 145, 30, 30);
	graphics.setColor(Mains.sidesArray[5][3]);
	graphics.drawRect(200, 145, 30, 30);
	graphics.fillRect(200, 145, 30, 30);
	graphics.setColor(Mains.sidesArray[5][4]);
	graphics.drawRect(230, 145, 30, 30);
	graphics.fillRect(230, 145, 30, 30);
	graphics.setColor(Mains.sidesArray[5][5]);
	graphics.drawRect(260, 145, 30, 30);
	graphics.fillRect(260, 145, 30, 30);
	graphics.setColor(Mains.sidesArray[4][6]);
	graphics.drawRect(20, 175, 30, 30);
	graphics.fillRect(20, 175, 30, 30);
	graphics.setColor(Mains.sidesArray[4][7]);
	graphics.drawRect(50, 175, 30, 30);
	graphics.fillRect(50, 175, 30, 30);
	graphics.setColor(Mains.sidesArray[4][8]);
	graphics.drawRect(80, 175, 30, 30);
	graphics.fillRect(80, 175, 30, 30);
	graphics.setColor(Mains.sidesArray[0][6]);
	graphics.drawRect(110, 175, 30, 30);
	graphics.fillRect(110, 175, 30, 30);
	graphics.setColor(Mains.sidesArray[0][7]);
	graphics.drawRect(140, 175, 30, 30);
	graphics.fillRect(140, 175, 30, 30);
	graphics.setColor(Mains.sidesArray[0][8]);
	graphics.drawRect(170, 175, 30, 30);
	graphics.fillRect(170, 175, 30, 30);
	graphics.setColor(Mains.sidesArray[5][6]);
	graphics.drawRect(200, 175, 30, 30);
	graphics.fillRect(200, 175, 30, 30);
	graphics.setColor(Mains.sidesArray[5][7]);
	graphics.drawRect(230, 175, 30, 30);
	graphics.fillRect(230, 175, 30, 30);
	graphics.setColor(Mains.sidesArray[5][8]);
	graphics.drawRect(260, 175, 30, 30);
	graphics.fillRect(260, 175, 30, 30);
	graphics.setColor(Mains.sidesArray[3][0]);
	graphics.drawRect(110, 205, 30, 30);
	graphics.fillRect(110, 205, 30, 30);
	graphics.setColor(Mains.sidesArray[3][1]);
	graphics.drawRect(140, 205, 30, 30);
	graphics.fillRect(140, 205, 30, 30);
	graphics.setColor(Mains.sidesArray[3][2]);
	graphics.drawRect(170, 205, 30, 30);
	graphics.fillRect(170, 205, 30, 30);
	graphics.setColor(Mains.sidesArray[3][3]);
	graphics.drawRect(110, 235, 30, 30);
	graphics.fillRect(110, 235, 30, 30);
	graphics.setColor(Mains.sidesArray[3][4]);
	graphics.drawRect(140, 235, 30, 30);
	graphics.fillRect(140, 235, 30, 30);
	graphics.setColor(Mains.sidesArray[3][5]);
	graphics.drawRect(170, 235, 30, 30);
	graphics.fillRect(170, 235, 30, 30);
	graphics.setColor(Mains.sidesArray[3][6]);
	graphics.drawRect(110, 265, 30, 30);
	graphics.fillRect(110, 265, 30, 30);
	graphics.setColor(Mains.sidesArray[3][7]);
	graphics.drawRect(140, 265, 30, 30);
	graphics.fillRect(140, 265, 30, 30);
	graphics.setColor(Mains.sidesArray[3][8]);
	graphics.drawRect(170, 265, 30, 30);
	graphics.fillRect(170, 265, 30, 30);
	graphics.setColor(Mains.sidesArray[1][0]);
	graphics.drawRect(110, 295, 30, 30);
	graphics.fillRect(110, 295, 30, 30);
	graphics.setColor(Mains.sidesArray[1][1]);
	graphics.drawRect(140, 295, 30, 30);
	graphics.fillRect(140, 295, 30, 30);
	graphics.setColor(Mains.sidesArray[1][2]);
	graphics.drawRect(170, 295, 30, 30);
	graphics.fillRect(170, 295, 30, 30);
	graphics.setColor(Mains.sidesArray[1][3]);
	graphics.drawRect(110, 325, 30, 30);
	graphics.fillRect(110, 325, 30, 30);
	graphics.setColor(Mains.sidesArray[1][4]);
	graphics.drawRect(140, 325, 30, 30);
	graphics.fillRect(140, 325, 30, 30);
	graphics.setColor(Mains.sidesArray[1][5]);
	graphics.drawRect(170, 325, 30, 30);
	graphics.fillRect(170, 325, 30, 30);
	graphics.setColor(Mains.sidesArray[1][6]);
	graphics.drawRect(110, 355, 30, 30);
	graphics.fillRect(110, 355, 30, 30);
	graphics.setColor(Mains.sidesArray[1][7]);
	graphics.drawRect(140, 355, 30, 30);
	graphics.fillRect(140, 355, 30, 30);
	graphics.setColor(Mains.sidesArray[1][8]);
	graphics.drawRect(170, 355, 30, 30);
	graphics.fillRect(170, 355, 30, 30);
	graphics.setColor(Color.black);
	graphics.drawLine(20, 25, 20, 435);
	graphics.drawLine(50, 25, 50, 435);
	graphics.drawLine(80, 25, 80, 435);
	graphics.drawLine(110, 25, 110, 435);
	graphics.drawLine(140, 25, 140, 435);
	graphics.drawLine(170, 25, 170, 435);
	graphics.drawLine(200, 25, 200, 435);
	graphics.drawLine(230, 25, 230, 435);
	graphics.drawLine(260, 25, 260, 435);
	graphics.drawLine(290, 25, 290, 435);
	graphics.drawLine(5, 25, 505, 25);
	graphics.drawLine(5, 55, 505, 55);
	graphics.drawLine(5, 85, 505, 85);
	graphics.drawLine(5, 115, 505, 115);
	graphics.drawLine(5, 145, 505, 145);
	graphics.drawLine(5, 175, 505, 175);
	graphics.drawLine(5, 205, 505, 205);
	graphics.drawLine(5, 235, 505, 235);
	graphics.drawLine(5, 265, 505, 265);
	graphics.drawLine(5, 295, 505, 295);
	graphics.drawLine(5, 325, 505, 325);
	graphics.drawLine(5, 355, 505, 355);
	graphics.drawLine(5, 385, 505, 385);
	}
}
