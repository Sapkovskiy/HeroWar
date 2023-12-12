package SAO.Andruha.play;

public class TrainingGround {
    public static void main(String[] args) {
        Hero Warrior = new Warrior("Кирито", 15);
        Hero Archer = new Archer("Сион", 14);
        Hero Mage = new Mage("Асуна", 10);
        Enemy enemy = new Enemy("Грифона", 130);
        attackEnemy(enemy, Warrior, Archer, Mage);
    }

    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}
