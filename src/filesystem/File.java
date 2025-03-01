package filesystem;

public class File extends FileSystemNode {

    private int size;
    private String data;

    public File(String name , String data) {
        super(name);
        this.data = data;
        this.size = data.length();
    }

    public int getSize() {
        return size;
    }

    public String readData() {
        return data;
    }
}
