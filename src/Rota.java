import java.util.Scanner;
public class Rota {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int rotas;
        int km;
        double valor;


        System.out.print("Qual o número de rotas?");
        rotas = entrada.nextInt();

        System.out.print("Quantos quilometros cada ônibus vai percorrer?");
        km = entrada.nextInt();

        System.out.print("Qual o valor do litro de óleo diesel?");
        valor = entrada.nextDouble();


        double combustivel = ((rotas * km) * 2.5);
        double custo = combustivel * valor;

        System.out.println(rotas);
        System.out.println(km);
        System.out.println(valor);
        System.out.println(combustivel);
        System.out.println(custo);



    }
}
