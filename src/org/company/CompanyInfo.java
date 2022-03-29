package org.company;

public class CompanyInfo {
private void companyName() {
	System.out.println("companyName:Greens");

}
private void companyId() {
 System.out.println("companyId:254");

}
private void companyAddress() {
System.out.println("companyAddress:OMR");

}public static void main(String[] args) {
	CompanyInfo c = new CompanyInfo();
	c.companyName();
	c.companyId();
	c.companyAddress();
}
}
