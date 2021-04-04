import java.util.Scanner;

public class DisplayTriangle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1: Vẽ hình chữ nhật");
        System.out.println("2: Vẽ hình tam giác 1");
        System.out.println("3: Vẽ hình tam giác 2");
        System.out.println("4: Vẽ hình tam giác cân");
        System.out.println("0: Thoát khỏi chương trình");

        System.out.println("Nhập sự lựa chọn của bạn");
        int choice = input.nextInt();
        switch(choice){
            case 1: for (int i = 0; i <5 ; i++) {
                        for (int j = 0; j <5 ; j++) {
                        System.out.print("* ");
                        }
                    System.out.println("");
                    }
                    break;

            case 2:
                for (int i = 0; i <5 ; i++) {
                    for (int j = 0; j <5 ; j++) {
                        if(j>i){
                            break;
                        }
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                for (int i = 4; i >=0 ; i--) {
                    for (int j = 0; j <5 ; j++) {
                        if(j>i){
//
                            break;
                        }
                        System.out.print("* ");

                    }
                    System.out.println("");
                }
                break;
            case 4:
//                for (int i = 0; i < 5 ; i++) {
//                    for (int j = 0; j < 2 ; j++) {
//                        System.out.print(" ");
//                    }
//                    for (int j = 0; j < 5 ; j++) {
//                        if( j>5-i || j<=2+i) {
//                            System.out.print("*");
//                        }else
//                            System.out.print(" ");
//                    }

//                    System.out.println("");
//                }
                break;

            case 0:
                System.exit(0);
            default:
                System.out.println("No choice");
        }
    }
}
