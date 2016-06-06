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
    
    public static Date getDataHoraAtual(){
        return new Date(System.currentTimeMillis());
    }
    
    //Ex: 2016-01-30 20:00:00
    public static String sqlDataHora(Date date){
        return ""+(date.getYear()+1900)+"-"+(date.getMonth()+1)+"-"+date.getDate()+" "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
    }
    
    //Ex: 2016-01-30
    public static String sqlData(Date date){
        return ""+(date.getYear()+1900)+"-"+(date.getMonth()+1)+"-"+date.getDate();
    }
    
    //Ex: 20:00:00
    public static String sqlHora(Date date){
        return ""+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
    }
    
    ///////
    
    //Ex: 2016-01-30 20:00:00
    public static String userDataHora(Date date){
        return ""+date.getDate()+"/"+(date.getMonth()+1)+"/"+(date.getYear()+1900)+" "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
    }
    
    //Ex: 2016-01-30
    public static String userData(Date date){
        return ""+date.getDate()+"/"+(date.getMonth()+1)+"/"+(date.getYear()+1900);
    }
    
    public static String userDataDiaMes(Date date){
        return ""+date.getDate()+"/"+(date.getMonth()+1);
    }
    
    //Ex: 20:00:00
    public static String userHora(Date date){
        return ""+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
    }
    
    public static int getMes(Date date){
        return date.getMonth()+1;
    }
    
    public static int getAno(Date date){
        return date.getYear()+1900;
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
    
}

