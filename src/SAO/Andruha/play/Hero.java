package SAO.Andruha.play;

public abstract class Hero {
    private int damage;
    private String name;

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
}
