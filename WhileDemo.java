public class WhileDemo {
    public static void main(String[] args) {
        int i = 0;
        double high = 0.1;
        while(high <= 8844430){
            high *=2;
            i++;
            System.out.println(high);
            System.out.println("折叠了"+ i + "次");
        }

        
    }
}
