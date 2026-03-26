public abstract class Items {
    protected String name;
    protected String description;
    protected Double weight;
    protected Boolean isUseable;
    protected String itemType;
    public Items(String name, String description, Double weight, Boolean isUseable, String itemType){
        this.name=name;
        this.description=description;
        this.weight=weight;
        this.isUseable=isUseable;
        this.itemType=itemType;
    }
    public void itemStats(){
        System.out.println("This is a "+name+" "+description+" It weighs "+weight+"lbs. Can be used? : "+isUseable+". It is a "+itemType);
    }
    public void useItem(){
        if(isUseable==true) {
            System.out.println("You use the "+name);

        }
    }
}


class mapOfIsland extends Items{
    public mapOfIsland(){
        super("Island Map","Map of an Island near the US Virgin Islands",0.2,false,"Key Item" );
    }
}

