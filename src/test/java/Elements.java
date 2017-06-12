import java.util.Objects;

class Elements {

  private Element head;
  private Element tail;

  public void setHead(Position headPosition) {
    this.head = new Element(headPosition);
    this.tail = head;
  }

  public void addElementAt(CardinalDirection cardinalDirection) {
    tail = tail.successorAt(cardinalDirection);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Elements elements = (Elements) o;
    return Objects.equals(head, elements.head) && Objects.equals(tail, elements.tail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(head);
  }

  @Override
  public String toString() {
    return "Elements{" + "head=" + head + ", tail=" + tail + '}';
  }
}
