import java.util.LinkedList;

/**
 * Baseball_Game.
 *
 * @author Vladislav Sidlyarevich
 * @since 25.07.2023
 */
class Baseball_Game {

    public int calPoints(String[] operations) {
        LinkedList<Integer> queue = new LinkedList<>();

        for (String operation : operations) {
            switch (operation) {
                case "+" -> queue.addFirst(queue.get(1) + queue.getFirst());
                case "D" -> queue.addFirst(queue.getFirst() * 2);
                case "C" -> queue.removeFirst();
                default -> queue.addFirst(Integer.valueOf(operation));
            }
        }

        return queue.stream().reduce(0, Integer::sum);
    }
}
