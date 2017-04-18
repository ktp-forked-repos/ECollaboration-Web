1.ECollaboration Web是一款为本校软件学院工程实践提供学生间团队合作、师生间项目管理的Web系统。系统提供学生选题、任务计划管理、教师课题管理、进度监控等服务。  
2.独立完成了使用Spring MVC、Spring、Hibernate、Maven搭建后端框架的任务。  
3.后端分为controller、service、dao三层，分别对应前端交互、业务逻辑、持久化三个功能。前端交互主要使用Rest API；少量GET请求使用Thymeleaf。持久化使用Hibernate，Entity之间采用双向映射，在此基础上封装了GenericEntityDAO来完成增删改查。通过MySQL存储数据，部署于阿里云CentOS7。使用Spring的依赖注入功能管理对象。  