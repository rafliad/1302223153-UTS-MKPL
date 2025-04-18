package lib;

public class TaxFunction {

	
	/**
	 * Fungsi untuk menghitung jumlah pajak penghasilan pegawai yang harus dibayarkan setahun.
	 * 
	 * Pajak dihitung sebagai 5% dari penghasilan bersih tahunan (gaji dan pemasukan bulanan lainnya dikalikan jumlah bulan bekerja dikurangi pemotongan) dikurangi penghasilan tidak kena pajak.
	 * 
	 * Jika pegawai belum menikah dan belum punya anak maka penghasilan tidak kena pajaknya adalah Rp 54.000.000.
	 * Jika pegawai sudah menikah maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000.
	 * Jika pegawai sudah memiliki anak maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000 per anak sampai anak ketiga.
	 * 
	 */
	
	public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
		int children = Math.min(ctx.getChildren(), TaxRules.CHILD_LIMIT);
        int exemption = BASE_EXEMPTION + (ctx.getStatus() == MaritalStatus.MARRIED ? TaxRules.SPOUSE_EXEMPTION : 0) + (children * TaxRules.CHILD_EXEMPTION);
        int grossIncome = (ctx.getMonthlySalary() + ctx.getOtherMonthlyIncome()) * ctx.getMonthsWorked();
        int taxableIncome = grossIncome - ctx.getDeductible() - exemption;

        if (taxableIncome <= 0) {
            return 0;
        }

        return (int) Math.round(TaxRules.TAX_RATE * taxableIncome);
			 
	}
	
}
