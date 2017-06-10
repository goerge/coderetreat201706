import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

  @ParameterizedTest()
  @EnumSource(Snake.MovingDirection.class)
  void setMovingDirection(Snake.MovingDirection direction) {
    final Snake snake = new Snake();
    final List<Element> elements = new ArrayList<>(snake.getElements());

    snake.setMovingDirection(direction);

    assertEquals(snake.getMovingDirection(), direction);
    assertEquals(snake.getElements(), elements);
  }

  @Test
  void setMovingDirectionOpposite() {
    final Snake snake = new Snake();
    snake.setMovingDirection(Snake.MovingDirection.UP);
    assertThrows(IllegalStateException.class,()->snake.setMovingDirection(Snake.MovingDirection.DOWN));
    assertEquals(snake.getMovingDirection(), Snake.MovingDirection.UP);
  }
}
