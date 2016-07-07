
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Top ten players by goals");
        NHLStatistics.sortByGoals();      // orders the players by goals
        NHLStatistics.top(10);
        
        System.out.println("Top twenty-five players by penalties");
        NHLStatistics.sortByPenalties();  // orders the players by penalty minutes
        NHLStatistics.top(25);
        
        System.out.println("Sidney Crosby's stats");
        NHLStatistics.searchByPlayer("Sidney Crosby");  // prints stats of Sidney Crosby
        
        System.out.println("Philadelphia Flyers team stats");
        NHLStatistics.teamStatistics("PHI");  // Statistics of Philadelphia Flyers
                                              // Retains the player order from last sortBy
        
        System.out.println("Anaheim Ducks team ordered by points");                                      
        NHLStatistics.sortByPoints();     // orders the players by points
        NHLStatistics.teamStatistics("ANA");  // Statistics of Anaheim Ducks
    }
}
