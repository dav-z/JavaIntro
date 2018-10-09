/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author dav
 */
public class Lab10 {

    static class Car{
        String make,model;
        int year;
        double MPG,milesDriven;
        private double fuelCapacity,fuelRemaining;
        //constructer
        public Car(String make,String model,int year,double MPG, double milesDriven,double fuelCapacity,double fuelRemaining){
            this.make=make;
            this.model=model;
            this.year=year;
            this.MPG=MPG;
            this.fuelCapacity=fuelCapacity;
            this.fuelRemaining=fuelRemaining;
            this.milesDriven = milesDriven;
        }
            //fillTank
        public void fillTank(double m){
            //if tank is not full
            if(m+this.fuelRemaining<=this.fuelCapacity){
                this.fuelRemaining=this.fuelRemaining+m;
            }
            //tank is full
            else{
                this.fuelRemaining=this.fuelCapacity;
            }
        }
        //drive function
        public void drive(double m){
            //adding it to milesDriven
            this.milesDriven=this.milesDriven+m;
            //reducting the fuel
            this.fuelRemaining=this.fuelRemaining-(m/this.MPG);
        }
        //getFuelRemaining()
        public double getFuelRemaining(){
            return this.fuelRemaining;
        }
        //toString() method as printCar
        public String toString(){
            String result="";
            result+=(this.make+" "+this.model+" "+this.year);
            result+=("\nMPG : "+this.MPG);
            result+=("\nTotal Capacity: "+this.fuelCapacity);
            result+=("\nFuelRemaining: "+this.fuelRemaining);
            result+=("\nmilesDriven: "+this.milesDriven);

            return result;
        }
    }
    
    static class Fraction{
       private int numerator,denominator;
       //constructer
       public Fraction(int n,int d){
           check(d);
           this.numerator=n;
           this.denominator=d;
           reduce();
       }

       //If d is 0, throw an ArithmeticException
       public void check(int d){
           if(d==0){
               throw new ArithmeticException("Denominator shouldn't be zero");
           }
       }
       //Returns the value of the numerator field
       public int getNum(){
           return this.numerator;
       }
       //   Returns the value of the denominator field

       public int getDenom(){
           return this.denominator;
       }
       //Sets the numerator field to the value given in n

       public void setNum(int n){
           this.numerator=numerator;
       }
       //Sets the denominator field to the value given in d. If d is 0, throw an ArithmeticException.
       public void setDenum(int d)   {
           check(d);
           this.denominator=d;
       }
       //Returns the fraction that is the sum of the subject of the method and a.
       public Fraction add(Fraction a){
           if(a==null){return null;}

           Fraction result=new Fraction(1,1);
           result.numerator=this.numerator*a.denominator+this.denominator*a.numerator;
           result.denominator=this.denominator*a.denominator;
           result.reduce();
           System.out.println(result);
           return result;

       }
       //Returns true if subject of method and argument of call are equal.
       // Fractions a/b and c/d are equal if a*d and b*c are equal or since the fractions are normalized, if a==c and b==d.
       public boolean equals(Fraction a){

           return this.numerator*a.denominator==this.denominator*a.numerator;
       }
       //reducting fraction
       public void reduce(){
           int r=gcd(this.numerator,this.denominator);
           this.numerator/=r;
           this.denominator/=r;
       }
       //gcd
       int gcd(int x, int y)
        {
            int r=0, a, b;
            a = (x > y) ? x : y; // a is greater number
            b = (x < y) ? x : y; // b is smaller number
            r = b;
            while(a % b != 0)
            {
                r = a % b;
                a = b;
                b = r;
            }
            return r;
        }
       //toString()
       public String toString(){
           return this.numerator+"/"+this.denominator;
       }
    }
    
    public static void main(String args[]){
        Car oldJunker = new Car("Ford", "Pinto", 1972, 17.5, 127621, 12, 8); // creates a new Car object
        oldJunker.drive(5); // drives the Car 5 miles
        oldJunker.fillTank(1); // put in a gallon of gas
        //System.out.println(oldJunker.getFuelRemaining()); // prints the amount of fuel left
        System.out.println(oldJunker); // prints the attributes of the car to the screen
        
        Fraction f1=new Fraction(8,4);
        Fraction f2=new Fraction(4,16);
        System.out.println("F1="+f1);
        System.out.println("F2="+f2);
        System.out.println(f1.equals(f2));
        System.out.println(f1+"+"+f2+"="+f1.add(f2));
   }
    
}
