package multithreading.acdirican.cafeteria.entities;

/**
 * The consumer class that eats or consumes a {@link Food}.
 * 
 * @author Ahmet Cengizhan Dirican
 * @see https://github.com/acdirican
 *
 */
public class Student extends Entity {
    private  Food myfood;
    public Student(Table table, String name) {
    	super(table, name);
    }

	public void eat() throws InterruptedException {
		while (true) {
			synchronized (table) {
				while (table.isEmpty()) {
					table.wait();
				}
				myfood = table.remove(0);
				table.notify();
			}
			System.out.println("->" + getName() + " had " + myfood.getName());
			Thread.sleep(500);
			myfood = null;
		}
	}


    public void run(){
        try {
            eat();
        } catch (InterruptedException e) {
            System.out.println();
        }
    }

}
