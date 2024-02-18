/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvdev.ioc.enset.Pres;

import com.vvdev.ioc.enset.Pres.*;
import com.vvdev.ioc.enset.Ext.DaoImplV2;
import com.vvdev.ioc.enset.Metier.MetierImpl;
import com.vvdev.ioc.enset.Dao.DaoImpl;

/**
 *
 * @author apple
 */
public class Presentation {
    
    public static void main(String[] args) {
      DaoImpl dao =new DaoImpl();
      MetierImpl metier = new MetierImpl();
      metier.setDao(dao);
      System.out.println("res="+metier.Calcul());
        
    }
    
}
