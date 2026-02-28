public class j003_math_basics{
    @SuppressWarnings("unused")
    public static void main(String[] args){
        // Java'daki Math class'inda bircok method var.
        System.out.println(Math.min(10, 20));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.abs(-4));
        System.out.println(Math.pow(3, 4));
        System.out.println(Math.ceil(16.1));

        int randomNum = (int)(Math.random() * 101); // 0 to 100
        System.out.println(randomNum);
    }
}