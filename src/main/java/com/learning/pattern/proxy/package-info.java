package com.learning.pattern.proxy;
/**
 * 代理模式
 * 提供一个代理对象，通过代理对象来控制目标对象的引用
 * 涉及角色：抽象对象角色、目标对象角色、代理对象角色
 * 目的：1.保护目标对象 2.增强目标对象
 * 代理模式分静态代理和动态代理
 * #1.静态代理
 * 客户端不直接和目标角色接触，而是通过代理角色进行操作，代理角色直接持有目标角色的引用
 * 显示引用
 * 理解：
 * 静态代理是代理对象直接控制目标对象的引用形成代理，也就要求代理对象也必须继承抽象对象角色
 * 缺点：
 * 1.在代理量小的情况下还能操作，但是一旦代理量剧增，就需要非常多的目标对象角色的引用
 * 2.在抽象对象角色中新增接口代理对象也必须新增接口，违背了开闭原则
 * 3.目标对象角色在代理前必须存在
 * #2.动态代理
 * 针对静态代理的固定性，动态代理实现了解耦，不需要对代理对象做过多的约束，只要找我代理就行（但是还有一定要求，JDK动态代理只能针对接口）
 * 1.JDK动态代理
 * 代理对象必须实现InvocationHandler
 * JDK动态代理只能针对接口，代理后会生成一个$Proxy的对象，也就是实际调用的时候是调用的这个新的对象
 * JDK动态代理的代理文件会实现接口
 * 2.CGLIB动态代理
 * 代理对象要实现MethodInterceptor接口，因为CGLIB动态代理是通过拦截器去实现的
 * 可对接口和类都进行代理
 * 代理后会生成三个代理对象 代理对象 、代理对象的fastClass，被代理对象的fastClass
 * CGLIB会继承类
 */