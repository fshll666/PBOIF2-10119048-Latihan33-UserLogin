/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan33.userlogin;

/**
 *
 * @author SystemOs
 * Nama      : Mochammad Faishal
 * NIM       : 10119048
 * Kelas     : IF2
 * Deskripsi : Class User dan Password.
 */
public class User {
    private final String username = "Mochammad Faishal";
    private final String password = "wanareksa110";
    private boolean statusAkun = true;
    
    boolean cekAkun (String parUserName, String parPassword){
        if((parUserName.equals(username)) && (parPassword.equals(password))){
            return statusAkun = true;
    } 
        else {
        return statusAkun = false;
        }
    }
    
    private void hasil(boolean status, String parUserName) {
        status = statusAkun;
        if(status){
            System.out.printf("%n******Halo %s******%n", parUserName.toUpperCase());
            System.out.println("Selamat datang di aplikasi ini");
        }
        else {
            System.out.println("Username atau Password anda salah");
        }
        System.out.println("==========================================");
        System.out.println("Developed by : Mochammad Faishal");
    }
}
