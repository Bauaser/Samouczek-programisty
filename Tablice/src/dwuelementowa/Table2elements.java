package dwuelementowa;
import java.util.*;
public class Table2elements {
    public int sum(int[] numbers){
        return numbers [0] + numbers [1];
        }
        public static void main (String[] args) {
        Scanner t = new Scanner(System.in);
            System.out.println( "Wskaż liczbę column");
           int t1 = t.nextInt();
            System.out.println( "A teraz wskaż liczbę wierszy");
            int t2 = t.nextInt();
            Table2elements table= new Table2elements();
        int [] numbers = {t1, t2};
            System.out.println(table.sum(numbers));
        }
    }
