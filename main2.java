import java.util.Scanner;

public class main2 {

    public static void main(String[] args) {

        double armut,elma,domates,muz,patlican;

        Scanner gir = new  Scanner(System.in);

        System.out.println("armut kg giriniz");
        armut=gir.nextDouble();
        System.out.println("elma kg giriniz");
        elma=gir.nextDouble();
        System.out.println("domates kg giriniz");
        domates=gir.nextDouble();
        System.out.println("muz kg giriniz");
        muz=gir.nextDouble();
        System.out.println("patlican kg giriniz");
        patlican=gir.nextDouble();

        System.out.println("toplam tutar :"+(armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlican*5.00));










    }
}
