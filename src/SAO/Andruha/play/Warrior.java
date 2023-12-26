package SAO.Andruha.play;

import SAO.Andruha.Weapons.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T>{

    public Warrior(String name,int damage) {
        super(name,damage);

    }

    @Override
    public void attackEnemy(Enemy enemy) {

        System.out.println(getName()+" ударил мечём "+enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
