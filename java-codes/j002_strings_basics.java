public class j002_strings_basics{
    @SuppressWarnings("unused")
    public static void main(String[] args){
        String greeting = "Hello";
        int length = greeting.length();
        // Java'da olusturulan bir string aslinda bir nesne oldugundan
        // ... bu string nesnesi uzerinde islemler yapabilmemizi saglayan methodlar da bulundurur.
        System.out.println(length);
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.charAt(0));

    }   
}