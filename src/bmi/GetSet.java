/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

/**
 *
 * @author Dineth
 */
public class GetSet {
    int height=0;
    float weight=0;
    Boolean standerd=null;
    float bmi_val=0;
  public void compute(int height){
        this.height=height;
        System.out.println(height);
    }

    void compute(float weight) {
        this.weight=weight;
          System.out.println(weight);
    }


    public void  final_value(){
        float bmi=0,bmi2=0;
       if (standerd=true){
          bmi =(float) (703*weight/Math.pow(height,2));
          this.bmi_val=bmi;
            //System.out.println(bmi_val+"22");
         
        }
     else{
           this.bmi_val=0;
          this.bmi_val=(float) (weight/Math.pow(height,2));
         

           // System.out.println(bmi_val+"2");
           }
        
    }

    void compute(Boolean standerd) {
        this.standerd=standerd;
        System.out.println(standerd);
    }
    
    public float pass(){
        Calc temp=new Calc();
        temp.tem(bmi_val);
        return this.bmi_val; 
    }
}
