class MemberCard{
	private static int counter=0;
	private static final String PREFIX = "LIB-";
	private String cardNo;
	private String studentName;
	private String department;
	private int semester;
	private double feePaid;
	private boolean active;

     public MemberCard(){
	this("Unknown");
	System.out.println("Default constructor called");
}
     public MemberCard(String studentName){
	this(studentName,"BSSE");	
}
     public MemberCard(String studentName, String department){
	this(studentName,department,1,0.0,true);
}
     public MemberCard(String studentName, String department, int semester, double feePaid, boolean active){
	this.cardNo=generateCardNo();
	setStudentName(studentName);
	setDepartment(department);
	setSemester(semester);
	setFeePaid(feePaid);
	setActive(active);
}
     public MemberCard(MemberCard other){
	this(other.studentName,other.department,other.semester,other.feePaid,other.active);
}
     private static String generateCardNo(){
	return PREFIX + String.format("%04d", ++counter);
}
     public static int getTotalCards(){
	return counter;	
}
     public void payFee(double amount){
	if(amount > 0){
            feePaid += amount;
    }
}
     public void deactivateCard(){
	active=false;
}
     public void activateCard(){
	active=true;
}
     public String getCardNO() {
        return cardNo;
}   
     public String getStudentName(){
	return studentName;
}
     public String getDepartment(){
	return department;
}
     public int getSemester(){
	return semester;
}
     public double getFeePaid(){
	return feePaid; 
}
     public boolean getActive(){
	return active;
}
     public void setStudentName(String studentName){
	this.studentName=studentName;
}
     public void setDepartment(String department){
	this.department=department;
}
     public void setSemester(int semester){
	this.semester=semester;
}
     public void setFeePaid(double feePaid){
	this.feePaid=feePaid;
}
     public void setActive(boolean active){
	this.active=active;
}
     public String toString(){
	return String.format("%s  %s  %s  %d Fee: %.2f Active: %b",cardNo,studentName,department,semester,feePaid,active);	

}


}