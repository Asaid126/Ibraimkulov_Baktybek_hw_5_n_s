public class Boss {
    private int health;
    private int damage;
    private String typeAttack;

    public int getHealth() {
        return this.health;  //геттер
    }

    public int getDamage() {
        return this.damage;  //геттер
    }

    public String getTypeAttack() {
        return this.typeAttack;   //геттер
    }

    public void setHealth(int newHealth) {  //сеттер
        this.health = newHealth;
    }

    public void setDamage(int newDamage) {  //сеттер
        this.damage = newDamage;
    }

    public void setTypeAttack(String newTypeAttack) { //сеттер
        this.typeAttack = newTypeAttack;
    }
}