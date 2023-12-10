package SAO.Andruha.play;

public class Mage extends Hero{

    public Mage(String name,int damage) {
        super(name,damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName()+" скастовала заклинание в "+enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
