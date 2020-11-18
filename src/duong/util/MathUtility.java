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
//    public static long getFactorial(int n){
//        if(n<0 || n>20)throw new IllegalArgumentException("n must be between 0..20");
//        if(n==0 || n==1)
//            return 1;
//        //ko sài else có else trừ điểm
//        long result =1;
//        for(int i=2;i<=n;i++){
//            result*=i;
//        }
//        return result;
//    }
    
    //viết đệ quy 
    // gọi lại chính mình vs 1 quy mô khác
    // đệ quy phải có điểm dừng, ko di miết
    // rất dễ bị vòng lặp vô tận
    //kết luận n!=n*(n-1)!
    public static long getFactorial(int n){
        if(n<0 || n >20)throw new IllegalArgumentException("n must between 0...20");
        if(n ==0 || n==1)
            return 1;
        return n*getFactorial(n-1);
    }
    // mình minh họa khái niệm Refactoring - tối ưu, chỉnh sửa lại code
    //cho tốt hơn
    //và minh họa Regression Test, test hồi quy, test lại những gì đã từng test xanh
    // để check xem code còn Xanh như ngày xưa
    
    

}
