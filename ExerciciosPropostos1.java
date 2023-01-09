import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciciosPropostos1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> temperaturaSemestral = new ArrayList<Double>();

        double soma = 0;
        for (int i = 0; i < 6; i++) {

            System.out.print("Digite a Temperatura do mês: " + i + " => ");
            double temperatura = scanner.nextDouble();
            temperaturaSemestral.add(temperatura);

            soma += temperatura;
        }

        double mediaTemperaturaSemestral = soma / temperaturaSemestral.size();

        System.out.println("Temperarura Semestral: " + temperaturaSemestral);
        System.out.println("Média da temperatura dos 6 primeiros meses: "  + mediaTemperaturaSemestral + " celsius");


        for (double temperatura : temperaturaSemestral) {
            if (temperatura > mediaTemperaturaSemestral) {
                int index = temperaturaSemestral.indexOf(temperatura);
                switch (index) {
                    case 0:
                        System.out.println((index + 1 ) + " - Janeiro: " + temperatura );
                        break;
                    case 1:
                        System.out.println((index + 1 ) + " - Fevereiro: " + temperatura );
                        break;
                    case 2:
                        System.out.println((index + 1 ) + " - Março: " + temperatura );
                        break;
                    case 3:
                        System.out.println((index + 1 ) + " - Abril: " + temperatura );
                        break;
                    case 4:
                        System.out.println((index + 1 ) + " - Maio: " + temperatura );
                        break;
                    case 5:
                        System.out.println((index + 1 ) + " - Junho: " + temperatura );
                        break;
                    default:
                        break;
                }
            }
        }

    }
}
