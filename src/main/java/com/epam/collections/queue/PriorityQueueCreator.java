package com.epam.collections.queue;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>(Collections.reverseOrder());

        priorityQueue1.addAll(firstList);
        priorityQueue1.addAll(secondList);

        return priorityQueue1;
    }
}
