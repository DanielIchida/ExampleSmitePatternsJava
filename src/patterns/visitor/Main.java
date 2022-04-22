package patterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Warrior w1 = new Warrior();
        Warrior w2 = new Warrior();

        Wizard wz1 = new Wizard();
        Wizard wz2 = new Wizard();

        wz1.setLevelMagic(3);
        wz2.setLevelMagic(7);

        List<ICharacter> characters = new ArrayList<>();
        characters.add(w1);
        characters.add(w2);
        characters.add(wz1);
        characters.add(wz2);

        IVisitor visitorWeapon = new EquipWeapon();
        visitorWeapon.visit(characters);

        IVisitor visitorSpell = new EquipSpell();
        visitorSpell.visit(characters);

        System.out.println("Weapon warrior 1 " + w1.getWeapon());
        System.out.println("Weapon warrior 2 " + w2.getWeapon());
        System.out.println("Weapon wizard 1 " + wz1.getWeapon());
        System.out.println("Weapon wizard 2 " + wz2.getWeapon());

        System.out.println("Spell wizard 1 "+wz1.getSpell());
        System.out.println("Spell wizard 2 "+wz2.getSpell());

    }
}
