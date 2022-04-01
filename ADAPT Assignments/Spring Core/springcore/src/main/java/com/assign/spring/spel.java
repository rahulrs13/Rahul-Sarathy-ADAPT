package com.assign.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class spel {
@Value("#{12+45}")
private int add;
@Value("#{23-12}")	
private int sub;
@Value("#{12*7}")
private int multiply;
@Value("#{20/2}")
private int divide;
@Value("#{'ad'+'d'}")
private String addstring;
public int getAdd() {
	return add;
}
public void setAdd(int add) {
	this.add = add;
}
public int getSub() {
	return sub;
}
public void setSub(int sub) {
	this.sub = sub;
}
public int getMultiply() {
	return multiply;
}
public void setMultiply(int multiply) {
	this.multiply = multiply;
}
public int getDivide() {
	return divide;
}
public void setDivide(int divide) {
	this.divide = divide;
}
public String getAddstring() {
	return addstring;
}
public void setAddstring(String addstring) {
	this.addstring = addstring;
}
@Override
public String toString() {
	return "spel [add=" + add + ", sub=" + sub + ", multiply=" + multiply + ", divide=" + divide + ", addstring="
			+ addstring + "]";
}
}
