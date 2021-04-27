package com.uregina.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class Time24Test{
    
    @Test
    public void Convert12AmTrue()
    {
        try{
          Time24 time24 = new Time24(0, 0);
          Time24 result = time24.toTime24(12,0,AmPm.am);
            if(result == null){
                assertTrue(false);
            }else{
            assertEquals(0, result.hours);
            assertEquals(0, result.minutes); 
            }
              
        } catch (Exception e){}  
    }

    @Test
    public void Convert1259AmTrue()
    {
        try{
          Time24 time24 = new Time24(0, 0);
          Time24 result = time24.toTime24(12,59,AmPm.am);
            if(result == null){
                assertTrue(false);
            }else{
            assertEquals(0, result.hours);
            assertEquals(59, result.minutes); 
            }
              
        } catch (Exception e){}  
    }

    @Test
    public void Convert12pmTrue()
    {
        try{
          Time24 time24 = new Time24(0, 0);
          Time24 result = time24.toTime24(12,59,AmPm.pm);
            if(result == null){
                assertTrue(false);
            }else{
            assertEquals(12, result.hours);
            assertEquals(59, result.minutes); 
            }
              
        } catch (Exception e){}  
    }

    @Test
    public void Convert1pmTrue()
    {
        try{
          Time24 time24 = new Time24(0, 0);
          Time24 result = time24.toTime24(1,59,AmPm.pm);
            if(result == null){
                assertTrue(false);
            }else{
            assertEquals(13, result.hours);
            assertEquals(59, result.minutes); 
            }
              
        } catch (Exception e){}  
    }

    @Test
    public void Convert11pmTrue()
    {
        try{
          Time24 time24 = new Time24(0, 0);
          Time24 result = time24.toTime24(11,59,AmPm.pm);
            if(result == null){
                assertTrue(false);
            }else{
            assertEquals(23, result.hours);
            assertEquals(59, result.minutes); 
            }
              
        } catch (Exception e){}  
    }

    @Test
    public void ConvertnegativeFalse()
    {
        boolean catchException = true;
        try{
          Time24 time24 = new Time24(0, 0);
          Time24 result = time24.toTime24(-1,59,AmPm.pm);
            if(result == null){
                catchException = false;
            }
            
            assertFalse(catchException);
        } catch (Exception e){
            assertTrue(true);
        }  
    }

    @Test
    public void ConvertOver13False()
    {
        try{
          Time24 time24 = new Time24(0, 0);
          Time24 result = time24.toTime24(13,59,AmPm.pm);
            if(result == null){
                
            }
              
        } catch (Exception e){
            assertTrue(true);
        }  
    }
}