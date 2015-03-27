
package id.co.blits.parameter;

import java.util.*;

/**
 *
 * @author andri
 */
public class ProsedurFungsi {
int panjang,lebar,luas;

void luas_persegi(){

    System.out.print("Masukan Panjang : ");
    panjang =new Scanner(System.in).nextInt();
    
    System.out.print("Masukan Lebar : ");
    lebar=new Scanner(System.in).nextInt();
    
    luas=panjang*lebar;
    
    System.out.println("luas persegi panjang : "+luas);
    }
    

    public static void main(String[] args) {

    ProsedurFungsi hitung;
    hitung = new ProsedurFungsi();
    hitung.luas_persegi();
    
    }
    
}
