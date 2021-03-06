
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
    private double fact;
    private Operacion op;
    private int num;
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.ponNum1(5);
        calc.ponNum2(10);
        calc.ponNum(5);
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
    
    public void ponNum(int n)
    {
        // put your code here
        this.num=n;
    }

    public void opera()
    {
        switch(op){
            case SUMA:
                rdo=num1+num2;
                if(rdo <= -100.000 || rdo >= 100.000){
                    System.out.println("Error");
                }
                break;
            case RESTA:
                rdo=num1-num2;
                if(rdo <= -100.000 || rdo >= 100.000){
                    System.out.println("Error");
                }
                break;
            case MULTIPLICA:
                rdo=num1*num2;
                if(rdo <= -100.000 || rdo >= 100.000){
                    System.out.println("Error");
                }
                break;
            case DIVIDE:
                rdo=num1/num2;
                if(rdo <= -100.000 || rdo >= 100.000){
                    System.out.println("Error");
                }
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
            if(rdo <= -100.000 || rdo >= 100.000){
                    System.out.println("Error");
                }
        break;
            case RAIZ:
                rdo = Math.sqrt(num1);
               if(rdo <= -100.000 || rdo >= 100.000){
                    System.out.println("Error");
                }
            break;
            case FACTORIAL:
                fact = 1;
                for (int i = num; i > 0; i--) {
            fact = fact * i;
        }
        if(rdo <= -100.000 || rdo >= 100.000){
                    System.out.println("Error");
                }
             break;    
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
        case "FACTORIAL":
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
        System.out.println("Potencia :"+Math.pow((double)num1,(double)num2)+"");
        System.out.println("Raiz :"+Math.pow((double)num1,1/(double)num2)+"");
        System.out.println("logaritmo :"+Math.log(num1)+"");
        System.out.println("factorial :"+fact+"");
        
    }
}
