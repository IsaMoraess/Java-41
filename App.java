import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //Calcule o volume de uma esfera com raio r fornecido pelo usuário. A fórmula do volume Volume = (4/3) * π * r³
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o raio da esfera: ");
    double raio = sc.nextDouble();

    double volume = 4.0/3.0 *Math.PI * Math.pow(raio, 3);

    System.out.println("Volume e: " +volume);

    //println sem o % e pula uma linha automaticamente.
    //printf usa o %s e ñ pula linha.
    }
}
