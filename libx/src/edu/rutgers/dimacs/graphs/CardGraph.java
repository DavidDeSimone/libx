package edu.rutgers.dimacs.graphs;

import java.util.List;

import org.graphstream.graph.Edge;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.DefaultGraph;

import edu.rutgers.dimacs.serialization.JSONSerializer;
import edu.rutgers.dimacs.utils.Card;

public abstract class CardGraph extends DefaultGraph {
	
	//TODO Add handling for node and edges already in graph
	
	private List<Card> cards;
	
	public CardGraph(List<Card> cards, String name) {
		super(name);
		
		this.cards = cards;
		
		for(Card card: cards) {
			addNode(card.toString());
		}
		
		for(Card cardOne: cards) {
			for(Card cardTwo: cards) {
				if(!cardOne.equals(cardTwo)) {
				double weight = cardOne.dataCompTo(cardTwo);
				Edge e = addEdge(cardOne.toString() + ":" + cardTwo.toString(), 
						cardOne.toString(), cardTwo.toString());
				e.addAttribute("weight", weight);
				}
			}
		}
	}
	
	public Node addCard(Card toAdd) {
		Node n = addNode(toAdd.toString());
		return n;
	}
	
	public List<Card> getCards() {
		return cards;
	}
	
	public void showGraph() {
		addAttribute("ui.quality");
		addAttribute("ui.antialias");
		display();
	}
	
	public void saveAsJson(String saveAs) {
		JSONSerializer json = new JSONSerializer(saveAs, cards);
		json.save();
	}
}
