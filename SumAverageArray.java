// Qn. 5 Sum and Average of Elements in Array.
class SumAverageArray
{
    int elements[] = {2, 7, 9, 11, 14, 20};
    int sum = 0;
    double average;

    // Constructor to calculate sum and average
    public SumAverageArray() {

        for (int i = 0; i < elements.length; i++) {
            sum += elements[i];
        }

        average = (double) sum / elements.length;
    }

    public void display() {
        System.out.println("The sum of elements in array is " + sum);
        System.out.println("The average of elements in array is " + average);
    }
}

class CalculationSA {
    public static void main(String[] args) {
        SumAverageArray Obj = new SumAverageArray();
        Obj.display();
    }
}
