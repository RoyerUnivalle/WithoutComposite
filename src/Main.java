// Ejemplo de uso
public class Main {
    public static void main(String[] args) {

        // Crear archivos
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");

        // Crear directorios
        Directory dir1 = new Directory("dir1");
        Directory dir2 = new Directory("dir2");

        // Agregar archivos a directorios
        dir1.addFile(file1);
        dir1.addFile(file2);
        dir2.addFile(file3);

        // Mostrar estructura de directorios
        displayDirectory(dir1, 0);
        displayDirectory(dir2, 0);
    }

    private static void displayDirectory(Directory directory, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
        System.out.println("- " + directory.getName());

        for (File file : directory.getFiles()) {
            for (int i = 0; i < depth + 1; i++) {
                System.out.print("  ");
            }
            System.out.println(file.getName());
        }

        for (Directory subDirectory : directory.getDirectories()) {
            displayDirectory(subDirectory, depth + 1);
        }
    }
}