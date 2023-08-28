public class Harmonic {
    public static void main(String[] args) {
        double[] numbers = {1,2,3,4,5};
        double hsum=0;
        for(double d: numbers)
        {
            hsum+=1/d;
        }
        double hAver= numbers.length/hsum;
        System.out.println(hAver);
    }
}
