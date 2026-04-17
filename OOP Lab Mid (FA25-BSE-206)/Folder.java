class Folder{
    private String folderName;
    private String path;

    Folder(String folderName, String path){
        setFolderName(folderName);
        setPath(path);
    }

    public String getPath(){
        return path;
    }

    public void setFolderName(String folderName){
        this.folderName=folderName;
    }

    public void setPath(String path){
        this.path=path;
    }

    public String getFolderName(){
        return folderName;
    }
}