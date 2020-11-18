
import bacltt.util.MathUtility;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Thúy Bắc
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long expected = 120;
        long actual = MathUtility.getFactorial(5);
        //in ra kiem tra su khop nhau giua cai ta muon va cai ta lam
        System.out.println("5! expected: " + expected);
        System.out.println("5! actual: " + actual);
        //tiep tuc cho cac tinh huong 6! 7! 21! -5! 0! ...
        //             cac tinh huong can phai test ta goi la test case
        //ve ly thuyet ta phai test het cac tinh huong...
        //ve thuc hanh: ki 5 se ro SWT301
        System.out.println("6!: 720, actual: " + MathUtility.getFactorial(6));
        System.out.println("0!: 1, actual: " + MathUtility.getFactorial(0));
        //tao ki vong m nem ve ngoai le, maf phai laf ngoai le IllegalArgumentException neu t co tinh,
        //nguoi xai ham cua tao dua tham so am, >20
        System.out.println("expected: IllegalArgumentException: " + MathUtility.getFactorial(-5));
        System.out.println("I want to see the RED or GREEN!!!");
    }
    
}
