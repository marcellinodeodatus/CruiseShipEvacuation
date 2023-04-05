package evacuation;

import java.util.PriorityQueue;


public class EvacueeQueue {
	private PriorityQueue<Evacuee> pq;

	public EvacueeQueue()
	{
		System.out.println("<<Constructor>>");
		pq = new PriorityQueue<Evacuee>();
	}

	public void add(Evacuee e)
	{
		System.out.println("<<add>>");
		pq.add(e);
	}

	public Evacuee getNextEvacuee()
	{
		System.out.println("<<getNextEvacuee>>");
		return pq.poll();
	}

	public int size(){
		int a = 0;
		a = pq.size();
		return a;
	}
}