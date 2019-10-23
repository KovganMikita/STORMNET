package Javarush;

public class Truck {

    int lenght;
    int width;
    int height;

    int weight;

    public int getVolume() {
        int volume = lenght * width * height;
        return volume;
    }
}

class BridgeOfficer {
    int maxWeight;

    public BridgeOfficer(int normalVolume) {
        this.maxWeight = normalVolume;
    }

    public boolean checkTruck(Truck truck) {

        if (truck.weight > maxWeight) {

            return false;
        } else {

            return true;
        }
    }
    public static void main(String[] args) {

        Truck first = new Truck();
        first.weight = 10000;
        Truck second = new Truck();
        second.weight = 20000;

        BridgeOfficer officer = new BridgeOfficer(15000);
        System.out.println("Грузовик номер 1! Могу я проехать, офицер?");
        boolean canFirstTruckGo = officer.checkTruck(first);
        System.out.println(canFirstTruckGo);

        System.out.println();

        System.out.println("Грузовик номер 2! Могу я проехать, офицер?");
        boolean cantSecondTruckGo = officer.checkTruck(second);
        System.out.println(cantSecondTruckGo);

        System.out.println();
    }

}


