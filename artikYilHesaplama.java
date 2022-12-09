import java.util.Scanner;
public class artikYilHesaplama {
    public static void main(String[] args) {

        int yil,remaining4,remaining100;
        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen yil giriniz:");
        yil=inp.nextInt();
        remaining4=yil%4;
        remaining100=yil%100;

        if (remaining4==0 && remaining100!=0){
            System.out.println(yil+" bir artik yıldır.");

        } else if (remaining100==0 && remaining4==0) {
            System.out.println(yil+" bir artik yıl değildir");

        } else if (remaining4!=0) {
            System.out.println(yil+" bir artik yıl değildir");

        }else {
            System.out.println(yil+" bir artik yıl değildir");
        }
    }
}
