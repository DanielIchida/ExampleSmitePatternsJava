package patterns.prototype;

public class DefendMagic extends Skill{

    public final static String NAME = DefendMagic.class.getName();
    public final static String DESCRIPTION = "Attack for Gods Magic";
    public final static int POINTS = 20;

    public DefendMagic() {
        super(NAME,DESCRIPTION,POINTS);
    }
}
