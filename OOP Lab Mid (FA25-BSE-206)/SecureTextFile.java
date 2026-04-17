class SecureTextFile extends TextFile{
    private String securityLevel;

    SecureTextFile(int fileID, String fileName, Folder folder, int fileSize, String securityLevel){
        super(fileID, fileName, folder, fileSize);
        System.out.println("SecureTextFile constructor is called");
        setSecurityLevel(securityLevel);
    }

    public void setSecurityLevel(String securityLevel){
        this.securityLevel=securityLevel;
    }

    public void shareFile(){
        System.out.println("Fiel shared with default secure settings.");
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Security Level: " + securityLevel);
    }

    public String getSecurityLevel(){
        return securityLevel;
    }

    public void openFile(){
        System.out.println("SecureTextFile is opening with protected access.");
    }

    public void shareFile(String file){
        System.out.println("File shared with: " + file + ".pk");
    }
}
