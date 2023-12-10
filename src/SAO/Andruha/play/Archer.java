package SAO.Andruha.play;

public class Archer extends Hero{

    public Archer(String name,int damage) {
        super(name,damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName()+" выстрелила из лука в "+ enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
