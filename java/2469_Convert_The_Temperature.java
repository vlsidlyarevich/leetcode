/**
 * Convert_The_Temperature.
 *
 * @author Vladislav Sidlyarevich
 * @since 05.06.2023
 */
class Convert_The_Temperatures {

    public double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }
}
