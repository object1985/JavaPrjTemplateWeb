# JavaPrjTemplateWeb

## Description

JavaのWebプロジェクトのテンプレートです

## formatter

/JavaPrjTemplateWeb/src/main/resources/GoogleStyleCustom.xml

- プロジェクトのプロパティ「Java Code Style > Formatter」から設定してください
- save actionなどでformatterを忘れず実行してください

## build

mavenプロジェクトになっています。  
pom.xmlのあるプロジェクトルートでビルドします。

```sh
JavaPrjTemplateWeb[1-readme]$ java  --version
Unrecognized option: --version
Error: Could not create the Java Virtual Machine.
Error: A fatal exception has occurred. Program will exit.
JavaPrjTemplateWeb[1-readme]$ 
JavaPrjTemplateWeb[1-readme]$ mvn -version
Apache Maven 3.6.0 (97c98ec64a1fdfee7767ce5ffb20918da4f719f3; 2018-10-25T03:41:47+09:00)
Maven home: /usr/local/Cellar/maven/3.6.0/libexec
Java version: 1.8.0_192, vendor: Oracle Corporation, runtime: /Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/jre
Default locale: ja_JP, platform encoding: UTF-8
OS name: "mac os x", version: "10.14.6", arch: "x86_64", family: "mac"
JavaPrjTemplateWeb[1-readme]$ 
```

```sh
JavaPrjTemplateWeb[1-readme]$ mvn clean  install
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< jp.co.tonaise:JavaPrjTemplateWeb >------------------
[INFO] Building JavaPrjTemplateWeb 0.0.1
[INFO] --------------------------------[ war ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ JavaPrjTemplateWeb ---
[INFO] Deleting /Users/user/Documents/workspace/JavaPrjTemplateWeb/target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ JavaPrjTemplateWeb ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ JavaPrjTemplateWeb ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /Users/user/Documents/workspace/JavaPrjTemplateWeb/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ JavaPrjTemplateWeb ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ JavaPrjTemplateWeb ---
[INFO] Changes detected - recompiling the module!
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ JavaPrjTemplateWeb ---
[INFO] 
[INFO] --- maven-war-plugin:2.2:war (default-war) @ JavaPrjTemplateWeb ---
[INFO] Packaging webapp
[INFO] Assembling webapp [JavaPrjTemplateWeb] in [/Users/user/Documents/workspace/JavaPrjTemplateWeb/target/JavaPrjTemplateWeb-0.0.1]
[INFO] Processing war project
[INFO] Copying webapp resources [/Users/user/Documents/workspace/JavaPrjTemplateWeb/src/main/webapp]
[INFO] Webapp assembled in [53 msecs]
[INFO] Building war: /Users/user/Documents/workspace/JavaPrjTemplateWeb/target/JavaPrjTemplateWeb-0.0.1.war
[INFO] WEB-INF/web.xml already added, skipping
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ JavaPrjTemplateWeb ---
[INFO] Installing /Users/user/Documents/workspace/JavaPrjTemplateWeb/target/JavaPrjTemplateWeb-0.0.1.war to /Users/user/.m2/repository/jp/co/tonaise/JavaPrjTemplateWeb/0.0.1/JavaPrjTemplateWeb-0.0.1.war
[INFO] Installing /Users/user/Documents/workspace/JavaPrjTemplateWeb/pom.xml to /Users/user/.m2/repository/jp/co/tonaise/JavaPrjTemplateWeb/0.0.1/JavaPrjTemplateWeb-0.0.1.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.795 s
[INFO] Finished at: 2019-07-29T13:37:57+09:00
[INFO] ------------------------------------------------------------------------
JavaPrjTemplateWeb[1-readme]$ 
```