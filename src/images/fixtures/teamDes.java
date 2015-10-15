/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package images.fixtures;

/**
 *
 * @author iLawlipop
 */
public class teamDes {
    
     private String des;
     
   
       
    
    public teamDes(){
        des = new String();

    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }


    
    public String getDetails(){
        return "Player des: "+des+"\nTeam:";
    }
    
}
