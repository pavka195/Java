package main.block02.lesson13;

public class BlockedClass {
    @Blocked(value = -1, name = "stop")
    public String stop() {
        String str = "Запрещено использовать метод";
        return str;
    }
}