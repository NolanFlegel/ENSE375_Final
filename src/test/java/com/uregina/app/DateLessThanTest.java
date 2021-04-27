package com.uregina.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class DateLessThanTest{

    @Test
    public void differentYearTrue(){
        try{
           Date d1 = new Date(1,1,2021);
        Date d2 = new Date(5,1,2022);

        assertTrue(d1.lessThan(d1,d2)); 
        }catch (Exception e){
            assertFalse(true);
        }
        
    }

    @Test
    public void differentMonthTrue(){
        try{
           Date d1 = new Date(1,1,2021);
        Date d2 = new Date(2,1,2021);

        assertTrue(d1.lessThan(d1,d2)); 
        }catch (Exception e){
            assertFalse(true);
        }
        
    }
    
    @Test
    public void SameDateFalse(){
        try{
        Date d1 = new Date(1,1,2021);
        Date d2 = new Date(1,1,2021);

        assertFalse(d1.lessThan(d1,d2)); 
        }catch (Exception e){
            assertFalse(true);
        }
        
    }

    @Test
    public void SameYearandDayFalse(){
        try{
        Date d1 = new Date(11,1,2021);
        Date d2 = new Date(1,1,2021);

        assertFalse(d1.lessThan(d1,d2)); 
        }catch (Exception e){
            assertFalse(true);
        }
        
    }

    public void differentYearSameMonthTrue(){
        try{
           Date d1 = new Date(1,1,2021);
        Date d2 = new Date(1,1,2022);

        assertTrue(d1.lessThan(d1,d2)); 
        }catch (Exception e){
            assertFalse(true);
        }
        
    }

    @Test
    public void differentDayTrue(){
        try{
        Date d1 = new Date(1,1,2021);
        Date d2 = new Date(1,30,2021);

        assertTrue(d1.lessThan(d1,d2)); 
        }catch (Exception e){
            assertFalse(true);
        }
        
    }

    @Test
    public void differentDayFalse(){
        try{
        Date d1 = new Date(1,30,2021);
        Date d2 = new Date(1,1,2021);

        assertFalse(d1.lessThan(d1,d2)); 
        }catch (Exception e){
            assertFalse(true);
        }
        
    }
}