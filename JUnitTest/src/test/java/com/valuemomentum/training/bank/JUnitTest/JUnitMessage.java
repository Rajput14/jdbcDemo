package com.valuemomentum.training.bank.JUnitTest;

public class JUnitMessage {
	String m;
	JUnitMessage(String msg)
	{
		m=msg;
	}
	String printMessage()
	{
		return m;
	}

	String printHiMessage()
	{
		return "Hi "+m;
	}

}

