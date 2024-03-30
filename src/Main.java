import java.text.NumberFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NumberFormat pound = NumberFormat.getCurrencyInstance();
        String productValue = pound.format(120.80);
        System.out.println(productValue);


        int a = 80;
        int b = 5;
        System.out.println(a != b);



        //Comprar produto entre $ 10 e $ 15 :
        int priceProduct = 20;
        boolean buy = priceProduct >=10 && priceProduct <=15;
        System.out.println(buy);

        // Financiamento de casa
        boolean temEmprego = true;
        boolean temEmpresa = true;
        boolean tem50k = true;
        boolean podeFinanciar =(temEmprego || temEmpresa) && tem50k;
        System.out.println(podeFinanciar);

        // Comprar carro
        int valorCarro =74_000;
        if(valorCarro > 100_000)
            System.out.println("Não comprar. Acima da tabela");
        else if (valorCarro >=90_000 && valorCarro <=100_000)
            System.out.println("Comprar o carro");
        else
            System.out.println("Não comprar. Valor abaixo da tabela");

        // Ingresso na balada

        int ingresso = 700;
        String terAcesso = "Pista";
        if (ingresso >=500)
            terAcesso = "VIP";
        else
            terAcesso = "Pista";
        System.out.println(terAcesso);

        // String terAcesso = ingresso>= 500 ? "Vip" : "Pista";
        // System.out.println(terAcesso);
}}
