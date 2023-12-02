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

### 2.1 SQL 概述

**SQL** 的全称是 ==Structure Query Language== ，即结构化查询语言，是关系数据库的国际标准语言。 1974 年， IBM 公司的研究员 Boyce 和 Chamberlin 开发了 **SEQUEL** 语言 (SQL 的原型），而后 IBM 的 San Jose 实验室研制了关系数据库实验系统 System R ，并在该系统上成功实现了SEQUEL 语言，之后在此基础上推出 SQL 语言。

1986 年 10 月，美国国家标准局发布了 **SQL** 的第一个标准 **SQL-86** ； 1987 年，国际标准化组织也通过了这一标准，使 **SQL** 成为了国际标准； 1989 年发布的 **SQL- 89** ，是对 **SQL** 的进一步修改和完善，标志着 **SQL 语言**在推动数据库技术发展中的重要地位。

自 20 世纪 80 年代以来，几乎所有的关系数据库产品都支持 **SQL** 或提供了与 SQL 的接口，这有利于不同的数据库管理系统之间实现良好的互操作性，也有利于数据库操纵语言的标准化制定。

### 2.2 SQL 的特点及命令动词

### SQL 语言的特点

- 一体化

SQL 语言风格统一，可以完成数据库活动中的全部工作，包括创建数据库、定义模式、更改和查询数据以及安全控制和维护数据库等，这就为数据库应用系统的开发提供了良好的环境。比如，用户在数据库投人运行后，还可根据需要随时地逐步修改模式，并不影响数据库的运行，从而使系统具有良好的可扩充性。

- 高度非过程化

在使用 SQL 语句访问数据库时，用户没有必要告诉计算机如何一步步完成任务，只需要SQL 语言描述要做什么就行了，数据库管理系统会自动完成全部工作

- 提供多种方式使用

::: tip  SQL 既是自含式语言，又是嵌人式语言

- 自含式语言是指 SQL 可以独立地联机交互，即用户可以直接以命令的方式操作数据库中的数据
- 嵌人式语言是指 SQL 可以嵌人到 Java 、 C#等高级程序设计语言中使用

:::

- 支持三级数据模式

全体基本表构成了数据库的全局逻辑模式，视图和部分基本表（被用户直接操作）构成了数据库的外模式而数据库的存储文件和索引文件则构成了数据库的内模式。

#### SQL 语言三大功能及命令动词

SQL 语言简洁，易学易用，主要有以下三大功能和 9 个命令动词。

|          | 数据定义 (DDL)                                               | 数据操纵 (DML)                                               | 数据控制 (DCL)                                               |
| -------- | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| 关键字   | create 、 alter 和 drop                                      | select 、 insert 和 delete                                   | grant  和 revoke                                             |
| 实现方式 | Data DefinitionL(Language)                                   | Data ManipulationL                                           | Data ControlL                                                |
| 作用     | 用于定义、修改和删除数据库中各种对象，包括表、视图、索引、触发器等实现 SQL 的数据定义功能 | 用于对数据库中数据的查词、添加、删除、修改等操作实现 SQL 的数据操纵功能 | 用于对数据库中用户的授权和收权操作，以控制不同用户在各自权限范围内使用数据库资源，从而保证数据库的安全性实现 SQL 的数据控制功能 |

## 三、MySQL 数据类型

### 3.1 数值型



### 3.2字符串型



### 3.3 日期时间型

