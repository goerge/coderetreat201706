import java.util.Objects;

public class Element {
  private final Position position;

  public Element(Position position) {
    this.position = position;
  }

  public Position position() {
    return position;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Element{");
    sb.append("position=").append(position);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Element element = (Element) o;
    return Objects.equals(position, element.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position);
  }
}
