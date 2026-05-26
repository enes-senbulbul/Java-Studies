public class j308_Arrays {
    public static void main(String[] args) {
        int[] primes = {2,3,5,7,11}; // Tanımlama ve Initialize etme aynı satırda
        System.out.println("Dizinin kapasitesi: "+primes.length);

        // Ayrı satırda atama yapmak zorundaysak "anonim dizi" yaratmalıyız.
        double[] grades;
        grades = new double[]{90.5, 58.0, 100.0}; //boyut [] içine yazılmaz, otomatik sayılır.
        System.out.println("Ilk not: "+grades[0]);
    }
}
