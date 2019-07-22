public class CalculatePriceBrutto {
    private double vat;

    public void checkVat(Product product){

        String category = product.getCategory();

        switch(category){
            case "mleczne":
                vat = 0.08;
                break;
            case "pieczywo":
                vat = 0.05;
                break;
            case "slodycze":
                vat = 0.23;
                break;
            default:
                vat = 0.23;
        }
    }

    public double calculateBrutto(Product product){
        checkVat(product);
        return product.getPriceNetto() +(product.getPriceNetto() * vat);
    }

    public String getPriceBrutto(Product product){
        return " Cena brutto: " + String.format("%.2f", calculateBrutto(product)) ;
    }
}
