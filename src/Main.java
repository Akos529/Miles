public class Main {
    public static void main(String[] args) {
        int ticketPrice = 30_000;
        int milesPerRoubles = 20;
        int miles = ticketPrice / milesPerRoubles;

        System.out.println("Количество начисленных миль:" + miles);

    }
}
