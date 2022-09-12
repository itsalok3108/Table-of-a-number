package Method1;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Inter N");
        int n= sc.nextInt();
        int table;
        for(int a=1; a<11; a++){
            table=n*a;
            System.out.println(table);}

    }
}
