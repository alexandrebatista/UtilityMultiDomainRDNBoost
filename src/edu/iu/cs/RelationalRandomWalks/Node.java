package edu.iu.cs.RelationalRandomWalks;

import java.util.LinkedHashSet;

public class Node {

	public String name;
	public int Nodeid;
	public LinkedHashSet<Edge> IncomingEdge = new LinkedHashSet<Edge>();
	public LinkedHashSet<Edge> OutgoingEdge = new LinkedHashSet<Edge>();
	
	public Node(String xname,int xNodeid)
	{
		this.name = xname;
		this.Nodeid = xNodeid;
	}
	
	
}
