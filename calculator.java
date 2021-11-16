import java.util.Scanner;

/**
 * @author fatih-git
 */

public class calculator {

    public static void main(String[] args) {

        double n1, n2;
        int select;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen 1. sayıyı giriniz: ");
        n1=input.nextDouble();

        System.out.print("Lütfen 2. sayıyı giriniz: ");
        n2=input.nextDouble();

        System.out.print("Lütfen seçim yapınız: 1=Toplama; 2=Çıkarma; 3=Çarpma; 4=Bölme ");
        select=input.nextInt();



        switch (select){

            case 1: System.out.println(n1+n2);
                break;
            case 2: System.out.println(n1-n2);
                break;
            case 3: System.out.println(n1*n2);

                break;
            case 4: if (n2==0){
                    System.out.println("Bir sayı 0'a bölünemez!");
                    break;
                }
                System.out.println(n1/n2);
                break;
            default: System.out.println("Yanlış giriş yaptınız!");

        }

    }

}
