/**
 * 	前面的案例中，每个代理都是通过ProxyFactoryBean织入切面代理，在实际开发中，非常多的Bean每个都配置ProxyFactoryBean开发维护量巨大
		解决方案：自动创建代理
		•	BeanNameAutoProxyCreator 根据Bean名称创建代理 （针对Bean所有方法）
		•	DefaultAdvisorAutoProxyCreator 根据Advisor本身包含信息创建代理 （针对特定的方法）

 */
/**
 * @author wangzhf
 *
 */
package com.facingsea.springexercise.g_aop.gd_auto_proxy;