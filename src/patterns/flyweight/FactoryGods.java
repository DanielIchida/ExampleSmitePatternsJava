package patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FactoryGods {

    private final List<IGods> gods;

    public FactoryGods() {
        this.gods = new ArrayList<>();
    }

    public IGods getGods(String name,TypeGods typeGods){
         for (IGods god : this.gods){
             if(god.getName().equals(name) && god.getTypeGods().equals(typeGods)){
                System.out.println("already exists gods "+god.getName());
                return god;
             }
         }
         System.out.println("creating a new god "+name);
         IGods god = new Gods(name,typeGods);
         this.gods.add(god);
         return god;
    }
}
