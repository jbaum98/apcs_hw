public class OrderedSuperArray extends Sarray {
    public boolean add(int index, String i)
    {throw new UnsupportedOperationException();}

    private int findSpot(String element, int pivot) {
        int i = 0;
        while (i < size() && get(i).compareTo(element) < 0) {
            i++;
        }
        return i;
    }

    public boolean add(String element) {
        int i = findSpot(element, size()/2);
        if (i == size()) {
            return super.add(element); // to the end
        } else {
            return super.add(i, element);
        }
    }

    public static void main(String[] args) {
        OrderedSuperArray o = new OrderedSuperArray();
        System.out.println(o);
        o.add("a");
        System.out.println(o);
        o.add("d");
        o.add("b");
        System.out.println(o);
        o.add("c");
        System.out.println(o);
    }
}
