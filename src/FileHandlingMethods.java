import java.io.File;

public class FileHandlingMethods {
    static public void main(String[] args) {

        File obj = new File("./README.md");
        System.out.println(obj.canRead()); // true
        System.out.println(obj.canWrite()); // true

        File f = new File("./program.txt");
        try {
            if (f.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.println(f.getName()); // 'program.txt'
        System.out.println(f.getAbsolutePath()); // /home/uladzimir/Documents/projects/java/java-bootcamp/./program.txt
        System.out.println(f.length()); // 0 (in bites)

        System.out.println(f.exists()); // true

        System.out.println(f.delete()); // true
        System.out.println(f.exists()); // false

        System.out.println(f.mkdir()); // true (create the directory)
        System.out.println(f.list()); // (returned array of files in directory)

    }

}
