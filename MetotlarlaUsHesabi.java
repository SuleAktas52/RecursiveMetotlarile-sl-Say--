import java.util.Scanner;

public class MetotlarlaUsHesabi {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Taban degeri giriniz: ");
        int a=input.nextInt();
        System.out.print("Us degeri giriniz: ");
        int b=input.nextInt();
        System.out.print("SONUC:" + power(a,b));
    }
    static int power(int taban, int us){

        int result=1;
        if (us>0) {
            result = power(taban, us - 1) * taban;
            return result;
        }else {
            return 1;
        }
    }
}

/*
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini
"Recursive" metot kullanarak yapan programı yazınız.
 */
