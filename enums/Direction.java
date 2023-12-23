package enums;

public enum Direction {
    UP ("Вверх"),
    DOWN ("Вниз"),
    LEFT ("Влево"),
    RIGHT ("Вправо");

    private final String direction;

    Direction(String direction) {this.direction = direction;}

    @Override
    public String toString() {return this.direction;}
}
