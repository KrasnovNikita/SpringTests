package ua.krasnovnikita.robotimpl.robot;

import ua.krasnovnikita.robotimpl.interfaces.Hand;
import ua.krasnovnikita.robotimpl.interfaces.Head;
import ua.krasnovnikita.robotimpl.interfaces.Leg;
import ua.krasnovnikita.robotimpl.interfaces.Robot;

public abstract class BaseModel implements Robot {

	private Hand hand;
	private Leg leg;
	private Head head;

	public BaseModel() {
		super();
		System.out.println(this + " - BaseModel constructor()");
	}

	public BaseModel(Hand hand, Head head, Leg leg) {
		super();
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public Leg getLeg() {
		return leg;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

}
