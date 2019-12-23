# <img src="https://i.loli.net/2019/12/20/sygfzRmECiDHOZF.png"> [Mushroom](###)

## 简介

[Mushroom](###) 是一款**小而美**的 Java 开源博客系统，具备了一个标准博客系统应有的功能，导入简单，非常适合作为**学习项目**或者**搭建属于自己的博客**。

## 技术栈

- 后端：Spring Boot + JPA + thymeleaf模板
- 数据库：MySQL
- 前端UI：Semantic UI框架

## 工具与环境

- IDEA
- Maven 3
- JDK 8
- Axure RP 8

## 插件集成

- [编辑器 Markdown](https://pandao.github.io/editor.md/)
- [内容排版 typo.css](https://github.com/sofish/typo.css)
- [动画 animate.css](https://daneden.github.io/animate.css/)
- [代码高亮 prism](https://github.com/PrismJS/prism)
- [目录生成 Tocbot](https://tscanlin.github.io/tocbot/)
- [滚动侦测 waypoints](http://imakewebthings.com/waypoints/)
- [平滑滚动 jquery.scrollTo](https://github.com/flesler/jquery.scrollTo)
- [二维码生成 qrcode.js](https://davidshimjs.github.io/qrcodejs/)

## 博客示例

请移步:www.coolblog.online

## 预览图
![lp80js.png](https://s2.ax1x.com/2019/12/23/lp80js.png)

![lpGcqI.png](https://s2.ax1x.com/2019/12/23/lpGcqI.png)

![lpG6sA.png](https://s2.ax1x.com/2019/12/23/lpG6sA.png)
![lpYN4K.png](https://s2.ax1x.com/2019/12/23/lpYN4K.png)
![lpYYAx.png](https://s2.ax1x.com/2019/12/23/lpYYAx.png)
![lpYtN6.png](https://s2.ax1x.com/2019/12/23/lpYtN6.png)
![lpGyMd.png](https://s2.ax1x.com/2019/12/23/lpGyMd.png)
![lpGrxH.png](https://s2.ax1x.com/2019/12/23/lpGrxH.png)
![lpGUVx.png](https://s2.ax1x.com/2019/12/23/lpGUVx.png)
![lpG2Zt.png](https://s2.ax1x.com/2019/12/23/lpG2Zt.png)
![lpGWIf.png](https://s2.ax1x.com/2019/12/23/lpGWIf.png)
![lpGhi8.png](https://s2.ax1x.com/2019/12/23/lpGhi8.png)
![lpG4JS.png](https://s2.ax1x.com/2019/12/23/lpG4JS.png)

## 快速安装

##### 1.下载Blog并解压到本地文件夹

##### 2.导入IDEA工具

![1576849434528](https://i.loli.net/2019/12/20/KNuzCX2HV1R7YIq.png)

##### 3.选择Maven项目类型

![1576849500142](https://i.loli.net/2019/12/20/lScVCnGp1Hv4MX5.png)



![1576849517666](https://i.loli.net/2019/12/20/8XtfErnlFT1y6cN.png)

##### 4.选择JDK版本

![1576850506289](https://i.loli.net/2019/12/20/fCVBvYr4zoNJuP5.png)

##### 5.配置数据库连接

![1576850565759](https://i.loli.net/2019/12/20/7yY69SkfWHvriCp.png)

##### 6.本地新建数据库

![1576850790566](https://i.loli.net/2019/12/20/4K7XCA1sMg3cpak.png)

##### 7.启动工程、自动生成数据表

![1576850855636](https://i.loli.net/2019/12/20/whP1ag2nU7XREmb.png)

##### 8.初始化用户信息

初始化t_user表数据，在用户表中插入一条用户信息数据，执行以下SQL语句:


```sql
INSERT INTO `t_user`
(`avatar`,`password`,`update_time`,`id`,`nickname`,`email`,`create_time`,`type`,`username`)
VALUES ('https://unsplash.it/100/100?image=1005','96e79218965eb72c92a549dd5a330112',
'2019-10-1 12:36:04','1','管理员','1946902163@qq.com','2019-10-1 12:36:04','1','admin');
```


##### 9.登录后台

- 访问:http://127.0.0.1:8080/admin  后台管理页面
- 输入用户名: admin 密码: 111111
- 管理页面新增一些标签和分类数据进行
- 访问:http://127.0.0.1:8080  用户游览主页





------

<p align = "center">
<strong>小而美博客系统</strong>
<br><br>
<img src="https://i.loli.net/2019/12/20/sygfzRmECiDHOZF.png">
</p>

