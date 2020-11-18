/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bacltt.util.test;

import static bacltt.util.MathUtility.*;
//chi co tu JDK 5? , ham static goi ma k can ten class.
//do minh da choi tro khai bao san ten class va ten ham static qua lenh import static
//sau nay xai ham static cua class nay ko can ten class. , xai nhu C

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thúy Bắc
 */
public class MathUtilityTest {
    
    //viet ra nhung viec, nhung tinh huong xai ham getFactorial()
    //kiem tra xem actual == expected hay k? nhu truyen thong ben main()
    //nhung o day xin xo hon, show ra mau xanh do
    //ngoai ra no con dung cho viec CI - Continuous Integration
    //                              CD - Continuous Delivery
    //                              CT - Continuous Regession Test
    //                              DevOps - Development & Operation
    //ngoai doanh nghiep dang xai
    // app lien tuc dc kiem tra chat luong code, build ra file .jar .war
    //day len 1 server trung gian - STAGING ENVIRONMENT de cho nhom test san sang test ki
    //sau do co the day thang len PRODUCTION SERVER, MAY CHAY THAT O NOI KHACH HANG
    //moi viec se bat dau ke tu luc Developer push code len gitHub
    //moi thu co the tu dong, ko can con nguoi can thiep
    @Test //tu khoa nay ~~ bien ham nay thanh public static void main()
    //trong ham nay minh xe show ra mau xanh do dua tren su khop nhau cua
    //EXPECTED VS. ACTUAL qua ham assertEquas() ... ma thu vien cung cap
    //assert...() du cac loai assert tren doi  -  assert(v) so sanh
    //thay vi so sanh bang mat, ta nho ham so sanh gium, thay ve mau gium ta
    public void getFactorial_RunsWell_IfValidArgument(){
        assertEquals(120, getFactorial(5));
        assertEquals(24, getFactorial(4));
        assertEquals(720, getFactorial(6));
        assertEquals(1, getFactorial(0));
        assertEquals(0, getFactorial(0));
        //hay tinh gium toi 5! coi co no co la 120 khong?
        // co thi bao mau xanh, ko thi bao do
        
    }
    
}
