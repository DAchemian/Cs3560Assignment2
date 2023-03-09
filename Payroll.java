package cs3560;

public class Payroll {
    private int numWorkers;
    private double totalPayroll;
    
    public Payroll() {
        this.numWorkers = 0;
        this.totalPayroll = 0.0;
    }
    
    public void processPayments(Worker worker) {
        double payment = worker.getHoursWorked() * worker.getHourlyRate();
        System.out.println("Payment processed for worker " + worker.getName() + ": $" + payment);
        numWorkers++;
        totalPayroll += payment;
    }
    
    public int getNumWorkers() {
        return numWorkers;
    }
    
    public double getTotalPayroll() {
        return totalPayroll;
    }


	public class Worker {
	    private String name;
	    private double hourlyRate;
	    private int hoursWorked;
	    
	    public Worker(String name, double hourlyRate, int hoursWorked) {
	        this.name = name;
	        this.hourlyRate = hourlyRate;
	        this.hoursWorked = hoursWorked;
    }
    
    public String getName() {
        return name;
    }
    
    public double getHourlyRate() {
        return hourlyRate;
    }
    
    public int getHoursWorked() {
        return hoursWorked;
    }
}
}

