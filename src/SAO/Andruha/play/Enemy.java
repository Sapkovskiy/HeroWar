package SAO.Andruha.play;

public class Enemy implements Mortal{
    private String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void takeDamage(int damage){
        if (isAlive()&& health<damage){
            health=0;
            System.out.println(getName()+" победили");
        }else {
        this.health-=Math.min(damage,health);
        System.out.println(name+" получил урон "+damage+". Осталось "+health);}

    }


    public String getName() {
        return name;
    }

    @Override
    public boolean isAlive() {
        return health>0;
    }
}
