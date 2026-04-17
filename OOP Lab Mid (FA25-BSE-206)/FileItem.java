abstract class FileItem{
    private int fileId;
    private String fileName;
    private Folder folder;

    FileItem(int fileId, String fileName, Folder folder){
        System.out.println("FileItem constructor called");
        setFileId(fileId);
        setFileName(fileName);
        setFolder(folder);
    }

    public String getFileName(){
        return fileName;
    }

    public Folder getFolder(){
        return folder;
    }

    public void setFileId(int fileId){
        this.fileId=fileId;
    }

    public int getFileId(){
        return fileId;
    } 

    public void setFileName(String fileName){
        this.fileName=fileName;
    }

    public void setFolder(Folder folder){
        this.folder=folder;
    }

    public static void showSystemType(){
        System.out.println("Digital File Management System");
    }

    public void displayInfo(){
        System.out.println("File ID: " + fileId);
        System.out.println("File Name: " + fileName );
        System.out.println("Folder: " + folder.getFolderName() + " Path: " + folder.getPath());
    }

    public abstract void openFile();

}