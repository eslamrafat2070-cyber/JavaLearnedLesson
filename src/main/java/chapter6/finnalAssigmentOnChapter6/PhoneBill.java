package chapter6.finnalAssigmentOnChapter6;

public class PhoneBill {
    private  int id;
    private double baseCost;
    private int allottedMinutes;
    private   int usedMinutes;

    private  final double  Tax = 0.15;
    private  final double OverageFeePerMinute = 0.25;

    public PhoneBill(int id, int baseCost, int allottedMinutes, int usedMinutes) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.usedMinutes = usedMinutes;
    }
    public PhoneBill(int id) {
        this(id, 20, 60, 60); // استدعاء التاني
    }

    public  PhoneBill()
    {
        this(0,20,60,60); // استدعاء التاني
    }
    public  int getId() {
        return id;
    }
    public int getAllottedMinutes() {
        return allottedMinutes;
    }
    public int getUsedMinutes() {
        return usedMinutes; }

    public double getBaseCost() {
        return baseCost;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }
    public void setAllottedMinutes(int allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }
    public void setUsedMinutes(int usedMinutes) {
        this.usedMinutes = usedMinutes;
    }
    public double calculateRemainingMuintes(){
        if (usedMinutes <= allottedMinutes) {
            return 0;
        } else {
            return usedMinutes - allottedMinutes;
        }
    }
    public double calculateOverageFee(){

        return usedMinutes * OverageFeePerMinute;
    }
    public double calculateTax(){
        return (baseCost + calculateOverageFee()) * Tax;
    }
    public double calculateTotal(){
        return baseCost + calculateOverageFee() + calculateTax();
    }
    public void printPhoneBillStatement(){
        System.out.println("Phone Bill Statement for ID: " + id);
        System.out.println("Base Cost: $" + baseCost);
        System.out.println("Allotted Minutes: " + allottedMinutes);
        System.out.println("Used Minutes: " + usedMinutes);
        System.out.println("Overage Fee: $" + calculateOverageFee());
        System.out.println("Tax: $" + calculateTax());
        System.out.println("Total Amount: $" + calculateTotal());
    }
}




