package patterns.prototype;

public class AttackMagic extends Skill{

    public final static String NAME = AttackMagic.class.getName();
    public final static String DESCRIPTION = "Attack for Gods Magic";
    public final static int POINTS = 20;

    public AttackMagic() {
        super(NAME,DESCRIPTION,POINTS);
    }
}
