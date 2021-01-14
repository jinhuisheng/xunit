# xunit

## 作业一

创建一个测试类

作为一个负责任的程序员，我希望我写的代码，都能被程序自动化测试。因此，我需要一个工具，把我的测试方法包装起来，这样在未来我就可以通过运行这些测试方法来验证代码的正确性。

每个测试方法应该是一个void的、无入参的方法。一个测试类应该可以包括有多个测试方法，由于测试类也可能有一些非测试方法（我们假设我们也没有反射这种东西），因此需要测试类把自己的测试方法注册进来。调用者可以通过测试类，获取测试类测试方法的数量、名称。

### 任务分解

n. 
XxxTestCase 测试类

v.
getDeclaredMethods

### 测试用例

获取没有方法测试类的一个测试方法,测试方法数量为0

获取单方法测试类的一个测试方法,测试方法数量为1,并且可调用

获取多个方法(3个)的测试类的一组测试方法,测试方法数量为3,并且可调用


## 作业二
运行一个测试类

我们现在已经拥有了一个测试类，并且获得了测试方法的数量、名称。接下来我们要运行这个测试类。
通过遍历测试类下的所有测试方法，并逐个运行测试方法，我们可以知道哪些方法成功了，哪些失败了。运行完毕后，我们可以得到测试类下的测试结果，包括：方法名、是否成功、失败信息（如果不成功）

### 测试用例

执行测试方法成功，并返回成功的结果(方法名、是否成功)
执行测试方法失败，返回失败的结果(包括：方法名、是否成功、失败信息（如果不成功）)
一个测试成功，一个测试失败，返回测试结果(包括：方法名、是否成功、失败信息（如果不成功）)


## 作业三

将一组测试类做成一个套件
随着我们系统越来越复杂，我们写了越来越多的测试类，我们现在需要把一些测试类放到一起运行，称为一个套件（Suite）。运行一个测试套件，就等于运行了套件下的所有测试类。
这样我们就可以获得一个测试套件的所有测试结果。除了测试类上的测试结果外，对测试套件，结果还要增加 类名，以方便我们分类显示。

n. 
Test Suite 测试套件

## 作业四 
Setup和Teardown

在测试之前，我们需要准备一些数据，设定当前程序的状态，以便符合测试方法对环境的要求。
有些Setup改变了系统的状态，需要在结束之后调用TearDown方法消除状态。
要求在每个测试方法开始之前，运行setup，在测试方法运行只有，运行tearDown。
每一个TestCase都有自己的一个setup方法和tearDown方法。    

