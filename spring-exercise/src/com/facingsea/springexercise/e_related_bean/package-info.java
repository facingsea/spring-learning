/**
 * 测试Bean之间的关联关系
 * 
 * 	1. 继承，不是Java类之间的继承，而是Bean之间继承，如果多个Bean具有相同的方法和属性，
 * 		则可以引入父类Bean，配置父子bean关系
 *  2. 依赖，一个类内部运行依赖另一个Bean初始化一些数据（一个Bean 需要 在另一个Bean 之后进行构造 ） 
 *  	Bean之间数据存在依赖 SystemInit 会对 SystemInfo的 taskPeroid 任务周期进行初始化 TaskManager 需要使用 SystemInfo提供  taskPeroid 指定任务周期
 *  3. 引用，一个Bean可以将另一个Bean的id注入到程序中，在运行期获得其实例
 *  
 */
/**
 * @author wangzhf
 *
 */
package com.facingsea.springexercise.e_related_bean;