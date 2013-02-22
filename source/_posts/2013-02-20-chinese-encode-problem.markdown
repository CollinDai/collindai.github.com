---
layout: post
title: "中文编码问题"
date: 2013-02-20 17:14
comments: true
categories: octopress
---

在用octopress写中文时遇到了问题：
    YAML Exception reading 2012-11-23-rise-of-the-guardians.markdown: invalid byte sequence in GBK
经查找是中文的句号引起的。
[这里](http://www.v2ex.com/t/26027)说
>1. markdown文件如果出现了中文请另存为UTF-8格式且去掉BOM头。
>2. yaml的冒号后要有空格。
>3. 把设置环境变量里的zh_CN改成en_US。
<!--more-->
根据我的经验，yaml里的冒号后无空格报的不是这个错。于是我先尝试了"UTF-8 without BOM"编码，直接用Notepad++转换。结果还是报这个错，然后我又尝试了修改环境变量。Windows7右键计算机->属性->高级系统设置->环境变量。在“系统变量”那一栏中新建两个变量`LANG`和`LC_ALL`,都设置为`en_US.UTF-8`。再尝试generate果然就没报错了。
不知道`LANG`和`LC_ALL`是什么变量，但估计是linux里用的。

对了，文件名也不能用中文，也就是说博客的网址里只有显示英文。