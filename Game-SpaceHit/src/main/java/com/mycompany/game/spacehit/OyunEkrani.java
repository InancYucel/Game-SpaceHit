/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game.spacehit;

import javax.swing.JFrame;

/**
 *
 * @author inanc
 */
public class OyunEkrani extends JFrame{
    
    private OyunEkrani(String space_Game) {
        super(space_Game);
    }
    
    
    public static void main(String[] args){
        
        OyunEkrani ekran = new OyunEkrani("Space Game");
        
        
        ekran.setResizable(false);
        ekran.setFocusable(false);
        ekran.setSize(800,600);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Oyun oyun = new Oyun();
        oyun.requestFocus();
        oyun.addKeyListener(oyun);
        oyun.setFocusable(true);
        oyun.setFocusTraversalKeysEnabled(false);
        
        ekran.add(oyun);
        ekran.setVisible(true);
        
            
       
         
        
    }

    
    
}
