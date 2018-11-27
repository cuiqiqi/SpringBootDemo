#### IOC 依赖注入：

bean作用域:
singleton		每次返回相同的实例
prototype		每次返回不同的实例
request			请求
session			会话
global session 	全局会话

#### 创建bean的三种方式：

1、xml的setter方法注入bean以及xml的构造器注入；
2、注解的方式创建bean
3、Java类的方式创建bean

详解：xml 注解 Java
​	1.xml:spring依赖注入的形式
​		以setter注入 
​		以构造器注入（不建议使用，在实例化是造成资源浪费）
​		优先状态：构造器先执行，setter覆盖构造器
​		
​	2.注解：
​		@AutoWire	@inject
​		@Component 	@Service	@Controller
​		@Qualifier("") 	@Resource(name="")
​		
	3.java配置：
		@configuration配置类	
		@bean	注入bean
		@ComponentScan(basePackages="xx.xx")	指定加载时扫描哪个文件
		@Primary	在bean相同的情况下使用primary的属性
在测试类中：
加载配置：

```xml
//在类路径下加载：		
ClassPathXmlApplicationContext("xx.xml")
//在文件路径下加载：		
FileSystemXmlApplicationContext("classpath:xx.xml")
```

#### 使用命令行操作Maven项目：

 1.普通运行 run as -->mavenBuild-->mvn:package-->run-->项目target文件加下生成jar包-->在jar包文件路径下运行cmd-->"java -jar 项目名.jar 
 mvn compile 编译,将Java 源程序编译成 class 字节码文件。 
 mvn test 测试，并生成测试报告 
 mvn clean 将以前编译得到的旧的 class 字节码文件删除 
 mvn pakage 打包,动态 web工程打 war包，Java工程打 jar 包。 
 mvn install 将项目生成 jar 包放在仓库中，以便别的模块调用 
 2.使用maven插件运行 java -jar sample-0.0.1-SNAPSHOT.jar 
 mvn plugin:run 
 3.指定jar包config目录下默认名 指定jar包同级目录下默认名配置application.properties java -jar sample-0.0.1-SNAPSHOT.jar 
 4.指定jar包同级目录下非默认名配置test.properties java -jar sample-0.0.1-SNAPSHOT.jar --spring.config.location=test.properties

#### 安装lombok

​	常用注解
​		@Data：注解在类上；提供类所有属性的getting和setting方法，此外还提供了equals、canEqual、hashCode、toString方法
​		@Setter：注解在属性上；为属性提供setting方法
​		@Getter：注解在属性上；为属性提供getting方法
​		@Log4j：注解在类上；为类提供一个属性名为log的log4j日志对象
​		@NoArgsConstructor：注解在类上；为类提供一个无参的构造方法
​		@AllArgsConstructor：注解在类上；为类提供一个全参的构造方法
​	注入依赖

```xml
<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<version>1.16.20</version>
		</dependency>
```

#### Spring Boot Admin监控

Spring Boot Admin 是一个针对spring-boot的actuator接口进行UI美化封装的监控工具。实现对多个spring boot应用进行监控，每个客户端应用可以通过HTTP或者使用 Eureka注册到admin server中进行展示
在pom文件中添加依赖：

```xml
<!--引入admin server依赖-->
<dependency>
	<groupId>de.codecentric</groupId>
	<artifactId>spring-boot-admin-server</artifactId>
	<version>1.5.6</version>
</dependency>
<!--admin server的展示-->
<dependency>
	<groupId>de.codecentric</groupId>
	<artifactId>spring-boot-admin-server-ui</artifactId>
	<version>1.5.6</version>
</dependency>
```




在启动类上添加注解：

```java
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
```

设置访问端口：

```java
spring.boot.admin.url=http://localhost:8000 
```

在客户端设置：
  在pom文件中添加依赖：

```xml
<dependency>
   <groupId>de.codecentric</groupId>
   <artifactId>spring-boot-admin-starter-client</artifactId>
   <version>1.5.6</version>
</dependency>
```

 

在配置文件中设置：

```properties
spring.boot.admin.url=http://localhost:8000  
management.security.enabled=false
#可在线查看日志
endpoints.logfile.enabled=true
logging.file=fileDir
#客户端开启停止服务端点
endpoints.shutdown.enabled=true
#保护客户端端点数据
security.user.name=aa
security.user.password=aa
security.basic.path=/aa
eureka.instance.metadata-map.user.name=${security.user.name}
eureka.instance.metadata-map.user.password=${security.user.password}
```



