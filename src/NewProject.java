public class NewProject {
    public static void main(String[] args) {

        int ticketPrice = 5000;
        int bonusMilesPerRubles = 20;

        int bonusPerTicket = ticketPrice / bonusMilesPerRubles;

        System.out.println("Начислено милей за покупку билета: " + bonusPerTicket);

    }
}
