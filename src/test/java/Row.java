import java.util.Objects;

public class Row {
  private final Row predecessor;

  private Row(Row predecessor) {
    this.predecessor = predecessor;
  }
  private Row() {
    this.predecessor = null;
  }
  private Row successor() {
    return new Row(this);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Row row = (Row) o;
    return Objects.equals(predecessor, row.predecessor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(predecessor);
  }

  @Override
  public String toString() {
    return "Row{" + "predecessor=" + predecessor + '}';
  }

  static final Row ZERO = new Row();
  static final Row ONE = new Row(ZERO);
  static final Row TWO = new Row(ONE);
  static final Row THREE = new Row(TWO);
  static final Row FOUR = new Row(THREE);
}
