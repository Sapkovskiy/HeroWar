package SAO.Andruha.play;

import SAO.Andruha.Weapons.Weapon;

public abstract class Hero <T extends Weapon> {
    private int damage;
    private String name;

    private T weapon;

    public Hero(String name,int damage) {
        this.name = name;
        this.damage=damage;
    }

    public abstract void attackEnemy(Enemy enemy);



    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
}
