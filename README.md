# SpringCloud-Finchley   

#### 介绍 
学习SpringCloud，记录一些自己理解与体会 。

#### 什么是微服务架构？什么是SpringCloud？ 
微服务是系统架构上的一种设计风格， 它的主旨是将一个原本独立的系统 拆分成多个小型服务，这些小型服务都在各自独立的进程中运行，服务之间通过基于HTTP
的RESTful API进行通信协作。<br/>
个人理解上来讲，小到一个方法也能称为服务，例如一个格式化日期的方法DateUtil.format(Date date)，这个方法为我的项目提供格式化日期的服务，这个时候这个服务在本地项目里，我来调用这个服务直接调用 就可以了。但是如果这个服务在异地，需要网络资源开销，那么就需要考虑例如网络延迟、分布式事务、异步消息 等因素。而SpringCloud就是来帮助我们处理这些问题的，Spring Cloud是一个基千Spring Boot实现的微服务架构开发 工具。 它为微服务架构中 涉及的 配置管理、 服务治理、 断路器、 智能路由、 微代理、 控制总线、 全局锁、 决策竞选、 分布式会话和集群状态管理等操作提供了一种简单的开发方式。 

#### SpringCloud 的各个组件
* Spring Cloud Config：配置管理工具，支持使用 Git 存储配置内容，可以使用它实现应用配置的外部存储，并支持客户端配置信息刷新、加密/解密配置内容等。
* Spring Cloud Netflix：核心组件，对多个 Netflix 旗下的开源套件进行整合。
  * Eureka：服务治理组件，包含注册中心、服务注册与发现机制的实现
  * Hystrix：容错管理组件，实现断路器模式，帮助服务依赖中出现的延迟和故障提供强大的容错能力。
  * Ribbon：客户端负载均衡的服务调用。
  * Feign：基于 Ribbon 和 Hystrix 的声明式服务调用组件。
  * Zuul：网管组件，提供智能路由、访问过滤等功能。
  * Archaius：外部化配置组件。
* Spring Cloud Bus：事件、消息总线，用于传播集群中的状态变化或事件，以触发后续的处理，比如用来动态刷新配置等。
* Spring Cloud Cluster：针对 ZooKeeper、Redis、Hazelcast、Consul 的选举算法和通用状态模式的实现。
* Spring Cloud Cloudfoundry：与 Pivotal Cloudfoundry 的整合支持。
* Spring Cloud Consul：服务发现与配置管理工具。
* Spring Cloud Stream：通过 Redis、Rabbit 或者 Kafka 实现的消费微服务，可以通过简单的声明式模型来发送和接收消息。
* Spring Cloud AWS：用于简化整合 Amazon web Service 的组件。
* Spring Cloud Security：安全工具包，提供在 Zuul 代理中对 OAuth2 客户端请求的中继器。
* Spring Cloud Sleuth：Spring Cloud 应用的分布式跟踪实现，可以完美整合 Zipkin。
* Spring Cloud ZooKeeper：基于 ZooKeeper 的服务发现与配置管理组件。
* Spring Cloud Starters：Spring Cloud 的基础组件，它是基于 Spring Boot 风格项目的基础依赖模块。
* Spring Cloud CLI：用于在 Groovy 中快速创建 Spring Cloud 应用的 Spring Boot CLI 插件
* ......

