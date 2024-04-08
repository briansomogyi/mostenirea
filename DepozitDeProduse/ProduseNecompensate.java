package DepozitDeProduse;

public class ProduseNecompensate extends Produse {

    public ProduseNecompensate(String cod, String nume, double pretDeBaza, double cantitate, double coeficient) {
        super(cod, nume, pretDeBaza, cantitate, coeficient);
    }

    public static ProduseNecompensate faProduseNecompensate(String cod, String nume, double pretDeBaza,
            double cantitate,
            double coeficient) {
        if (coeficient == 1) {
            return new ProduseNecompensate(cod, nume, pretDeBaza, cantitate, coeficient);
        } else {
            System.out.println("Produsul este compensat, deci nu s-a putut crea un produs necompensat.");
            return null;
        }
    }

}
