package creational.objectpool;

import java.util.Enumeration;
import java.util.Hashtable;

public abstract class ObjectPool {
    private long expirationTime;
    private Hashtable locked, unlocked;

    abstract Object create();

    abstract boolean validate(PoolObject o);

    abstract void expire(PoolObject o);

    ObjectPool() {
        expirationTime = 10000; // 10 seconds
        locked = new Hashtable();
        unlocked = new Hashtable();
    }

    synchronized PoolObject checkOut() {

        long now = System.currentTimeMillis();
        PoolObject o;
        if (unlocked.size() > 0) {
            Enumeration e = unlocked.keys();
            while (e.hasMoreElements()) {
                o = (PoolObject) e.nextElement();
                if ((now - ((Long) unlocked.get(o)).longValue()) > expirationTime) {
                    // object has expired
                    System.out.println("Object Expired: " + o.toString());
                    unlocked.remove(o);
                    expire(o);
                    o = null;
                } else {
                    if (validate(o)) {
                        System.out.println("Removing Object from pool: "
                                + o.toString());
                        unlocked.remove(o);
                        locked.put(o, new Long(now));
                        return (o);
                    } else {
                        unlocked.remove(o);
                        expire(o);
                        o = null;
                    }
                }
            }
        }
        o = (PoolObject) create();
        System.out.println("no objects available, creating a new one: " + o);
        locked.put(o, new Long(now));
        return (o);
    }

    synchronized void checkIn(Object o) {
        System.out.println("Checking in: " + o.toString());
        locked.remove(o);
        unlocked.put(o, new Long(System.currentTimeMillis()));
    }

}
