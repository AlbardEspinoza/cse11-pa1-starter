import tester.*;

class DesignRecipeExamples {

    int getPerimeter1 = this.perimeter(9, 7); // expected = 63
    int getPerimeter2 = this.perimeter(3, 12); // expected = 36
    int getPerimeter3 = this.perimeter(-2, 3); // expected = 0
    int getBorderArea1 = this.borderArea(4, 2, 3, 7); // expected = 13
    int getBorderArea2 = this.borderArea(12, 12, 3, 19);  // expected = 87
    int getBorderArea3 = this.borderArea(-3, 4, 5, -8); // expected = 0
    int getFahrenheit1 = this.fahrenheitToCelsius(32); // expected = 0
    int getFahrenheit2 = this.fahrenheitToCelsius(91); // expected = 32
    int getFahrenheit3 = this.fahrenheitToCelsius(-18); // expected = -27
    int getTotalInches1 = this.feetAndInchesToTotalInches(6, 0); // expected = 72
    int getTotalInches2 = this.feetAndInchesToTotalInches(3, 13); // expected = 49
    int getGetTotalInches3 = this.feetAndInchesToTotalInches(-1, 4); // expected = 0

    /**
     * This method takes two parameters, base and height of a rectangle, as ints
     * and returns an int that stores the resulting area of multiplying the
     * parameters.
     * Note: it can only take positive arguments.
     *
     * @param base of rectangle
     * @param height of rectangle
     * @return perimeter of rectangle
     */
    int perimeter(int base, int height) {
        int result = 0;
        if (base <= 0 || height <= 0) {
            System.out.println("Arguments must be positive.\n");
        } else {
            result = base * height;
        }
        return result;
    }

    /**
     * This method takes 4 parameters, the base and height of two rectangles, as ints
     * and returns an int that stores the resulting area that's the difference
     * between the
     * two areas of both rectangles.
     * Note: it can only take positive arguments.
     *
     * @param base1 base of first rectangle
     * @param height1 height of first rectangle
     * @param base2 base of second rectangle
     * @param height2 height of second rectangle
     * @return difference between the areas of both rectangles
     */
    int borderArea(int base1, int height1, int base2, int height2) {
        int result = 0;
        if (base1 <= 0 || height1 <= 0 || base2 <= 0 || height2 <= 0) {
            System.out.println("Arguments must be positive.\n");
        } else {
            int area1 = base1 * height1;
            int area2 = base2 * height2;
            if (area1 >= area2) {
                result = area1 - area2;
            } else {
                result = area2 - area1;
            }
        }
        return result;
    }


    /**
     * This method takes an int, degrees Fahrenheit value, and
     * returns the equivalent value of degrees Celsius.
     *
     * @param fahrenheit degrees to convert to degrees Celsius
     * @return the equivalent value of Fahrenheit degrees to degrees Celsius
     */
    int fahrenheitToCelsius(int fahrenheit) {
        return (int) ((fahrenheit - 32) / 1.8);
    }

    /**
     * This method converts the parameters feet and inches
     * into the total number of inches and return the result.
     * Note: it only accepts non-negative values for both parameters.
     * If a negative value is received then it will automatically
     * return 0.
     *
     * @param feet integer number of feet
     * @param inches integer number of inches
     * @return total number of inches
     */
    int feetAndInchesToTotalInches(int feet, int inches) {
        int totalInches = 0;
        if (feet >= 0 && inches >= 0) {
            totalInches = feet * 12 + inches;
        }
        return totalInches;
    }
}
