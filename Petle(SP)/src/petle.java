import java.util.*;
public class petle {
    public static void main(String[] args) {
        Exe1();
        Exe2();
        Exe3();
        Exe4();
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        System.out.println(Exe5(numbers));
        int[][] numbers1 = new int[][]{new int[] {1, 1}, new int[] {2, 2}, new int[] {3, 3}, new int[] {4, 4}, new int[] {5, 5}};
        System.out.println(Exe6(numbers1));
    }

    public static void Exe1 (){
    System.out.println("Zadanie 1");
        for (int x =20; x>=10; x--){
            System.out.println(x);
        }
        }
    public static void Exe2 (){
        System.out.println("Zadanie 2");
        int x =10;
        while (x<=20) {
            System.out.println(x);
            x++;
        }
    }
    public static void Exe3 (){
        System.out.println("Zadanie 3");
        for (int x =-9; x<40; x+=2){
            System.out.println(x);
        }
    }
    public static void Exe4 (){
        System.out.println("Zadanie 4");
        int x =-9;
        while ( x<40){
            System.out.println(x);
            x+=2;
        }
    }
    public static int Exe5 (int [] numbers){
        System.out.println("Zadanie 5");
            int suma =0;
            for (int numbers2 : numbers) {
                suma += numbers2;
            }
        return suma;
    }
    public static int Exe6 (int [][] numbers){
        System.out.println("Zadanie 6");
        int suma =0;
        for (int[] numbers2 : numbers) {
            for (int numbers3:numbers2){
            suma += numbers3;
        }
        }
        return suma; }

}

