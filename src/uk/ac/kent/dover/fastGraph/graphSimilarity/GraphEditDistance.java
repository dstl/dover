package uk.ac.kent.dover.fastGraph.graphSimilarity;

import java.util.HashMap;

import uk.ac.kent.dover.fastGraph.*;
import uk.ac.kent.dover.fastGraph.editOperation.*;

/**
 * @author Peter Rodgers
 *
 */
public abstract class GraphEditDistance extends GraphSimilarity {

	HashMap<Integer,Double> editCosts;
	EditList editList;


	/**
	 * use this to define editCosts in the constructor. Typically used
	 * to give all editCosts entries default values of 1.0
	 * 
	 * @param editOperations gives the allowed operations and their cost
	 */
	public GraphEditDistance() {
		super();
	}
	
	
	/**
	 * defaults to treating graph as undirected.
	 * 
	 * @param editOperations gives the allowed operations and their cost
	 */
	public GraphEditDistance(HashMap<Integer,Double> editCosts) {
		super();
		this.editCosts = editCosts;
	}

	/**
	 * @param directed true if the graph should be treated as directed, false if undirected
	 * @param editOperations gives the allowed operations by edit code and their cost
	 */
	public GraphEditDistance(boolean directed,HashMap<Integer,Double> editCosts) {
		super(directed);
		this.editCosts = editCosts;
	}

	/**
	 * @return returns the edit list after the algorithm has run
	 */
	EditList getEditList() {return editList;}
	
	/**
	 * This returns the graph edit distance calculation between the two graphs. 
	 * Zero means the graphs are isomorphic. Greater values mean more dissimilarity. 
	 * 
	 * @param g1 the first graph to be compared.
	 * @param g2 the second graph to be compared.
	 * @return the cost of the edits between two graphs.
	 */
	@Override
	public abstract double similarity(FastGraph g1, FastGraph g2);	
	

}