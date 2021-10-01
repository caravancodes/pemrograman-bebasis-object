package com.d3if.java.pbo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

final public class GUIKedua extends JFrame {

	public GUIKedua() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setTitle("Ini Hanya Contoh");
		getContentPane().setBackground(Color.YELLOW);
		
		setLayout(new FlowLayout());
		
		for (int i = 0; i < 12; i++) {
			final JButton tombol =  new JButton();
			tombol.setText("klik Me");
			add(tombol, BorderLayout.NORTH);
			tombol.addActionListener(new ActionListener() { 
				@Override
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("saya di-klik... lagi");
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
					Random rand =  new Random();
					int x =  rand.nextInt(800);
					int y =  rand.nextInt(600);
					tombol.setLocation(x, y);
					
				}
				
				@Override
				public void mouseClicked(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
			});
			
		}
		
		show();
	}
	
	public static void main(String[] args) {
		GUIKedua gk =  new GUIKedua();
	}
	
}
