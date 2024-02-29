package poo.calase3.encapsulamiento;
import poo.calase3.encapsulamiento.CuentaDeBanco.AccountType;
public class POOCALASE3Encapsulamiento {
    public static void main(String[] args) {
        Empleado empleadoUno = new Empleado ("Juan", 13, 1500) ;
        Empleado empleadoDos = new Empleado ("Pedro", 40, 15900, 583937) ;
        System.out.println("Empleado: "+empleadoUno.getName()+
                "     Edad:"+empleadoUno.getAge()+
                "       Salario:"+empleadoUno.getSalary());
        
        System.out.println(empleadoUno.getAge()+"Juan");
        System.out.println(empleadoDos.getCuenta().getAccountNumber()+"Pedro");
        System.out.println(empleadoUno.depositar(800000, 800));
        
        CuentaDeBanco projectManager = new CuentaDeBanco (15737989, 25000, AccountType.BLACK, 0);
        System.out.println("Depositar $15 000"); 
        projectManager.deposit(15000);
        System.out.println("Retirar $10 000");
        projectManager.retirar(1000);
        
        CuentaDeBanco limpieza = new CuentaDeBanco (1747592389, 12000, AccountType.PLATINUM, 0);
        System.out.println("Depositar $90, 000");
        limpieza.deposit(90000);
        System.out.println("Retirar $100, 000");
        limpieza.retirar(100000);
        
        
        

    }
}