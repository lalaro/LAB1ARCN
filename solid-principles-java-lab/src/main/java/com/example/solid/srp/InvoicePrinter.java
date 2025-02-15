package com.example.solid.srp;

class InvoicePrinter {
    public void print(Invoice invoice) {
        System.out.println("Factura para: " + invoice.getCustomer());
        System.out.println("Total: " + invoice.calculateTotal());
    }
}
