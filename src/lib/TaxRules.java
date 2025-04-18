public interface TaxRules {
    double TAX_RATE         = 0.05;       // tarif pajak 5%
    int    BASE_EXEMPTION   = 54_000_000; // PTKP dasar
    int    SPOUSE_EXEMPTION = 4_500_000;  // tambahan PTKP jika sudah menikah
    int    CHILD_EXEMPTION  = 1_500_000;  // tambahan PTKP per anak (maks 3 anak)
    int    CHILD_LIMIT      = 3;  
}