package Buoi_07.James;

/**
 * Bai tap o James( Codegym)
 */
public class QuadraticEquation {
    private int numA;
    private int numB;
    private int numC;

    public int getNumA(){ return this.numA; }
    public int getNumB(){ return this.numB;}
    public int getNumC(){ return this.numC; }
    public QuadraticEquation(int numA, int numB, int numC){
        this.numA = numA;
        this.numB = numB;
        this.numC = numC;
    }

    public double getDiscriminant(){
        return numB*numB - 4*numA*numC;
    }
    public double getRoot1(){
        return (-numB + Math.sqrt(getDiscriminant())) / (2*numA);
    }

    public double getRoot2(){
        return (-numB - Math.sqrt(getDiscriminant())) / (2*numA);
    }
}
