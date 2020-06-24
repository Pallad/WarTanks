package movable;

import entityPosition.EntityPosition;
import velocity.Velocity;

public interface Movable {
    EntityPosition getPosition();
    void setPosition(EntityPosition pos);

    Velocity getVelocity();
    void setVelocity(Velocity speed);
}
