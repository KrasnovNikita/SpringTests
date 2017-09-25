package ua.krasnovnikita.robotimpl.robot;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import ua.krasnovnikita.robotimpl.interfaces.Hand;
import ua.krasnovnikita.robotimpl.interfaces.Head;
import ua.krasnovnikita.robotimpl.interfaces.Leg;
import ua.krasnovnikita.robotimpl.interfaces.Robot;

public class ModelT100 extends BaseModel implements Robot, InitializingBean, DisposableBean {
	private Hand hand;
	private Head head;
	private Leg leg;

	private String color;
	private int year;
	private boolean soundEnabled;

	public ModelT100(String color, int year, boolean soundEnabled) {
		super();
		this.color = color;
		this.year = year;
		this.soundEnabled = soundEnabled;
	}

	public ModelT100() {
		super();
	}

	public ModelT100(Hand hand, Head head, Leg leg) {
		super(hand, head, leg);

	}

	public ModelT100(Hand hand, Head head, Leg leg, String color, int year, boolean soundEnabled) {
		super(hand, head, leg);
		this.color = color;
		this.year = year;
		this.soundEnabled = soundEnabled;
	}

	public void initObject() {
		System.out.println("init");
	}

	public void destroyObject() {
		System.out.println("destroy");

	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	public Leg getLeg() {
		return leg;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isSoundEnabled() {
		return soundEnabled;
	}

	public void setSoundEnabled(boolean soundEnabled) {
		soundEnabled = soundEnabled;
	}

	@Override
	public void action() {
		hand.catchSomething();
		head.calc();
		leg.go();
		System.out.println("color:" + color);
		System.out.println("year:" + year);
		System.out.println("can palay sound:" + soundEnabled);

	}

	@Override
	public void dance() {

		System.out.println("T100 is dencing");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(this + " - method destroy()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(this + " - method init()");

	}

}
