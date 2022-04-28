package multithreading.acdirican.cafeteria.entities;

/**
 * The producer class that cooks or produce a {@link Food}.
 * 
 * @author Ahmet Cengizhan Dirican
 * @see https://github.com/acdirican
 *
 */
public class Cooker extends Entity {
	private final Food food;

	public Cooker(Table table, Food food, String name) {
		super(table, name);
		this.food = food;
	}

	public void cook() throws InterruptedException {
		while (!isInterrupted()) {
			synchronized (table) {
				while (table.isFull()) {
					table.wait();
				}
				table.add(food);
				table.notify();
			}
			System.out.println("Cooker " + getName() + " cooked " + food.getName() + ".");
			Thread.sleep(500);
		}
	}

	public void run() {
		try {
			cook();
		} catch (InterruptedException e) {
			System.out.println();
		}
	}
}
