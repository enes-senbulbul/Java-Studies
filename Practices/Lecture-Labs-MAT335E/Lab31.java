class Employee{
    private String essn;
    private double pricebyHour;
    private int workingYear;
    private boolean isRetired;

    public Employee(String essn, int workingYear, double pricebyHour, boolean isRetired){
        this.workingYear = workingYear;
        this.pricebyHour = pricebyHour;
        this.essn = essn;
        this.isRetired = isRetired;
    }

    public int getWorkingYear(){
        return this.workingYear;
    }
    public boolean getIsRetired(){
        return this.isRetired;
    }
    public void setIsRetired(boolean isRetired){
        this.isRetired = isRetired;
    }
    public void setWorkingYear(int workingYear){
        this.workingYear = workingYear;
        Retiring();
    }
    public boolean deserveBonus(){
        if(workingYear >= 10 && !isRetired) return true;
        else return false;
    }
    public double calculateSalary(int workingHour, int workingDays){
        return pricebyHour*workingHour*workingDays;
    }
    public void Retiring(){
        if(workingYear >= 20 && !isRetired) isRetired = true;
    }
}

public class Lab31{
    public static void main(String[] args){

        Employee calisan = new Employee("7777", 14, 10, false);
        boolean bonus = calisan.deserveBonus();
        calisan.setWorkingYear(21);
        System.out.println("Is retired: "+calisan.getIsRetired());
        
    }
}