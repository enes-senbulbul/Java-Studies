public class j304_Iterations3{
    @SuppressWarnings("unused")
    public static void main(String[] args){
        
        // Classic Continue Filtering
        System.out.print("Odd Numbers (Even Numbers Skipped): ");
        for(int i=1; i<=10; i++){
            if(i % 2 == 0) continue;
            System.out.println(i + " ");
        } System.out.println(""); // Insert a new line
    
        // Labeled Break (Early exit on Matrix)
        int[][] matrix = {{12,5,8}, {9,42,1}, {7,3,19}};
        int targetElement = 42;
        boolean found = false;
        
        disDongu: //  En distaki donguye disDongu adinda bir etiket veriyoruz.
        for(int satir = 0; satir < matrix.length; satir++){
            for(int sutun = 0; sutun < matrix[satir].length; sutun++){
                if(matrix[satir][sutun] == targetElement){
                    System.out.println("Hedef "+targetElement+", ["+satir+"]["+sutun+"] konumunda bulundu.");
                    found = true;
                    break disDongu;
                    // sadece break; yazsaydık satir dongusu donmeye devam ederdi.
                    // break disDongu; yazarak CPU'yu gereksiz arama yapmaktan kurtariyoruz.
                }
            }
        }
    }
} 