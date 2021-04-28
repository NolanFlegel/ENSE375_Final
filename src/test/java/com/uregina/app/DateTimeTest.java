package com.uregina.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class DateTimeTest{

    @Test
    public void SameDateTrue(){
        try{
           Date date1 = new Date(1,1,2021);
        Date date2 = new Date(1,1,2021);
        Time12 time1 = new Time12(12,1,AmPm.am);
        Time12 time2 = new Time12(12,1,AmPm.pm);
        DateTime d1 = new DateTime(date1, time1);
        DateTime d2 = new DateTime(date2,time2);

        int timeDifference = d1.subtract(d1, d2);
        
        assertEquals(-720, timeDifference);
        }catch(Exception e){}
        
    }
}