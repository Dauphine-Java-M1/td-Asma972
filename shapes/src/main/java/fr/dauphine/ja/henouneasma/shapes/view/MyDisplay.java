package fr.dauphine.ja.henouneasma.shapes.view;

import javax.swing.*;

import fr.dauphine.ja.henouneasma.shapes.model.Cercle;
import fr.dauphine.ja.henouneasma.shapes.model.Ligne;
import fr.dauphine.ja.henouneasma.shapes.model.Point;

import java.awt.*;
import java.util.*;

public class MyDisplay extends JPanel{
	
	public MyDisplay(){
		
	}
	@Override
	public  void paintComponent(Graphics g) {
        g.drawLine(50, 50, 200, 300);
        Cercle c = new Cercle(1, new Point(1,2));
		c.d.draw(g);
    }
	public static void main(String []args){
		
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDisplay d = new MyDisplay();
		frame.add(d);
				
		}

}
