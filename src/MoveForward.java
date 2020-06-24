package moveForward;

import executable.Executable;
import movable.Movable;

public class MoveForward implements Executable {
    public boolean preCheckAction(Object _obj){
        return _obj instanceof Movable;
    }

    public void execAction(Object _obj){
        if (preCheckAction(_obj)){
            ((Movable) _obj).setPosition(((Movable) _obj).getVelocity().getNewEntityPosition(((Movable) _obj).getPosition()));
        }
    }

    public void rollbackAction(Object _obj){

    }
}
