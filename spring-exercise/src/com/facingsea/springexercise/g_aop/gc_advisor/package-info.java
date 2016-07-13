/**
 * 	使用普通Advice作为切面，将对目标类所有方法进行拦截，不够灵活，在实际开发中常采用 带有切点的切面
		常用PointcutAdvisor 实现类
		•	DefaultPointcutAdvisor 最常用的切面类型，它可以通过任意Pointcut和Advice 组合定义切面
		•	RegexpMethodPointcutAdvisor 按正则表达式，匹配方法名定义切面，其内部通过JdkRegexpMethodPointcut 构造正则表达式切点
		•	AspectJExpressionPointcutAdvisor 用于AspectJ切点表达式定义切点的切面
 * 
 */
/**
 * @author wangzhf
 *
 */
package com.facingsea.springexercise.g_aop.gc_advisor;