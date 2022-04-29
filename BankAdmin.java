public class BankAdmin {

	BankAcct processApplication(Application app) {
		
		BankAcct ba = new BankAcct(101,"Jack",5000,"9292929292");
		return ba;
	}
	
	void autherizedToChangeMobileNumber(BankAcct ref, String newNumber)
	{
			ref.setMobileNo(newNumber);
			System.out.println("mobile number changed....");
	}
	void autherizedToChangeAccountHolderName(BankAcct ref, String newName)
	{
		ref.setName(newName);
		System.out.println("name changed....");
	}
	void autherizedToDepositAmount(BankAcct ref, double amountToDeposit)
	{
		double currentBalance = ref.getBalance();
		double newBalance = currentBalance + amountToDeposit;
		ref.setBalance(newBalance);
		System.out.println("Deposit successful....");
	}
	void autherizedToWithdrawAmount(BankAcct ref, double amountToWithdraw)
	{
		double currentBalance = ref.getBalance();
		double newBalance = currentBalance - amountToWithdraw;
		ref.setAccountBalance(newBalance);
		System.out.println("Withdraw successful....");
	}
	void autherizedToTransferAmount(BankAcct src,BankAcct trg, double amountToTransfer)
	{
		double sourceBalance = src.getBalance() - amountToTransfer;
		double targetBalance = trg.getBalance() + amountToTransfer;
		src.setAccountBalance(sourceBalance);
		trg.setAccountBalance(targetBalance);
		System.out.println("Transfer successful....");
	}
}