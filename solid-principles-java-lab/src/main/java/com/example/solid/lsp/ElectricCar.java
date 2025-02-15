package com.example.solid.lsp;

class ElectricCar implements Drivable {
    @Override
    public void drive() {
        System.out.println("Conduciendo el carro electrico...");
    }
}