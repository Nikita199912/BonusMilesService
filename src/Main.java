// Main.java
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000; // Цена билета
        int miles = service.calculate(price); // Рассчитываем мили
        System.out.println(miles); // Выводим результат в консоль
    }
}