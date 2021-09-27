public class Donkey implements Drivable, Domesticatable, Tradable{
    private double maxSpeed;

    public Donkey() {
        this.maxSpeed = 0.5;
    }

    @Override
    public String sound() {
        return "Hee-haw!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed = this.maxSpeed + 0.5;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return (int) this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 5;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
