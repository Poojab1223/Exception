package com.policyApplicationprocess;

public class MainClass {
	public static void main(String[] args) {
		User user = new User("pooja" ,19,"good","clean");
		PolicyApplication policyApplication = new PolicyApplication();
		try {
		policyApplication.processApplication(user);
		}
		catch(InvalidAgeException i) {
			System.out.println(i.getMessage());
		}
		catch(HealthIssueException h) {
			System.out.println(h.getMessage());
		}
		catch(PoorDrivingRecordException p) {
			System.out.println(p.getMessage());
		}
	}

}
