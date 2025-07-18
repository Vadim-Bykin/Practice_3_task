import java.util.Random;

public abstract class Room {
    protected int number;
    protected int maxPeople;
    protected int pricePerNight;
    protected boolean isReserved;

    public Room(int number, int pricePerNight) {
        this.number = number;
        this.pricePerNight = pricePerNight;
        this.maxPeople = new Random().nextInt(4) + 1; // от 1 до 4
        this.isReserved = false;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        this.isReserved = reserved;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " #" + number +
                ", макс. чел.: " + maxPeople +
                ", цена: " + pricePerNight +
                ", забронирована: " + isReserved;
    }
}
