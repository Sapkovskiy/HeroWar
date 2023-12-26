package SAO.Andruha.play;

import SAO.Andruha.Weapons.*;

public class WeaponRunner {
    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Сион", 13);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("Kirito",10);
        warrior.setWeapon(new Sword());

        Mage<Wand> mage = new Mage<>("Asuna",12);
        mage.setWeapon(new Wand());

        printWeapon(archer);
        printWeapon2(mage);
        printWeapon3(warrior);

    }
    public static <T extends Weapon> void printWeapon(Hero<T> hero){
        System.out.println(hero.getWeapon().getDamage());

    }
    public static void printWeapon2(Hero<? extends Weapon> hero){
        System.out.println(hero.getWeapon().getDamage());
    }
    public static void printWeapon3(Hero<? super Sword> hero){
        hero.setWeapon(new Sword());

        System.out.println(hero.getWeapon().getDamage());
    }
}
