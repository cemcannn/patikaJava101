package BoxingMatch;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("John",10,100,85,30);
        Fighter f2 = new Fighter("Mahmut",15,95,80,45);
        Match match = new Match(f1, f2, 80,85);
        match.run();
    }
}
