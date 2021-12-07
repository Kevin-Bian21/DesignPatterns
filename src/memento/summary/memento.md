# 备忘录模式
 - 用途：用于存储系统关键对象的重要状态。
 - 维护关键对象的封装。
 - 当需要让对象返回之前的状态时，如“撤销”，就需要用到备忘录模式(MementoPattern)。
## 优点
1. 将被存储的状态放在外面，不需要和关键对象混在一起，这样可以维护内聚。
2. 保持关键对象的数据封装。
3. 提供了容易实现的恢复能力。
##缺点
1. 存储和恢复状态的过程可能比较耗时。
---
 注：Java中可以考虑使用序列化机制存储系统的状态。