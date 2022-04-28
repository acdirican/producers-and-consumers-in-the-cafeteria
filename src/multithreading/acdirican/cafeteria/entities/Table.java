package multithreading.acdirican.cafeteria.entities;

import java.util.ArrayList;

/**
 * The table where foods are placed by Cookers and taken by Students.  * 
 * It is the common resource that is shared by producers and consumers, and where the synchronization problems occur.
 * 
 * @author Ahmet Cengizhan Dirican
 * @see https://github.com/acdirican
 *
 */

public class Table extends ArrayList<Food> {
    private int capacity ;
    public Table(int capacity){
        this.capacity = capacity;
    }

    public boolean add(Food food){
        if (this.size() == capacity){
            throw  new RuntimeException("Table is full.");
        }
        return super.add(food);
    }

    public boolean isFull() {
        return this.size() == capacity;
    }
}
