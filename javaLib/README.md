
该工程演示"在gradle中构建 自定义java源码和测试路径的项目"

### 1. 构建工程和测试代码

**第1步**：切换到当前目录

    $ cd .../03_self_dir

**第2步**：构成源码和测试工程

    $ gradle build

说明：`gradle build`则会执行生成compileJava, jar, assemble, test等任务。  
若只需要构成测试工程，则执行`gradle test`即可。

**第3步**：查看测试结果

测试结果是以html形式呈现的，使用find命令可以找到。

    $ find . -name *.html

说明：结果的路径应该是build/reports/tests/index.html，打开该文件即可看到测试结果。

