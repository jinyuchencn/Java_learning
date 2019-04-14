# Java_learning
for learning java
## Usage
    1、导入GetLadder后，使用GetLadder方法，输入beginword和endword，便可找到从beginword到endword的ladder
    2、字典文件与代码在同一路径下，由于尚未解决的bug，代码中文件路径为绝对路径而非相对路径，如运行失败请修改dictionary.txt的路径
## Test
    1、由于代码接口与自己水平问题，单元测试无法很好进行，主要原因在于各方法的返回值多为map，set等较大的集合，难以选取合适的测试用例，因此目前只对最终功能进行了测试
## Spring boot
    1、在根目录中Terminal 输入mvn spring-boot:run来启动服务
    2、提供了2种传参方式
        a、http://localhost:8080/Ladder?b=apple&e=happy，其中b表示beginword，e表示endword
        b、http://localhost:8080/Ladder/apple/happy，其中第一个单词为beginword，第二个单词为endword
## Spring boot security
    1、添加了spring security使用Ladder前，需要输入用户名密码（写死在application.properties中）
## Spring boot actuator
    1、添加了actuator，在login后可以使用actuator进行监听 