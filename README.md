# mybatisTool
mybatis工具



#### 使用步骤

1. generatorConfig.xml配置好jdbc连接(地址/数据库名/账户/密码)
2. generatorConfig.xml配置生成文件的路径,我的是com.cbw.dto(根据自己爱好去定义)
3. generatorConfig.xml配置下要生成的table(注意前面是表名,后面是类名:tb_content-->TbContent(类名))
4. 打开脚本,复制,当前目录下,打开cmd(shift+右键)运行脚本(多次运行会有问题,多次运行建议删除newfile中的文件)
5. 在newfile中找打你要的文件,复制进项目
6. enjoy