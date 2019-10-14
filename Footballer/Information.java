package footballer;

public class Information {

   String name;
   String age;
   String country;
   int goals=0;
   int offsides=0;
   int matches=0;
   

public void initialValue(String n, String a, String c, int g, int o, int m){
    
    name = n;
    age = a;
    country = c;
    goals = g;
    offsides = o;
    matches = m;
    

    }
public void numberOfGoals(int goal){
    goals=goals+goal;
    }

public void numberOfOffsides(int offside){
    offsides=offsides+offside;
    }

public void numberOfMatches(int match){
    matches=matches+match;
    }

public void display(){
    System.out.println("Player name:"+name);
    System.out.println("Age:"+age);
    System.out.println("Country:"+country);
    System.out.println("Number Of Goals:"+goals);
    System.out.println("Number Of Offsides:"+offsides);
    System.out.println("Number Of Matches:"+matches);
    }
}

