//Name:Mehmet 
//Surname:Turan
package ıkiliagac;
import java.util.Scanner;
public class IkiliAgac {
    public static void main(String[] args) {
        AgacYapisi bt=new AgacYapisi();
        Scanner scanner=new Scanner(System.in);
        int secim=-1;
        int data=0;
        int aranan;   
        while(secim!=0){
            System.out.println("\n--------------------");
            System.out.println("1-KOK EKLE");
            System.out.println("2-SOLA EKLE");
            System.out.println("3-SAGA EKLE");
            System.out.println("4-ELEMAN SIL");
            System.out.println("5-YAZDIR");
            System.out.println("0-CIKIS");
            System.out.println("--------------------");
            bt.Kok(bt.root, data);
            System.out.print("Seciminiz:");
            secim=scanner.nextInt();          
            switch(secim){
                case 1:
                System.out.println("Eklenecek degeri giriniz:");                    
                data=scanner.nextInt();
                System.out.println("Hangi kokten once eklenecegini giriniz:");
                aranan=scanner.nextInt();
                bt.root=bt.kokeekle(bt.root,data,aranan);break;
                case 2:
                System.out.println("Hangi kokun soluna eklenecegini giriniz:");
                data=scanner.nextInt();
                System.out.println("Eklenecek degeri giriniz:");
                aranan=scanner.nextInt();
                bt.root=bt.SolaEkle(bt.root,data,aranan);break;
                case 3:
                System.out.println("Hangi kokun sagina eklenecegini giriniz:");
                data=scanner.nextInt();
                System.out.println("Eklenecek degeri giriniz:");
                aranan=scanner.nextInt();
                bt.root=bt.SagaEkle(bt.root,data,aranan);break;
                case 4:
                System.out.println("Silinecek degeri giriniz:");
                data=scanner.nextInt();
                bt.root=bt.Sil(bt.root, data);break;
                case 5:
                bt.printInSpiralForm(bt.root);break;     
            }
    }
    }  
}
