package filesystem;

class FileSystem {
    private Directory root;

    public FileSystem() {
        this.root = new Directory("root");
    }

    public Directory getRoot() {
        return root;
    }
}
