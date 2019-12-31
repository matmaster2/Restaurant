package food_ordering_system;

import food_ordering_system.tasks.OrderManager;

public class Main {

    public static void main(String[] args) {
        new OrderManager().startOrdering();
    }
}
