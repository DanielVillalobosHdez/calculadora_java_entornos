
/**
 * Write a description of class Calculadora here.
 * 
 * @author Daniel Villalobos y Cristian lerida 
 * @version 
 */


public class Calculadora
{
    // instance variables - replace the example below with your own
    private double num1;
    private double num2;
    private double rdo;
    private Operacion op;
    
    public static void main(String[] args) {
    	Calculadora calc = new Calculadora();
    	calc.ponNum1(5);
    	calc.ponNum2(10);
    	calc.muestraTodosResultados();
    }

    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
        // initialise instance variables
        num1 = 0;
        num2 = 0;
        op=op.SUMA;
        
    }
    
    public void ponNum1(int n1)
    {
        // put your code here
        this.num1=n1;
    }
    
    public void ponNum2(int n2)
    {
        // put your code here
        this.num2=n2;
    }

    public void opera()
    {
        switch(op){
            case SUMA:
                rdo=num1+num2;
                break;
            case RESTA:
                rdo=num1-num2;
                break;
            case MULTIPLICA:
                rdo=num1*num2;
                break;
            case DIVIDE:
                rdo=num1/num2;
                break;
            case POTENCIA:
            if(num2 >1){    
            for (int i= 1; i < num2; i++) {
                if(i == 1){
                    rdo = num1 * num1;
                }
                else
                    rdo=rdo*num1;
        }
    }
    else
        rdo=num1;
        break;
            case RAIZ:
                rdo = Math.sqrt(num1);                        
    
}
}
    public void ponOperacion(String opera){
        switch(opera){
        
        case "SUMA":
            op=op.SUMA;
            break;
        case "RESTA":
            op=op.RESTA;
            break;
        case "MULTIPLICA":
            op=op.MULTIPLICA;
            break;
        case "DIVIDE":
            op=op.DIVIDE;
            break;
        case "POTENCIA":
            op=op.POTENCIA;
            break;
        case "RAIZ":
            op=op.RAIZ;
            break;
        }
    }
    public double dameResultado()
    {
        // put your code here
        return rdo;
    }
    
    public void muestraTodosResultados(){
        System.out.println("Num1="+num1+" Num2=" +num2+"");
        System.out.println("Suma :" +(num1+num2)+"");
        System.out.println("Resta :"+(num1-num2)+"");
        System.out.println("Multiplica :" +(num1*num2)+"");
        System.out.println("Divide :"+(num1/num2)+"");
        System.out.println("Potencia :"+rdo+"");
        System.out.println("Raiz :"+rdo+"");
        
    }
}
