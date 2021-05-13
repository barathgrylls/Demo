package Practice;

public class PageCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * input 
		 * int n=6; no of pages
			int p=2; which page to go
			
			output : min page to turn 
		 */
		int n=6;
		int p=2;
		
		
		
		
		int solution = 0;
        int totalTurn = n/2 ;
        int pageTurnFromBeg = p/2;
        int pageTurnFromEnd = totalTurn-pageTurnFromBeg;

        if(pageTurnFromBeg>pageTurnFromEnd){

            solution =pageTurnFromEnd;
        }else{
            solution =pageTurnFromBeg;

        }
        System.out.println(solution);
	}

}
