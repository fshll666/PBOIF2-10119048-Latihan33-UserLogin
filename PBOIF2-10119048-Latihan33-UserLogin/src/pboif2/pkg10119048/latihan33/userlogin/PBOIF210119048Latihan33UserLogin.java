/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan33.userlogin;

import java.util.Scanner;
/**
 *
 * @author SystemOs
 * Nama      : Mochammad Faishal
 * NIM       : 10119048
 * Kelas     : IF2
 * Deskripsi : Menampilkan Program Proses Login.
 */
public class PBOIF210119048Latihan33UserLogin {
    private static String UserName, Password;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan Username\t : ");
        UserName = scanner.nextLine();
        System.out.print("Masukan Password\t : " );
        Password = scanner.nextLine();
        
        User user1 = new User();
        user1.cekAkun(UserName,Password);
        
        System.out.println("==========================================");
        System.out.println("Developed by : Mochammad Faishal");
    }
    
}
