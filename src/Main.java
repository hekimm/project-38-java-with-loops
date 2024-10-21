/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hekimcanaktas
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kaça kadar gidecek :");
        int n = scanner.nextInt();
        for(int i=1;i<=n;i*=4){
            System.out.println(i);
        }
        System.out.println("*********************");
        for (int i = 1; i<=n; i*=5) {
            System.out.println(i);
        }
    }
}
