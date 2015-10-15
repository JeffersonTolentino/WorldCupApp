/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package worldcupapp;

/**
 *
 * @author Nathan Ryan x13448212 Group 7
 */
public class WCOddsToWin extends WCOddsGroupName{
    private String Odds;
    
    public WCOddsToWin(String TeamName, String TeamGroup, String Odds){
        super(TeamName, TeamGroup);
        this.Odds = Odds;
        
    }

    public String getOdds() {
        return Odds;
    }

    public void setOdds(String Odds) {
        this.Odds = Odds;
    }
    
    
}
