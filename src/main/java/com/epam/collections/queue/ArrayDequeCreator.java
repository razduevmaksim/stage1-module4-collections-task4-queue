package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public static ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> finalQueue = new ArrayDeque<>();

        finalQueue.offer(Objects.requireNonNull(firstQueue.poll()));
        finalQueue.offer(Objects.requireNonNull(firstQueue.poll()));
        finalQueue.offer(Objects.requireNonNull(secondQueue.poll()));
        finalQueue.offer(Objects.requireNonNull(secondQueue.poll()));

        while ((!firstQueue.isEmpty() && !secondQueue.isEmpty())) {
            firstQueue.offer(finalQueue.pollLast());
            finalQueue.offer(Objects.requireNonNull(firstQueue.poll()));
            finalQueue.offer(Objects.requireNonNull(firstQueue.poll()));

            secondQueue.offer(finalQueue.pollLast());
            finalQueue.offer(Objects.requireNonNull(secondQueue.poll()));
            finalQueue.offer(Objects.requireNonNull(secondQueue.poll()));
        }

        return finalQueue;
    }
}