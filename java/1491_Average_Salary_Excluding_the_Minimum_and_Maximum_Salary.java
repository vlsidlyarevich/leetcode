import java.util.Arrays;

/**
 * Average_Salary_Excluding_the_Minimum_and_Maximum_Salary.
 *
 * @author Vladislav Sidlyarevich
 * @since 01.08.2023
 */
class Average_Salary_Excluding_the_Minimum_and_Maximum_Salary {

    public double average(int[] salary) {
        Arrays.sort(salary);

        int sum = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
        }
        return (double) sum / (salary.length - 2);
    }
}
