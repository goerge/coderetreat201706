import java.util.Objects;

public class Element {
  private final Position position;
  private Element successor;

  public Element(Position position) {
    this.position = position;
  }

  public Position position() {
    return position;
  }

  @Override
  public String toString() {
    return "Element{" + "position=" + position + '}';
  }

  public Element successorAt(CardinalDirection cardinalDirection) {
    successor = new Element(new Position(this.position.x().successor(), this.position.y()));
    return successor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Element element = (Element) o;
    return Objects.equals(position, element.position) &&
      Objects.equals(successor, element.successor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, successor);
  }
}
