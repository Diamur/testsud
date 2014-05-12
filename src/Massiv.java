import java.util.Scanner;

public class Massiv {

    private final int CONST = 9;
    private int[] mas = new int[CONST];
    private Scanner in = new Scanner(System.in);

    @Override
    public String toString() {

        String stroka = new String();

//        for(int i = 0; i < CONST ; i++){
//            stroka  = stroka + mas[i]+"\u0020";
//        }
        for(Integer s : mas){
            stroka = stroka + s + "\t";
        }

        return stroka ;
    }

    public int getMas(int i) {
        return mas[i-1];
        }

    public void setMas(int str) {

      for(int j = 0; j < str; j++){
       //or(int j : CONST){
            this.mas[j] = in.nextInt();

        }

    }


}
