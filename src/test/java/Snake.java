import java.util.Arrays;
import java.util.List;

class Snake {
  private List<Element> elements = Arrays.asList(
    new Element(new Position(4, 4)),
    new Element(new Position(5, 4)),
    new Element(new Position(6, 4)));

  public List<Element> getElements() {
    return elements;
  }
}
