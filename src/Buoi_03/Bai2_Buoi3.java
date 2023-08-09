package Buoi_03;

public class Bai2_Buoi3 {
    public static void main(String[] args) {
        int[] arrNum;
        arrNum= new int[6];
        for(int i=1;i<10;i++){
            for(int j=0;j<10;j++){
                for(int k=0;k<10;k++){
                    for(int n=0;n<10;n++){
                        for(int m=0;m<10;m++){
                            for(int l=1;l<10;l++){
                                arrNum[0]=i;
                                arrNum[1]=j;
                                arrNum[2]=k;
                                arrNum[3]=n;
                                arrNum[4]=m;
                                arrNum[5]=l;
                                if(arrNum[0]==arrNum[5] && arrNum[1]==arrNum[4] && arrNum[2]==arrNum[3] ){
                                    System.out.println(" "+arrNum[0]+arrNum[1]+arrNum[2]+arrNum[3]+arrNum[4]+arrNum[5]);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
