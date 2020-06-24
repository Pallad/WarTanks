package tank;

import entityPosition.EntityPosition;
import movable.Movable;
import velocity.Velocity;

public class Tank implements Movable {
    private String nickName;

    EntityPosition pos;
    Velocity       speed;

    public EntityPosition getPosition() {
        return pos;
    }

    public void setPosition(EntityPosition _pos){
        this.pos.assign(_pos);
    }

    public String getNickName(){
        return this.nickName;
    }

    public Velocity getVelocity(){
        return this.speed;
    }

    public void setVelocity(Velocity _speed){
        this.speed.assign(_speed);
    }

    public Tank(String _nickName){
        this.nickName = _nickName;
        this.pos      = new EntityPosition(0, 0);
        this.speed    = new Velocity(0f, 0f);
    }
}
