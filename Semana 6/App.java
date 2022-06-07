import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;

class App {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String option = "";
        float dollarQuote = 0f;
        boolean restart = true;

        do {
            showMenu();
            option = scanner.next();
            option = validateMenuOption(scanner, option);

            switch (option) {
                case "1":
                    dollarQuote = currencyConversion(scanner, dollarQuote);
                    break;
                case "2":
                    temperatureConversion(scanner);
                    break;
                case "3":
                    System.exit(0);
                    break;
            }

            System.out.println("Deseja realizar outra conversão? 'sim/nao'");
            restart = checkRestart(scanner, scanner.next().toLowerCase());
            
        } while (restart);

        scanner.close();
    }

    public static void showMenu() {
        System.out.println("Programa de conversões" +
        "\n 1- Conversão de moeda" +
        "\n 2- Conversão de temperatura" +
        "\n 3- Sair");
        System.out.println("Insira o valor correspondente a opção desejada:");
    }

    public static boolean checkRestart(Scanner scanner, String option) {
        while (!option.equals("sim") && !option.equals("s") 
            && !option.equals("nao") && !option.equals("n")) {
            System.out.println("Opção inválida, digite uma das opções acima.");
            option = scanner.next().toLowerCase();
        }

        if (option.equals("nao") || option.equals("n")) {
            return false;
        }

        return true;
    }

    public static String validateOption(Scanner scanner, String option) {
        while (!option.equals("1") && !option.equals("2")) {
            System.out.println("Opção inválida, digite uma das opções acima.");
            option = scanner.next();
        }

        return option;
    }

    public static String validateMenuOption(Scanner scanner, String option) {
        while (!option.equals("1") && !option.equals("2") 
            && !option.equals("3")) {
            System.out.println("Opção inválida, digite uma das opções acima.");
            option = scanner.next();
        }

        return option;
    }

    public static float realToDollar(float real, float dollarQuote) {
        return real / dollarQuote;
    }

    public static float dollarToReal(float dollar, float dollarQuote) {
        return dollar * dollarQuote;
    }

    public static float celsiusToFahrenheit(float celsius) {
        return (celsius * 1.8f) + 32;
    }

    public static float fahrenheitToCelsius(float fahrenheit) {
        return (fahrenheit - 32f) / 1.8f;
    }

    public static void realToDollarOption(Scanner scanner, float dollarQuote) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        float real = 0f;

        while (real == 0f) {
            try {
                System.out.println("Insira o valor em Real:");
                real = scanner.nextFloat();
            } catch (InputMismatchException exception) {
                System.out.println("Entrada inválida, digite um número.");
            }

            scanner.nextLine();
        }

        System.out.println(decimalFormat.format(real) + " reais são " + 
            decimalFormat.format(realToDollar(real, dollarQuote)) + " dolares.");
    }

    public static void dollarToRealOption(Scanner scanner, float dollarQuote) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        float dollar = 0f;

        while (dollar == 0f) {
            try {
                System.out.println("Insira o valor em Dolar:");
                dollar = scanner.nextFloat();
            } catch (InputMismatchException exception) {
                System.out.println("Entrada inválida, digite um número.");
            }

            scanner.nextLine();
        }

        System.out.println(decimalFormat.format(dollar) + " dolares são " + 
            decimalFormat.format(dollarToReal(dollar, dollarQuote)) + " reais.");
    }

    public static void celsiusToFahrenheitOption(Scanner scanner) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        float celsius = 0f;

        while (celsius == 0f) {
            try {
                System.out.println("Insira os graus em Celsius:");
                celsius = scanner.nextFloat();
            } catch (InputMismatchException exception) {
                System.out.println("Entrada inválida, digite um número.");
            }

            scanner.nextLine();
        }

        System.out.println(decimalFormat.format(celsius) + " Celsius são " + 
            decimalFormat.format(celsiusToFahrenheit(celsius)) + " Fahrenheit.");
    }

    public static void fahrenheitToCelsiusOption(Scanner scanner) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        float fahrenheit = 0f;

        while (fahrenheit == 0f) {
            try {
                System.out.println("Insira os graus em Fahrenheit:");
                fahrenheit = scanner.nextFloat();
            } catch (InputMismatchException exception) {
                System.out.println("Entrada inválida, digite um número.");
            }

            scanner.nextLine();
        }

        System.out.println(decimalFormat.format(fahrenheit) + " Fahrenheit são " + 
            decimalFormat.format(fahrenheitToCelsius(fahrenheit)) + " Celsius.");
    }

    public static float currencyConversion(Scanner scanner, float dollarQuote) {
        String option;

        while (dollarQuote == 0f) {
            try {
                System.out.println("Insira a cotação do dolar:");
                dollarQuote = scanner.nextFloat();
            } catch (InputMismatchException exception) {
                System.out.println("Entrada inválida, digite um número.");
            }

            scanner.nextLine();
        }

        System.out.println("1- Real para Dolar");
        System.out.println("2- Dolar para Real");
        System.out.println("Insira o valor correspondente a opção desejada:");

        option = scanner.next();
        option = validateOption(scanner, option);

        switch (option) {
            case "1":
                realToDollarOption(scanner, dollarQuote);
                break;
            case "2":
                dollarToRealOption(scanner, dollarQuote);
                break;
        }

        return dollarQuote;
    }

    public static void temperatureConversion(Scanner scanner) {
        String option;

        System.out.println("1- Celsius para Fahrenheit");
        System.out.println("2- Fahrenheit para Celsius");
        System.out.println("Insira o valor correspondente a opção desejada:");

        option = scanner.next();
        option = validateOption(scanner, option);

        switch (option) {
            case "1":
                celsiusToFahrenheitOption(scanner);
                break;
            case "2":
                fahrenheitToCelsiusOption(scanner);
                break;
        } 
    }

}
