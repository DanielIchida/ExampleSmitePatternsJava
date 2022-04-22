package patterns.composite;

public class Team extends Node{

    public Team(String name, Node parent){
         this.setName(name);
         this.setTypeNode(Node.TEAM);
         this.setParent(parent);
    }

    @Override
    public void show() {
        System.out.println("Team "+this.getName());
    }
}
