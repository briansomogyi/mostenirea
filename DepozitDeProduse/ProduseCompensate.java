package DepozitDeProduse;

public class ProduseCompensate extends Produse {

    public ProduseCompensate(String cod, String nume, double pretDeBaza, double cantitate, double coeficient) {
        super(cod, nume, pretDeBaza, cantitate, coeficient);
    }

    public static ProduseCompensate faProduseCompensate(String cod, String nume, double pretDeBaza, double cantitate,
            double coeficient) {
        if (coeficient > 0 && coeficient <= 1) {
            return new ProduseCompensate(cod, nume, pretDeBaza, cantitate, coeficient);
        } else {
            System.out.println("Produsul nu este compensat, deci nu s-a putut crea un produs necompensat.");
            return null;
        }
    }

}
