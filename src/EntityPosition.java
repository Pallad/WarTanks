package entityPosition;

import static java.lang.String.format;

public class EntityPosition {
    double posX;
    double posY;

    public void assign(EntityPosition _pos){
        this.posX = _pos.posX;
        this.posY = _pos.posY;
    }

    public double getX(){
        return this.posX;
    }

    public double getY(){
        return this.posY;
    }

    public String toString(){
        return format("posX:{%f}; posY:{%f}", this.posX, this.posY);
    }

    public EntityPosition(double _x, double _y){
        this.posX = _x;
        this.posY = _y;
    }
}
