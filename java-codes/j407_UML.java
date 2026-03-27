/* 
   TASARLANAN UML DİYAGRAMI:
   -----------------------------------------
   |                 Account               | -> Üst Bölme (Sınıf Adı)
   -----------------------------------------
   | - name: String                        | -> Orta Bölme (Private Nitelikler)
   | - balance: double                     |
   -----------------------------------------
   | <<constructor>> Account(name: String, balance: double) | -> Alt Bölme (Operasyonlar)
   | + deposit(depositAmount: double): void| 
   | + getBalance(): double                |
   | + getName(): String                   |
   -----------------------------------------
*/

public class Account{
    
    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public void depositAmount(double depositAmount){
        if(depositAmount >= 0.0){
            balance = balance + depositAmount;
        }
    }

    public double getBalance(){
        return balance;
    }

    public String getName(){
        return name;
    }
}



public class j407_UML{
    public static void main(){

    }
} 