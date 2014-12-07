public class Sarray {
    private String[] data;
    private int   last;
    private int   chunk; // amount by which data increases when space runs out

    public Sarray(int chunk) {
        this.chunk = chunk;
        last = -1;
        data = new String[chunk];
    }

    public Sarray() {
        this(100); // default chunk is 100
    }

    private boolean hasSpace() {
        return last + 1 < data.length;
    }

    private void makeSpace() {
        if ( !hasSpace() ) {
            String[] new_data = new String[data.length + chunk]; // new array with chunk more spaces
            for (int i = 0; i < data.length; i++) // copy data over
                new_data[i] = data[i];
            data = new_data;
        }
    }

    private void checkIndex(int index) {
        if (index > last)
            throw new IndexOutOfBoundsException(""+index);
    }

    public boolean add(String i){
        makeSpace();
        last++;
        data[last] = i;
        return true;
    }

    public boolean add(int index, String i){
        checkIndex(index);
        makeSpace();
        for (int j = last; j >= index; j--) // shift from end
            data[j+1] = data[j];
        data[index] = i;
        last++;
        return true;
    }

    public int size() {
        return last + 1;
    }

    public String get(int index) {
        checkIndex(index);
        return data[index];
    }

    public String set(int index, String i) {
        checkIndex(index);
        String old = data[index];
        data[index] = i;
        return old;
    }

    public String remove(int index) {
        checkIndex(index);
        String old = data[index];
        for (int i=index; i < last; i++) // count up from index
            data[i] = data[i+1];
        last--;
        return old;
    }

    public String toString() {
        if (size() == 0) return "[]";
        String out = "[ ";
        for (int i = 0; i < size(); i++) {
            if (i == last)
                out += data[i] + " ]";
            else
                out += data[i] + ", ";
        }
        return out;
    }

    public boolean isSorted() {
        for (int i = 1; i < size(); i++) {
            if (data[i-1].compareTo(data[i]) > 0) {
                return false;
            }
        }
        return true;
    }

    private void shift(int index) {
      String shiftee = data[index];
      int i;
      for (i = index; i > 0 && data[i-1].compareTo(shiftee) > 0; i--) {
        data[i] = data[i-1];
      }
      data[i] = shiftee;
    }

    public void isort() {
      for (int divider = 0; divider < size(); divider++) {
        shift(divider);
      }
    }

    public void ssort() {
        for (int divider = 0; divider < size(); divider++) { // divider seperates sorted from unsorted
            String king = data[divider];
            int king_index = divider;
            for (int i = divider; i < size(); i++) {
                if (data[i].compareTo(king) < 0 ) {
                    king = data[i];
                    king_index = i;
                }
            }
            data[king_index] = data[divider];
            data[divider] = king;
        }
    }

    private void swap(int i, int j) {
        String buffer = data[i];
        data[i] = data[j];
        data[j] = buffer;
    }

    public void bsort() {
        for (int divider = 0; divider < size(); divider++) {
            for (int i = divider; i+1 < size(); i++) {
                if (data[i].compareTo(data[i+1]) > 0) {
                    swap(i, i+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Sarray s = new Sarray();
/*        System.out.println("Should be 0: " + s.size());
        System.out.println("Adding hey");
        s.add("hey");
        System.out.println("Adding ho");
        s.add("ho");
        System.out.println("Should be 2: " + s.size());
        System.out.println(s);
        System.out.println("Adding yay at 1");
        s.add(1, "yay");
        System.out.println(s);
        System.out.println("Changing index 1 to boom");
        s.set(1,"boom");
        System.out.println("At index 1: "+s.get(1));
        System.out.println("Deleting index 1");
        s.remove(1);
        System.out.println(s);*/
        s.add("a");
        s.add("e");
        s.add("f");
        s.add("b");
        s.add("d");
        System.out.println(s);
        s.isort();
        System.out.println(s);
    }
}
