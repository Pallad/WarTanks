package warTanks;

import tank.Tank;
import entityPosition.EntityPosition;
import velocity.Velocity;

import moveForward.MoveForward;
import moveTurnLeft.MoveTurnLeft;
import moveTurnRight.MoveTurnRight;

import static java.lang.System.currentTimeMillis;
import static java.lang.Thread.sleep;

public class WarTanks {


    public static void main(String []args){
        // Respawn tanks
        Tank ta = new Tank("t34");
        ta.setPosition(new EntityPosition(0f, 0f));
        ta.setVelocity(new Velocity(0f, 5f));

        Tank tb = new Tank("Tiger");
        tb.setPosition(new EntityPosition(10f, 10f));
        tb.setVelocity(new Velocity(Math.PI*3/2f, 5f));

        // Allow moving command
        MoveForward moveForward   = new MoveForward();
        MoveTurnLeft moveTurnLeft = new MoveTurnLeft();
        MoveTurnRight moveTurnRight = new MoveTurnRight();

        // Global game params
        final int FPS   = 25;
        long start_time = 0;
        long end_time   = 0;
        long delay      = 0;

        for (int i = 0; i < 5; i++) {
            start_time = currentTimeMillis();
            System.out.println(ta.getPosition());
            System.out.println(tb.getPosition());

            moveForward.execAction(ta);
            moveForward.execAction(tb);
            moveTurnLeft.execAction(ta);
            moveTurnRight.execAction(tb);

            end_time = currentTimeMillis();

            delay = 1000/FPS - (end_time - start_time);

            if (delay > 0){
                try {
                    sleep(delay);
                } catch (InterruptedException ex) {

                }
            }
        }
    }
}
