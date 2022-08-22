<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajax局部刷新</title>
  <script>
    window.onload = function () {
        var button = document.getElementsByTagName("button")[0];
        button.onclick = function () {
            //创建异步请求对象
            var xhr = new XMLHttpRequest();
            //给异步对象绑定事件onreadystatechange  [readystate  当这个属性的状态改变时触发事件]
            xhr.onreadystatechange = function () {
              //判断网络状态200【表示网络发送正常】 和
              // readyState 状态4 【4表示异步对象接受到服务器返回的数据并成功处理，交数据保存到了 responseText】
              if(xhr.status == 200 && xhr.readyState == 4){
                //获取数据 并解析json字符串
                var data = xhr.responseText;//该异步对象请求，响应的数据保存在responseText 对象参数中
                var obj = JSON.parse(data);
                //通过js和dom渲染数据到页面
                var inputId = document.getElementById("id");
                inputId.value = obj.id;
                document.getElementById("shengfen").value = obj.shengfen;
                document.getElementById("jiancheng").value = obj.jianchen;
                document.getElementById("shenghui").value = obj.shenghui;
              }
            };
            //初始化异步对象
          xhr.open("get","queryServlet?id="+document.getElementById("id").value,true);
          //发送请求
          xhr.send();
        };

        var id = document.getElementById("id");
        id.onblur = function () {
            //创建异步请求对象
            var xhr = new XMLHttpRequest();
            //给异步对象绑定事件onreadystatechange  [readystate  当这个属性的状态改变时触发事件]
            xhr.onreadystatechange = function () {
                //判断网络状态200【表示网络发送正常】 和
                // readyState 状态4 【4表示异步对象接受到服务器返回的数据并成功处理，交数据保存到了 responseText】
                if(xhr.status == 200 && xhr.readyState == 4){
                    //获取数据 并解析json字符串
                    var data = xhr.responseText;//该异步对象请求，响应的数据保存在responseText 对象参数中
                    var obj = JSON.parse(data);
                    //通过js和dom渲染数据到页面
                    var inputId = document.getElementById("id");
                    inputId.value = obj.id;
                    document.getElementById("shengfen").value = obj.shengfen;
                    document.getElementById("jiancheng").value = obj.jianchen;
                    document.getElementById("shenghui").value = obj.shenghui;
                }
            };
            //初始化异步对象
            xhr.open("get","queryServlet?id="+document.getElementById("id").value,true);
            //发送请求
            xhr.send();
        };

    };
  </script>
</head>
<body>
<table align="center">
    <tr>
        <td>id：</td>
        <td><input type="text" id="id" name="id"/></td>
    </tr>
    <tr>
        <td>省份：</td>
        <td><input type="text" id="shengfen" name="id"/></td>
    </tr>
    <tr>
        <td>简称：</td>
        <td><input type="text" id="jiancheng" name="id"/></td>
    </tr>
    <tr>
        <td>省会：</td>
        <td><input type="text" id="shenghui" name="id"/></td>
    </tr>
    <tr><td colspan="2" align="center"><button class="button">Ajax提交</button></td></tr>
</table>
</body>
</html>
