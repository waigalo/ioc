/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvdev.ioc.enset.Ext;

import com.vvdev.ioc.enset.Ext.*;
import com.vvdev.ioc.enset.Dao.IDao;

/**
 *
 * @author apple
 */
public class DaoImplV2 implements IDao{

    @Override
    public double getdata() {
        //version web service
        System.out.println("version WEB service");
        double temp=Math.random()*23;
        return temp;
    }
    
}
