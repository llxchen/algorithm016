# 本周体会
我报这门算法课程的学习，目的不是为了拿大厂的Offer。最吸引我的是体验课中老师讲的算法这些不怎么变的基础知识是修炼内功的正确方式，我希望通过算法课，提升自身的修为，增加竞争力。
第一周最大的收获不是做了多少题，而是意识到以前学习算法的错误方式，以下任何一点都让我和期望的目标越走越远。
  - 想证明自己优秀，死磕
  - 看学习资料，对某些内容觉得很简单，没有实战练习
  - 对复杂的知识点，缺乏耐心，没有学习明白而放弃。
  - 反复努力没有掌握知识点时，怀疑自己的能力....
接下来，在训练营期间，尽最大能力完成好作业，使用五毒神练习算法。
    
# 使用add first 或add last 写 Deque 的代码
用 add first 或 add last 新的 API 改写 Deque 的代码:
```java
        Deque<String> deque = new LinkedList<String>();
        //使用addFirst代替push方法
        deque.addFirst("a");
        deque.addFirst("b");
        deque.addFirst("c");
        System.out.println(deque);
        //使用peekFirst()代替peek方法
        System.out.println(deque.peekFirst());
        System.out.println(deque);
        while (!deque.isEmpty()) {
            System.out.println(deque.pollFirst());
        }
        System.out.println(deque);
```
 # 分析 Queue 和 Priority Queue 的源码
 ## Queue
 java中Queue是一个Inteface，做为最基础的队列，主要有先进先出的特性，包含主要的接口定义：
 - add、remove、element(Throws exception)
 - offer、poll、peek(Returns special value)
 ## Priority Queue
 Priority Queue是比较特殊的，不像基础的Queue先进先出，而是根据优先级来决定出的顺序。它实现了Queue的所有接口，PriorityQueue 的实现是基于动态扩容数组的二叉树堆结构，其最大容量长度为 Int 大小，是非并发安全的队列。此外 PriorityQueue 的元素不可为 null 值
```java
/**
  58:    * This is the storage for the underlying binomial heap.
  59:    * The idea is, each node is less than or equal to its children.
  60:    * A node at index N (0-based) has two direct children, at
  61:    * nodes 2N+1 and 2N+2.
  62:    */
  63:   E[] storage;
  
  /**
  66:    * The comparator we're using, or null for natural ordering.
  67:    */
  68:   Comparator<? super E> comparator;
```
> 以下内容摘自网络，java还是不太熟，学习中：
> PriorityQueue 确定最高优先级元素使用的是堆数据结构，因为堆是一棵完全树，堆中某个节点的值总是不大于或不小于其父节点值的，常见的堆有二叉堆、斐波那契堆等，二叉堆是完全二叉树或者是近似完全二叉树的一种特殊堆，其分为最大堆和最小堆，最大堆中父结点值总是大于或等于任何一个子节点值，最小堆中父结点值总是小于或等于任何一个子节点值，由于二叉堆一直是自左向右自上向下一层层填充的，所以其可以用数组来表示而不是用链表，PriorityQueue 就是采用了基于动态数组的二叉堆来确定优先级

 
