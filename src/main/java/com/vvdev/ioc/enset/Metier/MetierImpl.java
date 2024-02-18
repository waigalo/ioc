/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvdev.ioc.enset.Metier;

import com.vvdev.ioc.enset.Metier.*;
import com.vvdev.ioc.enset.Dao.IDao;

/**
 *
 * @author apple
 */
public class MetierImpl implements IMetier{

    private IDao dao ; //couplage faible
    
    @Override
    public double Calcul() {
        double tmp=dao.getdata();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }

    //injecter dans la variable dao un objet
    public void setDao(IDao dao) {
        this.dao = dao;
    }
    
    
    
}
