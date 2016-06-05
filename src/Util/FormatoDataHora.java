/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Rafael
 */
public class FormatoDataHora {
    
    //Ex: 2016-01-30 20:00:00
    public static String sqlDataHora(Date date){
        return ""+date.getYear()+"-"+date.getMonth()+"-"+date.getDay()+" "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
    }
    
    //Ex: 2016-01-30
    public static String sqlData(Date date){
        return ""+date.getYear()+"-"+date.getMonth()+"-"+date.getDay();
    }
    
    //Ex: 20:00:00
    public static String sqlHora(Date date){
        return ""+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
    }
    
    ///////
    
    //Ex: 2016-01-30 20:00:00
    public static String userDataHora(Date date){
        return ""+date.getDay()+"/"+date.getMonth()+"/"+date.getYear()+" "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
    }
    
    //Ex: 2016-01-30
    public static String userData(Date date){
        return ""+date.getDay()+"-"+date.getMonth()+"-"+date.getYear();
    }
    
    //Ex: 20:00:00
    public static String userHora(Date date){
        return ""+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
    }
    
    //////////////////////////CALENDAR/////////////////////////////////////////////////
    
    public static String sqlDataHora(Calendar date){
        return ""+date.get(Calendar.YEAR)+"-"+date.get(Calendar.MONTH)+"-"+date.get(Calendar.DAY_OF_MONTH)+" "+date.get(Calendar.HOUR)+":"+date.get(Calendar.MINUTE)+":"+date.get(Calendar.SECOND);
    }
    
    public static String sqlData(Calendar date){
        return ""+date.get(Calendar.YEAR)+"-"+date.get(Calendar.MONTH)+"-"+date.get(Calendar.DAY_OF_MONTH);
    }
    
    public static String sqlHora(Calendar date){
        return ""+date.get(Calendar.HOUR)+":"+date.get(Calendar.MINUTE)+":"+date.get(Calendar.SECOND);
    }
    
    public void teste(){
    }
}

