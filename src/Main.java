
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setTypeAttack("physical");
        System.out.println("Параметры Босса: " + "\n" + "Жизнь: " + boss.getHealth() + "\n" + "Урон: " + boss.getDamage() + "\n" + "Тип атаки: " + boss.getTypeAttack());
        System.out.println("-----------------");
        for (int i = 0; i < 3; i++) {
            Hero tt=createHeroes(i);
            System.out.println(tt.getHealth()+" "+tt.getDamage()+tt.getSuperAbility());

        }
    }
    public static Hero createHeroes(int a){
        Hero mag=new Hero(250,30," невидимость");
        Hero  warrion =new Hero(300,25);
        Hero archer=new Hero(200,40," зоркость");
        Hero[] hero=new Hero[3];
        hero[0]=mag;
        hero[1]=warrion;
        hero[2]=archer;
        return (hero[a]);

    }
}