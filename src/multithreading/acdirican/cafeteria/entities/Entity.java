package multithreading.acdirican.cafeteria.entities;

/**
 * Parent class for producer {@link Cooker} and consumers {@link Student} threads.
 */
public class Entity extends Thread{
    protected final Table table;

    public Entity(Table table, String name) {
        this.table = table;
        this.setName(name);
    }
}
