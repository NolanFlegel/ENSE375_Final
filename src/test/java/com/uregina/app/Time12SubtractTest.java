package com.uregina.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class Time12SubtractTest{

    @Test
    public void Subtract12amfrom1159(){
        try{
           Time12 time1 = new Time12(12,0,AmPm.am);
        Time12 time2 = new Time12(11,59,AmPm.pm);

        int difference = time1.subtract(time1, time2);

        assertEquals(-1439,difference); 
        }catch(Exception e){
            assertFalse(true);
        }
        
    }

    @Test
    public void Subtract1159from12am(){
        try{
        Time12 time1 = new Time12(11,59,AmPm.pm);
        Time12 time2 = new Time12(12,0,AmPm.am);

        int difference = time1.subtract(time1, time2);

        assertEquals(1439,difference); 
        }catch(Exception e){
            assertFalse(true);
        }
        
    }

    @Test
    public void Subtract12amfrom12am(){
        try{
           Time12 time1 = new Time12(12,0,AmPm.am);
        Time12 time2 = new Time12(12,0,AmPm.am);

        int difference = time1.subtract(time1, time2);

        assertEquals(0,difference); 
        }catch(Exception e){
            assertFalse(true);
        }
        
    }

    @Test
    public void Subtract12pmfrom12pm(){
        try{
        Time12 time1 = new Time12(12,0,AmPm.pm);
        Time12 time2 = new Time12(12,0,AmPm.pm);

        int difference = time1.subtract(time1, time2);

        assertEquals(0,difference); 
        }catch(Exception e){
            assertFalse(true);
        }
        
    }

}