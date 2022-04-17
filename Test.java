import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        lo:while(true){
            System.out.println("请输入您需要查看的星期数(按 0 退出)：");
            Scanner sc = new Scanner(System.in);
            int week = sc.nextInt();
            switch(week){
                case 1:
                    System.out.println("跑步");
                    break;
                case 2:
                    System.out.println("游泳");
                    break;
                case 3:
                    System.out.println("慢走");
                    break;
                case 4:
                    System.out.println("动感单车");
                    break;
                case 5:
                    System.out.println("拳击");
                    break;
                case 6:
                    System.out.println("爬上");
                    break;
                case 7:
                    System.out.println("休息");
                    break;
                case 0:
                    System.out.println("退出成功！");
                    break lo;
                default:
                    System.out.println("输入错误，请从新输入！");
            }
            /**
            if(week == 0){
                
                break;
            }
            */
            
        }
    }
}
