package com.d3if.java.pbo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIPertama {
	public static void main(String[] args) {
		
		JFrame firhan =  new JFrame();
		firhan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		firhan.setSize(400, 600);
		firhan.setTitle("Ini Hanya Contoh");
		firhan.getContentPane().setBackground(Color.YELLOW);
		
		firhan.setLayout(new FlowLayout());
		
		for (int i = 0; i < 10; i++) {
			JButton tombol =  new JButton();
			tombol.setText("klik Me");
			firhan.add(tombol, BorderLayout.NORTH);
			tombol.addActionListener(new ActionListener() { 
				@Override
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("saya di-klik...");
				}
			});
			
			
		}
		
		firhan.show();
		
	}
}
