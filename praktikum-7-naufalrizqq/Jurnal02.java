/*Algoritma
1.Meminta masukan banyaknya jumlah perpindahan cakram
2.Membuat method towerHanoi yang berisikan rumus jumlah cakram dikurangi 1 ,variabel a,b,dan c
3.Jika jumlah perpindahan cakram sama dengan 1, maka pindahkan cakram 1 dari variabel a ke b
4.Jika lebih dari 1 maka menggunakan rumus, (n - 1,variabel a,b dan c)outputnya adalah "Cakram n dipindahkan dari variabel a ke b"
 */
import java.util.Scanner;

public class Jurnal02{

    private static void towerHanoi(int n, char cakram1,char cakram2, char cakram3){
        if (n == 1){
            System.out.println("Cakram 1 dipindahkan dari "+cakram1+" ke "+ cakram2);
            return;
        }else{
        towerHanoi(n - 1, cakram1, cakram3, cakram2);
        System.out.println("Cakram "+ n + " dipindahkan dari " +cakram1 +" ke " + cakram2 );
        towerHanoi(n - 1, cakram3, cakram2, cakram1);
		}
    }
   
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt(); 
        towerHanoi(n, 'A', 'C', 'B'); 
		s.close();
    }
    }


