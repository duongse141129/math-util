/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.util.test;

import static duong.util.MathUtility.*;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class MathUtinityTest {
    //test những hàm trên
    //các đặt tên hàm nói len mục tiêu test
    @Test
    public void getFactorial_RunWell_IfVaildArgument(){
        assertEquals(120, getFactorial(5));
        assertEquals(1, getFactorial(0));
    }
    
    //cần ném về ngoại lệ hay ko
    //nếu đúng là mày ném về ngoại lệ IllegalArgumentException 
    //tình huống giao thừa -5 màu xanh   
    
    //IllegalArgumentException
    @Test(expected = SQLException.class)
    public void getFactorial_ThrowException_IfInvalidArgument(){
        getFactorial(-5);
    }
    //ngoại lệ ko phải là 1 value để đem ra so sánh
    
    
    
}
