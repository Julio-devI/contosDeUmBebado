import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Character char1 = new Character();
        Character enemy = new Character();
        Random random = new Random();

        int hit_points = 1 + random.nextInt(19); // vida
        int stamina = 1+ random.nextInt(19); //mana
        int strength = 1 + random.nextInt(5); // forca
        int armor = 0;

        char1.setHit_points(hit_points);
        char1.setStamina(stamina);
        char1.setStrength(strength);
        char1.setArmor(armor);

        enemy.setHit_points(hit_points);
        enemy.setStamina(stamina);
        enemy.setStrength(strength);
        enemy.setArmor(armor);

        System.out.println("Bem vindo aos contos de um bebado, esteja preparado para enfrentar uma historia maluca !");
        System.out.println(" ");
        System.out.println("Você acorda numa ilha, com o sol ofuscando sua visão, você põe a mão sobre seu rosto e observa ao seu redor e consegue ver várias palmeiras e uma trilha a frente");
        System.out.println(" ");

        System.out.println("Mas antes, diga-me, qual é o seu nome ?");
        String nome = input.nextLine();

        char1.setName(nome);

        System.out.println("Seus status são: ");
        System.out.println("Nome: " + char1.getName());
        System.out.println("Pontos de Vida: " + char1.getHitPoints());
        System.out.println("Mana: " + char1.getStamina());
        System.out.println("Força: " + char1.getStrength());

        System.out.println("Voltando para a realidade o que você deseja fazer ?");
        System.out.println("1. Ir pela trilha " + "\n2. Dar a volta pela costa" + "\n3. Meditar e encontrar a resposta dentro de você");
        int escolha = input.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Você anda pela trilha e observa árvores grandes ao seu redor e mais a frente um homem de pele pálida," + "\n1. Você se aproxima dele" + "\n2. Você da meia volta");
                escolha =  input.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.println("Você se aproxima dele e percebe que ele está de boassa observando uma vila, ele pergunta: 'Qual é o seu nome viajante ?'" + "\n1. Falar seu nome" + "\n2. Cumprimenta-lo e seguir avante");
                        escolha = input.nextInt();
                        if (escolha == 1) {
                            System.out.println("Olá "+char1.getName()+", me chamo kisso severino, então quando ele aperta sua mão ele te golpeia na cabeça");
                            System.out.println("FI DUM CABRUNCO TUA MÃE NUNCA TE DISSE PARA NÃO FALAR COM ESTRANHOS ?????");
                        }

                        if (escolha == 2) {
                            System.out.println("Você cumprimenta-o casualmente e ele tenta te atacar te dando uma paulada em sua direção e te atinge na barriga e você acaba perdendo 3 pontos de vida");
                            char1.setHit_points(hit_points-3);
                            System.out.println("Agora seus status são: " + "\n Pontos de vida: "+char1.getHitPoints()+"\n Mana: "+char1.getStamina()+"\n Força: "+char1.getStrength());
                            System.out.println("Após isso ele sente uma enorme dor e acaba ficando deitado no chão (Vai da sua interpretação do que aconteceu...)");
                            System.out.println("Você acaba aproveietando a chance para seguir caminho para a vila");
                        }
                        break;
                    case 2:
                        System.out.println("Você da meia volta e acaba na praia novamente");
                        break;
                }
            break;

            case 2:
                System.out.println("Dando a volta pela costa você consegue observar uma colina e no alto dela tem duas cadeiras de praia: " + "\n1. Subir ate la");
                System.out.println("Você sobe e consegue curtir a vista");
            break;

            case 3:
                System.out.println("Você descobre que tem uma fonte inexplicavel de poder latente e descobre que é capaz de altos feitos anormais, capacidade de manipular a gravidade e tudo mais, .................... nam");
                System.out.println("É só fome");
            break;
        }
    }
}