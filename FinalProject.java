import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
Gokulan Anand
5/13/2019

Program of a fridge

 */
public class FinalProject {
    public static void main(String[] args) throws IOException {


        boolean failed1000 = false;
        boolean failed2000 = false;
        boolean failedexpired = false;
        ArrayList<FridgeItemClass> fridgeitemlist = GetFridgeItems();


        System.out.println("You just bought a new, beautiful Samsung Smart Fridge from IKEA.");
        System.out.println("You have to eat at least 1,000 calories but not exceed 2,000 calories for 5 days. If the food expires, you lose! Make sure you don't run out of food and starve! If you survive all 5 days, you win.");
        System.out.print("\n");
        System.out.println("------------------\n" +
                "|Samsung         |\n" +
                "|           |''| |\n" +
                "|           |__| |\n" +
                "| .--            |\n" +
                "|________________|\n" +
                "|                |\n" +
                "|                |\n" +
                "|                |\n" +
                "|                |\n" +
                "|                |\n" +
                "| .--            |\n" +
                "|                |\n" +
                "|                |\n" +
                "|                |\n" +
                "|                |\n" +
                "------------------\n" +
                "^                ^");
        System.out.print("\n");

        for (int daycounter = 1; daycounter <= 5; daycounter++) {
            DailyFridgeContent(fridgeitemlist,daycounter);
            int dailycalories = 0;
            do {
                Scanner eatorsleep = new Scanner(System.in);
                System.out.println("Do you want to eat or sleep?");
                String taskchoice = eatorsleep.nextLine();
                if (taskchoice.equalsIgnoreCase("eat")) {
                    System.out.println("What do you want to eat?");
                    Scanner whattoeat = new Scanner(System.in);
                    String foodchoice = whattoeat.nextLine();
                    System.out.println("How many do you want to consume?");
                    int foodquantity = whattoeat.nextInt();
                    int itemindex = GetItemIndex(foodchoice, foodquantity,fridgeitemlist);
                    if(itemindex == -1){
                        System.out.println("Your item isn't in the fridge.");
                    }
                    else{
                        FridgeItemClass fridgeitem = fridgeitemlist.get(itemindex);
                        int calorieyoueat = fridgeitem.GetCalories();
                        dailycalories = dailycalories + (foodquantity*calorieyoueat);
                        int itemquantity = fridgeitem.GetQuantity();
                        if(foodquantity > itemquantity){
                            System.out.println("Sorry. We only have " + itemquantity + " left.");
                            foodquantity = itemquantity;
                        }
                        fridgeitem.SetQuantity(itemquantity-foodquantity);
                        fridgeitemlist.set(itemindex,fridgeitem);
                        if(dailycalories > 2000){
                            failed2000 = true;
                            break;
                        }
                        else{
                            System.out.println("So far today, you have consumed " + dailycalories + " calories");
                        }
                    }
                }
                else {
                    break;
                }
            }
            while (true);
            System.out.println();
            System.out.println();
            if (dailycalories < 1000) {
                failed1000 = true;
                System.out.println("You ate less than 1000 calories. You lose...");
                break;
            }
            if(failed2000){
                System.out.println("You ate more than 2000 calories. You lose...");
                break;
            }
            for (int i = 0; i < fridgeitemlist.size(); i++) {
                FridgeItemClass food = fridgeitemlist.get(i);
                int daysleft = food.GetDaysToExpire();
                daysleft--;
                if(daysleft == 0 && food.GetQuantity() != 0){
                    failedexpired = true;
                    System.out.println("The " + food.GetName() + " expired. You lose...");
                    break;
                }
                else{
                    food.SetDaysToExpire(daysleft);
                    fridgeitemlist.set(i,food);
                }

            }

            if(failedexpired){
                break;
            }


            System.out.println("On Day " + daycounter + " , you consumed " + dailycalories + " calories.");
            System.out.println("You have " + (5-daycounter) + " days left");
            System.out.println();

        }
        if(!failed2000 && !failedexpired && !failed1000){
            System.out.println("Congratulations! You won!");
        }
    }


    static ArrayList<FridgeItemClass> GetFridgeItems() throws IOException {
        File fridgefood = new File("C:\\Users\\Gokulan Anand\\IdeaProjects\\BeginningJava\\BeginningJava\\src\\fridgefood");
        Scanner filereader = new Scanner(fridgefood);
        ArrayList chubb = new ArrayList<FridgeItemClass>();

        while (filereader.hasNext()) {
            String line = filereader.nextLine();
            int counter = 0;
            FridgeItemClass fooditem = new FridgeItemClass();
            do {
                int commafinder = line.indexOf(",");
                counter++;
                if (commafinder < 0) {
                    fooditem.SetDaysToExpire(Integer.parseInt(line));
                    break;
                } else {
                    String word = line.substring(0, commafinder);
                    switch (counter) {
                        case 1:
                            fooditem.SetName(word);
                            break;
                        case 2:
                            fooditem.SetQuantity(Integer.parseInt(word));
                            break;
                        case 3:
                            fooditem.SetCalories(Integer.parseInt(word));
                            break;
                    }
                    line = line.substring(commafinder + 1);
                }
            }
            while (true);
            chubb.add(fooditem);
        }
        return chubb;
    }

    static void DailyFridgeContent(ArrayList<FridgeItemClass> fridgeitemlist,int Day) {

        System.out.println("Name     Quantity     Calories     Days Before Expiration");
        for (int i = 0; i < fridgeitemlist.size(); i++) {
            FridgeItemClass item = fridgeitemlist.get(i);
            if(item.GetQuantity() > 0){
                String foodname =item.GetName();
                System.out.print(foodname);
                repeatPrintCharacter(" ",50-foodname.length());
                System.out.println(item.GetQuantity() + "     " + item.GetCalories() + "     " + item.GetDaysToExpire());
            }
        }
    }

    static void repeatPrintCharacter(String character, int times){
        for(int i = 1; i <= times; i++){
            System.out.print(character);
        }
    }
    static int Calorimeter(String name, int quantity, ArrayList<FridgeItemClass> fridgeitemlist) {
        for (int i = 0; i < fridgeitemlist.size(); i++) {
            FridgeItemClass item = fridgeitemlist.get(i);
            if (name.equalsIgnoreCase(item.GetName())) {
                return quantity * item.GetCalories();
            }
        }
        System.out.println("Whatever you said isn't in the fridge.");
        return 0;
    }

    static int GetItemIndex(String name, int quantity, ArrayList<FridgeItemClass> fridgeitemlist) {
        for (int i = 0; i < fridgeitemlist.size(); i++) {
            FridgeItemClass item = fridgeitemlist.get(i);
            if (name.equalsIgnoreCase(item.GetName())) {
                return i;
            }
        }
        return -1;
    }
}