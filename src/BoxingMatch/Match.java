package BoxingMatch;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 =f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (checkWeight()) {
            while (this.f1.health>0 && this.f2.health>0) {
                headOrTails();
                if (f1.luck > f2.luck) {
                    this.f1.hit(this.f2);
                    System.out.println(f2.name + " has " + f2.health + " health left.");
                    this.f2.hit(this.f1);
                    System.out.println(f1.name + " has " + f1.health + " health left.");
                }
                else {
                    this.f2.hit(this.f1);
                    System.out.println(f1.name + " has " + f1.health + " health left.");
                    this.f1.hit(this.f2);
                    System.out.println(f2.name + " has " + f2.health + " health left.");
                }
            }
            isWin();
        } else {
            System.out.println("The weights of fighters don't match");
        }
    }

    public boolean checkWeight() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    public void headOrTails() {
        this.f1.luck = Math.random() * 100;
        this.f2.luck = Math.random() * 100;
        System.out.println(f1.luck>f2.luck ? f1.name + " will start first" : f2.name + " will start first");
    }

    public void isWin() {
        System.out.println("---------------------------------");
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " won the fight!");
        }
        else {
            System.out.println(this.f2.name + " won the fight!");
        }
    }
}
