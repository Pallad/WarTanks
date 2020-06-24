package velocity;

import entityPosition.EntityPosition;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Velocity {
    double direction;
    double velocity;

    public void setDirection(double _direction){
        this.direction = _direction;

        if (this.direction < 0){
            while (this.direction < 0) {
                this.direction  = this.direction + 2*Math.PI;
            }
        } else if (_direction > 2*Math.PI) {
            while (this.direction > 2*Math.PI) {
                this.direction  = this.direction - 2*Math.PI;
            }
        }
    }

    public void setVelocity(double _velocity){
        this.velocity = _velocity;
    }

    public double getDirection(){
        return this.direction;
    }

    public double getVelocity(){
        return this.velocity;
    }

    public void assign(Velocity _speed){
        setDirection(_speed.direction);
        this.velocity  = _speed.velocity;
    }

    public Velocity(double _direction, double _velocity){
        setDirection(_direction);
        this.velocity  = _velocity;
    }

    public EntityPosition getNewEntityPosition(EntityPosition _pos){
        return new EntityPosition(_pos.getX() + this.velocity*cos(direction), _pos.getY() + this.velocity*sin(direction));
    }
}
