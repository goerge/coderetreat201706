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
