package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee {
	private PersonalInfo personal;
    private EmploymentInfo employment;
    private FamilyInfo family;
    private IncomeInfo income;
	
	public Employee(PersonalInfo personal, EmploymentInfo employment) {
		this.personal = personal;
		this.employment = employment;
		family = new FamilyInfo();
		income = new IncomeInfo();	
	}
	
	/**
	 * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3: 7.000.000 per bulan)
	 * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
	 */
	
	public int getAnnualIncomeTax() {
		return TaxFunction.calculateTax(income.getMonthlySalary(), income.getOtherMonthlyIncome(), employment.getMonthWorkingInYear(), income.getAnnualDeductible(), family.getSpouseIdNumber().equals(""), family.getChilds().size());
	}
}
