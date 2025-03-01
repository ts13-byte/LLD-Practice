package filesystem;

public class FileSystemTest {
    public static void main(String[] args) throws Exception {
        FileSystem fileSystem = new FileSystem();
        Directory rootDirectory = fileSystem.getRoot();

        rootDirectory.addFile("root.txt","abc");
        Directory docs = rootDirectory.addDirectory("docs");
        Directory movies = rootDirectory.addDirectory("movies");

        docs.addFile("bills.xlsx","data1");
        Directory tax = docs.addDirectory("taxes");
        Directory homeMovies = movies.addDirectory("home movies");
        tax.addFile("tax1.txt","data tax");

        movies.addFile("dhoom3","movie...........");

        rootDirectory.tree(" " );
    }
}
