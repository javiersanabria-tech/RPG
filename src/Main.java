public class Main{
    public static void main(String[] args) {
        weaponBag add = new weaponBag();
        add.addItem("WEAPONBAG","BroadSword","Weapon", 2, 10);
        add.addItem("WEAPONBAG","ShortSword","Weapon",  1.5, 7);
        add.addItem("WEAPONBAG","Zweihander","Weapon", 5, 15);
        add.addItem("WEAPONBAG","Flamberge","Weapon", 5.4,18);
        add.addItem("WEAPONBAG","Claymore","Weapon", 5.5,19);
        add.addItem("WEAPONBAG","Rapier","Weapon", 1.2, 6);
        add.addItem("WEAPONBAG","Estoc","Weapon", 4.5, 13);
        add.open();
        itemBag add2 = new itemBag();
        add2.addItem("ITEMBAG","SmallHealthPotion","Healing",0.2, 50); //should continue but im too lazy rn
        add2.open();






        }

    }