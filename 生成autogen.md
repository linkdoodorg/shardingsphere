* 因为org.apache.shardingsphere.sql.parser.autogen 包下的代码由 ANTLR 生成
* 所以需要执行以下命令快速生成
```shell
# 使用高版本jdk

export JAVA_HOME=D:\Soft\jdk-17.0.4.1

mvn -Dcheckstyle.skip=true -Drat.skip=true -Dmaven.javadoc.skip=true -Djacoco.skip=true -DskipITs -DskipTests install -T1C
``` 