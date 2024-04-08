package DepozitDeProduse;

import java.util.ArrayList;
import java.util.Scanner;

public class DepozitDeProduse {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<String> listStrings = new ArrayList<String>();
            ArrayList<Integer> lIntegers = new ArrayList<Integer>();
            ArrayList<Produse> listProduses = new ArrayList<Produse>();
            System.out.println("Introduceti de cate ori vreti sa introduceti produse.");
            Integer integer = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < integer; i++) {
                System.out.println("Introduceti codul produsului: ");
                String string = scanner.next();
                System.out.println("Introduceti numele produsului: ");
                String string2 = scanner.next();
                listStrings.addLast(string2);
                System.out.println("Introduceti pretul de baza al produsului: ");
                int int1 = scanner.nextInt();
                System.out.println("Introduceti cantitatea produsului: ");
                int int2 = scanner.nextInt();
                lIntegers.addLast(int2);
                System.out.println("Introduceti tipul de produs: ");
                String string3 = scanner.next();
                System.out.println("Introduceti coeficientul: ");
                int int3 = scanner.nextInt();
                if (string3.equals("compensate") && int3 > 0 && int3 <= 1) {
                    ProduseCompensate produseCompensate = ProduseCompensate.faProduseCompensate(string, string2, int1,
                            int2, int3);
                    listProduses.addLast(produseCompensate);
                } else {
                    if (string3.equals("necompensate") && int3 == 1) {
                        ProduseNecompensate produseNecompensate = ProduseNecompensate.faProduseNecompensate(string,
                                string2, int1, int2, int3);
                        listProduses.addLast(produseNecompensate);
                    } else {
                        System.out.println("Nu stiu ce sa fac mai departe.");
                        listProduses.addLast(null);
                    }
                }
            }
            for (Produse produse : listProduses) {
                if (produse != null) {
                    System.out.println(produse);
                }
            }
        } catch (Exception e) {
            System.out.println("Some error occured.");
        }
    }
}
