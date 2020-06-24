package moveTurnRight;

import executable.Executable;
import movable.Movable;

public class MoveTurnRight implements Executable {

    public boolean preCheckAction(Object _obj){
        return _obj instanceof Movable;
    }

    public void execAction(Object _obj){
        if (preCheckAction(_obj)){
            ((movable.Movable) _obj).getVelocity().setDirection(((movable.Movable) _obj).getVelocity().getDirection() - Math.PI/2);
        }
    }

    public void rollbackAction(Object _obj){

    }
}
