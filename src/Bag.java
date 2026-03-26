import java.util.HashMap;
public abstract class Bag{
    protected int slots;
    protected int availability;
    protected boolean Fullness=false;
    protected double weight;
    HashMap<Integer,String> Bag1 = new HashMap<>();
    HashMap<String,Double> Bag2 = new HashMap<>();
    public Bag(){
        slots=slots;
        availability=availability;
        Fullness=Fullness;
        weight=weight;

    }
    public void addItem(String bagName, String itemName,String itemType, double itemWeight, int itemValue) { //item value shows values of item(atk, def, heal amount, etc.)
        if (availability > 0) {
            int slot = -1;
            for (int i = 1; i <= slots; i++) {
                if (!Bag1.containsKey(i)) {
                    slot = i;
                    break;
                }
            }
            Bag1.put(slot, itemName);
            Bag2.put(itemName, itemWeight);
            availability--;
            weight += itemWeight;
            if (availability == 0) {
                Fullness = true;
            }
            System.out.println(itemName + " WAS ADDED TO " + bagName + "! " + availability + " slots remaining.");
        } else {
            System.out.println("Too Many Items");
        }
    }
    public void open(){
        if (slots==availability) {
            System.out.println("Opened Bag");
        }else{
            System.out.println(Bag1+" "+Bag2);
        }
    }
    public void close(){
        System.out.println("Closed Bag");
    }
    public void bagStats(){
        System.out.println("Bag Stats: "+slots+" slots, "+availability+" slots available, full bag? : "+Fullness+", "+weight+"lbs");
    }


    public void  removeItem(int slotNumber, String itemName) {
        if (Bag1.containsKey(slotNumber) && Bag1.get(slotNumber).equals(itemName)) {
            double itemWeight = Bag2.get(itemName);
            Bag1.remove(slotNumber);
            Bag2.remove(itemName);
            availability++;
            weight -= itemWeight;
            Fullness = false;
            System.out.println(itemName + " removed from slot " + slotNumber + "!");
        } else {
            System.out.println("Item not found in specified slot.");
        }
    }

    public void emptyBag(){
        Bag1.clear();
        Bag2.clear();
        availability=slots;
        Fullness=false;
        weight=0d;
        System.out.println("Bag is empty!");
        System.out.println("New Bag Stats: "+slots+" slots, "+availability+" slots available, full bag? : "+Fullness+", "+weight+"lbs");
    }
}
//Different Bag types

class armorBag extends Bag{
    public armorBag(){
        slots=20;
        availability=20;
        Fullness=false;
        weight=0d;
    }
}


class weaponBag extends Bag{
    public weaponBag(){
        slots=15;
        availability=15;
        Fullness=false;
        weight=0d;
    }
}


class itemBag extends Bag{
    public itemBag(){
        slots=25;
        availability=25;
        Fullness=false;
        weight=0d;
    }
}


class keyItemBag extends Bag{
    public keyItemBag(){
        slots=50;
        availability=50;
        Fullness=false;
        weight=0d;
    }
}
