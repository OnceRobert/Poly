public class BlackAndWhite extends Printer {
        String Black = "000";

        public void Printing(String P, String Black) {
            System.out.println("B: " + Black);
            System.out.println(P);
        }

        public void Printing(String P) {
            System.out.println("B: " + this.Black);
            System.out.println(P);
        }
}
