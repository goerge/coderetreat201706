import java.util.Objects;

class Position {
  private final int x;
  private final int y;

  public Position(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int x() {
    return x;
  }

  public int y() {
    return y;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Position{");
    sb.append("x=").append(x);
    sb.append(", y=").append(y);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Position position = (Position) o;
    return x == position.x &&
      y == position.y;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }
}
