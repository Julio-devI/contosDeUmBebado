import java.util.Random;
import java.util.Scanner;

public class Capitulo {
    Character ch1 = new Character();

    int danoDoGeneral = 10;
    int escolha;

    Scanner sc1 =  new Scanner(System.in);

    public void Mostrar(int numeroCapitulo){
        switch (numeroCapitulo) {
            case 1 -> {
                System.out.println("Capítulo I - A revolta");
                System.out.println(" ");
                System.out.println("COMANDANTE ACORDE ACORDE ESTAMOS SENDO ATACADOS !!!!! Olhando em volta você percebe que so consegue enxergar naves e uma grande guerra e sua nave parece estar pousando");
                System.out.println("Você e sua equipe pousam na nave de Sith, as suas tropas e companheiros saem da nave correndo e começam a adentrar a base interestelar");
                System.out.println(" ");
                System.out.println("Mas primeiro comandante, vamos decidir seus status como: ");
                System.out.println("- Vida" + "\n - Força" + "\n - Vigor" + "\n - Armadura");
                System.out.println("\n Diga-me seu nome comandante");
            }
            case 2 -> {
                System.out.println("Capitulo II - A batalha contra o Império");
                System.out.println("\n Comandante você e sua tropa se encontram no portão principal da nave inimiga e você pode ver duas portas, uma grande com o simbolo dos sith, e outra pequena com um painel para digitar uma senha, o que você deseja fazer ?");
                System.out.println("1- Porta com símbolo dos sith" + "\n 2- Porta com painel para digitação da senha");


                while (escolha != 1 && escolha != 2) {
                    System.out.println("Numero digitado é inválido");
                    escolha = sc1.nextInt();
                    int resultado = Escolher(escolha);

                    if (resultado == 1) {
                        System.out.println("Você vai até a porta com símbolo dos sith e a abre, e percebe que tem um general do império lutando contra suas tropas");
                        System.out.println("Você vai até lá para ajudar seus aliados e entra em um conflito direto com esse general do império");
                        System.out.println("Ele avança em cima de você, com seu sabre cor vermelha e te atinge no ombro");
                    }

                    if (resultado == 2) {
                        System.out.println("Você observa o painel e nao sabe qual a senha que e necessaria para abri-lo");
                    }
                }
            }
            case 3 -> System.out.println("Capitulo III - Coming soon");
        }
    }

    public int Escolher(int escolha){


        return escolha;
    }
}
