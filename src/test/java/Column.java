import java.util.Objects;

public class Column {
  private final Column predecessor;
  
  private Column(Column predecessor) {
    this.predecessor = predecessor;
  }
  private Column() {
    this.predecessor = null;
  }
  Column successor() {
    return new Column(this);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Column column = (Column) o;
    return Objects.equals(predecessor, column.predecessor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(predecessor);
  }

  @Override
  public String toString() {
    return "Column{" + "predecessor=" + predecessor + '}';
  }

  static final Column ZERO = new Column();
  static final Column ONE = ZERO.successor();
  static final Column TWO = ONE.successor();
  static final Column THREE = TWO.successor();
  static final Column FOUR = THREE.successor();
  static final Column FIVE = FOUR.successor();
  static final Column SIX = FIVE.successor();
}
