<%--
  Created by IntelliJ IDEA.
  User: wangxinzhi
  Date: 2017/4/5
  Time: 17:26
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
    <title>开药信息录入</title>
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/admin.css">
    <script src="js/jquery.js"></script>
    <script src="js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
    <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 开药信息录入</strong></div>
    <div class="body-content">
        <form method="post" class="form-x" name="druginfo" action="count.html">
            <div class="form-group">
                <div align="center">
                    <table width="1619" height="514" border="0">
                        <tr>
                            <td height="76" colspan="6"><p>&nbsp;</p>
                                <p>确诊汇总</p></td>
                        </tr>
                        <tr>
                            <td width="92" height="64" align="center">编号:</td>
                            <td width="321"><span class="field">
                <input type="text" class="input" name="stitle4" value="" />
              </span></td>
                            <td width="97" align="center">患者姓名：</td>
                            <td width="307"><span class="field">
                <input type="text" class="input" name="stitle5" value="" />
              </span></td>
                            <td width="117" align="center">&nbsp;</td>
                            <td width="659">&nbsp;</td>
                        </tr>
                        <tr>
                            <td height="54" align="center">是否输液:</td>
                            <td><span class="field">
                <input type="text" class="input" name="stitle2" value="" />
              </span></td>
                            <td align="center">确诊疾病：</td>
                            <td><span class="field">
                <input type="text" class="input" name="stitle3" value="" />
              </span></td>
                            <td align="center">&nbsp;</td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td height="50" align="center">药品编号:</td>
                            <td><span class="field">
                <input type="text" class="input" name="stitle6" value="" />
              </span></td>
                            <td align="center">药品数量：</td>
                            <td><span class="field">
                <input type="text" class="input" name="stitle8" value="" />
              </span></td>
                            <td align="center">&nbsp;</td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td height="50" align="center">药品编号:</td>
                            <td><span class="field">
                <input type="text" class="input" name="stitle9" value="" />
              </span></td>
                            <td align="center">药品数量：</td>
                            <td><span class="field">
                <input type="text" class="input" name="stitle9" value="" />
              </span></td>
                            <td align="center">&nbsp;</td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td height="50" align="center">药品编号:</td>
                            <td><span class="field">
                <input type="text" class="input" name="stitle9" value="" />
              </span></td>
                            <td align="center">药品数量：</td>
                            <td><span class="field">
                <input type="text" class="input" name="stitle9" value="" />
              </span></td>
                            <td align="center">&nbsp;</td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td height="50" align="center">药品编号:</td>
                            <td><span class="field">
                <input type="text" class="input" name="stitle9" value="" />
              </span></td>
                            <td align="center">药品数量：</td>
                            <td><span class="field">
                <input type="text" class="input" name="stitle9" value="" />
              </span></td>
                            <td align="center">&nbsp;</td>

                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td height="50" align="center">药品编号:</td>
                            <td><span class="field">
                <input type="text" class="input" name="stitle9" value="" />
              </span></td>
                            <td align="center">药品数量：</td>
                            <td><span class="field">
                <input type="text" class="input" name="stitle9" value="" />
              </span></td>
                            <td align="center">&nbsp;</td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td height="50" align="center">药品编号:</td>
                            <td><span class="field">
                <input type="text" class="input" name="stitle9" value="" />
              </span></td>
                            <td align="center">药品数量：</td>
                            <td><span class="field">
                <input type="text" class="input" name="stitle9" value="" />
              </span></td>
                            <td align="center">&nbsp;</td>
                            <td>&nbsp;</td>
                        </tr>
                    </table>
                    </div>
                </div>
                    <div class="form-group">
                        <div class="label">
                            <label></label>
                        </div>
                        <div class="field">
                            <button class="button bg-main icon-check-square-o" onclick="druginfo.submit" type="submit">提交</button>
                        </div>
                    </div>
        </form>
    </div>

</div>
</body>

</html>
