import java.util.Scanner;

class Questao1 {
    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {

            System.out.print("Informe a sua idade: ");
            int idade = ent.nextInt();

            if (idade < 18) {
                System.out.println("Menor de idade, você possui " + idade + " anos.");
            } else {
                System.out.println("Maior de idade, você possui " + idade + " anos.");
            }
        }
    }
}