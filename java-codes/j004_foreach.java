public class j004_foreach{
    public static void main(String[] args){

    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

    for(String car : cars){
        System.out.println(car);
    }

    // Accessing array elements 
    cars[0] = "Opel";
    System.out.println(cars[0]);

    // Multidimensional Arrays
    int[][] numbers = {{1,4,2}, {3,6,8,5,2}};

    for(int row=0; row<numbers.length ; row++){
        for(int col=0; col<numbers[row].length ;col++){
            System.out.println("numbers["+ row +"]["+ col +"]=" + numbers[row][col]);
        }
    }

    // using for-each loop or same task
    for(int[] row : numbers){
        for(int num : row){
            System.out.println(num);
        }
    }
    }
}
