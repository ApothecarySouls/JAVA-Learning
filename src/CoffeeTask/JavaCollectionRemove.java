package CoffeeTask;

public class CollectionAndIterator {
    public static final Collection<String> C = new ArrayList<>(); static {C.add("Jan"); C.add("Anna"); C.add("Ela");}
    public static void main(String[] args) { System.out.printf("Collection has size of: %s\n", C.size()); Iterator<String> i = C.iterator();
        while (i.hasNext()) {
            String next = i.next(); if(next.endsWith("a")){
                i.remove(); }
        }
        System.out.printf("Collection has size of: %s\n", C.size()); }
}