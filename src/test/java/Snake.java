class Snake {
  private MovingDirection movingDirection;

  void setMovingDirection(MovingDirection movingDirection) {
    if (movingDirection.isOppositeOf(this.movingDirection)) {
      throw new IllegalStateException();
    }
    this.movingDirection = movingDirection;
  }

  MovingDirection getMovingDirection() {
    return movingDirection;
  }

  private Elements elements = new Elements();

  {
    elements.setHead(new Position(Column.FOUR, Row.FOUR));
    elements.addElementAt(CardinalDirection.EAST);
    elements.addElementAt(CardinalDirection.EAST);
  }

  Elements getElements() {
    return elements;
  }
}
