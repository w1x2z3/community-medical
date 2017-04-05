<%--
  Created by IntelliJ IDEA.
  User: wangxinzhi
  Date: 2017/4/5
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>用户编号查询</title>
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/admin.css">
    <script src="js/jquery.js"></script>
    <script src="js/pintuer.js"></script>
    <%--<script type="text/javascript">--%>
        <%--function addAccount(){--%>
            <%--var form = document.forms[0];--%>
            <%--form.action = "/medical/info";--%>
            <%--form.method="post";--%>
            <%--form.submit();--%>
        <%--}--%>
    <%--</script>--%>
</head>
<body>
<div class="panel admin-panel">
    <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 用户编号查询</strong></div>
    <div class="body-content">
        <form method="post" class="form-x" name="info" action="information.html">
            <div class="form-group">
                <div align="center">
                    <table width="1619" height="136" border="0">
                        <tr>
                            <td height="76" colspan="2"><p>&nbsp;</p>
                                <p>请输入用户编号查询</p></td>
                        </tr>
                        <tr>
                            <td width="92" height="54" align="center">编号:</td>
                            <td><span class="field">
                <input type="text" class="input" name="stitle4" value="" />
              </span></td>
                        </tr>
                    </table>
                    <div class="form-group">
                        <div class="label">
                            <label></label>
                        </div>
                        <div class="field">
                            <button class="button bg-main icon-check-square-o" onclick="info.submit" type="submit">提交</button>
                        </div>
                    </div>
                    </div>
                </div>
        </form>
    </div>
</div>
</body>
</html>
