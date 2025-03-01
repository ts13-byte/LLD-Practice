package filesystem;

import java.util.Date;

public abstract class FileSystemNode {
    private String name;
    private Date createdAt;

    public FileSystemNode(String name) {
        this.name = name;
        this.createdAt = new Date();
    }

    public String getName() {
        return name;
    }

    public void tree(String indent) {
        System.out.println(indent + "- " + name);
    }
}
