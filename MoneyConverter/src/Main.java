public class Main {
    
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraFaixa = 9.70/100;
        double segundaFaixa = 37.35/100;
        double treceiraFaixa = 49.50/100;
        double valorInposto;

        if (salarioAnual <= 34712){
            valorInposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507){
            valorInposto = salarioAnual * segundaFaixa;
        } else {
            valorInposto = salarioAnual * treceiraFaixa;
        }

        System.out.println("Valor Inposto: " + valorInposto);

    }
}