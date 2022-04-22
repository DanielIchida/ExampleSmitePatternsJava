package patterns.proxy;

public class AttackProxy implements Skill{

    private Attack attack;
    private final String nameAttack;

    public AttackProxy(String nameAttack) {
        this.nameAttack = nameAttack;
    }

    @Override
    public void generate() {
        if(this.attack == null){
            this.attack = new Attack(this.nameAttack);
        }
        this.attack.generate();
    }
}
