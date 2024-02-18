/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvdev.ioc.enset.Dao;

/**
 *
 * @author apple
 */
public class DaoImpl implements IDao{

    @Override
    public double getdata() {
        //version base de donnee
        System.out.println("version base de donnee");
        double temp=Math.random()*23;
        return temp;
    }
    
}
