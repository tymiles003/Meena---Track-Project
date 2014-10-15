package menaa.beans;

import java.io.Serializable;

public class Driver implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String driverFirstName;
    private String driverLastName;
    private Double licenceNoOfDriver;
    /* private Long internationalLicenceNoOfDriver;
    private Long passportNoOfDriver;
    private Long visaNoOfDriver;
    private Long insuranceNoOfDriver;
    private int driverPhoneNo;
    private String emailOfDriver;*/
    
	public String getDriverFirstName() {
		return driverFirstName;
	}
	public void setDriverFirstName(String driverFirstName) {
		this.driverFirstName = driverFirstName;
	}
	public String getDriverLastName() {
		return driverLastName;
	}
	public void setDriverLastName(String driverLastName) {
		this.driverLastName = driverLastName;
	}
	public Double getLicenceNoOfDriver() {
		return licenceNoOfDriver;
	}
	public void setLicenceNoOfDriver(Double licenceNoOfDriver) {
		this.licenceNoOfDriver = licenceNoOfDriver;
	}
	/*public Long getInternationalLicenceNoOfDriver() {
		return internationalLicenceNoOfDriver;
	}
	public void setInternationalLicenceNoOfDriver(
			Long internationalLicenceNoOfDriver) {
		this.internationalLicenceNoOfDriver = internationalLicenceNoOfDriver;
	}
	public Long getPassportNoOfDriver() {
		return passportNoOfDriver;
	}
	public void setPassportNoOfDriver(Long passportNoOfDriver) {
		this.passportNoOfDriver = passportNoOfDriver;
	}
	public Long getVisaNoOfDriver() {
		return visaNoOfDriver;
	}
	public void setVisaNoOfDriver(Long visaNoOfDriver) {
		this.visaNoOfDriver = visaNoOfDriver;
	}
	public Long getInsuranceNoOfDriver() {
		return insuranceNoOfDriver;
	}
	public void setInsuranceNoOfDriver(Long insuranceNoOfDriver) {
		this.insuranceNoOfDriver = insuranceNoOfDriver;
	}
	public int getDriverPhoneNo() {
		return driverPhoneNo;
	}
	public void setDriverPhoneNo(int driverPhoneNo) {
		this.driverPhoneNo = driverPhoneNo;
	}
	public String getEmailOfDriver() {
		return emailOfDriver;
	}
	public void setEmailOfDriver(String emailOfDriver) {
		this.emailOfDriver = emailOfDriver;
	}*/
}
