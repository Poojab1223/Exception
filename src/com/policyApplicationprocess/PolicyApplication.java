package com.policyApplicationprocess;

public class PolicyApplication {
	public void validateAge(int age) throws InvalidAgeException{
		if(age > 18 && age < 65 ) {
			System.out.println("allowed");
		}
		else
			throw new InvalidAgeException("you are not allowed as your age is not falls in the range");
	}
	
	public void checkHealthIssue(String status) throws HealthIssueException{
		if(status.equalsIgnoreCase("good")) {
			System.out.println("you'r health status is good and you'r  eligible");
		}
		else
			throw new HealthIssueException("health issue found");
	}
	
	public void checkDrivigHistory(String status) throws PoorDrivingRecordException {
		if(status.equalsIgnoreCase("clean")) {
			System.out.println("you'r Driving status is clean and you'r  eligible");
		}
		else
			throw new PoorDrivingRecordException("Poor drving found");
		
	}
	
	public void processApplication(User user) throws InvalidAgeException,HealthIssueException,PoorDrivingRecordException{
		
		validateAge(user.getAge());
		checkHealthIssue(user.getHealthStatus());
		checkDrivigHistory(user.getDrivingRecords());
		}
		
	
}
