/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Frame;
import visao.*;

/**
 *
 * @author gusta
 */
public class SeguroVeiculo {
    
    public static void main(String[] args) {
        Login login = new Login();       
        login.setVisible(true);
        login.setSize(350, 300);
        login.setResizable(false);
        login.setLocationRelativeTo(null);
        
    }
    
}
