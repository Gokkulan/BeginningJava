public class FridgeItemClass {
    private String name;
    private int quantity;
    private int calories;
    private int daystoexpire;

    public void SetName(String x){
        name = x;
    }
    public String GetName(){
        return name;
    }
    public void SetQuantity(int x){
        quantity = x;
    }
    public int GetQuantity(){
        return quantity;
    }
    public void SetCalories(int x){
        calories = x;
    }
    public int GetCalories(){
        return calories;
    }
    public void SetDaysToExpire(int x){
        daystoexpire = x;
    }
    public int GetDaysToExpire(){
        return daystoexpire;
    }
}
