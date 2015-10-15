/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package worldcupapp;

import java.io.Serializable;

/**
 *
 * @author Jefferson
 */
public class Teams implements Serializable {
    private String name; 
    private String teamp;

    
    public Teams(String name, String teamp){
        this.name = name;
        this.teamp = teamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return teamp;
    }

    public void setTeam(String teamp) {
        this.teamp = teamp;
    }
    public String getDetails(){
        return "Player Name: "+name+"\nTeam: "+teamp;
    }

}
