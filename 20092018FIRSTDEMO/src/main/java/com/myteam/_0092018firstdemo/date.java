package com.myteam._0092018firstdemo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class date implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "to")
	private java.lang.String to;
	@org.kie.api.definition.type.Label(value = "from")
	private java.lang.String from;

	public date() {
	}

	public java.lang.String getTo() {
		return this.to;
	}

	public void setTo(java.lang.String to) {
		this.to = to;
	}

	public java.lang.String getFrom() {
		return this.from;
	}

	public void setFrom(java.lang.String from) {
		this.from = from;
	}

	public date(java.lang.String to, java.lang.String from) {
		this.to = to;
		this.from = from;
	}

}