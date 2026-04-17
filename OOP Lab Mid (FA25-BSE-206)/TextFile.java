class TextFile extends FileItem{

    private int fileSize;

    TextFile(int fileId, String fileName, Folder folder, int fileSize){
        super(fileId, fileName, folder);
        System.out.println("TextFile constructor called");
        setFileSize(fileSize);
    }

    public void openFile(){
        System.out.println("TextFile is opening normally.");
    }

    public int getFileSize(){
        return fileSize;
    }

    public void setFileSize(int fileSize){
        this.fileSize=fileSize;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("File Size: " + fileSize + " KB");
    }
}