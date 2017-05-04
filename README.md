## learn-design-pattern
###  设计模式学习

#### Strategy - 策略模式

![Strategy](https://github.com/saludyan/learn-design-pattern/raw/master/images/StrategyUML.jpeg)

定义一系列的算法,把每一个算法封装起来, 并且使它们可相互替换。本模式使得算法可独立于使用它的客户而变化。

#### Observer - 观察者模式

![Observer](https://github.com/saludyan/learn-design-pattern/raw/master/images/ObserverUML.jpeg)

观察者模式（有时又被称为发布（publish ）-订阅（Subscribe）模式、模型-视图（View）模式、源-收听者(Listener)模式或从属者模式）是软件设计模式的一种。在此种模式中，一个目标物件管理所有相依于它的观察者物件，并且在它本身的状态改变时主动发出通知。这通常透过呼叫各观察者所提供的方法来实现。此种模式通常被用来实现事件处理系统。

#### Decorator - 装饰模式

![Decorator](https://github.com/saludyan/learn-design-pattern/raw/master/images/DecoratorUML.jpeg)

在不必改变原类文件和使用继承的情况下，动态地扩展一个对象的功能。它是通过创建一个包装对象，也就是装饰来包裹真实的对象

#### Factory - 工厂模式

![Factory](https://github.com/saludyan/learn-design-pattern/raw/master/images/FactoryUML.jpeg)

- 简单工厂模式（Simple Factory）：不利于产生系列产品；

- 工厂方法模式（Factory Method）：又称为多形性工厂；

- 抽象工厂模式（Abstract Factory）：又称为工具箱，产生产品族，但不利于产生新的产品；
             这三种模式从上到下逐步抽象，并且更具一般性。
             GOF在《设计模式》一书中将工厂模式分为两类：工厂方法模式（Factory Method）与抽象工厂模式（Abstract Factory）。将简单工厂模式（Simple Factory）看为工厂方法模式的一种特例，两者归为一类。
             
        
#### Singleton - 单例模式

![Singleton](https://github.com/saludyan/learn-design-pattern/raw/master/images/SingleUML.jpeg)

单件模式是一种用于确保整个应用程序中只有一个类实例且这个实例所占资源在整个应用程序中是共享时的程序设计方法（根据实际情况，可能需要几个类实例）。在某些情况下，这种程序设计方法是很有用处的。

#### Command - 命令模式

![Command](https://github.com/saludyan/learn-design-pattern/raw/master/images/CommandUML.jpeg)

将请求封装成对象,这可以让你使用不同的请求,队列,或者日志请求来参数化其它对象,命令模式也支持撤销操作



#### Adapter - 适配器模式

![Adapter](https://github.com/saludyan/learn-design-pattern/raw/master/images/Adapter.jpeg)

把一个接口转成另一个接口


#### Facade - 外观模式

![Facade](https://github.com/saludyan/learn-design-pattern/raw/master/images/Facade.jpeg)

我们通过外观的包装，使应用程序只能看到外观对象，而不会看到具体的细节对象，这样无疑会降低应用程序的复杂度，并且提高了程序的可维护性


#### TemplateMethod - 模板方法模式

![TemplateMethod](https://github.com/saludyan/learn-design-pattern/raw/master/images/Facade.jpeg)

在一个方法中定义一个算法的骨架,而将一些步骤延迟到子类中.模板方法使得子类可以再不改变算法结构的情况下,重新定义算法中的某些步骤