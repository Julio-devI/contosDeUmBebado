public class Character {
    String name; // nome
    int hit_points; // vida
    int stamina; //mana
    int strength; // forca
    int armor; // armadura

    //setters
    public void setName(String name){this.name = name;}
    public void setHitPoints(int hit_points) {this.hit_points = hit_points;}
    public void setStamina(int stamina) {this.stamina = stamina;}
    public void setStrength(int strength) {this.strength = strength;}
    public void setArmor(int armor) {this.armor = armor;}

    //getters
    public String getName() {return name;}
    public int getHitPoints() {return hit_points;}
    public int getStamina() {return stamina;}
    public int getStrength() {return strength;}
    public int getArmor() {return armor;}
}
