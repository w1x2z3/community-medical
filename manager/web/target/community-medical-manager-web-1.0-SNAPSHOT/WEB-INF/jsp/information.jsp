<%--
  Created by IntelliJ IDEA.
  User: wangxinzhi
  Date: 2017/4/5
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>用户健康电子档案</title>
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/admin.css">
    <script src="js/jquery.js"></script>
    <script src="js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
    <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 健康电子档案</strong></div>
    <div class="body-content">
        <form method="post" class="form-x" action="">


            <div class="form-group">
                <div align="center">
                    <table width="1619" height="1072" border="0">
                        <tr>
                            <td colspan="6"><p>&nbsp;</p>
                                <p><strong>基本信息</strong></p></td>
                        </tr>
                        <tr>
                            <td width="92" align="center">编号:</td>
                            <td width="321"><div class="field">
                                <input type="text" class="input" name="stitle4" value="" />
                            </div></td>
                            <td width="97" align="center">姓名:</td>
                            <td width="307"><div class="field">
                                <input type="text" class="input" name="stitle5" value="" />
                            </div></td>
                            <td width="117" align="center">性别:</td>
                            <td width="659"><div class="field">
                                <input type="text" class="input" name="stitle8" value="" />
                            </div></td>
                        </tr>
                        <tr>
                            <td align="center">年龄:</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle3" value="" />
                            </div></td>
                            <td align="center">血型:</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle6" value="" />
                            </div></td>
                            <td align="center">联系方式:</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle9" value="" />
                            </div></td>
                        </tr>
                        <tr>
                            <td align="center">身高:</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle" value="" />
                            </div></td>
                            <td align="center">体重:</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle7" value="" />
                            </div></td>
                            <td align="center">身份证号:</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle10" value="" />
                            </div></td>
                        </tr>
                        <tr>
                            <td align="center">家庭住址： </td>
                            <td colspan="5"><div class="field">
                                <input type="text" class="input" name="stitle2" value="" />
                            </div></td>
                        </tr>
                        <tr>
                            <td height="70" align="center">联系邮箱：</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle11" value="" />
                            </div></td>
                            <td align="center">紧急联系方式：</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle12" value="" />
                            </div></td>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td height="49" colspan="6"><p>&nbsp;</p>
                                <p><strong>健康状况</strong></p></td>
                        </tr>
                        <tr>
                            <td align="center">身体状况：</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle13" value="" />
                            </div></td>
                            <td align="center">血压值：</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle14" value="" />
                            </div></td>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td align="center">心率值：</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle15" value="" />
                            </div></td>
                            <td align="center">是否有心血管疾病：</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle16" value="" />
                            </div></td>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td height="58" colspan="6"><p>&nbsp;</p>
                                <p><strong>生活习惯</strong></p></td>
                        </tr>
                        <tr>
                            <td align="center">喝酒情况：</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle17" value="" />
                            </div></td>
                            <td align="center">抽烟情况：</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle18" value="" />
                            </div></td>
                            <td align="center">血压情况：</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle19" value="" />
                            </div></td>
                        </tr>
                        <tr>
                            <td align="center">锻炼情况：</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle20" value="" />
                            </div></td>
                            <td align="center">三餐情况：</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle21" value="" />
                            </div></td>
                            <td align="center">睡眠情况：</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle22" value="" />
                            </div></td>
                        </tr>
                        <tr>
                            <td height="60" colspan="6"><p>&nbsp;</p>
                                <p><strong>既往诊断</strong></p></td>
                        </tr>
                        <tr>
                            <td align="center">所患疾病：</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle23" value="" />
                            </div></td>
                            <td align="center">确诊时间：</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle24" value="" />
                            </div></td>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td align="center">治疗地址：</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle25" value="" />
                            </div></td>
                            <td align="center">是否治愈：</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle26" value="" />
                            </div></td>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td align="center">现在状况：</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle27" value="" />
                            </div></td>
                            <td align="center">责任医生：</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle28" value="" />
                            </div></td>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td height="42" colspan="6"><p>&nbsp;</p>
                                <p><strong>确诊前注意</strong></p></td>
                        </tr>
                        <tr>
                            <td height="47" align="center">注意禁忌：</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle29" value="" />
                            </div></td>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td height="48" align="center">家族疾病史：</td>
                            <td><div class="field">
                                <input type="text" class="input" name="stitle30" value="" />
                            </div></td>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                        </tr>
                    </table>
                    </div>
                </div>
        </form>
    </div>

</div>
</body>
</html>
