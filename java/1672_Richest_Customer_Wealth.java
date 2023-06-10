/**
 * Richest_Customer_Wealth.
 *
 * @author Vladislav Sidlyarevich
 * @since 08.06.2023
 */
class Richest_Customer_Wealth {

    public int maximumWealth(int[][] accounts) {
        var maxWealth = 0;

        for (var customer : accounts) {
            var wealth = 0;

            for (var account : customer)
                wealth += account;

            maxWealth = Math.max(maxWealth, wealth);
        }
        return maxWealth;
    }
}
