public class ColorPrinter extends Printer {
    String Red = "000";
    String Blue = "000";
    String Green = "000";

    public void Printing(String P, String Red, String Green, String Blue) {
        System.out.println("R: " + Red + " G: " + Green + " B: " + Blue);
        System.out.println(P);
    }

    public void Printing(String P, String Red, String Green) {
        System.out.println("R: " + Red + " G: " + Green + " B: " + this.Blue);
        System.out.println(P);
    }
    public void Printing(String P, String Red) {
        System.out.println("R: " + Red + " G: " + this.Green + " B: " + this.Blue);
        System.out.println(P);
    }
    public void Printing(String P) {
        System.out.println("R: " + this.Red + " G: " + this.Green + " B: " + this.Blue);
        System.out.println(P);
    }

}
