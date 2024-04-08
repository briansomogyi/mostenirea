package DepozitDeProduse;

public class Produse {
    String cod, nume;
    double pretDeBaza, cantitate, pretProdus;

    public Produse(String cod, String nume, double pretDeBaza, double cantitate, double coeficient) {
        this.cod = cod;
        this.nume = nume;
        this.pretDeBaza = pretDeBaza;
        this.cantitate = cantitate;
        if (coeficient <= 0) {
            System.out.println("Coeficientul este mai mic sau egal cu 0. Se considera 0.1.");
            this.pretProdus = 0.1 * pretDeBaza;
        } else {
            if (coeficient > 0 && coeficient < 1) {
                System.out.println("Coeficientul este subunitar. Se considera asa cum este el.");
                this.pretProdus = coeficient * pretDeBaza;
            } else {
                if (coeficient == 1) {
                    System.out.println("Coeficientul este echiunitar. Se considera astfel.");
                    this.pretProdus = pretDeBaza;
                } else {
                    System.out.println("Coeficientul este supraunitar. Se considera 1.0.");
                    this.pretProdus = 1.0 * pretDeBaza;
                }
            }
        }
    }

    public String toString() {
        return "cod: " + cod + ", nume: " + nume + ", pretul de baza: " + pretDeBaza + ", cantitatea: " + cantitate
                + ", pretul produsului: " + pretProdus;
    }

    public boolean equals(Produse produse) {
        return this.nume.equals(produse.nume);
    }
}
