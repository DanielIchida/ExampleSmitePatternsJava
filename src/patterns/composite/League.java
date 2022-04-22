package patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class League extends Node{

    List<Node> nodes = new ArrayList<>();

    public League(String name,Node parent){
        this.setTypeNode(Node.LEAGUE);
        this.setName(name);
        this.setParent(parent);
    }

    public void addNode(Node node){
        nodes.add(node);
    }

    public void deleteNode(Node node){
        nodes.remove(node);
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public Node getNode(int position){
        return nodes.get(position);
    }

    public void showParents(){
         for (Node node: nodes){
             System.out.println("Node parent of " + node.getName() + " is "+ node.getParent().getName());
             if(node.getTypeNode() == Node.LEAGUE){
                 ((League)node).showParents();
             }
         }
    }

    @Override
    public void show() {
        System.out.println("List of League "+this.getName());
        for (Node node: nodes){
            node.show();
        }
    }
}
