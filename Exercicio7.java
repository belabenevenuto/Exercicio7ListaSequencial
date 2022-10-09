import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        double ladoDoQuadrado, resultado;
        Scanner teclado = new Scanner(System.in);
        ladoDoQuadrado = teclado.nextDouble();
        resultado = ladoDoQuadrado * ladoDoQuadrado * 2;
        System.out.print(" O resultado é "+ resultado);
    }
}