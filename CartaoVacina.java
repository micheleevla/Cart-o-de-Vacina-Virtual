import java.util.ArrayList;
import java.util.Scanner;

public class CartaoVacina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vacina1> cartaoVacina = new ArrayList<>();

        System.out.println("Bem-vindo ao Cartão de Vacinação Virtual!");

        while (true) {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1 - Registrar vacina");
            System.out.println("2 - Consultar vacinas registradas");
            System.out.println("3 - Mostrar vacinas por faixa etária");
            System.out.println("4 - Consultar vacinas por CPF");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    registrarVacina(scanner, cartaoVacina);
                    break;
                case 2:
                    consultarVacinas(cartaoVacina);
                    break;
                case 3:
                    mostrarVacinasPorFaixaEtaria();
                    break;
                case 4:
                    consultarVacinasPorCPF(scanner, cartaoVacina);
                    break;
                case 0:
                    System.out.println("Obrigado por usar o Cartão de Vacinação Virtual!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }

    private static void registrarVacina(Scanner scanner, ArrayList<Vacina1> cartaoVacina) {
        System.out.println("\nDigite o nome do paciente:");
        String nomePaciente = scanner.nextLine();

        System.out.println("Digite o CPF:");
        String cpf = scanner.nextLine();

        System.out.println("Digite a data de nascimento (dd/mm/aaaa):");
        String dataNascimento = scanner.nextLine();

        System.out.println("Digite o nome da vacina:");
        String nomeVacina = scanner.nextLine();

        System.out.println("Digite a dose:");
        int dose = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a data da vacinação (dd/mm/aaaa):");
        String dataVacinacao = scanner.nextLine();

        System.out.println("Digite a data da próxima dose (dd/mm/aaaa):");
        String dataProximaDose = scanner.nextLine();

        System.out.println("Digite o lote:");
        String lote = scanner.nextLine();

        System.out.println("Digite o fabricante:");
        String fabricante = scanner.nextLine();

        System.out.println("Digite o local de vacinação:");
        String local = scanner.nextLine();

        Vacina1 vacina = new Vacina1(nomePaciente, cpf, dataNascimento, nomeVacina, dose, dataVacinacao, dataProximaDose, lote, fabricante, local);
        cartaoVacina.add(vacina);

        System.out.println("\nVacina registrada com sucesso!");
    }

    private static void consultarVacinas(ArrayList<Vacina1> cartaoVacina) {
        if (cartaoVacina.isEmpty()) {
            System.out.println("\nNenhuma vacina registrada ainda.");
        } else {
            System.out.println("\nVacinas registradas:");
            for (Vacina1 vacina : cartaoVacina) {
                System.out.println(vacina);
            }
        }
    }

    private static void mostrarVacinasPorFaixaEtaria() {
        System.out.println("\nVacinas por faixa etária:"
        		+ "Crianças:\r\n"
        		+ "\r\n"
        		+ "ID, Idade, Nome, Dose, Detalhes\r\n"
        		+ "\r\n"
        		+ "1;\"Ao nascer\";\"BCG\";\"1°Dose\";\"Contra Tuberculose\"\r\n"
        		+ "2;\"Ao nascer\";\"Hepatite B\";\"1°Dose\";\"Hepatite B\"\r\n"
        		+ "3;\"2 meses\";\"Pentavalente\";\"1°Dose\";\"Contra difteria, tétano, pertússio(coqueluche), Haemophilus influenzae B e Hepatite B\"\r\n"
        		+ "4;\"2 meses\";\"VIP\";\"1°Dose\";\"Injetavel contra pólio\"\r\n"
        		+ "5;\"2 meses\";\"Pneumocócica 10V(conjugada)\";\"1°Dose\";\"Contra 10 sorotipos da bactéria Streptococcus pneumoniae, da pneumonia e meningite\"\r\n"
        		+ "6;\"2 meses\";\"Rotavírus\";\"1°Dose\";\"Contra diarreia de origem viral\"\r\n"
        		+ "7;\"3 meses\";\"Meningocócica C(conjugada)\";\"1°Dose\";\"Contra o sorotipo C da bactéria Neisseria meningitidis, causador de meningite\"\r\n"
        		+ "8;\"4 meses\";\"Pentavalente\";\"2°Dose\";\"Contra difteria, tétano, pertússio(coqueluche), Haemophilus influenzae B e Hepatite B\"\r\n"
        		+ "9;\"4 meses\";\"VIP\";\"2°Dose\";\"Injetavel contra pólio\"\r\n"
        		+ "10;\"4 meses\";\"Pneumocócica 10V(conjugada)\";\"2°Dose\";\"Contra 10 sorotipos da bactéria Streptococcus pneumoniae, da pneumonia e meningite\"\r\n"
        		+ "11;\"4 meses\";\"Rotavírus\";\"2°Dose\";\"Contra diarreia de origem viral\"\r\n"
        		+ "12;\"5 meses\";\"Meningocócica C(conjugada)\";\"2°Dose\";\"Contra o sorotipo C da bactéria Neisseria meningitidis, causador de meningite\"\r\n"
        		+ "13;\"6 meses\";\"Pentavalente\";\"3°Dose\";\"Contra difteria, tétano, pertússio(coqueluche), Haemophilus influenzae B e Hepatite B\"\r\n"
        		+ "14;\"6 meses\";\"VIP\";\"3°Dose\";\"Injetavel contra pólio\"\r\n"
        		+ "15;\"6 meses\";\"Influenza\";\"1°Dose\";\"Contra Influenza\"\r\n"
        		+ "16;\"7 meses\";\"Influenza\";\"2°Dose\";\"Contra Influenza - uma por ano até 5 anos\"\r\n"
        		+ "17;\"8 meses\";\"Febre amarela\";\"1°Dose\";\"Contra Febre amarela\"\r\n"
        		+ "18;\"12 meses\";\"Pneumocócica 10V(conjugada)\";\"3°Dose(reforço)\";\"Contra 10 sorotipos da bactéria Streptococcus pneumoniae, da pneumonia e meningite\"\r\n"
        		+ "19;\"12 meses\";\"Meningocócica C(conjugada)\";\"3°Dose(reforço)\";\"Contra o sorotipo C da bactéria Neisseria meningitidis, causador de meningite\"\r\n"
        		+ "20;\"12 meses\";\"Triplice viral\";\"1°Dose\";\"Contra sarampo, rubéola e caxumba\"\r\n"
        		+ "21;\"15 meses\";\"DTP\";\"1°Dose(reforço)\";\"Contra difteria, tétano, pertússio(coqueluche)\"\r\n"
        		+ "22;\"15 meses\";\"bVOP\";\"1°Dose(reforço da VIP)\";\"Oral contra dois sorotipos do vírus da pólio\"\r\n"
        		+ "23;\"15 meses\";\"Hepatite A\";\"1°Dose\";\"Contra a Hepatite A\"\r\n"
        		+ "24;\"15 meses\";\"Tetra viral\";\"1°Dose\";\"Contra sarampo, rubéola, caxumba e varicela\"\r\n"
        		+ "25;\"4 anos\";\"DTP\";\"2°Dose(2°reforço)\";\"Contra difteria, tétano, pertússio(coqueluche)\"\r\n"
        		+ "26;\"4 anos\";\"bVOP\";\"2°Dose(2°reforço da VIP)\";\"Oral contra dois sorotipos do vírus da pólio\"\r\n"
        		+ "27;\"4 anos\";\"Varicela\";\"1°Dose\";\"Contra a varicela\"\r\n"
        		+ "28;\"4 anos\";\"Febre amarela\";\"2°Dose(reforço)\";\"Contra Febre amarela\"\r\n"
        		+ "\r\n"
        		+ "Adolescente:\r\n"
        		+ "\r\n"
        		+ "ID, Idade, Nome, Dose, Detalhes\r\n"
        		+ "\r\n"
        		+ "29;\"9 a 19 anos\";\"Hepatite B\";\"3 Doses\";\"Contra Hepatite B\"\r\n"
        		+ "30;\"11 a 12 anos\";\"Meningocócica C(conjugada)\";\"Dose(reforço)\";\"Contra o sorotipo C da bactéria Neisseria meningitidis, causador de meningite\"\r\n"
        		+ "31;\"9 a 19 anos\";\"Febre amarela\";\"Dose(reforço)\";\"Contra Febre amarela\"\r\n"
        		+ "32;\"9 a 19 anos\";\"Triplice viral\";\"2 Doses\";\"Contra sarampo, rubéola e caxumba\"\r\n"
        		+ "33;\"9 a 19 anos\";\"HPV\";\"2 Doses(meninas, 9 a 14 anos),2 Doses(meninos, 11 a 14 anos)\";\"Contra sarampo, rubéola e caxumba\"\r\n"
        		+ "34;\"9 a 19 anos\";\"Dupla adulto\";\"Dose(reforço), a cada 10 anos\";\"Contra difteria e tétano\"\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "Adultos:\r\n"
        		+ "\r\n"
        		+ "ID, Idade, Nome, Dose, Detalhes\r\n"
        		+ "\r\n"
        		+ "35;\"20 ou mais\";\"Hepatite B\";\"3 Doses\";\"Contra Hepatite B\";\"\"\r\n"
        		+ "36;\"20 ou mais\";\"Febre amarela\";\"Dose(reforço)\";\"Contra Febre amarela\"\r\n"
        		+ "37;\"20 ou mais\";\"Triplice viral\";\"2 Doses até 59 anos\";\"Contra sarampo, rubéola e caxumba\"\r\n"
        		+ "38;\"20 ou mais\";\"Dupla adulto\";\"Dose(reforço), a cada 10 anos\";\"Contra difteria e tétano\"\r\n"
        		+ "39;\"20 ou mais\";\"Influenza\";\"Dose por ano(a partir dos 55 anos)\";\"Contra Influenza\"\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "Gestantes:\r\n"
        		+ "\r\n"
        		+ "ID, Idade, Nome, Dose, Detalhes\r\n"
        		+ "\r\n"
        		+ "40;\"20 ou mais\";\"Hepatite B\";\"3 Doses\";\"Contra Hepatite B\";\"\"\r\n"
        		+ "41;\"20 ou mais\";\"Dupla adulto\";\"3 Doses(reforço)\";\"Contra difteria e tétano\"\r\n"
        		+ "42;\"20 ou mais\";\"dTpa\";\"Dose(a cada gestação, a partir da 20°semana)\";\"Contra difteria, tétano, pertússio(coqueluche), produzidas com fragmentos das bactérias que causam essas doenças\"\r\n"
        		+ "43;\"20 ou mais\";\"Influenza\";\"Dose por ano(a partir dos 55 anos)\";\"Contra Influenza\"\r\n"
        		+ "");
        
    }

    private static void consultarVacinasPorCPF(Scanner scanner, ArrayList<Vacina1> cartaoVacina) {
        System.out.println("\nDigite o CPF do paciente:");
        String cpfConsulta = scanner.nextLine();

        boolean encontrouVacinas = false;
        for (Vacina1 vacina : cartaoVacina) {
            if (vacina.getCpf().equals(cpfConsulta)) {
                System.out.println("Nome do paciente: " + vacina.getNomePaciente());
                System.out.println("Vacinas registradas:");

                
                System.out.println("------------------------------------------------------------------------------------------------------------");
                System.out.printf("| %-20s | %-15s | %-12s | %-10s | %-15s | %-20s |\n", "Nome da Vacina", "Dose", "Próxima Dose", "Lote", "Fabricante", "Local de Vacinação");
                System.out.println("------------------------------------------------------------------------------------------------------------");
                System.out.printf("| %-20s | %-15d | %-12s | %-10s | %-15s | %-20s |\n", vacina.getNomeVacina(), vacina.getDose(), vacina.getDataProximaDose(), vacina.getLote(), vacina.getFabricante(), vacina.getLocal());
                System.out.println("------------------------------------------------------------------------------------------------------------");

                encontrouVacinas = true;
            }
        }

        if (!encontrouVacinas) {
            System.out.println("Nenhuma vacina encontrada para o CPF informado.");
        }
    }
}