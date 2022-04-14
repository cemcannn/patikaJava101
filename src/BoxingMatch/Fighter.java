package BoxingMatch;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    double luck;

    Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
        this.luck = 0;
    }

    public int hit(Fighter foe) {
        System.out.println("-----------");
        System.out.println(this.name + " hit " + this.damage + " damage!");
        if (foe.dodge()) {
            System.out.println(foe.name + "dodged your attack!");
            return foe.health;
        } else {
            foe.health -= this.damage;
            if (foe.health < 0) {
                return foe.health = 0;
            }
            else {
                return foe.health;
            }
        }
    }

    public boolean dodge() {
        double dodgeChance = Math.random() * 100;
        return this.dodge >= dodgeChance;
    }
}

