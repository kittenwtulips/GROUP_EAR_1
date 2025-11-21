/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sw2;

import java.time.LocalDate;

/**
 *
 * @author shaha
 */
public class Sw2 {
  public static void main(String[] args) {

        // Van seller (driver)
        VanSalesPerson seller = new VanSalesPerson("James Carter", "VAN-12");

        // Products
        Product p1 = new Product("P001", "Coca-Cola-500ml", 1.20);
        Product p2 = new Product("P002", "Lays-Classic", 0.75);

        // Create delivery note
        DeliveryNote note = new DeliveryNote(
                "DN-1001",
                "S-1001",
                LocalDate.of(2025, 11, 15),
                seller,
                "FreshMart Supermarket",
                "45 Industrial Zone"
        );

        // Add sold items
        note.addSale(p1, 24);
        note.addSale(p2, 30);

        // Add returns
        note.addReturn(p2, 2);

        // Payment
        double total = (24 * 1.20) + ((30 - 2) * 0.75);
        note.setPayment(total, "Cash");

        // Print
        note.print();
    }
}
