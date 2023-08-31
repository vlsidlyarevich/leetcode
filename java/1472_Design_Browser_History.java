import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Design_Browser_History.
 *
 * @author Vladislav Sidlyarevich
 * @since 29.08.2023
 */
class Design_Browser_History {

    class BrowserHistory {

        int currentPointer = 0;
        List<String> history;

        public BrowserHistory(String homepage) {
            this.history = new ArrayList<>();
            history.add(currentPointer, homepage);
        }

        public void visit(String url) {
            history.subList(++currentPointer, history.size()).clear();
            history.add(url);
        }

        public String back(int steps) {
            currentPointer = Math.max(currentPointer - steps, 0);
            return history.get(currentPointer);
        }

        public String forward(int steps) {
            if (currentPointer + steps >= history.size()) currentPointer = history.size() - 1;
            else currentPointer = currentPointer + steps;

            return history.get(currentPointer);
        }
    }
}
