## 第三方应用入驻
&nbsp;&nbsp;&nbsp;&nbsp;第三方应用在完成系统入驻后方能将其移动端业务应用入驻到掌心家校移动应用中。其业务有2种方式集成到掌心家校移动应用，并实现在掌心家校一键跳转第三方业务应用：1）以WebApp页面方式在掌心家校移动应用的WebView独立展现； 2）提供独立移动应用，通过应用间跳转方式打开第三方应用。入驻集成步骤如下：

1. 入驻的第三方应用需向掌心家校平台提供移动应用跳转的唯一标识、名称、图标以及WebApp跳转链接（URL）或独立移动应用的HOST和PATH，并通过掌心家校平台标识和名称唯一性审核，待审核通过后掌心家校平台会返回第三方应用在掌心家校入驻的AppId和AppSecret；![](http://xtemp.oss-cn-hangzhou.aliyuncs.com/temp/host_path.png)

2. 掌心家校平台会在垂直业务界面显示已入驻的第三方应用按钮、名称或图标列表，点击相应的按钮、名称或图标将一键跳转到相应的第三方应用；

3. 当第三方应用以Web App形式入驻，跳转时则在新的WebView中打开应用注册的跳转链接（URL），链接规则详见第三方系统入驻单点接入规则。例如：`http://third_party_url.com?username=13800138000&password=c4ca4238a0b923820dcc509a6f75849b`；

4. 当第三方应用以独立移动应用形式入驻，在跳转时则会发起应用URI跳转请求，系统将自动路由到第三方移动应用。跳转URI规则如下：`xrj0123456789://login/changepassword?username=13800138000&password=c4ca4238a0b923820dcc509a6f75849b`![](http://xtemp.oss-cn-hangzhou.aliyuncs.com/temp/uri.png)
