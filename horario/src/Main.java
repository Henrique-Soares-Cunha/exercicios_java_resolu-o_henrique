//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        Horario h1 = new Horario();
        try
        {
            System.out.println("Digite as horas: ");
            short horas = entrada.nextShort();
            h1.setHoras(horas);

            System.out.println("Digite os minutos: ");
            short minutos = entrada.nextShort();
            h1.setMinutos(minutos);

            System.out.println("Digite os segundos: ");
            short segundos = entrada.nextShort();
            h1.setSegundos(segundos);

            System.out.println("Horário configurado: " + h1);

            System.out.println("quantos segundos quer avançar? ");
            int somaSegundos = entrada.nextInt();
            h1.avance(somaSegundos);

            System.out.println("Novo horario: " + h1);

            System.out.println("quantos segundos quer retroceder? ");
            int retroceder = entrada.nextInt();
            h1.retroceda(retroceder);

            System.out.println("novo horario: " + h1);

        }
        catch (Exception erro)
        {
            System.err.println ("Erro: " + erro.getMessage());
        }
        entrada.close();
    }

}