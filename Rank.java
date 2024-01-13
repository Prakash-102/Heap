import java.util.*;

public class Rank {

    static class student implements Comparable<student> {
        String name;
        int rank;

        public student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @override
        public int compareTo(student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String args[]) {
        PriorityQueue<student> pq = new PriorityQueue<>();
        pq.add(new student("A", 4));
        pq.add(new student("B", 12));
        pq.add(new student("C", 9));
        pq.add(new student("D", 7));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();
        }
    }
}
