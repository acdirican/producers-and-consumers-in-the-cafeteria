package multithreading.acdirican.cafeteria;

/**
 * This projects aims to exemplify the producer-consumer problem in a cafeteria scenario using monitors (synchronized).
 * 
 * @author Ahmet Cengizhan Dirican
 * @see https://github.com/acdirican
 *
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cafeteria cafeteria =  new Cafeteria();
        cafeteria.init();
    }
}
