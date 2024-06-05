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
// quy ước đặt tên package của java
// tên miền đảo ngược, chữ thường 100%
// com.mycompany trên mạng
// com.tên-cty.tên-dự-án.tên-module.tên-class-sẽ-dùng
//com.microsoft.sqlserver.jdbc.
//org.junit.jupiter.api.Test;
//com.giaolang.mathutil.core

//C# viết chiều xuôi, chữ hoa từng đầu từ
//Microsoft.Sqlserver...

//NodeJS, ReacJS có cách riêng
//coding convention for...

/**
 *
 * @author DELL
 */
public class MathUlityTest {
    //ở đây chứa các lệnh các hàm dùng để đi test hàm chính ở bên code chính
    //ở bên thư mục source phía trên coi hàm chạy ổn ko
    //ở đây ta làm các hàm ứng với các test case để test code chính ở bên MathUtility. ví dụ .getFactorial()
    
    //TEST CASE: BỘ DATA ĐƯA VÀO HÀM, APP ĐỂ VERIFY HÀM, APP CÓ XỬ LÍ
    //ĐÚNG HAY KO, NÓ ĐI KÈM THEO CÁCH XÀI HÀM, TRÌNH TỰ XÀI APP + EXPECTED
    //VALUE + STATUS TEST CASE PASSED HAY FAILED
    
    //TEST CASE #1: CHECK GETFACTORIAL WITH N = 0, 0!
    //HOPES TO SEE 1 RETURNED
    @Test
    //Tên hàm mang ý nghĩa của test case luôn
    public void testFactorialGivenRightArg0ReturnsWell(){
        int n = 0; //given right argument
        long expectedValue = 1; //hy vọng n! 0! >= 1
        long actualValue;// = ???; // đoán xem trả về mấy
        //nếu expected == actual, hàm ngon với case này 
        actualValue = MathUtil.getFactorial(n);
        
        assertEquals(expectedValue, actualValue);
        //cách cũ là phải sout() từng cái 1 và dùng mắt để nhìn đúng sai
    }
    
    //TEST CASE #2: CHECK GETFACTORIAL WITH N = 1, EXPECTED => 1! = 1
    @Test
    public void testFactorialGivenRightArg1ReturnWell(){
        int n = 1;
        long expectedValue = 1; //1 giai thừa thì hi vọng 1
        long actualValue; // chờ xem hàm
        actualValue = MathUtil.getFactorial(n);
        
        assertEquals(expectedValue, actualValue);
    }
    
    //TEST CASE #2: CHECK GETFACTORIAL WITH N = 2, EXPECTED => 2! = 2
    //                                      N = 3, EXPECTED => 3! = 6
    //                                      N = 5, EXPECTED => 5! = 120
    @Test
    public void testFactorialGivenRightArg235ReturnsWell(){
        int n = 2;
        long expectedValue = 2; //1 giai thừa thì hi vọng 1
        long actualValue; // chờ xem hàm
        actualValue = MathUtil.getFactorial(n);
        
        assertEquals(expectedValue, actualValue); //2!
        
        assertEquals(6, MathUtil.getFactorial(3)); //3!
        
        assertEquals(120, MathUtil.getFactorial(5)); //5!
    }
    
    //TEST #4: CHECK IF GETFACTORIAL RETURNS EXCEPTION IF WE PASS N < 0
    @Test
    public void testFactorialGivenWrongArg_1ThowsException(){
        //Input n < 0, n = -1
        //Expected result: Illegal Argument exception
        //nhớ quy ước: màu xanh ứng với trả về như kì vọng
        // màu đỏ: actual != kì vọng
        //ngoại lệ Exception ko là value, ta ko phải khai báo biến để = ngoại lệ
        //ko assertEquals(value value value)
        assertThrows(IllegalArgumentException.class,
                () -> {MathUtil.getFactorial(-1);} );
    }
}

//PHẦN KIẾN THỨC BỔ SUNG VÀO CV
//TDD - TEST DRIVEN DEVELOPMENT LÀ KĨ  THUẬT VIẾT CODE CỦA DÂN DEV ĐI KÈM VỚI VIẾT CÁC TEST CASE 
// ĐỂ KIỂM THỬ NGAY NHỮNG CODE VỪA VIẾT
// TỨC LÀ CODE MỖI HÀM, LUÔN ĐI KÈM CODE KIỂM THỬ
//KẾT QUẢ KIỂM THỬ HIỂN THỊ THEO 2 MÀU XANH - CODE NGON, PASS CÁC TEST CASE
//MÀU ĐỎ, CODE KO PASS TEST CASE
//VIỆC NÀY CỨ LIÊN TỤC NHƯ VẬY, VIẾT CODE, VIẾT TEST CASE, RUN TEST
//CASE ĐỂ XEM XANH ĐỎ, KĨ THUẬT NÀY GỌI LÀ TDD

//MỌI NGUÔN NGỮ LẬP TRÌNH ĐỀU HỖ TRỢ CÁC BỘ THƯ VIỆN, FRAMEWORK GIÚP
//TEST CODE 2 MÀU XANH ĐỎ, GỌI LÀ UNIT TESTING FRAMEWORK
//MỌI NGON NGỮ ĐỀU HỖ TRỢ TDD, VẤN ĐỀ LÀ DEV TEAM CÓ XÀI HAY KO
//NHÓM LÀM OBS CÓ XÀI

//ĐỀ BÀI THUYẾT TRÌNH NHÓM
//vào google gõ: unit testing framework for <NNLT>, ra KQ thư viện
//C#: NUNIT, XUNIT, MS TEST...
//JAVA: TESTING...
//JS: MOCHA, JASMINE...

//DÒNG THỨ 2 TRONG CV
//DDT - DATA DRIVEN TESTING | TỪ TƯƠNG ĐƯƠNG: PARAMETERIZED TESTING
//(ĐỪNG NHẦM VỚI TDD - TEST DRIVEN DEVELOPNMENT Ở TRÊN)
//DDT LÀ PHẦN MỞ RỘNG THÊM, LÀ KĨ THUẬT NÂNG CAO ĐỂ GIÚP TỔ CHỨC CÁC TEST CASE
//KHI VIẾT CODE UNIT TEST, NÓ CÓ BÀ CON VỚI TDD

//DDT - PARAMETERIZED TESTING LÀ KĨ THUẬT VIẾT CÁC TEST CASE 
//MÀ TA TÁCH RIÊNG PHẦN DATA RA KHỎI CÁC CÂU LỆNH ASSERT()
//DỄ THEO DÕI CÁC PHẦN CODE LIÊN QUAN ĐẾN TEST HÀM 
//VÌ CÂU LỆNH SO SÁNH EXPECTED VS. ACTUAL TRỞ NÊN GỌN NHẸ HƠN

