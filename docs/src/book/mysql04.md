---
title: MySQL 数据库及 SQL 简介
order: 4
icon: /mysql-item.svg
category:
  - BOOK
  - MD
---

## 一、MySQL 数据库操作环境

### 1.1 MySQL 数据库管理系统简介

###   1.1.1 MySQL 的系统特性

 MySQL 的系统特性

###  1.1.2 MySQL 的优势

MySQL 的优势

###  1.1.3 MySQL 安装

MySQL 安装

### 使用 Docker 安装

-  拉取 Mysql 镜像

```Bash
docker pull mysql
```

-  创建容器卷

```Bash
docker volume create mysql8_3306
```

-  创建创建 Docker 网络

```Bash
docker network create mysql8-net
```

<img src="https://jz-cbq-1311841992.cos.ap-beijing.myqcloud.com/images/image-20231201233348595.png" alt="image-20231201233348595" style="zoom:67%;" />



-  运行 Docker 容器

```Bash
docker run -d --name mysql8_3306 -e MYSQL_ROOT_PASSWORD=root -v mysql8_3306:/var/lib/mysql -p 3306:3306 --network=mysql8-net <镜像 id>

```

<img src="https://jz-cbq-1311841992.cos.ap-beijing.myqcloud.com/images/image-20231201233400061.png" alt="image-20231201233400061" style="zoom:67%;" />

### 使用 MySQL Installer 安装

使用 MySQL Installer 安装

### 1.2 MySQL 图形化管理工具 Navicat

### 1.2.1 安装 Navicat Premium 16

<img src="https://jz-cbq-1311841992.cos.ap-beijing.myqcloud.com/images/image-20231201233410470.png" alt="image-20231201233410470" style="zoom:67%;" />



[Navicat Premium](https://www.navicat.com.cn/) 是一套可创建多个连接的数据库开发工具，让你从单一应用程序中同时连接 MySQL、Redis、MariaDB、MongoDB、SQL Server、Oracle、PostgreSQL 和 SQLite 。它与 GaussDB 主备版、OceanBase 数据库及 Amazon RDS、Amazon Aurora、Amazon Redshift、Amazon ElastiCache、Microsoft Azure、Oracle Cloud、MongoDB Atlas、Redis Enterprise Cloud、阿里云、腾讯云和华为云等云数据库兼容。你可以快速轻松地创建、管理和维护数据库。

1. [点击下载open in new window](https://yong-gan-niu-niu-1311841992.cos.ap-beijing.myqcloud.com/tools/navicat16Tools.zip) 激活工具
2. [Navicat Premium 16](https://www.navicat.com.cn/download/direct-download?product=navicat_premium_cs_x64.exe&location=1)

-  **以管理员身份运行**



<img src="https://yong-gan-niu-niu-1311841992.cos.ap-beijing.myqcloud.com/images/image-20230928220125872.png" style="zoom:67%;" />



<img src="https://jz-cbq-1311841992.cos.ap-beijing.myqcloud.com/images/image-20231201233432860.png" alt="image-20231201233432860" style="zoom:67%;" />



-  断网、断网、断网

复制上方生成的 Keygen

<img src="https://yong-gan-niu-niu-1311841992.cos.ap-beijing.myqcloud.com/images/image-20230928220747466.png" style="zoom:67%;" />



<img src="https://yong-gan-niu-niu-1311841992.cos.ap-beijing.myqcloud.com/images/image-20230928220818538.png" style="zoom:67%;" />



点击手动激活将 请求码 复制到 NavicatCracker 后点击 Generate Activation Code



<img src="https://jz-cbq-1311841992.cos.ap-beijing.myqcloud.com/images/image-20231201233452614.png" alt="image-20231201233452614" style="zoom:67%;" />



<img src="https://yong-gan-niu-niu-1311841992.cos.ap-beijing.myqcloud.com/images/image-20230928220901430.png" style="zoom:67%;" />



-  验证



<img src="https://yong-gan-niu-niu-1311841992.cos.ap-beijing.myqcloud.com/images/image-20230928220908514.png" style="zoom:67%;" />



<img src="https://jz-cbq-1311841992.cos.ap-beijing.myqcloud.com/images/image-20231201233506931.png" alt="image-20231201233506931" style="zoom:67%;" />

### 1.2.2 Navicat 中数据库的基本操作

-  创建连接

名字起错了应该是 JingDongYun-3306 但没啥影响只是一个标识



<img src="https://jz-cbq-1311841992.cos.ap-beijing.myqcloud.com/images/image-20231201233521637.png" alt="image-20231201233521637" style="zoom:67%;" />



<img src="https://jz-cbq-1311841992.cos.ap-beijing.myqcloud.com/images/image-20231201233532167.png" alt="image-20231201233532167" style="zoom:67%;" />



-  创建数据库



<img src="https://jz-cbq-1311841992.cos.ap-beijing.myqcloud.com/images/image-20231201233541118.png" alt="image-20231201233541118" style="zoom:67%;" />



<img src="https://jz-cbq-1311841992.cos.ap-beijing.myqcloud.com/images/image-20231201233548979.png" alt="image-20231201233548979" style="zoom:67%;" />

-  创建表



<img src="https://jz-cbq-1311841992.cos.ap-beijing.myqcloud.com/images/image-20231201233559112.png" alt="image-20231201233559112" style="zoom:67%;" />



<img src="https://jz-cbq-1311841992.cos.ap-beijing.myqcloud.com/images/image-20231201233604915.png" alt="image-20231201233604915" style="zoom:67%;" />



-  修改表



<img src="https://jz-cbq-1311841992.cos.ap-beijing.myqcloud.com/images/image-20231201233615999.png" alt="image-20231201233615999" style="zoom:67%;" />

-  表中主键和外键的设置



-  生成数据





<img src="https://jz-cbq-1311841992.cos.ap-beijing.myqcloud.com/images/image-20231201233628809.png" alt="image-20231201233628809" style="zoom:67%;" />



<img src="https://jz-cbq-1311841992.cos.ap-beijing.myqcloud.com/images/image-20231201233643055.png" alt="image-20231201233643055" style="zoom:67%;" />



-  运行和转储 SQL 文件



<img src="https://jz-cbq-1311841992.cos.ap-beijing.myqcloud.com/images/image-20231201233651116.png" alt="image-20231201233651116" style="zoom:67%;" />



-  创建查询

<img src="https://jz-cbq-1311841992.cos.ap-beijing.myqcloud.com/images/image-20231201233700250.png" alt="image-20231201233700250" style="zoom:67%;" />



### 1.3 MySQL 支持的字符集

MySQL 支持的字符集

## 二、SQL 概述及功能



## 三、MySQL 数据类型

