import  java.util.Random;

public class MineSweeper {

    int matrisSatir;
    int matrisSutun;
    int elemanSayisi;
    int mayinSayisi;

    boolean isFinish=false;

    String [][] matris;

    MineSweeper(int matrisSatir,int matrisSutun){

        this.matrisSatir=matrisSatir;
        this.matrisSutun=matrisSutun;
        this.elemanSayisi=matrisSatir*matrisSutun;
        this.mayinSayisi=elemanSayisi/4;

        this.matris=new String[this.matrisSatir][this.matrisSutun];

        this.getTarla();
        this.mayinReplace();
    }

    void printMatris(){


        for(int i=0;i<this.matrisSatir;i++){

            for(int j=0;j<this.matrisSutun;j++){

                if(this.matris[i][j].equals("*") && !this.isFinish){

                    System.out.print("- ");
                }

                else {
                    System.out.print(this.matris[i][j]+" ");
                }


            }
            System.out.println();
        }

    }

    void getTarla(){

        for(int i=0;i<this.matrisSatir;i++){

            for(int j=0;j<this.matrisSutun;j++){

                this.matris[i][j]="-";
            }
        }
    }

    void mayinReplace(){

        Random rand=new Random();
        int randSatir,randSutun,gecici=this.mayinSayisi;

        while(gecici!=0){

            randSatir=rand.nextInt(this.matrisSatir);
            randSutun=rand.nextInt(this.matrisSutun);

            if(this.matris[randSatir][randSutun].equals("*")){

                continue;
            }

            gecici--;
            this.matris[randSatir][randSutun]="*";
        }
    }

    boolean isFinish(int satir,int sutun){

        if(this.matris[satir][sutun].equals("*")){

            this.isFinish=true;
            System.out.println("Game Over!");
            return true;
        }

        int kacTane=0;

        for(int i=0;i<this.matrisSatir;i++){

            for(int j=0;j<this.matrisSutun;j++){

                if(this.matris[i][j].equals("-")){

                    kacTane++;
                }
            }
        }

        if(kacTane==0){

            this.isFinish=true;
            System.out.println("Oyunu Kazandiniz!");
            return true;
        }
        else {

            return false;
        }
    }

    void countMayin(int satir,int sutun){

        int mayinAdet=0;

        if(satir==0 && sutun==0){

            if(this.matris[satir][sutun+1].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir+1][sutun].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir+1][sutun+1].equals("*")){

                mayinAdet++;
            }
        }

        else if(satir==0 && (sutun>0 && sutun<this.matrisSutun-1)){

            if(this.matris[satir][sutun-1].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir][sutun+1].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir+1][sutun+1].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir+1][sutun].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir+1][sutun-1].equals("*")){

                mayinAdet++;
            }
        }

        else if(satir==0 && sutun==this.matrisSutun-1){

            if(this.matris[satir][sutun-1].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir+1][sutun].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir+1][sutun-1].equals("*")){

                mayinAdet++;
            }
        }

        else if((satir>0 && satir<this.matrisSatir-1) && sutun==0){

            if(this.matris[satir-1][sutun].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir-1][sutun+1].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir][sutun+1].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir+1][sutun+1].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir+1][sutun].equals("*")){

                mayinAdet++;
            }
        }

        else if((satir==this.matrisSatir-1) && sutun==0){

            if(this.matris[satir-1][sutun].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir-1][sutun+1].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir][sutun+1].equals("*")){

                mayinAdet++;
            }
        }

        else if((satir>0 && satir<this.matrisSatir-1) && (sutun>0 && sutun<this.matrisSutun-1)){

            if(this.matris[satir][sutun-1].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir-1][sutun-1].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir-1][sutun].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir-1][sutun+1].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir][sutun+1].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir+1][sutun+1].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir+1][sutun].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir+1][sutun-1].equals("*")){

                mayinAdet++;
            }
        }

        else if((satir>0 && satir<this.matrisSatir-1) && sutun==this.matrisSutun-1){

            if(this.matris[satir][sutun-1].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir-1][sutun-1].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir-1][sutun].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir+1][sutun].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir+1][sutun-1].equals("*")){

                mayinAdet++;
            }
        }

        else if(satir==this.matrisSatir-1 && (sutun>0 && sutun<this.matrisSutun-1)){

            if(this.matris[satir][sutun-1].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir-1][sutun-1].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir-1][sutun].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir-1][sutun+1].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir][sutun+1].equals("*")){

                mayinAdet++;
            }
        }

        else if(satir==this.matrisSatir-1 && sutun==this.matrisSutun-1){

            if(this.matris[satir][sutun-1].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir-1][sutun-1].equals("*")){

                mayinAdet++;
            }
            if(this.matris[satir-1][sutun].equals("*")){

                mayinAdet++;
            }
        }

        this.matris[satir][sutun]=String.valueOf(mayinAdet);
    }

}
