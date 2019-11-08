package fr.dauphine.ja.henouneasma.shapes.view;

import javax.swing.*;

import fr.dauphine.ja.henouneasma.shapes.controller.MouseController;
import fr.dauphine.ja.henouneasma.shapes.model.Cercle;
import fr.dauphine.ja.henouneasma.shapes.model.Ligne;
import fr.dauphine.ja.henouneasma.shapes.model.Point;
import fr.dauphine.ja.henouneasma.shapes.model.World;

import java.awt.*;
import java.util.*;

public class MyDisplay extends JPanel{
	
	World monde; 
	public MyDisplay(World monde){
		this.monde = monde;
	}
	@Override
	public  void paintComponent(Graphics g) {
        //g.drawLine(50, 50, 200, 300);
        //Cercle c = new Cercle(1, new Point(1,2));
		//d.draw(g);
    }
	public static void main(String []args){
		World monde = new World();
		JFrame frame = new JFrame("Java y");
		frame.setSize(new Dimension(500,500));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDisplay d = new MyDisplay(monde);
		frame.add(d);
		//c.repaint();
		MouseController m = new MouseController(monde, frame) ; 
		monde.getShapes();
		}

}
