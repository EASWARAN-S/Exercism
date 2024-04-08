public class ElonsToyCar {
    private int meters = 0;
    private int battery = 100;
    public static ElonsToyCar buy() {
       ElonsToyCar car = new ElonsToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven " + meters + " meters";
    }

    public String batteryDisplay() {
        if(battery <= 0)
            return "Battery empty";
        else
        return "Battery at " + battery + "%";
    }

    public void drive() {
        if(battery > 0)
        {
            meters += 20;
        battery--;
        buy().distanceDisplay();
        buy().batteryDisplay();
        }
        
    }
}
