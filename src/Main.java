public class Main {
    public static void main(String[] args) {
        int costOfTicket = 9_999;
        int countRublesForMile = 20;

        int bonusMiles = costOfTicket / countRublesForMile;

        System.out.println("Количество бонусных миль:" + bonusMiles);
    }
}