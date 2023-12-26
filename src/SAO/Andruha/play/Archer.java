package SAO.Andruha.play;

import SAO.Andruha.Weapons.RangeWeapon;

public class Archer<T extends RangeWeapon> extends Hero<T>{
    private Pet pet;

    public Archer(String name,int damage) {
        super(name,damage);
        this.pet=new Pet("Хатико",8);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName()+" выстрелила из лука в "+ enemy.getName());
        pet.attackEnemy(enemy) ;
    }
    private class Pet {
        private String name;
        private int damage;

        public Pet(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }
        public void attackEnemy(Enemy enemy){
            System.out.println(name +" и " +Archer.this.getName()+ " наносят совместный урон: ");
            enemy.takeDamage(damage+Archer.this.getDamage());
        }
    }
}
