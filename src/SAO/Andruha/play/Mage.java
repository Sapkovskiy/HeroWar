package SAO.Andruha.play;

import SAO.Andruha.Weapons.MagicWeapon;

public class Mage<T extends MagicWeapon> extends Hero<T>{

    public Mage(String name,int damage) {
        super(name,damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName()+" скастовала заклинание в "+enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
