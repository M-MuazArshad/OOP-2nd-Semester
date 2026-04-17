public class Demo{
    public static void main(String[] args) {
        FileItem.showSystemType();
        Folder f1 = new Folder("Assignments", "/docs/assignments");
        Folder f2 = new Folder("Exams", "/docs/exams");
        Folder f3 = new Folder("Projects", "/docs/projects");
        TextFile file1 = new TextFile(101, "OOP_Notes.txt", f1, 120);
        SecureTextFile secure1 = new SecureTextFile(202, "Midterm_Paper.txt", f2, 250, "High");

        FileItem[] items = new FileItem[5];
        items[0] = file1;
        items[1] = secure1;

        System.out.println("------- File Details --------");
        for(int i=0; i<items.length; i++){
            if(items[i] == null)
                continue;
        items[i].displayInfo();
        items[i].openFile();
        }

        FileItem ref = new SecureTextFile(303, "Project_Solution.txt", f3 , 180, "Medium");

        ref.displayInfo();
        ref.openFile();

        SecureTextFile specialRef = (SecureTextFile) ref;

        specialRef.shareFile();
        specialRef.shareFile("faculty@university.edu");
    }
}