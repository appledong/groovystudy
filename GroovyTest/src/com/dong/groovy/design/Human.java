package com.dong.groovy.design;

/**
 * 搬箱子不一定只有男人可以搬，女人也 
 * 可以，所以抽象出来一个父类
 * ，男人女人都继承即可
 * @author dong
 *
 */
public abstract class Human {
	protected abstract void movethings();
}
