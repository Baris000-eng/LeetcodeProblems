class Solution {
    public double[] convertTemperature(double celsius) {
        double[] kelvinAndFahrenheit = new double[2]; //creating a double array which keeps the fahrenheit and kelvin versions of the temperature provided with celsius unit.
        double kelvin = celsius + 273.15;
        double fahrenheit = (1.80 * celsius) + 32.00;
        kelvinAndFahrenheit[0] = kelvin;
        kelvinAndFahrenheit[1] = fahrenheit;
        return kelvinAndFahrenheit;
    }
}

//You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.

//You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].

//Return the array ans. Answers within 10-5 of the actual answer will be accepted.

//Note that:

//Kelvin = Celsius + 273.15
//Fahrenheit = Celsius * 1.80 + 32.00
