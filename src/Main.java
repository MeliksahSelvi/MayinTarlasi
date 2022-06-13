import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int satir,sutun;

        System.out.println("Mayin Tarlasina Hosgeldiniz!");

        System.out.print("Satir Boyutu Giriniz :");
        satir= input.nextInt();
        System.out.print("Sutun Boyutu Giriniz :");
        sutun= input.nextInt();
        System.out.println("===================");

        MineSweeper mines=new MineSweeper(satir,sutun);


        while(true){

            mines.printMatris();

            System.out.print("Satir :");
            satir= input.nextInt();
            System.out.print("Sutun :");
            sutun= input.nextInt();
            System.out.println("===================");

            if((satir<0 || satir>=mines.matrisSatir) || (sutun<0 || sutun>=mines.matrisSutun)){

                System.out.println("Yanlis Satir veya Sutun Girdiniz!");
                continue;
            }

            if(mines.isFinish(satir,sutun)){

                break;
            }

            else{

                mines.countMayin(satir,sutun);
            }

        }

        mines.printMatris();
    }
}
