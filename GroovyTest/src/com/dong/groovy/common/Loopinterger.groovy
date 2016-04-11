package com.dong.groovy.common

/**
 * 通过循环打印0到2值描述groovy的循环
 * @author dong
 *
 */
class Loopinterger {

	static main(args) {
		for(int i=0;i<3;i++){
			println "java模式打印数字（0到3）" + i
		}
		/**
		 * 属性不需要指明类型
		 * 集合[0,1,2]等价于：int is = new int[]{0,1,2}
		 * in 操作符等价于：
		 * int[] is = new int[]{0,1,2};
		 * for(int j=0;j<is.length;j++){
		 *	}
		 */
		for(j in [0, 1, 2]){
			println "groovy in 操作符的使用（0到3）" + j
		}
		
		/**
		 * 0..2等价于[0,1,2]
		 */
		for(z in 0..2){
			println "groovy in ..操作符的使用Z:" + z
		}
		
		/**
		 * 注意两个操作符：
		 *  $:groovy的一个转义字符，代表对应的值而不是本身，类似于脚本中的用法
		 *  it：闭包中的一个用法，如果没有参数闭包会有一个默认参数it即闭包肯定存在一个参数,如果函数没有返回默认值是0,1,2,3等
		 *  "$it"代表打印it对应的值，注意不要写成$it
		 */
		0.upto(2) {
			println "groovy upto 方法的使用（0到3）" + "$it"
		}
		
		/**
		 * 和上面类似
		 */
		3.times {
			println "groovy times 方法的使用（0到3）" + "$it"
		}
		
		/**
		 * 跳着循环的一个api参数：
		 * i：终点值
		 * i: 间隔的值
		 */
		0.step(10, 2) {
			println "groovy step 方法的使用（0到3）" + "$it"
		}
		
	}
}
