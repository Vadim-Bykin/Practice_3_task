public class RoomServiceImpl<T extends Room> implements RoomService<T> {

    @Override
    public void clean(T room) {
        System.out.println("Комната " + room.number + " убрана.");
    }

    @Override
    public void reserve(T room) {
        if (room.isReserved()) {
            throw new RoomAlreadyReservedException("Комната " + room.number + " уже забронирована!");
        }
        room.setReserved(true);
        System.out.println("Комната " + room.number + " успешно забронирована.");
    }

    @Override
    public void free(T room) {
        room.setReserved(false);
        System.out.println("Комната " + room.number + " теперь свободна.");
    }
}
