public class Company {
    private String companyName;
    private CinemaBranch[] branches;

    public Company() {
        this.companyName = "Galaxy Cinemas";
        branches = new CinemaBranch[2];
        branches[0] = new CinemaBranch("Downtown Branch", "Lahore", "Main Road", 3);
        branches[1] = new CinemaBranch("Uptown Branch", "Karachi", "City Center", 3);
    }

    public String getCompanyName() { 
        return companyName; }

    public CinemaBranch[] getBranches() {
         return branches; }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Company: ").append(companyName).append("\n");
        for (int i = 0; i < branches.length; i++) {
        stringBuilder.append(branches[i]).append("\n");
    }
        return stringBuilder.toString();
    }
}