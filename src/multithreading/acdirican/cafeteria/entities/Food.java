package multithreading.acdirican.cafeteria.entities;

/**
 * The class represents a food that is produced by {@link Cooker} and consumed by {@link Student}
 * 
 * @author Ahmet Cengizhan Dirican
 * @see https://github.com/acdirican
 *
 */
public abstract class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

	@Override
	public String toString() {
		return "(" + name + ")";
	}
    
     
    
}
