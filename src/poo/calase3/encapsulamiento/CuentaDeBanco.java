package poo.calase3.encapsulamiento;
public class CuentaDeBanco {
    private long accountNumber;
    private double monto;
    private AccountType type;
    private double cantidad ;

    public CuentaDeBanco(long accountNumber, double monto, AccountType type, double cantidad) {
        this.accountNumber = accountNumber;
        this.monto = monto;
        this.type = type;
        this.cantidad = cantidad;
    }

    CuentaDeBanco(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    public void deposit (double monto) {
        double maxDeposit = type.getmaxDeposit() ;
        double minDeposit = type.getminDeposit() ;
        if (monto >= minDeposit && maxDeposit > monto) {
            cantidad += monto ;
            System.out.println("La nueva cantidadd de monto es: $"+cantidad);
        }
            else {
            System.out.println("Error. Depositar una cantidad dentro de los límites.");
        }
    }
    public void retirar (double monto) {
        double maxDeposit = type.getmaxDeposit();
        double minDeposit = type.getminDeposit();
        if (monto >= minDeposit && monto < maxDeposit) {
        cantidad -= monto;
        System.out.println("Retiro de dinero: $"+monto+"La nueva cantidad de monto es: $"+cantidad); 
        }
        else
            System.out.println("Error. Retirar una cantidad dentro de los límites.");
    }
    public enum AccountType {
        PLATINUM(1000, 50000),
        GOLD (50000, 100000),
        BLACK (100000, Double.POSITIVE_INFINITY);
        
            private final double maxDeposit;
            private final double minDeposit;
            
    AccountType (double minDeposit, double maxDeposit) {
        this.minDeposit = minDeposit;
        this.maxDeposit = maxDeposit;
    }
    public double getminDeposit () {
        return minDeposit;
    }
    public double getmaxDeposit () {
        return maxDeposit;
    }
}
}