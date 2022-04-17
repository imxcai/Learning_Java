/* For 循环求 1-100 之间的偶数和 */
public class ForDemo {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i <= 100;i++){
            if(i%1 == 0){
                sum += i;
            }
        }
        System.out.println("和为:" + sum); 
    }
}
