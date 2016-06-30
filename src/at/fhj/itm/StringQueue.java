package at.fhj.itm;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * 
 * @author Damad
 * 
 * Adds the element obj to the queue. 
 * If the addition is successful, the method returns true else false.
 * @param obj
 * @return
 */
public class StringQueue implements Queue 
{ 
	List<String> queue = new ArrayList<String>();
	private int maxString; 
	
	public StringQueue(int maxString)
	{
		this.maxString = maxString;
	}
	
	
	@Override
	/**
	 *  Returns the head (first) element and also deletes it. That is, we cannot get it again. 
	 *  If no element exists (when queue is empty), the method returns null.
	 *  
	 *  
	 *  @return 
	 */
	public boolean offer(String obj) 
	{
		if (queue.size() == maxString)
		{
			return false;
		}

		queue.add(obj);
		return true;
	}

	@Override
	/**
	 * It also returns and deletes the head element like poll(), but with a small difference. 
	 * This method throws NoSuchElementException if the queue is empty. 
	 * 
	 * @return
	 */
	public String poll() 
	{
		if (queue.size() == 0)
		{
			return null;
		}

		String tmp = queue.get(0);
		queue.remove(0);
		return tmp;
	}

	@Override
	/**
	 *  Returns the head element but it does not delete it. That is, we can get it again. 
	 *  Returns null when the queue is empty. 
	 *  @return
	 */
	public String remove() 
	{
		if (queue.size() == 0)
		{
			throw new NoSuchElementException();
		}

		String erg = queue.get(0);
		queue.remove(0);
		return erg;
	}

	@Override
	/**
	 *  It works similar to peek() but with a small difference (returns but does not delete the element). 
	 *  It throws NoSuchElementException when the queue is empty.
	 * @return
	 */
	public String peek() 
	{
		if (queue.size() == 0)
		{
			return null;
		}

		return queue.get(0);
	}

	@Override
	public String element() 
	{
		if (queue.size() == 0)
		{
			throw new NoSuchElementException();
		}

		return queue.get(0);
	}

}
