public class Main {
    public static void main(String[] args) {
        RoomService<Room> service = new RoomServiceImpl<>();

        Room room1 = new EconomyRoom(101, 1000);
        Room room2 = new LuxRoom(202, 5000);
        Room room3 = new UltraLuxRoom(303, 8000);

        System.out.println(room1);
        service.clean(room1);
        service.reserve(room1);
        System.out.println(room1);

        try {
            service.reserve(room1); // повторное бронирование
        } catch (RoomAlreadyReservedException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        service.free(room1);
        System.out.println(room1);

        // Тест для других комнат
        service.reserve(room2);
        service.reserve(room3);
        System.out.println(room2);
        System.out.println(room3);
    }
}
