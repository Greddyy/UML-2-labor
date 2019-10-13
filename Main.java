import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double sk1, sk2;
	double rezultatas;
    String simbolis;

        Scanner S= new Scanner(System.in);
        System.out.println("Ar norite pradeti darba?");

        String kartoti=S.next();
         while (kartoti.equalsIgnoreCase("Taip")) {

             System.out.println("Įveskite pirmąjį skaičių");
             sk1 = S.nextDouble();
             System.out.println("Pasirinkite veiksmą");
             simbolis = S.next();
             System.out.println("Įveskite antrąjį skaičių");
             sk2 = S.nextDouble();

             if (simbolis.equals("+")) {
                 System.out.println("Rezultatas yra: " + sudetis(sk1, sk2));
             } else if (simbolis.equals("-")) {
                 System.out.println("Rezultatas yra: " + atimtis());
             } else if (simbolis.equals("/")) {
                 if (sk2 == 0) {
                     System.out.println("Dalyba iš nulio negalima. Įrašykite kitą skaičių.");
                 } else {
                     dalyba();
                 }
             } else if (simbolis.equals("*")) {
                 daugyba(sk1, sk2);
             }
             System.out.println("Ar norite kartoti programą? Taip/Ne");
             kartoti=S.next();
            while (kartoti.equalsIgnoreCase("ne")) {
                break;
            }
         }
    }
    public static double sudetis (double sk1, double sk2){
        double rezultatas=sk1+sk2;
        return rezultatas;
    }
    public static double atimtis (){
        Scanner S = new Scanner(System.in);
        System.out.println("Įveskite pirmąjį skaičių");
        double sk1=S.nextDouble();
        System.out.println("Įveskite antrąjį skaičių");
        double sk2=S.nextDouble();
        double rezultatas=sk1-sk2;
        return rezultatas;

    }
    public static void dalyba (){
        Scanner S = new Scanner(System.in);
        System.out.println("Įveskite pirmąjį skaičių");
        double sk1=S.nextDouble();
        System.out.println("Įveskite antrąjį skaičių");
        double sk2=S.nextDouble();
        double rezultatas=sk1/sk2;
        System.out.println("Rezultatas yra: " + rezultatas);

    }
    public static void  daugyba (double sk1, double sk2){
        double rezultatas=sk1*sk2;
        System.out.println("Rezultatas yra: " + rezultatas);
    }
}
