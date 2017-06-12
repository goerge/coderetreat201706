import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SnakeGameTest {
  @Test
  void snakeHasElements() {
    Elements expectedElements = new Elements();
    expectedElements.setHead(new Position(Column.FOUR, Row.FOUR));
    expectedElements.addElementAt(CardinalDirection.EAST);
    expectedElements.addElementAt(CardinalDirection.EAST);

    assertEquals(new Snake().getElements(), expectedElements);
  }

  @Test
  void positionHasCoordinates() {
    final Position position = new Position(Column.ONE, Row.TWO);
    assertEquals(position.x(), Column.ONE);
    assertEquals(position.y(), Row.TWO);
  }

  @Test
  void elementHasPosition() {
    final Element element = new Element(new Position(Column.ONE, Row.TWO));
    assertEquals(element.position(), new Position(Column.ONE, Row.TWO));
  }

  @ParameterizedTest()
  @EnumSource(MovingDirection.class)
  void setMovingDirection(MovingDirection direction) {
    final Snake snake = new Snake();
    snake.setMovingDirection(direction);

    assertEquals(snake.getMovingDirection(), direction);
  }

  @Test
  void setMovingDirectionOpposite() {
    final Snake snake = new Snake();
    snake.setMovingDirection(MovingDirection.UP);
    assertThrows(IllegalStateException.class,()->snake.setMovingDirection(MovingDirection.DOWN));
    assertEquals(snake.getMovingDirection(), MovingDirection.UP);
  }
}
