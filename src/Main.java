public class Main {
    public static void main(String[] args) {
        double cardBalance = 5000;

        double interestRate = .17;

        double interestMonthOne = cardBalance * interestRate;

        double interestMonthTwo = (cardBalance * interestMonthOne) * interestRate;

        System.out.println("The balance of your card is: " +cardBalance+

                          System.lineSeparator()+

                "Your interestrate is: " +interestRate+

                        System.lineSeparator()+

                "Your intrest due after one month: "+interestMonthOne+

                        System.lineSeparator()+

                "Your interest due after two months: "+interestMonthTwo

                 );
    }
}