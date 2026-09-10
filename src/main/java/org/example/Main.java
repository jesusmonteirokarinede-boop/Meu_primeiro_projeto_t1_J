import java.util.Locale;
import java.util.Scanner;


class Questao2 {
    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.print("Informe a sua nota: ");
            double nota = ent.nextDouble();

            if (nota >= 7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}