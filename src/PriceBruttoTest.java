public class PriceBruttoTest {
    public static void main(String[] args) {
        Product milk = new Product("Mleko", "Mleko 2%", 2.20, "mleczne");
        Product bread = new Product("chleb", "chleb pszenny", 3.5, "pieczywo");
        Product chocolate = new Product("Czekolada", "Czekolada mleczna", 2.17, "slodycze");

        CalculatePriceBrutto calc = new CalculatePriceBrutto();

        System.out.println(milk.getInfo() + calc.getPriceBrutto(milk));
        System.out.println(bread.getInfo() + calc.getPriceBrutto(bread));
        System.out.println(chocolate.getInfo() + calc.getPriceBrutto(chocolate));
    }
}
