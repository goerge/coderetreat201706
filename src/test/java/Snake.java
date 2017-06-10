import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Snake {
  private MovingDirection movingDirection;

  public void setMovingDirection(MovingDirection movingDirection) {
    if(movingDirection.isOppositeOf(this.movingDirection)) {
      throw new IllegalStateException();
    }
    this.movingDirection = movingDirection;
  }

  public MovingDirection getMovingDirection() {
    return movingDirection;
  }

  public enum MovingDirection {
    UP {
      @Override
      public boolean isOppositeOf(MovingDirection movingDirection) {
        return movingDirection == DOWN;
      }
    }, DOWN {
      @Override
      public boolean isOppositeOf(MovingDirection movingDirection) {
        return movingDirection == UP;
      }
    }, RIGHT {
      @Override
      public boolean isOppositeOf(MovingDirection movingDirection) {
        return movingDirection == LEFT;
      }
    }, LEFT {
      @Override
      public boolean isOppositeOf(MovingDirection movingDirection) {
        return movingDirection == RIGHT;
      }
    };

    public abstract boolean isOppositeOf(MovingDirection movingDirection);
  }

  private List<Element> elements = new ArrayList<>();

  {
    elements.addAll(Arrays.asList(
      new Element(new Position(4, 4)),
      new Element(new Position(5, 4)),
      new Element(new Position(6, 4))));
  }

  public List<Element> getElements() {
    return elements;
  }
}
