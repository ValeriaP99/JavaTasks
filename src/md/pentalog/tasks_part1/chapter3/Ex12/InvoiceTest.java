package md.pentalog.tasks_part1.chapter3.Ex12;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("001", "PartDescription", 3, 12.5);
        Invoice invoice2 = new Invoice("002", "PartDescription", 2, 11.4);

        showInvoice(invoice1, "PM01");
        System.out.println("\n**********************************************\n");
        showInvoice(invoice2, "PM02");
    }

    public static void showInvoice(Invoice invoice, String invoiceId){
        System.out.println("----------------------------------------------");
        System.out.printf("|             [Invoice id: %s]             |%n", invoiceId);
        System.out.println("----------------------------------------------");
        System.out.printf("|%-5s|%-20s|%-8s|%-8s|%n", "Id", "Part Description", "Quantity", "Price");
        System.out.println("----------------------------------------------");
        System.out.printf("|%-5s|%-20s|%-8d|%.2f   |%n", invoice.getPartNumber(), invoice.getPartDescription(),
                invoice.getQuantity(), invoice.getPrice());
        System.out.println("----------------------------------------------");
        System.out.printf("|Total:                                 %.2f|%n", invoice.getInvoiceAmount(invoice.getQuantity(), invoice.getPrice()));
        System.out.println("----------------------------------------------");
    }
}
