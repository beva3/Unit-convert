#include <stdio.h>
typedef enum {
    USD = 0,
    AR = 1,
    RS = 2 
}CURENCY;
double curencyConvert(double amount, int from, int to)
{
    double result = 2;

    double conversion[3][3] = {
        {1.00000, 4500.0, 83.000},   // USD to USD, AR, RS
        {0.00022, 1.0000, 0.0185},  // AR to USD, AR, RS
        {0.01200, 54.000, 1.0000}   // RS to USD, AR, RS
    };

    result = amount * conversion[from][to];
    
    return result;
}

int main()
{
    double amount = 100.0;
    printf("%g USD to AR: %g\n", amount, curencyConvert(amount, USD, AR));
    return 0;
}