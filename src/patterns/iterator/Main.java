package patterns.iterator;

public class Main {
    public static void main(String[] args) {
          AggregateConcrete aggregateConcrete = new AggregateConcrete();
          Iterator iterator = aggregateConcrete.getIterator();
          String first = (String) iterator.first();
          System.out.println(first);
          iterator.next();
          iterator.next();
          String current = (String) iterator.current();
          System.out.println(current);
          iterator.first();
          while (iterator.isMore()){
              System.out.println(iterator.next());
          }
    }
}
