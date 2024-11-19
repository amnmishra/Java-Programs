    public class Branch{
	Branch(){
		String branchName = "CSE";
		String hod = "AKM";
		System.out.println("HOD Name : "+hod+"\nBranch : "+branchName); 
	}
	String cr , crd;
	int noOfStd , roomNo;
	void CSE3A(){
		this.cr = "A";
		this.noOfStd = 60;
		this.crd = "RS";
		this.roomNo = 410;
		System.out.println("Sec : CSE3A\n\tCRD is : "+cr+"\n\tNo. of Std : "+noOfStd+"\n\tCRD is : "+crd); 
		// CRD -> Coordinator / cr -> Class Representative
	}
	void CSE3B(){
		this.cr = "B";
		this.noOfStd = 70;
		this.crd = "AS";
		System.out.println("Sec : CSE3A\n\tCRD is : "+cr+"\n\tNo. of Std : "+noOfStd+"\n\tCRD is : "+crd);
	}
	void CSE3C(){
		this.cr = "C";
		this.noOfStd = 65;
		this.crd = "CS";
		System.out.println("Sec : CSE3A\n\tCRD is : "+cr+"\n\tNo. of Std : "+noOfStd+"\n\tCRD is : "+crd);
	}
	void CSE3D(){
		this.cr = "D";
		this.noOfStd = 63;
		this.crd = "DS";
		System.out.println("Sec : CSE3A\n\tCRD is : "+cr+"\n\tNo. of Std : "+noOfStd+"\n\tCRD is : "+crd);
	}
}