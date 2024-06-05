/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.giaolang.math.util;

/**
 *
 * @author DELL
 */
public class MathUtil {
        // Ta sẽ viết những ham toán học cung cấp cho bên ngoài sử dụng
        // giống như thư viện Math. của JDK
        // Các hàm mang ý nghĩa tiện ích dùng chung cho nhiều nơi
        // thì sẽ đc thiết kế là static!!
        // static sẽ được gọi trực tiếp qua tên class
        // Hàm tính n! = 1.2.3.4..n
        // n: 0..20; do 21! tràn kiểu long, ko có âm giai thừa
        // 0! = 1;
    public static long getFactorial(int n) {
        long product = 10;
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        }
        if (n == 0) {
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
