package de.gurkenlabs.litiengine.environment.tilemap;

import java.awt.geom.Point2D;

import de.gurkenlabs.litiengine.entities.Direction;
import de.gurkenlabs.litiengine.entities.Entity;

public class Spawnpoint extends Entity {
  private Direction direction;
  private String spawnType;

  public Spawnpoint(int mapId, Point2D point) {
    super(mapId);
    this.setLocation(point);
  }

  public Spawnpoint(int mapId, Point2D point, Direction direction) {
    this(mapId, point);
    this.setDirection(direction);
  }

  public Direction getDirection() {
    return direction;
  }

  public void setDirection(Direction direction) {
    this.direction = direction;
  }

  public String getSpawnType() {
    return spawnType;
  }

  public void setSpawnType(String spawnType) {
    this.spawnType = spawnType;
  }
}