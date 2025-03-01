package filesystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Directory extends FileSystemNode{

    List<FileSystemNode> children;
    Map<String,Directory> directories;

    public Directory(String name) {
        super(name);
        children = new ArrayList<>();
        directories = new HashMap<>();
    }

    public void addFile(String name, String data) {
        children.add(new File(name, data));
    }

    public Directory addDirectory(String name) throws Exception {
        if(directories.containsKey(name)) {
            throw new Exception("directory with this name already exists");
        }
        Directory newDir = new Directory(name);
        children.add(newDir);
        directories.put(name,newDir);
        return newDir;
    }

    public Directory getSubDirectoryWithName(String name) {
        return directories.get(name);
    }

    public void ls() {
        for(FileSystemNode fileSystemNode : children) {
            System.out.println(fileSystemNode.getName());
        }
    }

    public void tree(String indent) {
        System.out.println(indent + "- " + this.getName());
        for (FileSystemNode node : children) {
            node.tree(indent + indent);
        }
    }
}
