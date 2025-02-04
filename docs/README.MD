## Boundary Cases for Fahrenheit to Celsius Conversion

| Test Case Name                  | Temperature in Fahrenheit | Expected Temperature in Celsius | Explanation                                                                 |
|---------------------------------|---------------------------|----------------------------------|-----------------------------------------------------------------------------|
| Room Temperature                | 68                        | 20                               | A typical room temperature in Celsius.                                     |
| Freezing Point of Water         | 32                        | 0                                | The temperature at which water freezes in Celsius.                         |
| Boiling Point of Water          | 212                       | 100                              | The temperature at which water boils in Celsius.                           |
| Negative Temperature            | -40                       | -40                              | The point where Fahrenheit and Celsius scales intersect.                   |
| Absolute Zero in Fahrenheit     | -459.67                   | -273.15                          | The lowest possible temperature in Fahrenheit, equivalent to 0 Kelvin.     |
| Extreme High Temperature        | 1000                      | 537.78                           | An extremely high temperature to test upper bounds.                        |
| Non-Numeric Input               | "abc"                     | Error                            | Input validation for non-numeric values.                                   |
| Empty Input                     | ""                        | Error                            | Input validation for empty or null input.                                  |
| Below Absolute Zero             | -500                      | Error                            | Input validation for temperatures below absolute zero (invalid physically).|