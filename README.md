# javafakedata假数据生成器
A library for generating fake data such as names, addresses,phone numbers,ipv4,ipv6,email,url

jar包，用于生成假数据，例如人名，地址，手机号，ipv4,ipv6,邮箱,url

# 安装教程
要使用 javafakedata，你需要安装 Java 环境，然后下载 javafakedata 的 jar 包，然后将其添加到你的 classpath 中。

jar包存放路径：
```
maven-repository\com\jimmywan\javafakedata\0.0.1-SNAPSHOT
```
# 示例

```
        String usName = FakeString.getUsLastName();
        System.out.println(usName);

        String string = FakeString.getFirstName();
        System.out.println(string);

        String string = FakeString.getLastName();
        System.out.println(string);
   
        String string = FakeString.getUsFirstName();
        System.out.println(string);
 
        String usName = FakeString.getUsLastName();
        System.out.println(usName);

        String usName = FakeString.getUsName();
        System.out.println(usName);

        String usName = FakeString.getPassword();
        System.out.println(usName);

        String string = FakeString.getEmail();
        System.out.println(string);

        String string = FakeString.getTelPhoneNumber();
        System.out.println(string);

        String string = FakeString.getInternetURL();
        System.out.println(string);

        String string = FakeString.getTencentQQCode();
        System.out.println(string);

        String string = FakeString.getPostcode_us();
        System.out.println(string);

        String string = FakeString.getPostcode_cn();
        System.out.println(string);

        String string = FakeString.getIpv4();
        System.out.println(string);

        String string = FakeString.getIpv6();
        System.out.println(string);


```
