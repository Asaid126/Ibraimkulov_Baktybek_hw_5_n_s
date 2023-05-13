public class Hero  {
    private int health;
    private int damage;
    private String superAbility;

    public int getHealth() {
        return this.health;      //геттер
    }

    public int getDamage() {
        return this.damage;     //геттер
    }

    public String getSuperAbility() {
        return this.superAbility;   //геттер
    }

    public Hero(int health, int damage, String superAbility){
        this.health=health;
        this.damage=damage;
        this.superAbility=superAbility;
    }
    public Hero(int health,int damage){
        this.health=health;
        this.damage=damage;
    }



}

