
public class Aufg_07_04 {	
	
	public static void main(String[] args) {
		
		Team teamArray[] = new Team[5];
		
		teamArray[0] = new Team("VFB Stuttgart", 50, 18);
		teamArray[1] = new Team("Borussia Mönchengladbach", 56, 22);
		teamArray[2] = new Team("Herne West", 58, 25);
		teamArray[3] = new Team("FC Bayern München", 67, 50);
		teamArray[4] = new Team("Borussia Dortmund", 75, 48);
		
		Team meister = teamArray[0];
		
		for(Team aktuell : teamArray){
			
			if(aktuell.getPunkte()>meister.getPunkte()){				
				meister = aktuell;
			
			}else if(aktuell.getPunkte()==meister.getPunkte()){
				if(aktuell.getTordifferenz()>meister.getTordifferenz())
					meister = aktuell;				
			}			
		}
		
		System.out.println("----------------------------");
		System.out.println("Deutscher Meister ist:");
		System.out.println(meister.getVerein());
		System.out.println("mit "+meister.getPunkte()+" Punkten");
		System.out.println("und einer Tordifferenz von "+meister.getTordifferenz());
		
	}

}
