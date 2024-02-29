package poo.calase3.encapsulamiento;
public class Empleado {
    private String name ;
    private int age ;
    private double salary ;
    private CuentaDeBanco cuenta ;
    
    public Empleado(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }    //El método se usa para ingresar datos o catualizarlos.
    public Empleado(String name, int age, double salary, long accountNumber) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.cuenta = new CuentaDeBanco (accountNumber) ;
    }   //Se usa un constructor ne la clase CuentaDeBanco para poder obtener o no un no. de cuenta.
    public double depositar (int monto, double montoADepositar) {
        montoADepositar += monto ;
        return montoADepositar ;
    }
    public double retirar (int monto, double montoARetirar) {
        montoARetirar -= monto ;
        return montoARetirar ;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 65) {
            this.age = age ;
        }
        else {
            System.out.println("Invalid age.");
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary < 0) {
            this.salary = salary ;
        } 
        else {
            System.out.println("Agregue un salario.");
        }
        this.salary = salary;
    }

    public CuentaDeBanco getCuenta() {  
        return cuenta ;
    }
    public void setCuenta(CuentaDeBanco cuenta) {
        this.cuenta = cuenta;
    }
}