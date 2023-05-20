import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int menu, recursion = 1;
        while (recursion != 2) {
            menu();
            menu = read.nextInt();
            switch (menu) {
                case 1:
                    int m1n1;
                    System.out.println("Informe o número que deseja ver na tabuada:");
                    m1n1 = read.nextInt();
                    showMultiplyTable(m1n1);
                    recursion = question2();
                    break;
                case 2:
                    int m2n1, m2n2;
                    System.out.println("Informe o primeiro número inteiro:");
                    m2n1 = read.nextInt();
                    System.out.println("Informe o segundo número inteiro:");
                    m2n2 = read.nextInt();
                    respondBigger(m2n1, m2n2);
                    recursion = question2();
                    break;
                case 3:
                    String m3s1, m3s2;
                    System.out.println("Digite o primeiro texto:");
                    Scanner readTxt1 = new Scanner(System.in);
                    m3s1 = readTxt1.nextLine();
                    System.out.println("Digite o segundo texto:");
                    Scanner readTxt2 = new Scanner(System.in);
                    m3s2 = readTxt2.nextLine();
                    testIfSameText(m3s1, m3s2);
                    recursion = question2();
                    break;
                case 4:
                    int m4n1, m4n2;
                    System.out.println("Informe o primeiro número inteiro:");
                    m4n1 = read.nextInt();
                    System.out.println("Informe o segundo número inteiro:");
                    m4n2 = read.nextInt();
                    respondSmaller(m4n1, m4n2);
                    recursion = question2();
                    break;
                case 5:
                    String m5s1, m5s2, r1;
                    System.out.println("Digite o primeiro texto:");
                    Scanner readTxt4 = new Scanner(System.in);
                    m5s1 = readTxt4.nextLine();
                    System.out.println("Digite o segundo texto:");
                    Scanner readTxt5 = new Scanner(System.in);
                    m5s2 = readTxt5.nextLine();
                    r1 = testIfSameText2(m5s1, m5s2);
                    System.out.println(r1);
                    recursion = question2();
                    break;
                case 6:
                    double celsius, r2;
                    System.out.println("Informe a temperatura em Celsius à ser convertida:");
                    celsius = read.nextDouble();
                    r2 = tempConverter(celsius);
                    System.out.println(r2);
                    recursion = question2();
                    break;
                case 7:
                    double ray, r3;
                    System.out.println("Informe o valor do raio:");
                    ray = read.nextDouble();
                    r3 = calcCircleArea(ray);
                    System.out.println(r3);
                    recursion = question2();
                    break;
                case 8:
                    int m8n1, m8n2, m8n3;
                    double r4;
                    System.out.println("informe a primeira nota do aluno:");
                    m8n1 = read.nextInt();
                    System.out.println("informe a segunda nota do aluno:");
                    m8n2 = read.nextInt();
                    System.out.println("informe a terceira nota do aluno:");
                    m8n3 = read.nextInt();
                    r4 = calcWeightAvg(m8n1, m8n2, m8n3);
                    System.out.println(r4);
                    recursion = question2();
                    break;
                default:
                    recursion = question();
                    break;
            }
        }
    }

    // Métodos SEM RETORNO

    public static void menu() {
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║ ▀▄▀▄▀▄▀▄▀▄▀▄▀▄ MENU ▄▀▄▀▄▀▄▀▄▀▄▀▄▀ ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║ Digite o número da ação desejada:  ║");
        System.out.println("╠═══╦════════════════════════════════╣");
        System.out.println("║ 1 ║ Tabuada                        ║");
        System.out.println("║ 2 ║ Maior número                   ║");
        System.out.println("║ 3 ║ Textos iguais?                 ║");
        System.out.println("║ 4 ║ Menor número                   ║");
        System.out.println("║ 5 ║ Textos iguais? (com retorno)   ║");
        System.out.println("║ 6 ║ Celsius para Farenheit         ║");
        System.out.println("║ 7 ║ Área do círculo                ║");
        System.out.println("║ 8 ║ Média ponderada                ║");
        System.out.println("╚═══╩════════════════════════════════╝");
    }

    public static void showMultiplyTable(int num) {
        int i, mult;
        for (i = 1; i <= 10; i++) {
            mult = i * num;
            System.out.println(num + " X " + i + " = " + mult);
        }
    }

    public static void respondBigger(int n1, int n2) {
        if (n1 > n2) {
            System.out.println("O primeiro número digitado é maior que o segundo.");
        } else {
            System.out.println("O segundo número digitado é maior que o primeiro.");
        }

    }

    public static void testIfSameText(String s1, String s2) {
        if (s1.equals(s2)) {
            System.out.println("Os textos inseridos são iguais.");
        } else {
            System.out.println("Os textos inseridos são diferentes.");
        }
    }

    public static void respondSmaller(int n1, int n2) {
        if (n1 < n2) {
            System.out.println("O primeiro número digitado é menor que o segundo.");
        } else {
            System.out.println("O segundo número digitado é menor que o primeiro.");
        }

    }

    // Métodos COM RETORNO

    public static String testIfSameText2(String s1, String s2) {
        if (s1.equals(s2)) {
            return "O retorno informa que os textos inseridos são iguais.";
        } else {
            return "O retorno informa que os textos inseridos são diferentes.";
        }
    }

    public static double tempConverter(double temp) {
        double conv;
        conv = (temp * 1.8) + 32;
        return conv;
    }

    public static double calcCircleArea(double r) {
        double area;
        area = Math.PI * Math.pow(r, 2);
        return area;
    }

    public static double calcWeightAvg(int n1, int n2, int n3) {
        double avg;
        avg = (double) ((double) n1 * 3 + n2 * 3 + n3 * 4) / 10;
        return avg;
    }

    public static int question() {
        Scanner read = new Scanner(System.in);
        int recursion;
        System.out.println(
                "Código de interface inexistente.\nDeseja fazer outra operação?\nDigite: 1 para 'sim', 2 para 'não'.");
        recursion = read.nextInt();
        return recursion;
    }

    public static int question2() {
        Scanner read = new Scanner(System.in);
        int recursion;
        System.out.println("Deseja fazer outra operação?\nDigite: 1 para 'sim', 2 para 'não'.");
        recursion = read.nextInt();
        return recursion;
    }
}