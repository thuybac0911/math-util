/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bacltt.util;

/**
 *
 * @author Thúy Bắc
 */
public class MathUtility {
    //làm bộ thư viện fake giống y chang Math
    //Math.PI, .abs() .sqrt() .pow(a,b) a^b
    //phàm là thư viện thì sẽ xài static khi k cần lưu info cho riêng mình
    //còn thư viện mà vẫn cần lưu info riêng, thì vẫn non-static như bình thường
    
    public static final double PI=3.1415;
    
    //tiện ích tính giai thừa n!=1.2.3...n
    //n phải là từ 0 trở lên
    //0!=1!=1
    //âm giai thừa vô nghĩa
    //giai thừa tăng cực nhanh, 21! long k chứa đc
    //bài này mình sẽ chặn giai thừa từ 0..20
    //âm hoặc 21 chửi, k thèm tính
    
//    public static long getFactorial(int n){
//        if(n<0 || n>21)
//            throw new IllegalArgumentException("n must be between 0..20");
//        if (n== 0 || n==1)
//            return 1; //dac biet, return luon
//        //viet else tru diem
//        //mac nhien CPU den dc day la hieu rang n=2..20
//        long result=1;
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }
    //viet ham de quy cho pro
     public static long getFactorial(int n){
         if(n<0||n>20)
             throw new IllegalArgumentException("n must be between 0..20");
         if(n == 0 || n==1)
             return 1; //ddk dung
         return n * getFactorial(n-1); //de quy do em
         //goi lai chinh ham cua minh vs quy mo khac, n-1
         //di mai se ve 1
     }
     
     //5! = 5 *4!;4!= 4 * 3!; 3! = 3 * 2!; 2! = 2*1!
     //1!=1, de quy goi lai minh vs quy mo nho hon
     //ket luan: n!= n * (n-1)!
     //phai co dung, k thi lap vo tan

}
// minh muon ket luan ham ngon, minh phai test cac truong hop xai ham
//truong hop 5! 0! -5! 21! 20! ....
//minh phai thiet ke cac test case, tinh huong test de dau di minh verify
//giua gia tri tra ve cua ham(actual) co khop vs expected cai minh du doan
//ham chay phai tra ve
//va neu moi thu khop, tuc la actual == expected, minh moi dam gay: HAM NGON
//CACH NAY CO NHUOC DIEM: NHIN BANG MAT VA SO SANH KET QUA CUA TUNG CASE
//                                                                  tinh huong test
//Cach nay on, nhun tiem an sai sot do nhin = mat nhieu case

//Cach nang cao
//cung nhin = mat, nhung chi nhin 2 mau xanh -  do cho moi test case
//co nghia: neu ban xai ham vs 100 tham so, chay ham 100 tinh huong khac nhau
//ban chi can nhin duy nhat 2 mau xanh, do
//XANH: code on cho moi test case, moi tinh huong goi ham, moi case phai co expected = actual thi moi xanh
//DO: moi case mau xanh, chi co it nhat 1 case mau do, ket luan ca dam ddor
//      ham dung cho 99 truong hop , expected = actual cho 99% tinh huong
//      chi co 1 tinh huong sai, ko khop, ket luan luon, ham k on dinh
//      ai dma xai khi ko on dinh, on dinh va chinh xac phai cho cho moi truong hop
//CHI CAN IT NHAT 1 CAI KHONG ON, DO CA DAM DE DAM BAO RANG HAM PHAI CHINH XAC MOI TINH HUONG
//