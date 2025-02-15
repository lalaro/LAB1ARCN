package com.example.solid.srp;

public class InvoiceApp {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Cliente 1", 100.0);
        InvoicePrinter printer = new InvoicePrinter();
        InvoiceRepository repository = new InvoiceRepository();

        printer.print(invoice);
        repository.save(invoice);
    }
}