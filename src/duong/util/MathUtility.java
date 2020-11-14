/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duong.util;

/**
 *
 * @author Admin
 */
public class MathUtility {
    // class này fake class Math của JDK
    // Math của JDK có .abs() .sqrt() .PI
    //chúng toàn là static, vì là thư viện dùng chung
    public static final double PI=3.1415;
    
    //hàm tính giai thừa: n!=1.2.3.4..n
    //o!=1
    //ko tính giao thửa âm
    //21! cực lón, tràn kiểu long, chứa ko nổi
    //int thối đa 2 tỷ 1 mấy
    //hàm tính gii thau72 trong giới hạn đầu vào từ 0..20
    public static long getFactorial(int n){
        if(n<0 || n>20)throw new IllegalArgumentException("n must be between 0..20");
        if(n==0 || n==1)
            return 1;
        //ko sài else có else trừ điểm
        long result =1;
        for(int i=2;i<=n;i++){
            result*=i;
        }
        return result;
    }

}
