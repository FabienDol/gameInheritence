import com.superjeu.*;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Human humain1 = new Human("Faramir", 30 , 50 , 100, 50, 1.0, 0);
        Tree tree = new Tree("Ent1", 10, 20, 100, 30, 2.0);
        Dragon dragon = new Dragon("Smaug", 10, 20, 100, 20, 2.0, humain1, 50, 10);
        House house = new House(50000, humain1, Material.WOOD);
        Wolf loup1 = new Wolf("loup1", 10, 20, 50, 70, 5, humain1);
        Orc orc1 = new Orc("orc1", 23, 56, 200, 65, 3.0, 10);

        System.out.println(humain1);
        System.out.println(tree);
        System.out.println(dragon);
        System.out.println(house);
        System.out.println(loup1);

        ArrayList<Being> beings = new ArrayList<>();
        beings.add(humain1);
        beings.add(tree);
        beings.add(dragon);
        beings.add(loup1);
        beings.add(orc1);

        System.out.println("Non trié : " + beings);
        Collections.sort(beings);
        System.out.println("Trié par points de santé : " + beings);

        tree.receiveDamage(10);
        humain1.receiveDamage(30);
        dragon.receiveDamage(50);
        loup1.receiveDamage(5);
        orc1.receiveDamage(12);

        System.out.println("Résistance de la maison de " + house.getOwner() + " : " + house.getMaterial().getResistance());

    }
}
