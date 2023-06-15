/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.linhdtt.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.linhdtt.mathutil.core.MathUtility.*;

/**
 *
 * @author ACER
 */
public class MathUtilityAdvancedTest {
    //ham tra ve mang 2 chieu gom nhieu dong, 2 cot
 //   n       expected
//       0 ->1
//       1 ->1
//       2 -> 2
    public static Object[][] initTestData(){
        //int a[] = {5,10,15};
        Object testData[][] = {{0, 1}, 
                               {1, 1},
                               {2, 2},
                               {3, 6},
                               {4, 24}
                               };
        
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource("initTestData")
    public void checkFactorialGivenRightAgrumentReturnsWell(int n, long expected) {
        assertEquals(expected, getFactorial(n));
    }
    
}
// bat ngoai le, tuc la ham cua ta getf() co tra ve ngoai le khi dua n -1 -2 hoac la n>20
//JUnit5 dua ra ham moi, AssertThrows()
//ham nay lai xai lambda expression
//TDD: Test driven development: la ki thuat danh cho dan dev
//noi ve viec viet code chinh can phai dc ktra ngay ve chat luong 
//nen viet code chinh dan xe, xem ke cung voi viec thiet ke
//cac test case de test code chinh
//lap trunh ma viet code chinh va code test (JUnit, unit Test)
//dan xen xen ke nhau thi goi la TDD
//Viet code huong theo viec kiem thu ngay code
//DDT: Data Driven Testing la ki thuat mo rong, bo sung them cho
//tdd trong do viet viet cide test dc tach rieng ra so voi test data
//nghia la bo du lieu test thuong dc dat o 1 mang 2 chieu
//hoac de o table, file txt, Excel sau do dc nhoi/fill/map vao trong cau lenh kiem thu
//Ciec data tach rieng ram sau do fill tro lai  ham so sanh qua
//ten bien thi ddt con dc goi la parameterized testing