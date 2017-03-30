
package esercitazione;


public class Retta {
    
    protected double a=0;
    protected double b=0;
    protected double c=0;
    
    public Retta(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    public String getTipo(){
        if(a==0){
            return "ORIZZONTALE";         
        }
        if (b==0){
            return "VERTICALE";
        }
        return "OBLIQUA"; 
    }
    
    
    public boolean appartiene(double x, double y ){
        double ax=this.a*x;
        double by=this.b*y;
        double risultato=ax+by+c;
        if (risultato==0){
            return true;
        }else{
            return false;
        }
        
    }
    
    
    public String stampa(){
        String equa="";
        if(this.a!=0)equa+=this.a+"x";
        if(this.b!=0){
            if(this.b>0){
                equa+="+";
            }
          equa+=this.b+"y";
        }
    if(this.c!=0){
        if(this.c>0){
            equa+="+";
        }
      equa+=this.c;
    }
    equa+="=0";
    
    return equa;
    }

}
