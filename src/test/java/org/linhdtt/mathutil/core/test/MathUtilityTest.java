/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.linhdtt.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.linhdtt.mathutil.core.MathUtility;

/**
 *
 * @author ACER
 */
public class MathUtilityTest {
    
    @Test
    public void checkFactorialGivenRightAgrumentReturnsWell() {
        //assertEquals(69, 69);
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
    }

}
//ddt:data driven testing - ky thuat viet code kiem thu cua UnitTest, tach data ra khoi assertE()
// viet cac test case huong ve viec tach data test ra rieng biet
//tdd: test driven development
//ky thuat viet code lam app thi phai viet luon code cho cac test case de dam bao method/func/class chay ok
//tdd: viet code chinh va code test/test case dan xen de check ham dung sai
// ddt: trong qua trinh viet code test, tach data test ra rieng 1 cho cho de doc, bao tri
// ddt nam trong tdd
