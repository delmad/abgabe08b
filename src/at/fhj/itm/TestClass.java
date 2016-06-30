package at.fhj.itm;

public class TestClass 
{

	public static void main(String[] args) 
	{
		StringQueue queue = new StringQueue(5);  // make a new Stack
		
		
		// Offer strings to the Queue
		queue.offer("Daten1");
		queue.offer("Daten2");
		queue.offer("Daten3");
		queue.offer("Daten4");
		queue.offer("Daten5");
		
		// Print out the strings
		String tmp = queue.peek();
		if (tmp != null)
			System.out.println("First element in queue: " + tmp);
		else
			System.out.println("Queue is empty");
		
		
		while (true)
		{
			try
			{
				String tmp2 = queue.remove();
				System.out.println(tmp2 + " got out of Queue");
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
				break;
			}
		}

	}

}
