package com.d3if.java.pbo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUILagi {
	public static void main(String[] args) {
		
		JFrame andre =  new JFrame();
		andre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		andre.setSize(800, 500);
		andre.setTitle("ini hanya contoh ya....");
		andre.getContentPane().setBackground(Color.YELLOW);
		andre.setLocationRelativeTo(null);
		
		andre.setLayout(new FlowLayout());

		for (int i = 0; i < 23; i++) {
			JButton tombol =  new JButton();
			tombol.setText("click Me");
			
			tombol.addActionListener(new ActionListener() { 
				@Override
				public void actionPerformed(ActionEvent arg0) { 
					System.out.println("saya sedang diklik...");
					tombol.setBackground(Color.RED);
				}
			});
			
			tombol.addMouseListener(new MouseListener() { 
				@Override
				public void mouseReleased(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
					Random random =  new Random();
					int x =  random.nextInt(andre.getWidth() - tombol.getWidth());
					int y =  random.nextInt(andre.getHeight() - tombol.getHeight());
					tombol.setLocation(x, y);
				}
				
				@Override
				public void mouseClicked(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
			});
			
			andre.add(tombol, BorderLayout.SOUTH);  
		}
		
		andre.show();
		
	}
}
