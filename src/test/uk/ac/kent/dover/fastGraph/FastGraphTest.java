package test.uk.ac.kent.dover.fastGraph;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import uk.ac.kent.displayGraph.*;
import uk.ac.kent.dover.fastGraph.*;
import uk.ac.kent.dover.fastGraph.Util;

import org.junit.*;


/**
 * 
 * @author Peter Rodgers
 * @author Rob Baker
 *
 */
public class FastGraphTest {

	@Test
	public void test001() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get0Node0Edge(),false);
		assertEquals(0,g.getNumberOfNodes());
	}
		
	@Test
	public void test002() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get0Node0Edge(),false);
		assertEquals(0,g.getNumberOfEdges());
	}
	
	@Test
	public void test003() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get0Node0Edge(),false);
		assertTrue(g.isConnected());
	}
	
	@Test
	public void test004() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get0Node0Edge(),true);
		assertEquals(0,g.getNumberOfNodes());
		
	}
	
	@Test
	public void test005() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get0Node0Edge(),true);
		assertEquals(0,g.getNumberOfEdges());
		
	}
	
	@Test
	public void test006() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get0Node0Edge(),true);
		assertTrue(g.isConnected());
	}
	
	@Test
	public void test007() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get1Node0Edge(),false);
		assertEquals(1,g.getNumberOfNodes());
	}
	
	@Test
	public void test008() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get1Node0Edge(),false);
		assertEquals(0,g.getNumberOfEdges());
	}
	
	@Test
	public void test009() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get1Node0Edge(),false);
		assertTrue(g.isConnected());
	}
	
	@Test
	public void test010() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get1Node0Edge(),true);
		assertEquals(1,g.getNumberOfNodes());
	}
	
	@Test
	public void test011() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get1Node0Edge(),true);
		assertEquals(0,g.getNumberOfEdges());
	}
	
	@Test
	public void test012() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get1Node0Edge(),true);
		assertTrue(g.isConnected());
	}
	
	@Test
	public void test013() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node0Edge(),false);
		assertEquals(2,g.getNumberOfNodes());
	}
	
	@Test
	public void test014() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node0Edge(),false);
		assertEquals(0,g.getNumberOfEdges());
	}
	
	@Test
	public void test015() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node0Edge(),false);
		assertFalse(g.isConnected());
	}
	
	@Test
	public void test016() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node0Edge(),false);
		assertEquals("node label 0",g.getNodeLabel(0));
	}
	
	@Test
	public void test017() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node0Edge(),false);
		assertEquals(12,g.getNodeWeight(0));
	}
	
	@Test
	public void test018() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node0Edge(),false);
		assertEquals(1,g.getNodeType(0));
	}
	
	@Test
	public void test019() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node0Edge(),false);
		assertEquals(-1,g.getNodeAge(0));
	}
	
	@Test
	public void test020() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node0Edge(),false);
		assertEquals("node label 1",g.getNodeLabel(1));
	}
	
	@Test
	public void test021() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node0Edge(),false);
		assertEquals(6,g.getNodeWeight(1));
	}
	
	@Test
	public void test022() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node0Edge(),false);
		assertEquals(0,g.getNodeType(1));
	}
	
	@Test
	public void test023() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node0Edge(),false);
		assertEquals(4,g.getNodeAge(1));
	}
	
	@Test
	public void test024() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node0Edge(),true);
		assertEquals(2,g.getNumberOfNodes());
	}
	
	@Test
	public void test025() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node0Edge(),true);
		assertEquals(0,g.getNumberOfEdges());
	}
	
	@Test
	public void test026() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node0Edge(),true);
		assertFalse(g.isConnected());
	}
	
	@Test
	public void test027() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node0Edge(),true);
		assertEquals("node label 0",g.getNodeLabel(0));
	}
	
	@Test
	public void test028() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node0Edge(),true);
		assertEquals(12,g.getNodeWeight(0));
	}
	
	@Test
	public void test029() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node0Edge(),true);
		assertEquals(1,g.getNodeType(0));
	}
	
	@Test
	public void test030() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node0Edge(),true);
		assertEquals(-1,g.getNodeAge(0));
	}
	
	@Test
	public void test031() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node0Edge(),true);
		assertEquals("node label 1",g.getNodeLabel(1));
	}
	
	@Test
	public void test032() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node0Edge(),true);
		assertEquals(6,g.getNodeWeight(1));
	}
	
	@Test
	public void test033() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node0Edge(),true);
		assertEquals(0,g.getNodeType(1));
	}
	
	@Test
	public void test034() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node0Edge(),true);
		assertEquals(4,g.getNodeAge(1));
	}
	
	@Test
	public void test035() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node1Edge(),false);
		assertEquals(2,g.getNumberOfNodes());
	}
	
	@Test
	public void test036() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node1Edge(),false);
		assertEquals(1,g.getNumberOfEdges());
	}
	
	@Test
	public void test037() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node1Edge(),false);
		assertTrue(g.isConnected());
	}
	
	@Test
	public void test038() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node1Edge(),true);
		assertEquals(2,g.getNumberOfNodes());
	}
	
	@Test
	public void test039() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node1Edge(),true);
		assertEquals(1,g.getNumberOfEdges());
	}
	
	@Test
	public void test040() {
		
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node1Edge(),true);
		assertTrue(g.isConnected());
	}
	
	@Test
	public void test041() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),true);
		assertEquals(2,g.getNumberOfNodes());
	}
	
	@Test
	public void test042() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),true);
		assertEquals(2,g.getNumberOfEdges());
	}
	
	@Test
	public void test043() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),true);
		assertTrue(g.isConnected());
	}
	
	@Test
	public void test044() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),false);
		assertEquals("node label 0",g.getNodeLabel(0));
	}
	
	@Test
	public void test045() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),false);
		assertEquals(12,g.getNodeWeight(0));
	}
	
	@Test
	public void test046() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),false);
		assertEquals(1,g.getNodeType(0));
	}
	
	@Test
	public void test047() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),false);
		assertEquals(-1,g.getNodeAge(0));
	}
	
	@Test
	public void test048() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),false);
		assertEquals("edge label 0",g.getEdgeLabel(0));
	}
	
	@Test
	public void test049() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),false);
		assertEquals(0,g.getEdgeNode1(0));
	}
	
	@Test
	public void test050() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),false);
		assertEquals(1,g.getEdgeNode2(0));
	}
	
	@Test
	public void test051() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),false);
		assertEquals(43,g.getEdgeWeight(0));
	}
	
	@Test
	public void test052() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),false);
		assertEquals(6,g.getEdgeType(0));
	}
	
	@Test
	public void test053() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),false);
		assertEquals(-1,g.getEdgeAge(0));
	}
	
	@Test
	public void test054() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),false);
		assertEquals("edge label 1",g.getEdgeLabel(1));
	}
	
	@Test
	public void test055() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),false);
		assertEquals(0,g.getEdgeNode1(1));
	}
	
	@Test
	public void test056() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),false);
		assertEquals(0,g.getEdgeNode2(1));
	}
	
	@Test
	public void test057() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),false);
		assertEquals(32,g.getEdgeWeight(1));
	}
	
	@Test
	public void test058() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),false);
		assertEquals(9,g.getEdgeType(1));
	}
	
	@Test
	public void test059() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),false);
		assertEquals(4,g.getEdgeAge(1));
	}
	
	@Test
	public void test060() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),true);
		assertEquals("node label 0",g.getNodeLabel(0));
	}
	
	@Test
	public void test061() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),true);
		assertEquals(12,g.getNodeWeight(0));
	}
	
	@Test
	public void test062() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),true);
		assertEquals(1,g.getNodeType(0));
	}
	
	@Test
	public void test063() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),true);
		assertEquals(-1,g.getNodeAge(0));
	}
	
	@Test
	public void test064() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),true);
		assertEquals("edge label 0",g.getEdgeLabel(0));
	}
	
	@Test
	public void test065() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),true);
		assertEquals(0,g.getEdgeNode1(0));
	}
	
	@Test
	public void test066() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),true);
		assertEquals(1,g.getEdgeNode2(0));
	}
	
	@Test
	public void test067() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),true);
		assertEquals(43,g.getEdgeWeight(0));
	}
	
	@Test
	public void test068() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),true);
		assertEquals(6,g.getEdgeType(0));
	}
	
	@Test
	public void test069() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),true);
		assertEquals(-1,g.getEdgeAge(0));
	}
	
	@Test
	public void test070() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),true);
		assertEquals("edge label 1",g.getEdgeLabel(1));
	}
	
	@Test
	public void test071() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),true);
		assertEquals(0,g.getEdgeNode1(1));
	}
	
	@Test
	public void test072() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),true);
		assertEquals(0,g.getEdgeNode2(1));
	}
	
	@Test
	public void test073() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),true);
		assertEquals(32,g.getEdgeWeight(1));
	}
	
	@Test
	public void test074() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),true);
		assertEquals(9,g.getEdgeType(1));
	}
	
	@Test
	public void test075() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),true);
		assertEquals(4,g.getEdgeAge(1));
	}
	
	@Test
	public void test076() {
		FastGraph g = FastGraph.randomGraphFactory(0, 0, false);
		assertEquals(0,g.getNumberOfNodes());
		assertEquals(0,g.getNumberOfEdges());
		assertTrue(g.isConnected());
	}
	
	@Test
	public void test077() {
		FastGraph g = FastGraph.randomGraphFactory(0, 0, true);
		assertEquals(0,g.getNumberOfNodes());
		assertEquals(0,g.getNumberOfEdges());
		assertTrue(g.isConnected());
	}
	
	@Test
	public void test078() {
		FastGraph g = FastGraph.randomGraphFactory(10, 5, false);
		assertEquals(10,g.getNumberOfNodes());
		assertEquals(5,g.getNumberOfEdges());
		assertFalse(g.isConnected());
	}
	
	@Test
	public void test079() {
		FastGraph g = FastGraph.randomGraphFactory(10, 5, true);
		assertEquals(10,g.getNumberOfNodes());
		assertEquals(5,g.getNumberOfEdges());
		assertFalse(g.isConnected());
	}
	
	@Test
	public void test080() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get5Node4Edge(),true);
		assertFalse(g.isConnected());
	}
	
	@Test
	public void test081() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get1Node0Edge(),false);
		assertEquals(0,g.getNodeInDegree(0));
		assertEquals(0,g.getNodeOutDegree(0));
		assertEquals(0,g.getNodeOutDegree(0));
	}

	@Test
	public void test082() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node1Edge(),false);
		assertEquals(0,g.getNodeInDegree(0));
		assertEquals(1,g.getNodeOutDegree(0));
		assertEquals(1,g.getNodeDegree(0));
	}
	
	@Test
	public void test083() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node1Edge(),true);
		assertEquals(1,g.getNodeInDegree(1));
		assertEquals(0,g.getNodeOutDegree(1));
		assertEquals(1,g.getNodeDegree(1));
	}
	
	@Test
	public void test084() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get4Node5Edge(),false);
		assertEquals(0,g.getNodeInDegree(0));
		assertEquals(2,g.getNodeOutDegree(0));
		assertEquals(2,g.getNodeDegree(0));
	}
	
	@Test
	public void test085() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get4Node5Edge(),false);
		assertEquals(2,g.getNodeInDegree(1));
		assertEquals(1,g.getNodeOutDegree(1));
		assertEquals(3,g.getNodeDegree(1));
	}
	
	@Test
	public void test086() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get4Node5Edge(),true);
		assertEquals(1,g.getNodeInDegree(2));
		assertEquals(2,g.getNodeOutDegree(2));
		assertEquals(3,g.getNodeDegree(2));
	}
	
	@Test
	public void test087() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get4Node5Edge(),true);
		assertEquals(2,g.getNodeInDegree(3));
		assertEquals(0,g.getNodeOutDegree(3));
		assertEquals(2,g.getNodeDegree(3));
	}
	
	@Test
	public void test088() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),false);
		assertEquals(1,g.getNodeInDegree(0));
		assertEquals(2,g.getNodeOutDegree(0));
		assertEquals(3,g.getNodeDegree(0));
	}
	
	@Test
	public void test089() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),false);
		assertEquals(1,g.getNodeInDegree(1));
		assertEquals(0,g.getNodeOutDegree(1));
		assertEquals(1,g.getNodeDegree(1));
	}
	
	@Test
	public void test090() throws IOException {
		FastGraph g = FastGraph.jsonStringGraphFactory(get0Node0Edge(),false);
		g.saveBuffers(null,"test");
		FastGraph g2 = FastGraph.loadBuffersGraphFactory(null,"test");
		assertEquals("empty",g2.getName());
		assertEquals(0,g2.getNumberOfNodes());
		assertEquals(0,g2.getNumberOfEdges());
	}
	
	@Test
	public void test091() throws IOException {
		FastGraph g = FastGraph.jsonStringGraphFactory(get4Node5Edge(),false);
		g.saveBuffers(null,"test");
		FastGraph g2 = FastGraph.loadBuffersGraphFactory(null,"test");
		assertEquals("four nodes, five edges",g2.getName());
		assertEquals(4,g2.getNumberOfNodes());
		assertEquals(5,g2.getNumberOfEdges());
		assertEquals(0,g2.getNodeInDegree(0));
		assertEquals(1,g2.getNodeOutDegree(1));
		assertEquals(2,g2.getNodeOutDegree(2));
		assertEquals(0,g2.getNodeOutDegree(3));
		assertEquals(2,g2.getNodeInDegree(3));
		assertTrue(g2.isConnected());
	}

	@Test
	public void test092() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get1Node0Edge(),false);
		int[] connections;
		connections = g.getNodeConnectingNodes(0);
		assertEquals(0,connections.length);
		connections = g.getNodeConnectingEdges(0);
		assertEquals(0,connections.length);
		connections = g.getNodeConnectingInNodes(0);
		assertEquals(0,connections.length);
		connections = g.getNodeConnectingInEdges(0);
		assertEquals(0,connections.length);
		connections = g.getNodeConnectingOutNodes(0);
		assertEquals(0,connections.length);
		connections = g.getNodeConnectingOutEdges(0);
		assertEquals(0,connections.length);
	}
	
	@Test
	public void test093() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get2Node1Edge(),true);
		int[] connections;
		connections = g.getNodeConnectingNodes(0);
		assertEquals(1,connections.length);
		assertEquals(1,connections[0]);
		connections = g.getNodeConnectingEdges(0);
		assertEquals(1,connections.length);
		assertEquals(0,connections[0]);
		connections = g.getNodeConnectingInNodes(0);
		assertEquals(0,connections.length);
		connections = g.getNodeConnectingInEdges(0);
		assertEquals(0,connections.length);
		connections = g.getNodeConnectingOutNodes(0);
		assertEquals(1,connections.length);
		assertEquals(1,connections[0]);
		connections = g.getNodeConnectingOutEdges(0);
		assertEquals(1,connections.length);
		assertEquals(0,connections[0]);
		
		connections = new int[10];
		g.getNodeConnectingNodes(connections,0);
		assertEquals(1,connections[0]);
		g.getNodeConnectingEdges(connections,0);
		assertEquals(0,connections[0]);
		g.getNodeConnectingOutNodes(connections,0);
		assertEquals(1,connections[0]);
		g.getNodeConnectingOutEdges(connections,0);
		assertEquals(0,connections[0]);
	}

	@Test
	public void test094() {
		FastGraph g = FastGraph.jsonStringGraphFactory(get4Node5Edge(),true);
		int[] connections;
		connections = g.getNodeConnectingNodes(2);
		assertEquals(3,connections.length);
		assertEquals(3,connections[2]);
		connections = g.getNodeConnectingEdges(2);
		assertEquals(3,connections.length);
		assertEquals(4,connections[2]);
		connections = g.getNodeConnectingInNodes(2);
		assertEquals(1,connections.length);
		assertEquals(0,connections[0]);
		connections = g.getNodeConnectingInEdges(2);
		assertEquals(1,connections.length);
		assertEquals(1,connections[0]);
		connections = g.getNodeConnectingOutNodes(2);
		assertEquals(2,connections.length);
		assertEquals(3,connections[1]);
		connections = g.getNodeConnectingOutEdges(2);
		assertEquals(2,connections.length);
		assertEquals(4,connections[1]);
		
		connections = new int[10];
		g.getNodeConnectingNodes(connections,2);
		assertEquals(3,connections[2]);
		g.getNodeConnectingEdges(connections,2);
		assertEquals(4,connections[2]);
		g.getNodeConnectingInNodes(connections,2);
		assertEquals(0,connections[0]);
		g.getNodeConnectingInEdges(connections,2);
		assertEquals(1,connections[0]);
		g.getNodeConnectingOutNodes(connections,2);
		assertEquals(3,connections[1]);
		g.getNodeConnectingOutEdges(connections,2);
		assertEquals(4,connections[1]);

	}

	@Test
	public void test095() throws Exception {
		FastGraph g = FastGraph.adjacencyListGraphFactory(0, 0, Launcher.startingWorkingDirectory+File.separatorChar+"data"+File.separatorChar+"test", "testAdj1.txt", false);
		assertEquals(0,g.getNumberOfNodes());
		assertEquals(0,g.getNumberOfEdges());
		assertTrue(g.isConnected());
	}

	@Test
	public void test096() throws Exception {
		FastGraph g = FastGraph.adjacencyListGraphFactory(2, 1, Launcher.startingWorkingDirectory+File.separatorChar+"data"+File.separatorChar+"test", "testAdj2.txt", true);
		assertEquals("testAdj2.txt",g.getName());
		assertEquals(2,g.getNumberOfNodes());
		assertEquals(1,g.getNumberOfEdges());
		int[] connections;
		connections = g.getNodeConnectingNodes(0);
		assertEquals(1,connections.length);
		assertEquals(1,connections[0]);
		connections = g.getNodeConnectingInEdges(1);
		assertEquals(1,connections.length);
		assertEquals(0,connections[0]);
		assertEquals("45",g.getNodeLabel(0));
		assertEquals("76",g.getNodeLabel(1));
		assertTrue(g.isConnected());
	}


	@Test
	public void test097() throws Exception {
		FastGraph g = FastGraph.adjacencyListGraphFactory(4, 4, Launcher.startingWorkingDirectory+File.separatorChar+"data"+File.separatorChar+"test", "testAdj3.txt", false);
		int[] connections;
		connections = g.getNodeConnectingOutNodes(0);
		assertEquals(1,connections.length);
		assertEquals(1,connections[0]);
		connections = g.getNodeConnectingInEdges(2);
		assertEquals(1,connections.length);
		assertEquals(1,connections[0]);
		assertTrue(g.isConnected());
	}

	@Test
	public void test098() {
		FastGraph g;
		g = FastGraph.jsonStringGraphFactory(get0Node0Edge(),false);
		assertEquals(0,g.maximumDegree());
		g = FastGraph.jsonStringGraphFactory(get1Node0Edge(),false);
		assertEquals(0,g.maximumDegree());
		g = FastGraph.jsonStringGraphFactory(get2Node1Edge(),false);
		assertEquals(1,g.maximumDegree());
		g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),true);
		assertEquals(3,g.maximumDegree());
		g = FastGraph.jsonStringGraphFactory(get4Node5Edge(),true);
		assertEquals(3,g.maximumDegree());
	}

	@Test
	public void test099() {
		FastGraph g;
		g = FastGraph.jsonStringGraphFactory(get1Node0Edge(),false);
		assertEquals(Arrays.deepToString(new int[][]{{0}}),Arrays.deepToString(g.buildIntAdjacencyMatrix()));
		g = FastGraph.jsonStringGraphFactory(get2Node1Edge(),false);
		assertEquals(Arrays.deepToString(new int[][]{{0,1},{1,0}}),Arrays.deepToString(g.buildIntAdjacencyMatrix()));
		g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),true);
		assertEquals(Arrays.deepToString(new int[][]{{2,1},{1,0}}),Arrays.deepToString(g.buildIntAdjacencyMatrix()));
		g = FastGraph.jsonStringGraphFactory(get4Node5Edge(),true);
		assertEquals(Arrays.deepToString(new int[][]{{0,1,1,0},{1,0,1,1},{1,1,0,1},{0,1,1,0}}),Arrays.deepToString(g.buildIntAdjacencyMatrix()));
		g = FastGraph.jsonStringGraphFactory(get5Node5Edge(),true);
		assertEquals(Arrays.deepToString(new int[][]{{0,1,1,0,0},{1,0,1,0,0},{1,1,0,1,0},{0,0,1,0,1},{0,0,0,1,0}}),Arrays.deepToString(g.buildIntAdjacencyMatrix()));
		g = FastGraph.jsonStringGraphFactory(get5Node4Edge(),true);
		assertEquals(Arrays.deepToString(new int[][]{{0,1,1,0,0},{1,0,1,0,0},{1,1,0,0,0},{0,0,0,0,1},{0,0,0,1,0}}),Arrays.deepToString(g.buildIntAdjacencyMatrix()));
	
	}
	
	@Test
	public void test099b() {
		FastGraph g;
		g = FastGraph.jsonStringGraphFactory(get1Node0Edge(),false);
		assertEquals(Arrays.deepToString(new boolean[][]{{false}}),Arrays.deepToString(g.buildBooleanAdjacencyMatrix()));
		g = FastGraph.jsonStringGraphFactory(get2Node1Edge(),false);
		assertEquals(Arrays.deepToString(new boolean[][]{{false,true},{true,false}}),Arrays.deepToString(g.buildBooleanAdjacencyMatrix()));
		g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),true);
		assertEquals(Arrays.deepToString(new boolean[][]{{true,true},{true,false}}),Arrays.deepToString(g.buildBooleanAdjacencyMatrix()));
		g = FastGraph.jsonStringGraphFactory(get4Node5Edge(),true);
		assertEquals(Arrays.deepToString(new boolean[][]{{false,true,true,false},{true,false,true,true},{true,true,false,true},{false,true,true,false}}),Arrays.deepToString(g.buildBooleanAdjacencyMatrix()));
	}
 
	@Test
	public void test100() {
		FastGraph g;
		g = FastGraph.jsonStringGraphFactory(get1Node0Edge(),false);
		assertEquals(Arrays.deepToString(new int[][]{{0}}),Arrays.deepToString(g.buildIntDirectedAdjacencyMatrix()));
		g = FastGraph.jsonStringGraphFactory(get2Node1Edge(),false);
		assertEquals(Arrays.deepToString(new int[][]{{0,1},{0,0}}),Arrays.deepToString(g.buildIntDirectedAdjacencyMatrix()));
		g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),true);
		assertEquals(Arrays.deepToString(new int[][]{{1,1},{0,0}}),Arrays.deepToString(g.buildIntDirectedAdjacencyMatrix()));
		g = FastGraph.jsonStringGraphFactory(get4Node5Edge(),true);
		assertEquals(Arrays.deepToString(new int[][]{{0,1,1,0},{0,0,0,1},{0,1,0,1},{0,0,0,0}}),Arrays.deepToString(g.buildIntDirectedAdjacencyMatrix()));
	}
	
	@Test
	public void test100b() {
		FastGraph g;
		g = FastGraph.jsonStringGraphFactory(get1Node0Edge(),false);
		assertEquals(Arrays.deepToString(new boolean[][]{{false}}),Arrays.deepToString(g.buildBooleanDirectedAdjacencyMatrix()));
		g = FastGraph.jsonStringGraphFactory(get2Node1Edge(),false);
		assertEquals(Arrays.deepToString(new boolean[][]{{false,true},{false,false}}),Arrays.deepToString(g.buildBooleanDirectedAdjacencyMatrix()));
		g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),true);
		assertEquals(Arrays.deepToString(new boolean[][]{{true,true},{false,false}}),Arrays.deepToString(g.buildBooleanDirectedAdjacencyMatrix()));
		g = FastGraph.jsonStringGraphFactory(get4Node5Edge(),true);
		assertEquals(Arrays.deepToString(new boolean[][]{{false,true,true,false},{false,false,false,true},{false,true,false,true},{false,false,false,false}}),Arrays.deepToString(g.buildBooleanDirectedAdjacencyMatrix()));
	}
	
	
	@Test
	public void test101() {
		FastGraph g;
		g = FastGraph.jsonStringGraphFactory(get1Node0Edge(),false);
		assertEquals(Arrays.toString(new double[]{0}),Arrays.toString(g.findEigenvalues(g.buildIntDirectedAdjacencyMatrix())));
		g = FastGraph.jsonStringGraphFactory(get2Node1Edge(),false);
		assertEquals(Arrays.toString(new double[]{0,0}),Arrays.toString(g.findEigenvalues(g.buildIntDirectedAdjacencyMatrix())));
		g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),false);
		assertEquals(Arrays.toString(new double[]{0,1}),Arrays.toString(g.findEigenvalues(g.buildIntDirectedAdjacencyMatrix())));
		g = FastGraph.jsonStringGraphFactory(get4Node5Edge(),false);
		assertEquals(Arrays.toString(new double[]{0,0,0,0}),Arrays.toString(g.findEigenvalues(g.buildIntDirectedAdjacencyMatrix())));
	}
	
	@Test
	public void test101b() {
		FastGraph g;
		g = FastGraph.jsonStringGraphFactory(get1Node0Edge(),false);
		assertEquals(Arrays.toString(new double[]{0}),Arrays.toString(g.findEigenvalues(g.buildBooleanDirectedAdjacencyMatrix())));
		g = FastGraph.jsonStringGraphFactory(get2Node1Edge(),false);
		assertEquals(Arrays.toString(new double[]{0,0}),Arrays.toString(g.findEigenvalues(g.buildBooleanDirectedAdjacencyMatrix())));
		g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),false);
		assertEquals(Arrays.toString(new double[]{0,1}),Arrays.toString(g.findEigenvalues(g.buildBooleanDirectedAdjacencyMatrix())));
		g = FastGraph.jsonStringGraphFactory(get4Node5Edge(),false);
		assertEquals(Arrays.toString(new double[]{0,0,0,0}),Arrays.toString(g.findEigenvalues(g.buildBooleanDirectedAdjacencyMatrix())));
	}
	
	@Test
	public void test101c() {
		FastGraph g;
		g = FastGraph.jsonStringGraphFactory(get1Node0Edge(),false);
		assertEquals(Arrays.toString(new int[]{0,3,3,5,5}),Arrays.toString(Util.roundArray(g.findEigenvalues(new int[][]{{4,-1,-1,-1,-1},{-1,3,-1,0,1},{-1,-1,3,-1,0},{-1,0,-1,3,-1},{-1,-1,0,-1,3}}))));
		g = FastGraph.jsonStringGraphFactory(get1Node0Edge(),false);
		assertEquals(Arrays.toString(new int[]{-2,-1,1,2}),Arrays.toString(Util.roundArray(g.findEigenvalues(new int[][]{{0,1,0,0},{1,0,1,0},{0,1,0,1},{0,0,1,0}}))));
	}
	
	@Test
	public void test102() {
		FastGraph g;
		g = FastGraph.jsonStringGraphFactory(get0Node0Edge(),false);
		Graph displayGraph = g.generateDisplayGraph();
		assertEquals(g.getName(),displayGraph.getLabel());
		assertEquals(0,displayGraph.getNodes().size());
		assertEquals(0,displayGraph.getEdges().size());
	}
	
	@Test
	public void test103() {
		FastGraph g;
		g = FastGraph.jsonStringGraphFactory(get1Node0Edge(),false);
		Graph displayGraph = g.generateDisplayGraph();
		assertEquals(g.getName(),displayGraph.getLabel());
		assertEquals(1,displayGraph.getNodes().size());
		assertEquals(0,displayGraph.getEdges().size());
		assertEquals(g.getNodeLabel(0),displayGraph.getNodes().get(0).getLabel());
		assertEquals(g.getNodeWeight(0),(int)(displayGraph.getNodes().get(0).getScore()));
		assertEquals(g.getNodeAge(0),(int)(displayGraph.getNodes().get(0).getAge()));
		assertEquals(Byte.toString(g.getNodeType(0)),displayGraph.getNodes().get(0).getType().getLabel());
	}
	
	@Test
	public void test104() {
		FastGraph g;
		g = FastGraph.jsonStringGraphFactory(get2Node1Edge(),false);
		Graph displayGraph = g.generateDisplayGraph();
		assertEquals(g.getName(),displayGraph.getLabel());
		assertEquals(2,displayGraph.getNodes().size());
		assertEquals(1,displayGraph.getEdges().size());
		assertEquals(g.getNodeLabel(1),displayGraph.getNodes().get(1).getLabel());
		assertEquals(g.getNodeWeight(1),(int)(displayGraph.getNodes().get(1).getScore()));
		assertEquals(g.getNodeAge(1),(int)(displayGraph.getNodes().get(1).getAge()));
		assertEquals(Byte.toString(g.getNodeType(1)),displayGraph.getNodes().get(1).getType().getLabel());
		assertEquals(g.getEdgeLabel(0),displayGraph.getEdges().get(0).getLabel());
		assertEquals(g.getEdgeWeight(0),(int)(displayGraph.getEdges().get(0).getScore()));
		assertEquals(g.getEdgeAge(0),(int)(displayGraph.getEdges().get(0).getAge()));
		assertEquals(Byte.toString(g.getEdgeType(0)),displayGraph.getEdges().get(0).getType().getLabel());
		assertEquals(g.getNodeLabel(0),displayGraph.getEdges().get(0).getFrom().getLabel());
		assertEquals(g.getNodeLabel(1),displayGraph.getEdges().get(0).getTo().getLabel());
	}
	
	@Test
	public void test105() {
		FastGraph g;
		g = FastGraph.jsonStringGraphFactory(get2Node2Edge(),false);
		Graph displayGraph = g.generateDisplayGraph();
		assertEquals(g.getName(),displayGraph.getLabel());
		assertEquals(2,displayGraph.getNodes().size());
		assertEquals(2,displayGraph.getEdges().size());
		assertEquals(g.getNodeLabel(0),displayGraph.getNodes().get(0).getLabel());
		assertEquals(g.getNodeWeight(0),(int)(displayGraph.getNodes().get(0).getScore()));
		assertEquals(g.getNodeAge(0),(int)(displayGraph.getNodes().get(0).getAge()));
		assertEquals(Byte.toString(g.getNodeType(0)),displayGraph.getNodes().get(0).getType().getLabel());
		assertEquals(g.getEdgeLabel(1),displayGraph.getEdges().get(1).getLabel());
		assertEquals(g.getEdgeWeight(1),(int)(displayGraph.getEdges().get(1).getScore()));
		assertEquals(Byte.toString(g.getEdgeType(1)),displayGraph.getEdges().get(1).getType().getLabel());
		assertEquals(g.getNodeLabel(0),displayGraph.getEdges().get(1).getFrom().getLabel());
		assertEquals(g.getNodeLabel(0),displayGraph.getEdges().get(1).getTo().getLabel());
	}
	
	@Test
	public void test106() {
		FastGraph g;
		g = FastGraph.jsonStringGraphFactory(get5Node5Edge(),false);
		Graph displayGraph = g.generateDisplayGraph();
		assertEquals(g.getName(),displayGraph.getLabel());
		assertEquals(5,displayGraph.getNodes().size());
		assertEquals(5,displayGraph.getEdges().size());
		assertEquals(g.getNodeLabel(4),displayGraph.getNodes().get(4).getLabel());
		assertEquals(g.getNodeWeight(4),(int)(displayGraph.getNodes().get(4).getScore()));
		assertEquals(g.getNodeAge(4),(int)(displayGraph.getNodes().get(4).getAge()));
		assertEquals(Byte.toString(g.getNodeType(4)),displayGraph.getNodes().get(4).getType().getLabel());
		assertEquals(g.getEdgeLabel(4),displayGraph.getEdges().get(4).getLabel());
		assertEquals(g.getEdgeWeight(4),(int)(displayGraph.getEdges().get(4).getScore()));
		assertEquals(g.getEdgeAge(4),(int)(displayGraph.getEdges().get(4).getAge()));
		assertEquals(Byte.toString(g.getEdgeType(4)),displayGraph.getEdges().get(4).getType().getLabel());
		assertEquals(g.getNodeLabel(3),displayGraph.getEdges().get(4).getFrom().getLabel());
		assertEquals(g.getNodeLabel(4),displayGraph.getEdges().get(4).getTo().getLabel());
	}
	
	@Test
	public void test107() {
		Graph displayGraph = new Graph("empty");
		FastGraph g = FastGraph.displayGraphFactory(displayGraph,false);
		
		assertEquals(g.getName(),displayGraph.getLabel());
		assertEquals(g.getNumberOfNodes(),displayGraph.getNodes().size());
		assertEquals(g.getNumberOfEdges(),displayGraph.getEdges().size());
		Graph displayGraph2 = g.generateDisplayGraph();
		assertTrue(displayGraph.isomorphic(displayGraph2));
	}
	
	@Test
	public void test108() {
		Graph displayGraph = new Graph("one node");
		Node n1 = new Node("node 1");
		n1.setScore(4.0);
		n1.setAge(19);
		n1.setType(new NodeType("3"));
		displayGraph.addNode(n1);
		FastGraph g = FastGraph.displayGraphFactory(displayGraph,false);
		
		assertEquals(g.getName(),displayGraph.getLabel());
		assertEquals(g.getNumberOfNodes(),displayGraph.getNodes().size());
		assertEquals(g.getNumberOfEdges(),displayGraph.getEdges().size());
		assertEquals(g.getNodeWeight(0),(int)(displayGraph.getNodes().get(0).getScore()));
		assertEquals(Byte.toString(g.getNodeType(0)),displayGraph.getNodes().get(0).getType().getLabel());
		assertEquals(g.getNodeAge(0),displayGraph.getNodes().get(0).getAge());
		assertEquals(g.getNodeLabel(0),displayGraph.getNodes().get(0).getLabel());
		assertEquals(g.getNodeInDegree(0),0);
		assertEquals(g.getNodeOutDegree(0),0);
		Graph displayGraph2 = g.generateDisplayGraph();
		assertTrue(displayGraph.isomorphic(displayGraph2));
	}
	
	@Test
	public void test109() {
		Graph displayGraph = new Graph("two nodes, one edge");
		Node n1 = new Node("node 1");
		n1.setScore(4.0);
		n1.setAge(19);
		n1.setType(new NodeType("3"));
		displayGraph.addNode(n1);
		Node n2 = new Node("node 2");
		n2.setScore(-4.0);
		n2.setAge(-19);
		n2.setType(new NodeType("text label"));
		displayGraph.addNode(n2);
		Edge e1 = new Edge(n1,n2,"edge 1");
		e1.setScore(0.0);
		e1.setAge(-34);
		e1.setType(new EdgeType("14"));
		displayGraph.addEdge(e1);
		FastGraph g = FastGraph.displayGraphFactory(displayGraph,false);
		
		assertEquals(g.getName(),displayGraph.getLabel());
		assertEquals(g.getNumberOfNodes(),displayGraph.getNodes().size());
		assertEquals(g.getNumberOfEdges(),displayGraph.getEdges().size());
		assertEquals(g.getNodeWeight(1),(int)(displayGraph.getNodes().get(1).getScore()));
		assertEquals(g.getNodeType(1),-1);
		assertEquals(g.getNodeAge(1),displayGraph.getNodes().get(1).getAge());
		assertEquals(g.getNodeLabel(1),displayGraph.getNodes().get(1).getLabel());
		assertEquals(1,g.getNodeInDegree(1));
		assertEquals(0,g.getNodeOutDegree(1));
		assertEquals(0,g.getNodeInDegree(0));
		assertEquals(1,g.getNodeOutDegree(0));
		assertEquals(g.getEdgeWeight(0),(int)(displayGraph.getEdges().get(0).getScore()));
		assertEquals(Byte.toString(g.getEdgeType(0)),displayGraph.getEdges().get(0).getType().getLabel());
		assertEquals(g.getEdgeAge(0),displayGraph.getEdges().get(0).getAge());
		assertEquals(g.getEdgeLabel(0),displayGraph.getEdges().get(0).getLabel());
		assertEquals(g.getNodeLabel(g.getEdgeNode1(0)),"node 1");
		assertEquals(g.getNodeLabel(g.getEdgeNode2(0)),"node 2");
		Graph displayGraph2 = g.generateDisplayGraph();
		assertTrue(displayGraph.isomorphic(displayGraph2));
	}
	
	@Test
	public void test110() {
		Graph displayGraph = new Graph("two nodes, one edge");
		Node n1 = new Node("node 1");
		n1.setScore(4.0);
		n1.setAge(19);
		n1.setType(new NodeType("3"));
		displayGraph.addNode(n1);
		Node n2 = new Node("node 2");
		n2.setScore(-4.0);
		n2.setAge(-19);
		n2.setType(new NodeType("text label"));
		displayGraph.addNode(n2);
		Node n3 = new Node("node label 3");
		n3.setScore(0);
		n3.setAge(5);
		n3.setType(new NodeType("90"));
		displayGraph.addNode(n3);
		Node n4 = new Node("node 4");
		n4.setScore(45);
		n4.setAge(2);
		n4.setType(new NodeType("65"));
		displayGraph.addNode(n4);
		Edge e1 = new Edge(n1,n2,"edge 1");
		e1.setScore(0.0);
		e1.setAge(-34);
		e1.setType(new EdgeType("14"));
		displayGraph.addEdge(e1);
		Edge e2 = new Edge(n1,n1,"edge 2 label");
		e2.setScore(12);
		e2.setAge(8);
		e2.setType(new EdgeType("0"));
		displayGraph.addEdge(e2);
		Edge e3 = new Edge(n3,n1,"edge 3");
		e3.setScore(121);
		e3.setAge(81);
		e3.setType(new EdgeType("21"));
		displayGraph.addEdge(e3);
		Edge e4 = new Edge(n3,n1,"edge 4");
		e4.setScore(123);
		e4.setAge(83);
		e4.setType(new EdgeType("text label"));
		displayGraph.addEdge(e4);
		FastGraph g = FastGraph.displayGraphFactory(displayGraph,false);
		
		assertEquals(g.getName(),displayGraph.getLabel());
		assertEquals(g.getNumberOfNodes(),displayGraph.getNodes().size());
		assertEquals(g.getNumberOfEdges(),displayGraph.getEdges().size());
		assertEquals(g.getNodeWeight(3),(int)(displayGraph.getNodes().get(3).getScore()));
		assertEquals(Byte.toString(g.getNodeType(3)),displayGraph.getNodes().get(3).getType().getLabel());
		assertEquals(g.getNodeAge(3),displayGraph.getNodes().get(3).getAge());
		assertEquals(g.getNodeLabel(3),displayGraph.getNodes().get(3).getLabel());
		assertEquals(0,g.getNodeInDegree(3));
		assertEquals(0,g.getNodeOutDegree(3));
		assertEquals(3,g.getNodeInDegree(0));
		assertEquals(2,g.getNodeOutDegree(0));
		assertEquals(g.getEdgeWeight(3),(int)(displayGraph.getEdges().get(3).getScore()));
		assertEquals(g.getEdgeType(3),-1);
		assertEquals(g.getEdgeAge(3),displayGraph.getEdges().get(3).getAge());
		assertEquals(g.getEdgeLabel(3),displayGraph.getEdges().get(3).getLabel());
		assertEquals(g.getNodeLabel(g.getEdgeNode1(3)),"node label 3");
		assertEquals(g.getNodeLabel(g.getEdgeNode2(3)),"node 1");
		Graph displayGraph2 = g.generateDisplayGraph();
		assertTrue(displayGraph.isomorphic(displayGraph2));
	}
	

	//TODO Add tests here

	
	
	
	String get0Node0Edge() {
		String json = "{\n";
		json += "\"name\": \"empty\",\n";
		json += "\"nodes\": [],\n";
		json += "\"edges\": []\n";
		json += "}\n";
		return json;
	}
	
	public String get1Node0Edge() {
	
		String json = "{\n";
		json += "\"name\": \"one node, no edges\",\n";
		json += "\"nodes\": [\n";
		json += "{\n";
		json += "\"nodeId\": \"0\",\n";
		json += "\"nodeLabel\": \"node label 0\",\n";
		json += "\"nodeWeight\": \"12\",\n";
		json += "\"nodeType\": \"1\",\n";
		json += "\"nodeAge\": \"-1\"\n";
		json += "}\n";
		json += "],\n";
		json += "\"edges\": []\n";
		json += "}\n";
		return json;
	}
	
	int[][] get0Node0EdgeAdjMatrix() {
		return new int[][]{{0}};
	}
	
	public String get2Node0Edge() {
		String json = "{\n";
		json += "\"name\": \"two nodes, no edges\",\n";
		json += "\"nodes\": [\n";
		json += "{\n";
		json += "\"nodeId\": \"0\",\n";
		json += "\"nodeLabel\": \"node label 0\",\n";
		json += "\"nodeWeight\": \"12\",\n";
		json += "\"nodeType\": \"1\",\n";
		json += "\"nodeAge\": \"-1\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"nodeId\": \"1\",\n";
		json += "\"nodeLabel\": \"node label 1\",\n";
		json += "\"nodeWeight\": \"6\",\n";
		json += "\"nodeType\": \"0\",\n";
		json += "\"nodeAge\": \"4\"\n";
		json += "},\n";
		json += "],\n";
		json += "\"edges\": []\n";
		json += "}\n";
		return json;
	}
	
	int[][] get2Node0EdgeAdjMatrix() {
		return new int[][]{{0,0},{0,0}};
	}

	public String get2Node1Edge() {
		String json = "{\n";
		json += "\"name\": \"two nodes, one edge\",\n";
		json += "\"nodes\": [\n";
		json += "{\n";
		json += "\"nodeId\": \"0\",\n";
		json += "\"nodeLabel\": \"node label 0\",\n";
		json += "\"nodeWeight\": \"12\",\n";
		json += "\"nodeType\": \"1\",\n";
		json += "\"nodeAge\": \"-1\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"nodeId\": \"1\",\n";
		json += "\"nodeLabel\": \"node label 1\",\n";
		json += "\"nodeWeight\": \"6\",\n";
		json += "\"nodeType\": \"0\",\n";
		json += "\"nodeAge\": \"6\"\n";
		json += "},\n";
		json += "],\n";
		json += "\"edges\": [\n";
		json += "{\n";
		json += "\"edgeId\": \"0\",\n";
		json += "\"node1\": \"0\",\n";
		json += "\"node2\": \"1\",\n";
		json += "\"edgeLabel\": \"edge label 0\",\n";
		json += "\"edgeWeight\": \"43\",\n";
		json += "\"edgeType\": \"6\",\n";
		json += "\"edgeAge\": \"-1\"\n";
		json += "},\n";
		json += "],\n";
		json += "}\n";
		return json;
	}
	
	int[][] get2Node1EdgeAdjMatrix() {
		return new int[][]{{0,1},{1,0}};
	}
	
	public String get2Node2Edge() {
		String json = "{\n";
		json += "\"name\": \"two nodes, two edges\",\n";
		json += "\"nodes\": [\n";
		json += "{\n";
		json += "\"nodeId\": \"0\",\n";
		json += "\"nodeLabel\": \"node label 0\",\n";
		json += "\"nodeWeight\": \"12\",\n";
		json += "\"nodeType\": \"1\",\n";
		json += "\"nodeAge\": \"-1\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"nodeId\": \"1\",\n";
		json += "\"nodeLabel\": \"node label 1\",\n";
		json += "\"nodeWeight\": \"6\",\n";
		json += "\"nodeType\": \"0\",\n";
		json += "\"nodeAge\": \"6\"\n";
		json += "},\n";
		json += "],\n";
		json += "\"edges\": [\n";
		json += "{\n";
		json += "\"edgeId\": \"0\",\n";
		json += "\"node1\": \"0\",\n";
		json += "\"node2\": \"1\",\n";
		json += "\"edgeLabel\": \"edge label 0\",\n";
		json += "\"edgeWeight\": \"43\",\n";
		json += "\"edgeType\": \"6\",\n";
		json += "\"edgeAge\": \"-1\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"edgeId\": \"1\",\n";
		json += "\"node1\": \"0\",\n";
		json += "\"node2\": \"0\",\n";
		json += "\"edgeLabel\": \"edge label 1\",\n";
		json += "\"edgeWeight\": \"32\",\n";
		json += "\"edgeType\": \"9\",\n";
		json += "\"edgeAge\": \"4\"\n";
		json += "},\n";
		json += "],\n";
		json += "}\n";
		return json;
	}
	
	int[][] get2Node2EdgeAdjMatrix() {
		return new int[][]{{2,1},{1,0}};
	}
	
	/*
	 * 0-1
	 * |/
	 * 2-3-4
	 */
	public String get5Node5Edge() {
	
		String json = "{\n";
		json += "\"name\": \"five nodes, five edges\",\n";
		json += "\"nodes\": [\n";
		json += "{\n";
		json += "\"nodeId\": \"0\",\n";
		json += "\"nodeLabel\": \"node label 0\",\n";
		json += "\"nodeWeight\": \"10\",\n";
		json += "\"nodeType\": \"0\",\n";
		json += "\"nodeAge\": \"0\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"nodeId\": \"1\",\n";
		json += "\"nodeLabel\": \"node label 1\",\n";
		json += "\"nodeWeight\": \"1\",\n";
		json += "\"nodeType\": \"1\",\n";
		json += "\"nodeAge\": \"1\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"nodeId\": \"2\",\n";
		json += "\"nodeLabel\": \"node label 2\",\n";
		json += "\"nodeWeight\": \"2\",\n";
		json += "\"nodeType\": \"2\",\n";
		json += "\"nodeAge\": \"2\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"nodeId\": \"3\",\n";
		json += "\"nodeLabel\": \"node label 3\",\n";
		json += "\"nodeWeight\": \"3\",\n";
		json += "\"nodeType\": \"3\",\n";
		json += "\"nodeAge\": \"3\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"nodeId\": \"4\",\n";
		json += "\"nodeLabel\": \"node label 4\",\n";
		json += "\"nodeWeight\": \"4\",\n";
		json += "\"nodeType\": \"4\",\n";
		json += "\"nodeAge\": \"4\"\n";
		json += "},\n";
		json += "],\n";
		json += "\"edges\": [\n";
		json += "{\n";
		json += "\"edgeId\": \"0\",\n";
		json += "\"node1\": \"0\",\n";
		json += "\"node2\": \"1\",\n";
		json += "\"edgeLabel\": \"edge label 0\",\n";
		json += "\"edgeWeight\": \"0\",\n";
		json += "\"edgeType\": \"0\",\n";
		json += "\"edgeAge\": \"0\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"edgeId\": \"1\",\n";
		json += "\"node1\": \"0\",\n";
		json += "\"node2\": \"2\",\n";
		json += "\"edgeLabel\": \"edge label 1\",\n";
		json += "\"edgeWeight\": \"1\",\n";
		json += "\"edgeType\": \"1\",\n";
		json += "\"edgeAge\": \"1\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"edgeId\": \"2\",\n";
		json += "\"node1\": \"1\",\n";
		json += "\"node2\": \"2\",\n";
		json += "\"edgeLabel\": \"edge label 2\",\n";
		json += "\"edgeWeight\": \"2\",\n";
		json += "\"edgeType\": \"2\",\n";
		json += "\"edgeAge\": \"2\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"edgeId\": \"3\",\n";
		json += "\"node1\": \"2\",\n";
		json += "\"node2\": \"3\",\n";
		json += "\"edgeLabel\": \"edge label 3\",\n";
		json += "\"edgeWeight\": \"3\",\n";
		json += "\"edgeType\": \"3\",\n";
		json += "\"edgeAge\": \"3\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"edgeId\": \"4\",\n";
		json += "\"node1\": \"3\",\n";
		json += "\"node2\": \"4\",\n";
		json += "\"edgeLabel\": \"edge label 4\",\n";
		json += "\"edgeWeight\": \"4\",\n";
		json += "\"edgeType\": \"4\",\n";
		json += "\"edgeAge\": \"4\"\n";
		json += "},\n";
		json += "],\n";
		json += "}\n";
		return json;
	}
	
	int[][] get5Node5EdgeAdjMatrix() {
		return new int[][]{{0,1,1,0,0},{1,0,1,0,0},{1,1,0,1,0},{0,0,1,0,1},{0,0,0,1,0}};
	}
	
	/*
	 * Disconnected
	 * 0-1
	 * |/
	 * 2   3-4
	 */
	public String get5Node4Edge() {
	
		String json = "{\n";
		json += "\"name\": \"five nodes, four edges\",\n";
		json += "\"nodes\": [\n";
		json += "{\n";
		json += "\"nodeId\": \"0\",\n";
		json += "\"nodeLabel\": \"node label 0\",\n";
		json += "\"nodeWeight\": \"10\",\n";
		json += "\"nodeType\": \"0\",\n";
		json += "\"nodeAge\": \"0\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"nodeId\": \"1\",\n";
		json += "\"nodeLabel\": \"node label 1\",\n";
		json += "\"nodeWeight\": \"1\",\n";
		json += "\"nodeType\": \"1\",\n";
		json += "\"nodeAge\": \"1\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"nodeId\": \"2\",\n";
		json += "\"nodeLabel\": \"node label 2\",\n";
		json += "\"nodeWeight\": \"2\",\n";
		json += "\"nodeType\": \"2\",\n";
		json += "\"nodeAge\": \"2\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"nodeId\": \"3\",\n";
		json += "\"nodeLabel\": \"node label 3\",\n";
		json += "\"nodeWeight\": \"3\",\n";
		json += "\"nodeType\": \"3\",\n";
		json += "\"nodeAge\": \"3\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"nodeId\": \"4\",\n";
		json += "\"nodeLabel\": \"node label 4\",\n";
		json += "\"nodeWeight\": \"4\",\n";
		json += "\"nodeType\": \"4\",\n";
		json += "\"nodeAge\": \"4\"\n";
		json += "},\n";
		json += "],\n";
		json += "\"edges\": [\n";
		json += "{\n";
		json += "\"edgeId\": \"0\",\n";
		json += "\"node1\": \"0\",\n";
		json += "\"node2\": \"1\",\n";
		json += "\"edgeLabel\": \"edge label 0\",\n";
		json += "\"edgeWeight\": \"0\",\n";
		json += "\"edgeType\": \"0\",\n";
		json += "\"edgeAge\": \"0\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"edgeId\": \"1\",\n";
		json += "\"node1\": \"0\",\n";
		json += "\"node2\": \"2\",\n";
		json += "\"edgeLabel\": \"edge label 1\",\n";
		json += "\"edgeWeight\": \"1\",\n";
		json += "\"edgeType\": \"1\",\n";
		json += "\"edgeAge\": \"1\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"edgeId\": \"2\",\n";
		json += "\"node1\": \"1\",\n";
		json += "\"node2\": \"2\",\n";
		json += "\"edgeLabel\": \"edge label 2\",\n";
		json += "\"edgeWeight\": \"2\",\n";
		json += "\"edgeType\": \"2\",\n";
		json += "\"edgeAge\": \"2\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"edgeId\": \"3\",\n";
		json += "\"node1\": \"3\",\n";
		json += "\"node2\": \"4\",\n";
		json += "\"edgeLabel\": \"edge label 3\",\n";
		json += "\"edgeWeight\": \"3\",\n";
		json += "\"edgeType\": \"3\",\n";
		json += "\"edgeAge\": \"3\"\n";
		json += "},\n";
		json += "],\n";
		json += "}\n";
		return json;
	}
	
	int[][] get5Node4EdgeAdjMatrix() {
		return new int[][]{{0,1,1,0,0},{1,0,1,0,0},{1,1,0,0,0},{0,0,0,0,1},{0,0,0,1,0}};
	}

	/*
	 * 0-1
	 * |/|
	 * 2-3
	 */
	public String get4Node5Edge() {
	
		String json = "{\n";
		json += "\"name\": \"four nodes, five edges\",\n";
		json += "\"nodes\": [\n";
		json += "{\n";
		json += "\"nodeId\": \"0\",\n";
		json += "\"nodeLabel\": \"node label 0\",\n";
		json += "\"nodeWeight\": \"10\",\n";
		json += "\"nodeType\": \"0\",\n";
		json += "\"nodeAge\": \"0\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"nodeId\": \"1\",\n";
		json += "\"nodeLabel\": \"node label 1\",\n";
		json += "\"nodeWeight\": \"1\",\n";
		json += "\"nodeType\": \"1\",\n";
		json += "\"nodeAge\": \"1\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"nodeId\": \"2\",\n";
		json += "\"nodeLabel\": \"node label 2\",\n";
		json += "\"nodeWeight\": \"2\",\n";
		json += "\"nodeType\": \"2\",\n";
		json += "\"nodeAge\": \"2\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"nodeId\": \"3\",\n";
		json += "\"nodeLabel\": \"node label 3\",\n";
		json += "\"nodeWeight\": \"3\",\n";
		json += "\"nodeType\": \"3\",\n";
		json += "\"nodeAge\": \"3\"\n";
		json += "},\n";
		json += "],\n";
		json += "\"edges\": [\n";
		json += "{\n";
		json += "\"edgeId\": \"0\",\n";
		json += "\"node1\": \"0\",\n";
		json += "\"node2\": \"1\",\n";
		json += "\"edgeLabel\": \"edge label 0\",\n";
		json += "\"edgeWeight\": \"0\",\n";
		json += "\"edgeType\": \"0\",\n";
		json += "\"edgeAge\": \"0\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"edgeId\": \"1\",\n";
		json += "\"node1\": \"0\",\n";
		json += "\"node2\": \"2\",\n";
		json += "\"edgeLabel\": \"edge label 1\",\n";
		json += "\"edgeWeight\": \"1\",\n";
		json += "\"edgeType\": \"1\",\n";
		json += "\"edgeAge\": \"1\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"edgeId\": \"2\",\n";
		json += "\"node1\": \"2\",\n";
		json += "\"node2\": \"1\",\n";
		json += "\"edgeLabel\": \"edge label 2\",\n";
		json += "\"edgeWeight\": \"2\",\n";
		json += "\"edgeType\": \"2\",\n";
		json += "\"edgeAge\": \"2\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"edgeId\": \"3\",\n";
		json += "\"node1\": \"1\",\n";
		json += "\"node2\": \"3\",\n";
		json += "\"edgeLabel\": \"edge label 3\",\n";
		json += "\"edgeWeight\": \"3\",\n";
		json += "\"edgeType\": \"3\",\n";
		json += "\"edgeAge\": \"3\"\n";
		json += "},\n";
		json += "{\n";
		json += "\"edgeId\": \"4\",\n";
		json += "\"node1\": \"2\",\n";
		json += "\"node2\": \"3\",\n";
		json += "\"edgeLabel\": \"edge label 4\",\n";
		json += "\"edgeWeight\": \"4\",\n";
		json += "\"edgeType\": \"4\",\n";
		json += "\"edgeAge\": \"4\"\n";
		json += "},\n";
		json += "],\n";
		json += "}\n";
		return json;
	}
	
	int[][] get4Node5EdgeAdjMatrix() {
		return new int[][]{{0,1,1,0},{1,0,1,1},{1,1,0,1},{0,1,1,0}};
	}

}