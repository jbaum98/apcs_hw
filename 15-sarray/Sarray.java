public class Sarray {
    private int[] data;
    private int   last;
    private int   chunk; // amount by which data increases when space runs out

    public Sarray(int chunk) {
        this.chunk = chunk;
        last = -1;
        data = new int[chunk];
    }

    public Sarray() {
        this(100); // default chunk is 100
    }

    private boolean hasSpace() {
        return last + 1 < data.length;
    }

    private void makeSpace() {
        if ( !hasSpace() ) { 
            int[] new_data = new int[data.length + chunk]; // new array with chunk more spaces
            for (int i = 0; i < data.length; i++) // copy data over
                new_data[i] = data[i];
            data = new_data;
        }
    }

    private void checkIndex(int index) {
        if (index > last)
            throw new IndexOutOfBoundsException(""+index);
    }

    public boolean add(int i){
        makeSpace();
        last++;
        data[last] = i;
        return true;
    }

    public boolean add(int index, int i){
        checkIndex();
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

    public int get(int index) {
        checkIndex();
        return data[index];
    }

    public int set(int index, int i) {
        checkIndex();
        int old = data[index];
        data[index] = i;
        return old;
    }

    public int remove(int index) {
        checkIndex();
        int old = data[index];
        for (int i=index; i < last; i++) // count up from index
            data[i] = data[i+1];
        last--;
        return old;
    }

    public String toString() {
        String out = "[ ";
        for (int i = 0; i < size(); i++) {
            if (i == last)
                out += data[i] + " ]";
            else  
                out += data[i] + ", ";
        }
        return out;
    }

    public static void main(String[] args) {
        Sarray s = new Sarray();
        System.out.println("Should be 0: " + s.size());
        System.out.println("Adding 4");
        s.add(4);
        System.out.println("Adding 1");
        s.add(1);
        System.out.println("Should be 2: " + s.size());
        System.out.println(s);
        System.out.println("Adding 2 at 1");
        s.add(1, 2);
        System.out.println(s);
        System.out.println("Changing index 1 to 3");
        s.set(1,3);
        System.out.println("At index 1: "+s.get(1));
        System.out.println("Deleting index 1");
        s.remove(1);
        System.out.println(s);
    }
}
