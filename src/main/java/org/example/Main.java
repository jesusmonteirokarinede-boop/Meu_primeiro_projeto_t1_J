import java.util.Locale;
import java.util.Scanner;

class questao3 {
    public static void main(String[] args) {

        try (Scanner ent = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.print("Informe a sua nota: ");
            double nota = ent.nextDouble();

            if (nota >= 9) {
                System.out.println("Muito Bom!");
            } else if (nota >= 7) {
                System.out.println("Bom");
            } else if (nota >= 5) {
                System.out.println("Regular");
            } else {
                System.out.println("Irregular!");
            }
        }
    }
}