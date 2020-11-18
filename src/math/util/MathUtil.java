/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import ttt.ultil.MathUltility;

/**
 *
 * @author Admin
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long expected = 120;//
        long actual = MathUltility.getFactorial(5);
        // check sự trùng khớp giữa actual và expected
        System.out.println("5! Actual: " + actual);
        System.out.println("5! Expected: " + expected);

        //Test Nhiều thứ khác ...(Lý thuyết là phải hết các trường hợp)
        //Test các ngoại lệ ...
        System.out.println("Yeah!");
        System.out.println("Local and Server is diff");
    }

}
