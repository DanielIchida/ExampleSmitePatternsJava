package patterns.composite;

public abstract class Node {

    public static int LEAGUE = 1;
    public static int TEAM = 2;

    protected String name;
    protected int typeNode;
    protected Node parent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTypeNode() {
        return typeNode;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void setTypeNode(int typeNode) {
        this.typeNode = typeNode;
    }

    public abstract void show();
}
