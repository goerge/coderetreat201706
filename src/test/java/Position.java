import java.util.Objects;

class Position {
  private final Column column;
  private final Row row;

  Position(Column column, Row row) {
    this.column = column;
    this.row = row;
  }

  Column x() {
    return column;
  }

  Row y() {
    return row;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Position{");
    sb.append("column=").append(column);
    sb.append(", row=").append(row);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Position position = (Position) o;
    return Objects.equals(column, position.column) &&
      Objects.equals(row, position.row);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, row);
  }
}
