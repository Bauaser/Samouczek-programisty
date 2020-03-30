package Szachy;
import java.util.*;
public class Szachy {
    public static final int nic =0;

    public static final int bpionek =1;
    public static final int bwieza =2;
    public static final int bkrol =3;
    public static final int bskoczek =4;
    public static final int bgoniec =5;
    public static final int brolowa =6;

    public static final int cpionek =7;
    public static final int cwieza =8;
    public static final int ckrol =9;
    public static final int cskoczek =10;
    public static final int cgoniec =11;
    public static final int crolowa =12;

    private int[][] szachownica =new int [8][8];
    public static int[][] Final5(){
        return new int[][]{
                new int[] {nic,    nic,    nic,    nic,    nic,   nic,    nic,    nic},
                new int[] {cpionek,   cpionek,   nic,    nic,    nic,   nic,    bpionek,   nic},
                new int[] {nic,    nic,    nic,    nic,    nic,   nic,    nic,    nic},
                new int[] {nic,    nic,    nic,    nic,    nic,   nic,    nic,    nic},
                new int[] {nic,    ckrol,   cpionek,   nic,    nic,   bskoczek, nic,    nic},
                new int[] {nic,    cskoczek, nic,    nic,    bwieza,  nic,    bpionek,   nic},
                new int[] {nic,    nic,    nic,    cwieza,   nic,   nic,    nic,    nic},
                new int[] {nic,    bkrol,   nic,    nic,    nic,   nic,    nic,    nic},
        };
    }

    public static void main(String[] args) {
int[][] koniec = Final5();
System.out.println(Arrays.toString(koniec));
    }
}
