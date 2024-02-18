/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvdev.ioc.enset.Pres;

import com.vvdev.ioc.enset.Pres.*;
import com.vvdev.ioc.enset.Metier.IMetier;
import com.vvdev.ioc.enset.Dao.IDao;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 *
 * @author apple
 */
public class Pres2 {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(new File("config.txt"));
        
        String DaoClassName= scanner.nextLine();
        Class cdao = Class.forName(DaoClassName);
        IDao dao = (IDao) cdao.newInstance();
        
        String MetierClassName= scanner.nextLine();
        Class cMetier = Class.forName(MetierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();
        
        Method method= cMetier.getMethod("setDao", IDao.class);
        method.invoke(metier,dao );
        
        System.out.println("Resultat:"+metier.Calcul());
        
    }
    
}
