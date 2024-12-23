package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        LinkedList<Integer> queue = new LinkedList<>();
        List<Integer> finalList = new ArrayList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            queue.offer(i);
        }

        int index = 0;

        while (!queue.isEmpty()) {
            index = (index + everyDishNumberToEat - 1) % queue.size();

            Integer dish = queue.remove(index);
            finalList.add(dish);
        }

        return finalList;
    }
}
