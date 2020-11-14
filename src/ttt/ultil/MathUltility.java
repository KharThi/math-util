/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttt.ultil;

/**
 *
 * @author Admin
 */
public class MathUltility {
    //Làm bộ thư viện fake giống Math
    //Math.PI,abs(),...
    //Phàm là thư viện thì sẽ xài static khi ko cần lưu info cho riêng mình
    //Còn thư viện mà cần lưu info cho riêng mình thì non static

    private static final double PI = 3.1415;

    //Tiện ích tính giai thừa
    //n phải là từ 0 trở lên
    //0! = 1! = 1
    // âm giai thừa vô nghĩa
    // giai thừa tăng cặc nhanh , 21! long ko chứa đc
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0-20");
        }
        if (n == 0 || n == 1) {
            return 1; //trường hợp đặt biệt return luôn
        }
        // viết else trừ điểm
        //Mặc định đến đây là n= 2..20
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}