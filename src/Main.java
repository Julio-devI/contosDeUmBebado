import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Character char1 = new Character();
        Character enemy = new Character();
        Scanner input = new Scanner(System.in);

        int hit_points = 1 + random.nextInt(19); // vida
        int stamina = 1+ random.nextInt(19); //mana
        int strength = 1 + random.nextInt(5); // forca
        int armor = 0;

        char1.setHitPoints(hit_points);
        char1.setStamina(stamina);
        char1.setStrength(strength);
        char1.setArmor(armor);

        enemy.setHitPoints(hit_points);
        enemy.setStamina(stamina);
        enemy.setStrength(strength);
        enemy.setArmor(armor);

        Capitulo capitulo1 =  new Capitulo();
        capitulo1.Mostrar(1);
        String nome = input.nextLine();
        char1.setName(nome);
        System.out.println("Comandante " + char1.getName()+ " seus dados são: " + "\n Vida - "+char1.getHitPoints()+"\n Força - "+char1.getStrength()+"\n Armadura - "+char1.getArmor());

        capitulo1.Mostrar(2);
        int danoDoGeneral = capitulo1.danoDoGeneral;
        char1.setHitPoints(hit_points - danoDoGeneral);

        if (char1.getHitPoints() <= 0)
        {
            System.out.println("Sua vida atual é: " + char1.getHitPoints());
            System.out.println("Infelizmente voce nao resistiu ao ferimento e morreu");
        }
        else
        {
            System.out.println("Sua vida atual é: " + char1.getHitPoints());
            System.out.println("Por sorte voce sobreviveu");
        }

    }
}