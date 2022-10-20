/*Algoritma
1.Meminta masukkan 2 angka bilangan bulat
2.Menentukan faktor persekutuan terbesar(FPB) dari 2 angka bilangan bulat tadi dengan cara menggunakan modulus
3.Membuat method baru yang dinamakan fpb
4.Jika b kurang dari sama dengan a dan sisa bagi dari a dengan b sama dengan 0 maka kembalikan nilai b
5.Jika a kurang dari b maka menggunakan rumus fpb(b,a)
6.Jika selain itu, maka menggunakan rumus fpb(b,a sisa bagi dari b)
 */
import java.util.Scanner;
public class Jurnal01 {

	public static void main(final String[] args) {
		int angka1, angka2 ;
		Scanner s = new Scanner(System.in);
		angka1 = s.nextInt();
		angka2 = s.nextInt();
        System.out.println(fpb(angka1,angka2));
        s.close();    
	}   
	private static int fpb(int a,int b){
		if (((b<=a) && (a%b==0))){ 
			return b;
			
		} else if (a<b) {
			return fpb(b,a);
			
		} else {
			return fpb(b,a%b);
		}
		
			
		}
	}


	

