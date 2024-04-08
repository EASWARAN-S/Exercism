class NeedForSpeed {
    public int distanceCovered = 0;
    public int batteryDrain;
    public int speed;
    public int battery = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;

    }

    public boolean batteryDrained() {
        return (battery == 0) ? true : false;
    }

    public int distanceDriven() {
        return distanceCovered;
    }

    public void drive() {
        if (battery > 0) {
            distanceCovered += speed;
            battery -= batteryDrain;
        }

    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (car.battery > 0) {
            car.drive();
        }
        if (car.distanceCovered >= distance)
            return true;
        else
            return false;
    }
}
