/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttt.ultil.test;

import org.junit.Test;
import static org.junit.Assert.*;
import static ttt.ultil.MathUltility.*;
//Chỉ có từ JDK 5, hàm static gọi mà không cần chấm do 
//mình đã khai báo tên class và tên hàm static thông qua lệnh
//import static
//Sau này xài hàm static của class này không cầu tên hàm ., xài như C

/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    
    //Viết ra nhũng việc những tình huống cần test và kiểm tra (actual vs expected)
    //Ngoài ra nó còn dùng cho việc CI - Continous Integration
    //                              CD - Continous Delivery
    //                              CT - Continous Reqression Test
    //                              DevOps - Development & Operation
    //Ngoài danh nghiệp đang xài
    //app liên tục đc kiểm tra chất lượng code, build ra file .jar hoặc . war
    //đẩy lên 1 server trung gian - STAGING ENVIRONMENT để cho nhóm test sẵn sàng test kì
    //sau đó có thể đẩy thẳng leeb PRODUCTION SERVER, MÁY CHẠY THẬT Ở NƠI KHÁCH
    
    @Test // tương đương biến hàm này thành public static void main()
    //Check xanh đỏ(Actual vs Expected) qua các hàm assertEqual()... , assert...(), và các loại assert khác mà thư ciện cung cấp
    public void getFactorial_RunWell_IfValidArgument(){
        assertEquals(120, getFactorial(5));
        assertEquals(24, getFactorial(4));
        assertEquals(720, getFactorial(6));
        assertEquals(1, getFactorial(0));
        //Mean tính xem 5! có bằng 120 không
    }
}
