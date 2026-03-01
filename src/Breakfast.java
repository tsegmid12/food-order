import java.util.ArrayList;

public class Breakfast extends Food{
    private ArrayList<Item> breakfast = new ArrayList<Item>();
    private final int[] id = { 1, 2, 3, 4, 5 };
    private final String[] names = {"Fried egg", "Miso Soup", "Smoothie", "Baked Sausage", "Waffles"};
    private final int[] prices = {10000, 15000, 20000, 12000, 15000};

    public void makeFood(){
        for(int i=0;i<names.length;i++){
            breakfast.add(new Item(id[i], names[i], prices[i]));
        }
    }

    public ArrayList<Item> getFood(){
        return breakfast;
    }

    public int priceOfFood(int id){
        for(Item item : breakfast)
            if(item.getId() == id)
                return item.getPrice();
        return -1;
    }

    public void display(){
        for(Item item : breakfast){
            System.out.println(item.getId()+"."+item.getName()+" = "+item.getPrice());
        }
    }

    public Item getFood(int id){
        for(Item item : breakfast)
            if(item.getId()==id)
                return item;
        return null;
    }

    public void addFood(Item item){
        breakfast.add(item);
    }

    public int getLastFoodId(){
        Item item = breakfast.getLast();
        return item.getId();
    }
}
