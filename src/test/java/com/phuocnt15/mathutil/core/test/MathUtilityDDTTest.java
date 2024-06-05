/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.phuocnt15.mathutil.core.test;

import org.giaolang.math.util.MathUtil;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author DELL
 */
public class MathUtilityDDTTest {

    //chuẩn bị data, sau này đưa vào hàm assert() của Framework
    //data này sẽ từ từ được trích vào trong hàm assert()
    //nó nằm trong hàm có style là static - nằm cố định ở 1 vùng ram
    //Test case
    //0! -> 1; 1! -> 1; 2! -> 2; 3! -> 6; 4! -> 24; 5! -> 120
    //ta thấy các bộ data
    // {0,1}, {1,1}, {2,2}, {3,6}, {4,24},  {5,120}, 
    // [6][2]
    //ta để riêng data này ra 1 mảng 2 chiều
    public static Object[][] initData() {
        return new Object[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720}
        };
    }
    
    //TEST CASE SO SÁNH HÀM CÓ TRẢ VỀ KÌ VỌNG HAY KO
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgReturnWell(int n, long expected){
        assertEquals(expected, MathUtil.getFactorial(n));
    }
}
