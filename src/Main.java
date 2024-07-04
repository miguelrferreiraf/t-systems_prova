import java.util.Comparator;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Alienigena alfOETeimoso = new Alienigena("998742", "Alf", "ALF",
                0, "1991-07-21",
                "Melmac");
        Alienigena spock = new Alienigena("4598237", "Spock", "Vulcano",
                8, "2023-08-23",
                "Vulcano");

        Alienigena chewbacca = new Alienigena("", "Chewbacca", "Wookie", 4,
                "2021-06-21", "Planeta dos wookies");

        // Array de alienígenas para facilitar a verificação
        Alienigena[] alienigenas = {alfOETeimoso, spock, chewbacca};

        // Exibindo os dados de todos os alienígenas
        System.out.println("Dados de todos os alienígenas cadastrados:");
        for (Alienigena alien : alienigenas) {
            System.out.println("Nome: " + alien.getNome());
            System.out.println("Especie: " + alien.getEspecie());
            System.out.println("Periculosidade: " + alien.getPericulosidade());
            System.out.println("Planeta de Origem: " + alien.getPlenetaOrigem());
            System.out.println("------------------------------------------------");
        }

        System.out.println("Alienígenas que devem ser monitorados:");
        for (Alienigena alien : alienigenas) {
            if (alien.deveSerMonitorado()) {
                alien.monitored();
            }
        }

        Arrays.sort(alienigenas, Comparator.comparingInt(Alienigena::getPericulosidade).reversed());

        System.out.println("Ranking de periculosidade:");
        for (int i = 0; i < alienigenas.length; i++) {
            Alienigena alien = alienigenas[i];
            System.out.println((i + 1) + ". " + alien.getNome() + " --> Periculosidade: " + alien.getPericulosidade());
        }

        String planetaPesquisado = "Vulcano";
        System.out.println("----------------------------------------------------");
        System.out.println("Resultado para " + planetaPesquisado + ":");

        boolean encontrou = false;
        for (Alienigena alien : alienigenas) {
            if (alien.getPlenetaOrigem().equalsIgnoreCase(planetaPesquisado)) {
                System.out.println(alien.getNome());
                encontrou = true;
            }
        }
    }
}

// NÃO CONSEGUI FAZER O NEGÓCIO DE MOSTRAR QUAL ALIENÍGENA CHEGOU NOS ÚLTIMOS SEIS MESES.
// TODO O RESTO, DE UMA FORMA OU DE OUTRA, ESTÁ INFORMADO NO OUTPUT.
