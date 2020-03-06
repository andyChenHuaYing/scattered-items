package org.oscar.algorithm.greedy;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author huaying
 * @version 0.0.1
 * @since 2020/1/13
 */
public class MinTotalServerTime {

    private static class Person{
        private int serverTime;

        private String name;

        public Person(int serverTime, String name) {
            this.serverTime = serverTime;
            this.name = name;
        }

        public int getServerTime() {
            return serverTime;
        }

        public void setServerTime(int serverTime) {
            this.serverTime = serverTime;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "serverTime=" + serverTime +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Person> queue = new PriorityQueue<>(Comparator.comparingInt(Person::getServerTime));
        queue.add(new Person(3, "oscar"));
        queue.add(new Person(5, "star"));
        queue.add(new Person(1, "sweet"));

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

}
