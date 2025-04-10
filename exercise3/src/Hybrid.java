class Hybrid implements Electric, InternalCombustion {
    public void chargeBattery() {
        System.out.println("Charging battery...");
    }

    public void fillGas() {
        System.out.println("Refueling gas...");
    }
}