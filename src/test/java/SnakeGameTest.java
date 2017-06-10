import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SnakeGameTest {
  @Test
  void snakeHasElements() {
    List<Element> expectedElements = Arrays.asList(
      new Element(new Position(4, 4)),
      new Element(new Position(5, 4)),
      new Element(new Position(6, 4)));

    assertEquals(new Snake().getElements(), expectedElements);
  }

  @Test
  void positionHasCoordinates() {
    final Position position = new Position(1, 2);
    assertEquals(position.x(), 1);
    assertEquals(position.y(), 2);
  }

  @Test
  void elementHasPosition() {
    final Element element = new Element(new Position(1, 2));
    assertEquals(element.position(), new Position(1, 2));
  }
}
